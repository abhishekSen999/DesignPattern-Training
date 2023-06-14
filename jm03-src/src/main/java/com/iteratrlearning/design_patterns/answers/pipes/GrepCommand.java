package com.iteratrlearning.design_patterns.answers.pipes;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class GrepCommand extends UnixCommand<String> {

    private String word;

    public GrepCommand(String word) {
        this.word = word;
    }


    @Override
    protected String process(String input) {
        String lines[] = input.split("\\r?\\n");

        return Arrays.stream(lines)
              .filter(line -> line.contains(word))
              .collect(joining("\n"));
    }
}
