package com.iteratrlearning.design_patterns.examples.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ExceptionControlFlow {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Raoul", "Richard");
        Iterator<String> iterator = names.iterator();
        try {
            while (true) {
                System.out.println(iterator.next());
            }
        }
        catch(NoSuchElementException e) {

        }
    }
}
