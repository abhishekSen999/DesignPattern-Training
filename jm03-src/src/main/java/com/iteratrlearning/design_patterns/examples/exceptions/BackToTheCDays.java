package com.iteratrlearning.design_patterns.examples.exceptions;

import java.nio.file.Files;
import java.util.Scanner;

public class BackToTheCDays {

    public static void main(String[] args) {

        //src/test/resources/bank-data-simple.csv

        Scanner scanner = new Scanner(System.in);
        long size = 0;
        long retries = 3;

        String filePath = "yadadada";
        System.out.println(OldFiles.size(filePath));

//        while(retries != 0) {
//            System.out.println("Enter the filePath:");
//            String filePath = scanner.nextLine();
//            size = OldFiles.size(filePath);
//
//            if (size == -1) {
//                System.out.println("Check that your path is correct!");
//                System.out.println(OldFiles.error);
//            } else if (size == -2) {
//                System.out.println("The file does not exist.");
//                System.out.println(OldFiles.error);
//            } else if (size == -3) {
//                System.out.println("We can't help sorry");
//                System.out.println(OldFiles.error);
//                break;
//            } else {
//                System.out.println("The size is " + size);
//                break;
//            }
//            retries--;
//        }

    }
}
