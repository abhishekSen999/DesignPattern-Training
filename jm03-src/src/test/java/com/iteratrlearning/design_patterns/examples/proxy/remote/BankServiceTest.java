package com.iteratrlearning.design_patterns.examples.proxy.remote;

import com.iteratrlearning.design_patterns.examples.proxy.remote.BankAccountProxy;
import com.iteratrlearning.design_patterns.examples.proxy.remote.BankService;
import org.apache.http.client.fluent.Executor;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BankServiceTest
{
    private BankService service = new BankService(BankService.PORT);
    private BankAccountProxy proxy = new BankAccountProxy();

    @Before
    public void setUp() throws Exception
    {
        service.start();
    }

    @After
    public void tearDown() throws Exception
    {
        service.stop();
        Executor.closeIdleConnections();
    }

    @Test
    public void shouldHaveInitialBalanceOfZero()
    {
        assertEquals(0.0, proxy.currentBalance(), 0.0);
    }

    @Test
    public void shouldIncreaseBalanceUponDeposit()
    {
        proxy.deposit(5);
        proxy.deposit(10);

        assertEquals(15, proxy.currentBalance(), 0.0);
    }

    @Test
    public void shouldDecreaseBalanceWithWithdraw()
    {
        proxy.deposit(10);
        proxy.withdraw(5);

        assertEquals(5, proxy.currentBalance(), 0.0);
    }
}
