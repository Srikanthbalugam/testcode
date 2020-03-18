package com.ojas.registrationWithEmail.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.registrationWithEmail.Dao.Userdao;
import com.ojas.registrationWithEmail.model.UserRegistration;
import com.ojas.registrationWithEmail.service.UserService;
@Service
public class UserserviceImpl implements UserService {
	@Autowired
	private Userdao userdao;
	public void saveuser(UserRegistration user) {
		userdao.save(user);
	}
	public List<UserRegistration> getuser(){
		List<UserRegistration> findAll = userdao.findAll();
		return findAll;
		
	}
	public UserRegistration getById(Integer userid) {
		Optional<UserRegistration> optional = userdao.findById(userid);
		if(optional.isPresent()) {
			UserRegistration userRegistration = optional.get();
			return userRegistration;
		}
		return null;
	}
	
	

}
