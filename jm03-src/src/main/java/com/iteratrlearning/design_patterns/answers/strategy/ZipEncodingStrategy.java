package com.iteratrlearning.design_patterns.answers.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class ZipEncodingStrategy implements EncodingStrategy {
    @Override
    public byte[] encode(String message) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ZipOutputStream zip = new ZipOutputStream(out)) {
            zip.write(message.getBytes());
        }
        catch(IOException ex) {
            return message.getBytes();
        }
        return out.toByteArray();
    }
}
