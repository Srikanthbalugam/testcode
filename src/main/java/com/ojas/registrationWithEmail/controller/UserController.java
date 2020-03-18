package com.ojas.registrationWithEmail.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.registrationWithEmail.model.UserRegistration;
import com.ojas.registrationWithEmail.serviceImpl.UserserviceImpl;
import com.ojas.registrationWithEmail.util.SendEmailAfterRegistration;

@RestController
@RequestMapping("register")
public class UserController {
	@Autowired
	private UserserviceImpl impl;
	@Autowired
	private SendEmailAfterRegistration sendEmailAfterRegistration;

	@PostMapping
	public String usercon(@RequestBody UserRegistration userRegistration) throws MessagingException {
		System.out.println(userRegistration.getUseremail());
		impl.saveuser(userRegistration);

		sendEmailAfterRegistration.sendmail(userRegistration);

		return "success";
	}

	@GetMapping
	public List<UserRegistration> getuser() {
		return impl.getuser();
	}

	@GetMapping("user")
	public UserRegistration getById(@RequestParam("userid") Integer userid) {
		return impl.getById(userid);

	}
}
