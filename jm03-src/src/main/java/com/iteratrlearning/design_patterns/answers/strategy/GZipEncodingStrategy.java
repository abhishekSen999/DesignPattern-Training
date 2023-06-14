package com.iteratrlearning.design_patterns.answers.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipEncodingStrategy implements EncodingStrategy {
    @Override
    public byte[] encode(String message) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(out)) {
            gzip.write(message.getBytes());
            gzip.finish();
        }
        catch(IOException ex) {
            return message.getBytes();
        }
        return out.toByteArray();
    }
}
