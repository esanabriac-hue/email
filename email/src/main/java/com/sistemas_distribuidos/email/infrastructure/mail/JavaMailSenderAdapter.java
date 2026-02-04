package com.sistemas_distribuidos.email.infrastructure.mail;

import com.sistemas_distribuidos.email.domain.model.Email;
import com.sistemas_distribuidos.email.domain.port.EmailSenderPort;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class JavaMailSenderAdapter implements EmailSenderPort {

    private final JavaMailSender mailSender;

    public JavaMailSenderAdapter(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void send(Email email) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(email.getTo());
        mail.setSubject("Mensaje desde la API");
        mail.setText(email.getMessage());
        mailSender.send(mail);
    }
}

