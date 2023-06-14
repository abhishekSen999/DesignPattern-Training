package com.iteratrlearning.design_patterns.answers.pipes;

import org.junit.Assert;
import org.junit.Test;

public class TranslateCommandTest {

    @Test
    public void shouldReplaceAllOccurrences() {

        TranslateCommand cmd = new TranslateCommand("Richard", "Sir");

        String input = "Richard is going to work to meet another Richard";
        String expectedOutput = "Sir is going to work to meet another Sir";

        Assert.assertEquals(expectedOutput, cmd.execute(input));
    }

    @Test
    public void shouldNotReplaceAnything() {
        TranslateCommand cmd = new TranslateCommand("Richard", "Sir");

        String input = "Raoul is going to work to meet Jim";

        Assert.assertEquals(input, cmd.execute(input));
    }

}
