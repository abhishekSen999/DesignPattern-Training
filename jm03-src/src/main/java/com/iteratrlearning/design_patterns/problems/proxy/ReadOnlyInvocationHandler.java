package com.iteratrlearning.design_patterns.problems.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReadOnlyInvocationHandler implements InvocationHandler
{
    private ReadOnlyInvocationHandler(final Object obj)
    {
        // TODO: need to store the object
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
        // TODO: invoke the method on obj normally
        // TODO: throw UnsupportedOperationException if method's name starts with set
        return null;
    }
}
