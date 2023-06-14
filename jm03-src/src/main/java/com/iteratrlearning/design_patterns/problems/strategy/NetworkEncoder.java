package com.iteratrlearning.design_patterns.problems.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class NetworkEncoder {

    private Status status;
    private int messageTreshHoldLength;
    private Encoding encoding;

    // TODO: refactor to be parameterised with strategies
    public NetworkEncoder(Status status, Encoding encoding, int messageTreshHoldLength) {
        this.status = status;
        this.encoding = encoding;
        this.messageTreshHoldLength = messageTreshHoldLength;
    }

    // TODO: refactor to delegate to appropriate strategy
    public byte[] encode(String message) {
        if(status == Status.ENCODED && message.length() > messageTreshHoldLength) {
            if(Encoding.ZIP == encoding) {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                try {
                    ZipOutputStream zip = new ZipOutputStream(out);
                    zip.write(message.getBytes());
                    zip.close();
                    return out.toByteArray();
                }
                catch(IOException ex) {
                    return message.getBytes();
                }
            }
            else if(Encoding.GZIP == encoding) {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gzip = new GZIPOutputStream(out);
                    gzip.write(message.getBytes());
                    gzip.close();
                    return out.toByteArray();
                }
                catch(IOException ex) {
                    return message.getBytes();
                }
            }
        }
        return message.getBytes();
    }

    public void setMessageTreshHoldLength(int messageTreshHoldLength) {
        this.messageTreshHoldLength = messageTreshHoldLength;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
