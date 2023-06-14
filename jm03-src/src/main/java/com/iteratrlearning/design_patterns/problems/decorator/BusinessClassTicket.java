package com.iteratrlearning.design_patterns.problems.decorator;

public class BusinessClassTicket implements AirlineTicket
{
    public double getCost()
    {
        return 250;
    }

    public boolean hasPriorityBoarding()
    {
        return true;
    }

    public boolean hasComfySeat()
    {
        return true;
    }
}
