package com.iteratrlearning.design_patterns.examples.proxy.remote;

import com.iteratrlearning.design_patterns.examples.proxy.BankAccount;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

import static javax.servlet.http.HttpServletResponse.SC_OK;

public class BankAccountProxy implements BankAccount
{
    private static final String URL_PREFIX = "http://localhost:" + BankService.PORT;
    private static final String AMOUNT = "?amount=";
    private static final String WITHDRAW_URL = URL_PREFIX + BankService.WITHDRAW + AMOUNT;
    private static final String DEPOSIT_URL =  URL_PREFIX + BankService.DEPOSIT + AMOUNT;
    private static final String BALANCE_URL =  URL_PREFIX + BankService.BALANCE;

    @Override
    public void deposit(final double amount)
    {
        post(DEPOSIT_URL + amount);
    }

    @Override
    public boolean withdraw(final double amount)
    {
        final int responseCode = post(WITHDRAW_URL + amount);
        return responseCode == SC_OK;
    }

    @Override
    public double currentBalance()
    {
        final String content = get(BALANCE_URL);
        return Double.parseDouble(content);
    }

    private int post(final String url)
    {
        try
        {
            return Request
                    .Post(url)
                    .execute()
                    .returnResponse()
                    .getStatusLine()
                    .getStatusCode();
        }
        catch (IOException e)
        {
            throw new BankConnectionException(e);
        }
    }

    private String get(final String url)
    {
        try
        {
            return Request
                    .Get(url)
                    .execute()
                    .returnContent()
                    .asString();
        }
        catch (IOException e)
        {
            throw new BankConnectionException(e);
        }
    }
}
