package com.example.demo.email;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	public void sendEmail(SimpleMailMessage email);
}
