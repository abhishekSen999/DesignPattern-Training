package com.iteratrlearning.design_patterns.examples.pipes;

public class S3UploaderFilter extends ProcessingFilter<String> {
    @Override
    protected String process(String input) {
        System.out.println("Uploading to S3: " + input);
        return null;
    }
}
