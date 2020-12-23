package com.moniumverse.educhip.app.ws.ui.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moniumverse.educhip.app.ws.service.OpportunitiesService;
import com.moniumverse.educhip.app.ws.shared.dto.OpportunitiesDto;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;
import com.moniumverse.educhip.app.ws.ui.model.request.OpportunititesRequestModel;
import com.moniumverse.educhip.app.ws.ui.model.request.UserDetailsRequestModel;
import com.moniumverse.educhip.app.ws.ui.model.response.OpportunitiesResponse;
import com.moniumverse.educhip.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/opportunities")
public class OpportunitiesController {

	@Autowired
	OpportunitiesService opportunitiesService;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<OpportunitiesResponse> getUsers(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "2") int limit, @PathVariable String id) {

		List<OpportunitiesResponse> returnValue = new ArrayList<>();

		ModelMapper modelMapper = new ModelMapper();

		List<OpportunitiesDto> opportunities = opportunitiesService.getOpportunities(id, page, limit);

		for (OpportunitiesDto opportunitiesDto : opportunities) {

			OpportunitiesResponse opportunityModelResponse = modelMapper.map(opportunitiesDto,
					OpportunitiesResponse.class);

			returnValue.add(opportunityModelResponse);

		}

		return returnValue;

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<OpportunitiesResponse> createOpportunitites(
			@RequestBody List<OpportunititesRequestModel> opportunititesRequestModelList) {

		for (OpportunititesRequestModel opportunititesRequestModel : opportunititesRequestModelList) {

			if (opportunititesRequestModel.getOpportunityType().isEmpty())
				throw new NullPointerException("Opportunity type is null");
		}

		ModelMapper modelMapper = new ModelMapper();
		
		
		List<OpportunitiesDto> opportunitiesDtoList = Arrays.asList(modelMapper.map(opportunititesRequestModelList, OpportunitiesDto[].class));
				
		
		

		List<OpportunitiesDto> createdOpportunitiesList = opportunitiesService.createOpportunities(opportunitiesDtoList);

		List<OpportunitiesResponse> opportunitiesResponseList = Arrays.asList(modelMapper.map(createdOpportunitiesList, OpportunitiesResponse[].class));

		return opportunitiesResponseList;

	}

}
