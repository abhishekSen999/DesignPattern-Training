package com.iteratrlearning.design_patterns.examples.factory;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateFactoryMethodExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, Month.MAY, 30);
        System.out.println(date);

        // (2) LocalDate.parse()
        // (3) LocalDate.now()

    }
}
