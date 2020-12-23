package com.moniumverse.educhip.app.ws.ui.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moniumverse.educhip.app.ws.exceptions.UserServiceException;
import com.moniumverse.educhip.app.ws.service.impl.UserServiceImpl;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;
import com.moniumverse.educhip.app.ws.ui.model.request.UserDetailsRequestModel;
import com.moniumverse.educhip.app.ws.ui.model.response.ErrorMessages;
import com.moniumverse.educhip.app.ws.ui.model.response.OperationStatus;
import com.moniumverse.educhip.app.ws.ui.model.response.RequestOperationName;
import com.moniumverse.educhip.app.ws.ui.model.response.RequestOperationStatus;
import com.moniumverse.educhip.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/users")

public class UserController {

	@Autowired
	UserServiceImpl userService;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

		if (userDetails.getFirstName().isEmpty())
			throw new NullPointerException("Object is null");

		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);

		UserDto createdUser = userService.createUser(userDto);

		UserRest userRest = modelMapper.map(createdUser, UserRest.class);

		return userRest;
	}

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserRest getUser(@PathVariable String id) {

		UserRest returnValue = new UserRest();
		UserDto userDto = userService.getUserById(id);
		ModelMapper modelMapper = new ModelMapper();

		if (userDto.getFirstName().isEmpty())
			throw new UserServiceException(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());

		return modelMapper.map(userDto, UserRest.class);
	}

	@GetMapping(path = "/email-verification", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public OperationStatus verifyEmailToken(@RequestParam(value = "token") String token) {

		OperationStatus returnValue = new OperationStatus();

		returnValue.setOperationName(RequestOperationName.VERIFY_EMAIL.name());

		boolean isVerified = userService.verifyEmailToken(token);

		if (isVerified) {
			returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
		} else {
			returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
		}

		return returnValue;
	}

}
