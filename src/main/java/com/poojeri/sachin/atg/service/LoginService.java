package com.poojeri.sachin.atg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.poojeri.sachin.atg.dao.LoginDAO;
import com.poojeri.sachin.atg.model.LoginModel;

@Service
public class LoginService {

		@Autowired
		LoginDAO loginDAO;
		
		public List<LoginModel> getAllUsers(){
			return this.loginDAO.findAll();
		}
		
		public LoginModel addUser(LoginModel user) {
			return this.loginDAO.save(user);
		}
		
	    public Optional<LoginModel> getUserById(int id) {
	        return this.loginDAO.findById(id);
	    }
		
	    public LoginModel updateUser(LoginModel user) {
	        return this.loginDAO.save(user);
	    }

	    public void deleteUserById(int id) {
	        this.loginDAO.deleteById(id);
	    }

	    public void deleteAllUsers() {
	        this.loginDAO.deleteAll();
	    }
}
