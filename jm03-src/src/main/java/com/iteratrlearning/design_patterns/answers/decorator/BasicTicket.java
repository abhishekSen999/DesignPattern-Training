package com.iteratrlearning.design_patterns.answers.decorator;

public class BasicTicket implements AirlineTicket
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
