package com.iteratrlearning.design_patterns.examples.strategy;

public class Firewall {

    private FilteringStrategy filteringStrategy;

    public Firewall(FilteringStrategy filteringStrategy) {
        this.filteringStrategy = filteringStrategy;
    }

    public void setFilteringStrategy(FilteringStrategy filteringStrategy) {
        this.filteringStrategy = filteringStrategy;
    }

    public void process(Email email) {
        if(filteringStrategy.accept(email)) {
            System.out.println("Accept " + email);
        } else {
            System.out.println("Ignore " + email);
        }
    }

}
