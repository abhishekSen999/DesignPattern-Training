package com.iteratrlearning.design_patterns.examples.decorator.coffee_decorator;

import com.iteratrlearning.design_patterns.examples.decorator.Coffee;

public class CoffeeMenu
{
    public static void main(String[] args)
    {
        final Coffee espresso =
            new WithEspressoShot(new CoffeeMug());

        final Coffee doubleEspresso =
            new WithEspressoShot(espresso);

        final Coffee latte =
            new WithSteamedMilk(espresso);

        final Coffee mocha =
            new WithChocolate(latte);

        final Coffee strongKetoLatte =
            new WithSteamedAlmondMilk(doubleEspresso);

        final Coffee coffeeAddiction =
            new WithChocolate(
                new WithEspressoShot(
                    new WithEspressoShot(
                        new WithEspressoShot(new CoffeeMug()))));

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

        System.out.println("Strong Keto Latte");
        strongKetoLatte.make();
        System.out.println();

        System.out.println("Coffee by Addiction");
        coffeeAddiction.make();
        System.out.println();
    }
}
