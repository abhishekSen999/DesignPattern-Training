package com.iteratrlearning.design_patterns.examples.exceptions.badvalidation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class IllegalValidator {

    private BankTransactionJSON data;

    public IllegalValidator(BankTransactionJSON data) {
        this.data = data;
    }

    public void validate() {
        if(data == null) {
            throw new IllegalArgumentException("No data");
        }

        if(data.getDescription().length() > 100) {
            throw new IllegalArgumentException("The description is too long");
        }

        LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(data.getDate());
        }
        catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid format for date", e);
        }
        if (parsedDate.isBefore(LocalDate.now())) throw new IllegalArgumentException("date cannot be before today");

        double amount;
        try {
            amount = Double.parseDouble(data.getAmount());
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid format for amount", e);
        }
    }
}
