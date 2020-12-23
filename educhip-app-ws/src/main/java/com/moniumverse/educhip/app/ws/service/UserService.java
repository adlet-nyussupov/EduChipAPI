package com.moniumverse.educhip.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.moniumverse.educhip.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	public UserDto createUser(UserDto userDto);
	public UserDto getUser(String email);
	public UserDto getUserById(String userId);
	boolean verifyEmailToken(String token);
		
}
