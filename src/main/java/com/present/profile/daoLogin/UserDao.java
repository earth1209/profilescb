package com.present.profile.daoLogin;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.present.profile.LoginModel.DAOUser;



@Repository
public interface UserDao extends CrudRepository<DAOUser, Long> {
	
	DAOUser findByUsername(String username);
	
}