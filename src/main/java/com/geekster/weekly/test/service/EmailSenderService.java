package com.geekster.weekly.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.geekster.weekly.test.model.Email;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(email.getSenderMail());
		message.setTo(email.getRecipientMail());
		message.setText(email.getBody());
		message.setSubject(email.getSubject());
		mailSender.send(message);
	}

}
