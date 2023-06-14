package com.iteratrlearning.design_patterns.answers.strategy;

import com.iteratrlearning.design_patterns.problems.strategy.Status;

public class NetworkEncoder {

    public int messageThresholdLength;
    private Status status;
    private EncodingStrategy encodingStrategy;

    public NetworkEncoder(Status status, EncodingStrategy encodingStrategy, int messageThresholdLength) {
        this.status = status;
        this.messageThresholdLength = messageThresholdLength;
        this.encodingStrategy = encodingStrategy;
    }

    public byte[] encode(String message) {
        if(status == Status.ENCODED && isAboveThreshold(message)) {
            return encodingStrategy.encode(message);
        }
        else {
            return message.getBytes();
        }
    }

    private boolean isAboveThreshold(String message) {
        return message.length() > messageThresholdLength;
    }

    public NetworkEncoder(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
