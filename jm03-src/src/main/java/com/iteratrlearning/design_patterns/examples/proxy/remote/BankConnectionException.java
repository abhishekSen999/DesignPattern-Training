package com.iteratrlearning.design_patterns.examples.proxy.remote;

public class BankConnectionException extends RuntimeException
{
    public BankConnectionException(final Throwable cause)
    {
        super(cause);
    }
}
