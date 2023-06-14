package com.iteratrlearning.design_patterns.examples.decorator.coffee_decorator;

import com.iteratrlearning.design_patterns.examples.decorator.Coffee;

public class WithSteamedMilk implements Coffee
{
    private final Coffee coffee;

    public WithSteamedMilk(final Coffee coffee)
    {
        this.coffee = coffee;
    }

    public double getCost()
    {
        return 0.5 + coffee.getCost();
    }

    public void make()
    {
        coffee.make();
        System.out.println("Steam Milk and pour into coffee");
    }
}
