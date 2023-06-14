package com.iteratrlearning.design_patterns.answers.decorator;

public class WithPriorityBoarding implements AirlineTicket
{
    private final AirlineTicket airlineTicket;

    public WithPriorityBoarding(final AirlineTicket airlineTicket)
    {
        this.airlineTicket = airlineTicket;
    }

    public double getCost()
    {
        return 100 + airlineTicket.getCost();
    }

    public boolean hasPriorityBoarding()
    {
        return true;
    }

    public boolean hasComfySeat()
    {
        return airlineTicket.hasComfySeat();
    }
}
