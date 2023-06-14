package com.iteratrlearning.design_patterns.examples.exceptions.badvalidation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class OverlySpecificValidator {

    private BankTransactionJSON data;

    public OverlySpecificValidator(BankTransactionJSON data) {
        this.data = data;
    }

    public void validate() throws NoDataException, DescriptionTooLongException, InvalidDateFormat, DateInThePastException, InvalidAmountException {
        if(data == null) {
            throw new NoDataException();
        }

        if(data.getDescription().length() > 100) {
            throw new DescriptionTooLongException();
        }

        LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(data.getDate());
        }
        catch (DateTimeParseException e) {
            throw new InvalidDateFormat();
        }
        if (parsedDate.isBefore(LocalDate.now())) throw new DateInThePastException();

        double amount;
        try {
            amount = Double.parseDouble(data.getAmount());
        }
        catch (NumberFormatException e) {
            throw new InvalidAmountException();
        }
    }
}
