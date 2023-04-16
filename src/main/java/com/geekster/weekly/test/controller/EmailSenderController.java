package com.geekster.weekly.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.weekly.test.constants.ApiPath;
import com.geekster.weekly.test.model.Email;
import com.geekster.weekly.test.service.EmailSenderService;

@RestController
@RequestMapping(ApiPath.EMAIL_SENDER_API)
public class EmailSenderController {

	/**
	 * Here @Autowired will look for the bean named email as specified by
	 * @Qualifier in configuration and inject it.
	 */
	@Autowired
	@Qualifier("email")
	private Email email;

	@Autowired
	private EmailSenderService emailSenderService;

	@GetMapping
	public Email sendEmail() {

		emailSenderService.sendEmail(email);
		return email;

	}

}
