package com.iteratrlearning.design_patterns.problems.immutability;

import java.time.LocalDate;

// TODO: there are three optional changes that you can make here as well that aren't required by the tests
// Can you find them?
public class ImmutableMeeting {

    private String name;
    private LocalDate date;

    public ImmutableMeeting(String name, LocalDate date) {
        // TODO
    }


    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public ImmutableMeeting withName(String newName) {
        // TODO
        return null;
    }

    public ImmutableMeeting withDate(LocalDate newDate) {
        //TODO
        return null;
    }

}
