package com.iteratrlearning.design_patterns.examples.observer;

public class FrenchAgent implements Observer
{
    @Override
    public void notify(String tweet)
    {
        if (tweet.contains("wine"))
        {
            System.out.println("And a bit of cheese please");
        }
    }
}
