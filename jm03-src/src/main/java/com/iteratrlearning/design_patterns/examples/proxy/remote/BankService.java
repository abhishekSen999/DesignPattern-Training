package com.iteratrlearning.design_patterns.examples.proxy.remote;

import com.iteratrlearning.PortFinder;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class BankService
{
    public static final int PORT = PortFinder.findPort();

    public static final String BALANCE = "/balance";
    public static final String WITHDRAW = "/withdraw";
    public static final String DEPOSIT = "/deposit";

    public static void main(String[] args)
    {
        new BankService(PORT).run();
    }

    public BankService(final int port)
    {
        this.server = new Server(port);

        final ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);

        final ServletHolder servlet = new ServletHolder(new BankAccountServlet());
        servletHandler.addServletWithMapping(servlet, BALANCE);
        servletHandler.addServletWithMapping(servlet, WITHDRAW);
        servletHandler.addServletWithMapping(servlet, DEPOSIT);
    }

    private final Server server;

    public void run()
    {
        try
        {
            start();
            server.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void start() throws Exception
    {
        server.start();
    }

    public void stop() throws Exception
    {
        server.stop();
    }
}
