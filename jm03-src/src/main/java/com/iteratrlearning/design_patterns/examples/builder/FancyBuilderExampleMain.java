package com.iteratrlearning.design_patterns.examples.builder;

public class FancyBuilderExampleMain {

    public static void main(String[] args) {

        Message incompleteMessage = Message.builder()
                .content("World")
                .sender(new Sender("hello@world.com"))
                .title("Hello")
                .build();

        Message completeMessage = Message.fancyBuilder()
                .sender(new Sender("hello@world.com"))
                .title("Hello")
                .content("World");

        System.out.println(incompleteMessage);
        System.out.println(completeMessage);
    }
}