package com.iteratrlearning.design_patterns.answers.pipes;

public class TranslateCommand extends UnixCommand<String> {

    private String before;
    private String after;

    public TranslateCommand(String before, String after) {
        this.before = before;
        this.after = after;
    }

    @Override
    protected String process(String input) {
        return input.replaceAll(before, after);
    }
}
