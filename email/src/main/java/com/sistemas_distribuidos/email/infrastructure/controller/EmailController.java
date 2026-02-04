package com.sistemas_distribuidos.email.infrastructure.controller;

import com.sistemas_distribuidos.email.application.dtos.EmailRequest;
import com.sistemas_distribuidos.email.application.service.SendEmailUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    private final SendEmailUseCase sendEmailUseCase;

    public EmailController(SendEmailUseCase sendEmailUseCase) {
        this.sendEmailUseCase = sendEmailUseCase;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailRequest request) {
        sendEmailUseCase.execute(request.getTo(), request.getMessage());
    }
}
