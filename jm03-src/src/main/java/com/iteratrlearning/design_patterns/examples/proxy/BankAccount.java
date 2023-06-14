package com.iteratrlearning.design_patterns.examples.proxy;

public interface BankAccount
{
    void deposit(final double amount);

    boolean withdraw(final double amount);

    double currentBalance();
}
