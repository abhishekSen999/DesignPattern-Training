package com.iteratrlearning.design_patterns.examples.adapter;

public class LegacyAPI {

    public static void process(Resource resource) {
        System.out.println(resource.read());
    }

}
