package com.sistemas_distribuidos.email.domain.model;

public class Email {

    private String to;
    private String message;

    public Email(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }
}
