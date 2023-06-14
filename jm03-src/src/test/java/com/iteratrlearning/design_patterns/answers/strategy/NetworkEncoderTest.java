package com.iteratrlearning.design_patterns.answers.strategy;

import com.iteratrlearning.design_patterns.problems.strategy.Status;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkEncoderTest {

    @Test
    public void shouldEncodePlainWhenSlowAndBelowThreshold() {
        String input = "Hello";
        NetworkEncoder networkEncoder = new NetworkEncoder(Status.ENCODED, new ZipEncodingStrategy(), 10);

        assertArrayEquals(input.getBytes(), networkEncoder.encode(input));
    }

    @Test
    public void shouldEncodeZipWhenSlowAndAboveThreshold() {
        String input = "Hello World! How are you";
        NetworkEncoder networkEncoder = new NetworkEncoder(Status.ENCODED, new ZipEncodingStrategy(), 10);

        byte[] expectedOutput = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 32, 72, 111, 119, 32, 97,
                114, 101, 32, 121, 111, 117};

        assertArrayEquals(expectedOutput, networkEncoder.encode(input));
    }

    @Test
    public void shouldEncodeGZipWhenSlowAndAboveThreshold() {
        String input = "Hello World! How are you";
        NetworkEncoder networkEncoder = new NetworkEncoder(Status.ENCODED, new GZipEncodingStrategy(), 10);

        final byte[] output = networkEncoder.encode(input);
        assertEquals(44, output.length);
        assertEquals(31, output[0]);
        assertEquals(-117, output[1]);
    }

    @Test
    public void shouldEncodePlainWhenFastStatusAndAboveThreshold(){
        String input = "Hello";
        NetworkEncoder networkEncoder = new NetworkEncoder(Status.FAST, new ZipEncodingStrategy(), 30);

        assertArrayEquals(input.getBytes(), networkEncoder.encode(input));
    }

}
