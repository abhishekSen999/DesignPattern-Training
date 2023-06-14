package com.iteratrlearning.design_patterns.examples.decorator.coffee_inheritance;

public class InheritanceCoffeeMenu
{
    public static void main(String[] args)
    {
        final Espresso espresso = new Espresso();
        final DoubleEspresso doubleEspresso = new DoubleEspresso();
        final Latte latte = new Latte();
        final Mocha mocha = new Mocha();

        System.out.println("Espresso");
        espresso.make();
        System.out.println();

        System.out.println("Double Espresso");
        doubleEspresso.make();
        System.out.println();

        System.out.println("Latte");
        latte.make();
        System.out.println();

        System.out.println("Mocha");
        mocha.make();
        System.out.println();
    }
}
