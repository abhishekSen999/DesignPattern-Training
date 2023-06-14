package com.iteratrlearning.design_patterns.answers.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ReadOnlyInvocationHandler implements InvocationHandler
{
    private Object obj;

    private ReadOnlyInvocationHandler(final Object obj)
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
            new ReadOnlyInvocationHandler(obj));
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
    {
        if (method.getName().startsWith("set"))
        {
            throw new UnsupportedOperationException("Cannot invoke method: " + method);
        }
        return method.invoke(obj, args);
    }
}
