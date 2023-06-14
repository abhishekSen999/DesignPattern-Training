package com.iteratrlearning.design_patterns.examples.strategy;

import java.time.LocalDateTime;

public class Email {

    private final String message;
    private final String sender;
    private final String recipient;
    private final LocalDateTime localDateTime;

    public Email(String message, String sender, String recipient, LocalDateTime localDateTime) {
        this.message = message;
        this.sender = sender;
        this.recipient = recipient;
        this.localDateTime = localDateTime;
    }


    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Email{" +
                "message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
