package com.iteratrlearning.design_patterns.examples.decorator.coffee_inheritance;

public class Latte extends Espresso
{
    @Override
    public double getCost()
    {
        return 0.5 + super.getCost();
    }

    @Override
    public void make()
    {
        super.make();
        System.out.println("Steam Milk and pour into coffee");
    }
}
