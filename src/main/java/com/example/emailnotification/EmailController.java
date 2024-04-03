package com.example.emailnotification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final MyEmailService emailService;

    public EmailController(MyEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail() {
        emailService.sendEmail();
        return ResponseEntity.ok("Email sent successfully");
    }
}

