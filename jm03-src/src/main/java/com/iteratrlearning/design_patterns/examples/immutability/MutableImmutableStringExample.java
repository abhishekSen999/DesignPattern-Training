package com.iteratrlearning.design_patterns.examples.immutability;

public class MutableImmutableStringExample
{
    public static void main(String[] args)
    {
        // Immutable
        String name = "Vin";
        String newName = name.concat("Diesel");
        System.out.println(name);
        System.out.println(newName);

        // Mutable
        StringBuilder mutableName = new StringBuilder("Vin");
        mutableName.append("Diesel");
        System.out.println(mutableName);
    }
}
