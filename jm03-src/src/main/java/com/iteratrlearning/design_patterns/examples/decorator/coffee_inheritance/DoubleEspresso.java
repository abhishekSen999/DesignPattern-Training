package com.iteratrlearning.design_patterns.examples.decorator.coffee_inheritance;

public class DoubleEspresso extends Espresso
{
    public double getCost()
    {
        return 2 * super.getCost();
    }

    public void make()
    {
        super.make();
        System.out.println("Pull Espresso shot");
    }
}
