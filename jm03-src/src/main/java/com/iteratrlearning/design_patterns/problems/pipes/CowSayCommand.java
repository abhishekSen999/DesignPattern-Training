package com.iteratrlearning.design_patterns.problems.pipes;

import com.github.ricksbrown.cowsay.Cowsay;

public class CowSayCommand extends UnixCommand<String> {
    @Override
    protected String process(String input) {
        String[] args = new String[1];
        args[0] = input;
        return Cowsay.say(args);
    }
}
