package com.geekster.weekly.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.geekster.weekly.test.constants.EmailConstants;
import com.geekster.weekly.test.model.Email;

@Configuration
public class EmailConfiguration {

	@Bean("email")
	Email getEmail() {

		return new Email(EmailConstants.SENDER_EMAIL, "edwardmaya094@gmail.com", "Demo Mail",
				"Hi Edward \n \n This is a demo mail. Do not reply. \n \n Thanks and Regards \n Mitesh");

	}

}
