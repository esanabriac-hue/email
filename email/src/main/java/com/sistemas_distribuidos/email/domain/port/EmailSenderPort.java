package com.sistemas_distribuidos.email.domain.port;

import com.sistemas_distribuidos.email.domain.model.Email;

public interface EmailSenderPort {
    void send(Email email);
}
