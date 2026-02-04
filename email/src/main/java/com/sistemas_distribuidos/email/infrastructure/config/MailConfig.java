package com.sistemas_distribuidos.email.infrastructure.config;

import com.sistemas_distribuidos.email.application.service.SendEmailUseCase;
import com.sistemas_distribuidos.email.domain.port.EmailSenderPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {

    @Bean
    public SendEmailUseCase sendEmailUseCase(EmailSenderPort emailSenderPort) {
        return new SendEmailUseCase(emailSenderPort);
    }
}

