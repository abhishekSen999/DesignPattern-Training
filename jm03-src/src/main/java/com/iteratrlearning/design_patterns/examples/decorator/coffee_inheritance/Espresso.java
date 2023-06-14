package com.iteratrlearning.design_patterns.examples.decorator.coffee_inheritance;

public class Espresso extends CoffeeMug
{
    public double getCost()
    {
        return 1;
    }

    public void make()
    {
        super.make();
        System.out.println("Pull Espresso shot");
    }
}
