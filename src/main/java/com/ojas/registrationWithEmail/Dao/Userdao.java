package com.ojas.registrationWithEmail.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.registrationWithEmail.model.UserRegistration;
@Repository
public interface Userdao extends JpaRepository<UserRegistration, Integer> {

}
