package com.iteratrlearning.design_patterns.answers.pipes;

import com.github.ricksbrown.cowsay.Cowsay;
import org.junit.Assert;
import org.junit.Test;

public class LinuxPipesTest {

    @Test
    public void shouldConnectAllTheCommands() {
        GrepCommand grepJava = new GrepCommand("Java");
        TranslateCommand replaceRichard = new TranslateCommand("Richard", "Dr. Richard");
        CowSayCommand cowsay = new CowSayCommand();

        grepJava.setSuccessor(replaceRichard);
        replaceRichard.setSuccessor(cowsay);

        String result = grepJava.execute("Richard loves Java\nBut also loves C# :-(");
        String[] cowsayArgs = {"Dr. Richard loves Java"};
        String expected = Cowsay.say(cowsayArgs);

        System.out.println(expected);
        Assert.assertEquals(expected, result);
    }



}
