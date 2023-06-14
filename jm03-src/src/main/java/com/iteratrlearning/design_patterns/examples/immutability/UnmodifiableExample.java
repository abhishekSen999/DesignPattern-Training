package com.iteratrlearning.design_patterns.examples.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {

    public static void main(String[] args) {

        //1.
        List<String> jedis = new ArrayList<>();
        jedis.add("Luke Skywalker");

        System.out.println(jedis);

        //2.
        List<String> cantChangeMe = Collections.unmodifiableList(jedis);
        // java.lang.UnsupportedOperationException
//        cantChangeMe.add("Darth Vader");

//        System.out.println(cantChangeMe);

          //3.
//        jedis.add("Darth Vader");
//        System.out.println(cantChangeMe);

    }
}
