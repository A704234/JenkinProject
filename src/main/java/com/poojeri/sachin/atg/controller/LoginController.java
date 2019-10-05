package com.poojeri.sachin.atg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poojeri.sachin.atg.model.LoginModel;
import com.poojeri.sachin.atg.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<LoginModel> getAllUsers() {
        return this.loginService.getAllUsers();
    }
	
    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoginModel addUser(@RequestBody LoginModel user) {
        return this.loginService.addUser(user);
    }
    
    @RequestMapping(value = "/updateuser", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoginModel updateUser(@RequestBody LoginModel user) {
        return this.loginService.updateUser(user);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<LoginModel> getUser(@PathVariable int id) {
        return this.loginService.getUserById(id);
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllUsers() {
        this.loginService.deleteAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        this.loginService.deleteUserById(id);
    }
    
    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
    public String greeting() {
        /**
         *   @LocaleContextHolder.getLocale()
         *  Return the Locale associated with the given user context,if any, or the system default Locale otherwise.
         *  This is effectively a replacement for Locale.getDefault(), able to optionally respect a user-level Locale setting.
         */

        return messageSource.getMessage("good.morning", null, LocaleContextHolder.getLocale());
    }

    @RequestMapping(value = "/get-greeting-name", method = RequestMethod.GET)
    public String greetingWithName() {
        String[] params = new String[]{"Ikhiloya", "today"};
        return messageSource.getMessage("good.morning.name", params, LocaleContextHolder.getLocale());
    }
}
