package com.moniumverse.educhip.app.ws.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.moniumverse.educhip.app.ws.entity.UserEntity;
import com.moniumverse.educhip.app.ws.io.repositories.UserRepository;
import com.moniumverse.educhip.app.ws.service.UserService;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		
		if(userRepository.findByEmail(userDto.getEmail()) != null)
		throw new NullPointerException("User with this email has already existed");
		
		
		ModelMapper modelMapper = new ModelMapper();
		UserEntity entity = modelMapper.map(userDto, UserEntity.class);
		
		userRepository.save(entity);
		
		
		
		
		return null;
	}


	@Override
	public UserDto getUser(String userName) {
	
		return null;
	}
	
	

}
