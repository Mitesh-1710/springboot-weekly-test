package com.geekster.weekly.test.model;

import org.springframework.stereotype.Component;

@Component
public class Email {

	private String senderMail;
	private String recipientMail;
	private String subject;
	private String body;

	public Email() {
		
	}

	public Email(String senderMail, String recipientMail, String subject, String body) {
		super();
		this.senderMail = senderMail;
		this.recipientMail = recipientMail;
		this.subject = subject;
		this.body = body;
	}

	public String getSenderMail() {
		return senderMail;
	}

	public void setSenderMail(String senderMail) {
		this.senderMail = senderMail;
	}

	public String getRecipientMail() {
		return recipientMail;
	}

	public void setRecipientMail(String recipientMail) {
		this.recipientMail = recipientMail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
