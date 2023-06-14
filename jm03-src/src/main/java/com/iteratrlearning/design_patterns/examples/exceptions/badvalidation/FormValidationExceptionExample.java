package com.iteratrlearning.design_patterns.examples.exceptions.badvalidation;

import java.util.Scanner;

public class FormValidationExceptionExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        String amount = scanner.nextLine();
        String description = scanner.nextLine();


        BankTransactionJSON data
                = new BankTransactionJSON(date, amount, description);
//
        IllegalValidator validator = new IllegalValidator(data);
        validator.validate();

//        OverlySpecificValidator validator = new OverlySpecificValidator(data);
//        validator.validate();

    }
}
