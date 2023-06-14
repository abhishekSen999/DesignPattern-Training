package com.iteratrlearning.design_patterns.answers.pipes;

import org.junit.Assert;
import org.junit.Test;

public class GrepCommandTest {

    @Test
    public void shouldFilterLines() {
        GrepCommand cmd = new GrepCommand("Richard");

        String input = "Richard is\nrelaxing by the\npool\nwith another Richard";
        String expected = "Richard is\nwith another Richard";

        Assert.assertEquals(expected, cmd.execute(input));
    }

    @Test
    public void shouldNotAnyFilterLines() {
        GrepCommand cmd = new GrepCommand("Raoul");

        String input = "Richard is\nrelaxing by the\npool\nwith another Richard";

        Assert.assertEquals("", cmd.execute(input));
    }


}
