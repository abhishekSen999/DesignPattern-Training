package com.iteratrlearning.design_patterns.examples.proxy;

public class InMemoryBankAccount implements BankAccount
{
    private double balance;

    public synchronized void deposit(final double amount)
    {
        balance += amount;
    }

    public synchronized boolean withdraw(final double amount)
    {
        if (balance > amount)
        {
            balance -= amount;
            return true;
        }

        return false;
    }

    public synchronized double currentBalance()
    {
        return balance;
    }
}
