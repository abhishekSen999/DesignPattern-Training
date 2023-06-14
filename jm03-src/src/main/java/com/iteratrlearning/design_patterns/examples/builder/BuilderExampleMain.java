package com.iteratrlearning.design_patterns.examples.builder;

public class BuilderExampleMain {

    public static void main(String[] args) {

        Message message = Message.builder()
                .content("World")
//                .sender(new Sender("hello@world.com"))
//                .title("Hello")
                .build();

        System.out.println(message);
    }
}
