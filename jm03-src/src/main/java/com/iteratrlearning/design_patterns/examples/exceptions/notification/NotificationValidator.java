package com.iteratrlearning.design_patterns.examples.exceptions.notification;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class NotificationValidator {
    private final BankTransactionJSON data;

    public NotificationValidator(BankTransactionJSON data) {
        this.data = data;
    }

    public Notification validate() {

        Notification notification = new Notification();

        if(data == null) {
            notification.addError("No data");
            return notification;
        }

        if(data.getDescription().length() > 100) {
            notification.addError("The description is too long");
        }

        LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(data.getDate());
            if (parsedDate.isBefore(LocalDate.now())) notification.addError("date cannot be before today");
        }
        catch (DateTimeParseException e) {
            notification.addError("Invalid format for date");
        }

        double amount;
        try {
            amount = Double.parseDouble(data.getAmount());
        }
        catch (NumberFormatException e) {
            notification.addError("Invalid format for amount");
        }
        return notification;
    }
}
