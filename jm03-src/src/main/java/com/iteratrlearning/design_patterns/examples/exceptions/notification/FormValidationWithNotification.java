package com.iteratrlearning.design_patterns.examples.exceptions.notification;

import java.util.Scanner;

public class FormValidationWithNotification {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        String amount = scanner.nextLine();
        String description = scanner.nextLine();


        BankTransactionJSON data
                = new BankTransactionJSON(date, amount, description);

        NotificationValidator validator = new NotificationValidator(data);
        Notification notification = validator.validate();

        if(notification.hasErrors()) {
            System.out.println(notification.errorMessage());
        }
        else {
            System.out.println("Valid data");
        }
    }
}
