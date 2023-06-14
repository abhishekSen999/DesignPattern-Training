package com.iteratrlearning.design_patterns.examples.adapter;

import java.time.LocalDate;
import java.time.Month;

public class DateExample
{
    public static void main(String[] args)
    {
        LocalDate localDate = LocalDate.of(2021, Month.MAY, 13);
        java.util.Date date = java.sql.Date.valueOf(localDate);
        LocalDate newLocalDate
            = new java.sql.Date(date.getTime()).toLocalDate();

        System.out.println("localDate = " + localDate);
        System.out.println("date = " + date);
        System.out.println("newLocalDate = " + newLocalDate);

    }
}
