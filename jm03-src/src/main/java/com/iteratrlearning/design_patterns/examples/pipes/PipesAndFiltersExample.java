package com.iteratrlearning.design_patterns.examples.pipes;

public class PipesAndFiltersExample {


    public static void main(String[] args) {

        ProcessingFilter<String> textChecker = new TextCheckerFilter();
        ProcessingFilter<String> latextToUnicode = new LatexToUnicodeFilter();
        ProcessingFilter<String> s3uploader = new S3UploaderFilter();

        textChecker.setSuccessor(latextToUnicode);
        latextToUnicode.setSuccessor(s3uploader);

        //1.
        String message = "I am feeling \\beta!";
        //2.
//        String message = "i'm feeling \\beta!";
        textChecker.handle(message);
    }
}
