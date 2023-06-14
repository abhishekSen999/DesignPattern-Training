package com.iteratrlearning.design_patterns.examples.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class LoggingInvocationHandler implements InvocationHandler
{
    private Object obj;

    private LoggingInvocationHandler(final Object obj)
    {
        this.obj = obj;
    }

    @SuppressWarnings("unchecked")
    public static <T> T newInstance(final T obj)
    {
        final Class<?> aClass = obj.getClass();
        return (T) Proxy.newProxyInstance(
            aClass.getClassLoader(),
            aClass.getInterfaces(),
            new LoggingInvocationHandler(obj));
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
    {
        System.out.print(method.getDeclaringClass().getName() + "." + method.getName());
        if (args != null)
        {
            System.out.println(Stream.of(args)
                    .map(Object::toString)
                    .collect(joining(",", "(", ")")));
        }
        else
        {
            System.out.println("()");
        }
        final Object result = method.invoke(obj, args);
        if (result != null)
        {
            System.out.println("result = " + result);
        }
        return result;
    }
}
