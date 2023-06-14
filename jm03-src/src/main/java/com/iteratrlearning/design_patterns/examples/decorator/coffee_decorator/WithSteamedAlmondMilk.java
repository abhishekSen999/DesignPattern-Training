package com.iteratrlearning.design_patterns.examples.decorator.coffee_decorator;

import com.iteratrlearning.design_patterns.examples.decorator.Coffee;

public class WithSteamedAlmondMilk implements Coffee
{
    private final Coffee coffee;

    public WithSteamedAlmondMilk(final Coffee coffee)
    {
        this.coffee = coffee;
    }

    public double getCost()
    {
        return 1 + coffee.getCost();
    }

    public void make()
    {
        coffee.make();
        System.out.println("Steam Almond Milk and pour into coffee");
    }
}
