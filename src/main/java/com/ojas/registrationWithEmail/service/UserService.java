package com.ojas.registrationWithEmail.service;

import org.springframework.stereotype.Service;

import com.ojas.registrationWithEmail.model.UserRegistration;

@Service
public interface UserService {
	
	 public void saveuser(UserRegistration user);

}
