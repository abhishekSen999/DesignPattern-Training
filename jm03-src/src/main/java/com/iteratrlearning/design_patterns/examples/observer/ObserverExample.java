package com.iteratrlearning.design_patterns.examples.observer;

public class ObserverExample
{
    public static void main(String[] args)
    {
        TwitterFeed twitterFeed = new TwitterFeed();
        twitterFeed.add(new PoliticalJournalist());
        twitterFeed.add(new FrenchAgent());

        twitterFeed.tweet("Hello");
        twitterFeed.tweet("Blah blah, politics, the world is ending!");
        twitterFeed.tweet("Time for a glass of wine");
    }
}
