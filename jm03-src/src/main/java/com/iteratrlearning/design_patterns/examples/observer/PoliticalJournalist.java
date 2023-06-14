package com.iteratrlearning.design_patterns.examples.observer;

public class PoliticalJournalist implements Observer
{
    @Override
    public void notify(String tweet)
    {
        if (tweet.contains("politics"))
        {
            System.out.println("Here we go again :-(");
        }
    }
}
