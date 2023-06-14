package com.iteratrlearning.design_patterns.examples.decorator.coffee_decorator;

import com.iteratrlearning.design_patterns.examples.decorator.Coffee;

public class WithChocolate implements Coffee
{
    private final Coffee coffee;

    public WithChocolate(final Coffee coffee)
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
        System.out.println("Add Hot chocolate to coffee");
    }
}
