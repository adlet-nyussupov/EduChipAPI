package com.moniumverse.educhip.app.ws.ui.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moniumverse.educhip.app.ws.service.impl.UserServiceImpl;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;
import com.moniumverse.educhip.app.ws.ui.model.request.UserDetailsRequestModel;
import com.moniumverse.educhip.app.ws.ui.model.response.UserRest;



@RestController
@RequestMapping("/users")

public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	
	@PostMapping (produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		if(userDetails.getFirstName().isEmpty())
			throw new NullPointerException("Object is null");
		
		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
		
		UserDto createdUser = userService.createUser(userDto);
		
		
		UserRest userRest =  modelMapper.map(createdUser, UserRest.class);
		
		
		
		
		return userRest;
		
		
		
		
	}

}
