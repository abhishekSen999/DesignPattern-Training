package com.iteratrlearning.design_patterns.answers.decorator;

public class WithComfySeating implements AirlineTicket
{
    private final AirlineTicket airlineTicket;

    public WithComfySeating(final AirlineTicket airlineTicket)
    {
        this.airlineTicket = airlineTicket;
    }

    public double getCost()
    {
        return 100 + airlineTicket.getCost();
    }

    public boolean hasPriorityBoarding()
    {
        return airlineTicket.hasPriorityBoarding();
    }

    public boolean hasComfySeat()
    {
        return true;
    }
}
