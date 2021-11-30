package net.abhishek.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.abhishek.springboot.dto.UserRegistrationDto;
import net.abhishek.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
