package com.iteratrlearning.design_patterns.examples.pipes;

public class LatexToUnicodeFilter extends ProcessingFilter<String> {
    @Override
    protected String process(String input) {
        return input
                .replaceAll("\\\\alpha", "α")
                .replaceAll("\\\\beta", "β");
    }
}
