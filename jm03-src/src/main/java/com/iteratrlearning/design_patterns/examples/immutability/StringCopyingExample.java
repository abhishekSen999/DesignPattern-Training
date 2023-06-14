package com.iteratrlearning.design_patterns.examples.immutability;

public class StringCopyingExample
{
    public static final int ITERATIONS = 100;

    public static void main(String[] args)
    {
        String result = immutableCopy();
        System.out.println(result);
        result = mutableCopy();
        System.out.println(result);
    }

    // O(N^2)
    static String immutableCopy()
    {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++)
        {
            result += i;
        }
        return result;
    }

    // O(N)
    static String mutableCopy()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++)
        {
            result.append(i);
        }
        return result.toString();
    }

}
