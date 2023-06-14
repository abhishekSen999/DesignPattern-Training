package com.iteratrlearning.design_patterns.examples.pipes;

import java.util.function.Function;

public class FunctionCompositionExample {

    public static void main(String[] args) {

        Function<String, String> toUpperCase = String::toUpperCase;

        String result = toUpperCase.andThen(FunctionCompositionExample::convertToLeet)
                .andThen(FunctionCompositionExample::reverse)
                .apply("Hello Netherlands!");

        System.out.println(result);
    }

    static public String convertToLeet(String input) {
        return input.replaceAll("a", "4").replaceAll("e", "3");
    }

    static public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}
