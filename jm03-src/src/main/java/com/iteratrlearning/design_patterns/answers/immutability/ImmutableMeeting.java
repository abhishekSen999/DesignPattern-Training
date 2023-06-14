package com.iteratrlearning.design_patterns.answers.immutability;

import java.time.LocalDate;

public final class ImmutableMeeting {

    private final String name;
    private final LocalDate date;

    public ImmutableMeeting(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public ImmutableMeeting withName(String newName) {
        return new ImmutableMeeting(newName, this.date);
    }

    public ImmutableMeeting withDate(LocalDate newDate) {
        return new ImmutableMeeting(this.name, newDate);
    }

}

