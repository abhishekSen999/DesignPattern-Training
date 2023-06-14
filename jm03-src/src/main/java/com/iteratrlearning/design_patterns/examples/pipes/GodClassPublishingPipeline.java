package com.iteratrlearning.design_patterns.examples.pipes;

import java.util.Arrays;

public class GodClassPublishingPipeline
{

    public static void main(String[] args)
    {
        // 1.
        String message = "I am feeling \\beta!";
        //2.
        //        String message = "i'm feeling \\beta!";

        String[] forbiddenWords = {"isn't", "i'm", "don't"};
        String messageLowerCase = message.toLowerCase();
        if (Arrays.stream(forbiddenWords).noneMatch(messageLowerCase::contains))
        {
            String converted = message.replaceAll("\\\\alpha", "α").replaceAll("\\\\beta", "β");
            System.out.println("Uploading to S3 ... " + converted);
        }
    }
}
