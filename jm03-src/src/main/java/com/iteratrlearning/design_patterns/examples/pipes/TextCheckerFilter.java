package com.iteratrlearning.design_patterns.examples.pipes;

import java.util.Arrays;

public class TextCheckerFilter extends ProcessingFilter<String>
{
    private final static String[] forbiddenWords = {"isn't", "i'm", "don't"};

    @Override
    protected String process(String input)
    {
        if (!containsForbiddenWord(input))
        {
            return input;
        }
        return null;
    }

    private boolean containsForbiddenWord(String message)
    {
        return Arrays.stream(forbiddenWords).anyMatch(message::contains);
    }
}
