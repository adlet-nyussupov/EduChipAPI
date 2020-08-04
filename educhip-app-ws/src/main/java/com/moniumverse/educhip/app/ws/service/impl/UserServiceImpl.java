package com.moniumverse.educhip.app.ws.service.impl;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.moniumverse.educhip.app.ws.entity.UserEntity;
import com.moniumverse.educhip.app.ws.exceptions.UserServiceException;
import com.moniumverse.educhip.app.ws.io.repositories.UserRepository;
import com.moniumverse.educhip.app.ws.service.UserService;
import com.moniumverse.educhip.app.ws.shared.Utils;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;
import com.moniumverse.educhip.app.ws.ui.model.response.ErrorMessages;
import com.moniumverse.educhip.app.ws.ui.model.response.OperationStatus;
import com.moniumverse.educhip.app.ws.ui.model.response.RequestOperationStatus;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByEmail(email);
		
		OperationStatus returnValue = new OperationStatus();

		if (userEntity == null) {
			throw new UsernameNotFoundException(email);
		} else if(!userEntity.getEmailVerificationStatus()) {
		//throw new UserServiceException(ErrorMessages.EMAIL_ADDRESS_NOT_VERIFIED.getErrorMessage());
		}
			

		//return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
		return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), userEntity.getEmailVerificationStatus(), true, true, true, new ArrayList<>());
		
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		
		if(userRepository.findByEmail(userDto.getEmail()) != null)
		throw new NullPointerException("User with this email has already existed");
		
		
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
		
		String publicUserId = utils.generateUserId(30);
		userEntity.setUserId(publicUserId);
		
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
		userEntity.setEmailVerificationToken(utils.generateEmailVerificationToken(publicUserId));
		userEntity.setEmailVerificationStatus(Boolean.FALSE);
		
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto userDtoReturnValue = modelMapper.map(storedUserDetails, UserDto.class);
		
		
		return userDtoReturnValue;
	}


	@Override
	public UserDto getUser(String email) {
		UserEntity userEntity = userRepository.findByEmail(email);

		if (userEntity == null)
			throw new UserServiceException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(userEntity, returnValue);

		return returnValue;

	}
	
	

}
