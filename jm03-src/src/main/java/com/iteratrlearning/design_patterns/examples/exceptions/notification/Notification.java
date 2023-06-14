package com.iteratrlearning.design_patterns.examples.exceptions.notification;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<String> errors = new ArrayList<>();

    public void addError(String message) {
        errors.add(message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String errorMessage() {
        return errors.toString();
    }

}