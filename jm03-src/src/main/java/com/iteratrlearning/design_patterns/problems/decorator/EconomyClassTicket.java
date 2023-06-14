package com.iteratrlearning.design_patterns.problems.decorator;

public class EconomyClassTicket implements AirlineTicket
{
    public double getCost()
    {
        return 50;
    }

    public boolean hasPriorityBoarding()
    {
        return false;
    }

    public boolean hasComfySeat()
    {
        return false;
    }
}
