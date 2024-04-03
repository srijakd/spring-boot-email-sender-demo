package com.example.emailnotification;

import org.springframework.stereotype.Service;

@Service
public class MyEmailService {

    private final MailSenderService mailSenderService;

    public MyEmailService(MailSenderService mailSenderService) {
        this.mailSenderService = mailSenderService;
    }

    public void sendEmail() {
        String recipientEmail = "recipientEmail@gmail.com";
        String subject = "Test Email";
        String body = "This is a test email sent from my Spring Boot application.";

        mailSenderService.sendNewMail(recipientEmail, subject, body);
    }
}
