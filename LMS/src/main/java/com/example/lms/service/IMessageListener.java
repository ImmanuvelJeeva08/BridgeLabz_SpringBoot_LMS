package com.example.lms.service;

import com.example.lms.dto.Email;

public interface IMessageListener {
    public void sendMessage(Email email);
    public void sendMessageWithLink(Email email);
}
