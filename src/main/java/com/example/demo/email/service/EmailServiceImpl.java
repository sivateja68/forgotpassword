package com.example.demo.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;

import com.example.demo.email.EmailService;

public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	@Async
	public void sendEmail(SimpleMailMessage email) {
		mailSender.send(email);
	}

}
