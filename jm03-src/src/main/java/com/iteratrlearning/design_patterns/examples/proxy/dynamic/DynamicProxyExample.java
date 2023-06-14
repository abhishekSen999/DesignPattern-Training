package com.iteratrlearning.design_patterns.examples.proxy.dynamic;

import com.iteratrlearning.design_patterns.examples.proxy.BankAccount;
import com.iteratrlearning.design_patterns.examples.proxy.InMemoryBankAccount;

import java.time.LocalDateTime;

public class DynamicProxyExample
{
    public static void main(String[] args)
    {
        final BankAccount bankAccount =
            LoggingInvocationHandler.newInstance(new InMemoryBankAccount());

        bankAccount.deposit(10);

        bankAccount.withdraw(5);

        bankAccount.currentBalance();
    }
}
