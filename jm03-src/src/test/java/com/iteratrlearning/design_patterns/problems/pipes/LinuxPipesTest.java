package com.iteratrlearning.design_patterns.problems.pipes;

import com.github.ricksbrown.cowsay.Cowsay;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class LinuxPipesTest
{

    @Test
    public void shouldConnectAllTheCommands()
    {
        GrepCommand grepJava = new GrepCommand("Java");
        TranslateCommand replaceRichard = new TranslateCommand("Richard", "Dr. Richard");
        CowSayCommand cowsay = new CowSayCommand();

        //TODO: uncomment
//        grepJava.setSuccessor(replaceRichard);
//        replaceRichard.setSuccessor(cowsay);

        String result = null;
        // result = grepJava.execute("Richard loves Java\nBut also loves C# :-(");

        String[] cowsayArgs = {"Dr. Richard loves Java\n"};
        String expected = Cowsay.say(cowsayArgs);
        Assert.assertEquals(expected, result);
    }

}
