package com.sistemas_distribuidos.email.application.service;

import com.sistemas_distribuidos.email.domain.model.Email;
import com.sistemas_distribuidos.email.domain.port.EmailSenderPort;

public class SendEmailUseCase {

    private final EmailSenderPort emailSenderPort;

    public SendEmailUseCase(EmailSenderPort emailSenderPort) {
        this.emailSenderPort = emailSenderPort;
    }

    public void execute(String to, String message) {
        Email email = new Email(to, message);
        emailSenderPort.send(email);
    }
}