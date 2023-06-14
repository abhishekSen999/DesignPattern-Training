package com.iteratrlearning.design_patterns.examples.proxy.remote;

import com.iteratrlearning.design_patterns.examples.proxy.BankAccount;
import com.iteratrlearning.design_patterns.examples.proxy.InMemoryBankAccount;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static javax.servlet.http.HttpServletResponse.SC_PRECONDITION_FAILED;

public class BankAccountServlet extends HttpServlet
{
    private BankAccount bankAccount = new InMemoryBankAccount();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setStatus(SC_OK);

        final ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println(String.valueOf(bankAccount.currentBalance()));
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException
    {
        final double amount = Double.parseDouble(req.getParameter("amount"));
        switch (req.getServletPath())
        {
            case BankService.DEPOSIT:
            {
                bankAccount.deposit(amount);
                resp.setStatus(SC_OK);
                return;
            }

            case BankService.WITHDRAW:
            {
                final boolean withdrawn = bankAccount.withdraw(amount);
                final int status = withdrawn ? SC_OK : SC_PRECONDITION_FAILED;
                resp.setStatus(status);
                return;
            }

            default:
            {
                resp.setStatus(SC_NOT_FOUND);
            }
        }
    }
}
