package com.iteratrlearning.design_patterns.examples.observer;

import java.util.ArrayList;
import java.util.List;

public class TwitterFeed
{
    private List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer)
    {
        observerList.add(observer);
    }

    public void tweet(String tweet)
    {
        observerList.forEach(observer -> observer.notify(tweet));
    }

}
