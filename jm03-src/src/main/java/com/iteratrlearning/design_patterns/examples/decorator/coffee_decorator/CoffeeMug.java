package com.iteratrlearning.design_patterns.examples.decorator.coffee_decorator;

import com.iteratrlearning.design_patterns.examples.decorator.Coffee;

public class CoffeeMug implements Coffee
{
    public double getCost()
    {
        return 0;
    }

    public void make()
    {
        System.out.println("Get a mug");
    }
}
