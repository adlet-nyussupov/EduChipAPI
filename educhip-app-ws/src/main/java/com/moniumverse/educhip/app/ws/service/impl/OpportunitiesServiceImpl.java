package com.moniumverse.educhip.app.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.moniumverse.educhip.app.ws.entity.AssociateOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.BachelorOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.DoctoralOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.MasterOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.UserEntity;
import com.moniumverse.educhip.app.ws.exceptions.OpportunitiesServiceException;
import com.moniumverse.educhip.app.ws.exceptions.UserServiceException;
import com.moniumverse.educhip.app.ws.io.repositories.AssociateOpportunitiesRepository;
import com.moniumverse.educhip.app.ws.io.repositories.BachelorOpportunitiesRepository;
import com.moniumverse.educhip.app.ws.io.repositories.DoctoralOpportunitiesRepository;
import com.moniumverse.educhip.app.ws.io.repositories.MasterOpportunitiesRepository;
import com.moniumverse.educhip.app.ws.io.repositories.UserRepository;
import com.moniumverse.educhip.app.ws.service.OpportunitiesService;
import com.moniumverse.educhip.app.ws.shared.Utils;
import com.moniumverse.educhip.app.ws.shared.dto.OpportunitiesDto;
import com.moniumverse.educhip.app.ws.shared.dto.UserDto;
import com.moniumverse.educhip.app.ws.ui.model.response.ErrorMessages;


@Service
public class OpportunitiesServiceImpl implements OpportunitiesService {

	@Autowired
	AssociateOpportunitiesRepository associateOpportunitiesRepository;

	@Autowired
	BachelorOpportunitiesRepository bachelorOpportunitiesRepository;

	@Autowired
	DoctoralOpportunitiesRepository doctoralOpportunitiesRepository;

	@Autowired
	MasterOpportunitiesRepository masterOpportunitiesRepository;
	
	@Autowired
	Utils utils;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<OpportunitiesDto> getOpportunities(String userId, int page, int limit) {

		UserEntity userEntity = userRepository.findByUserId(userId);

		ModelMapper mapper = new ModelMapper();

		if (userEntity == null)
			throw new UserServiceException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

		List<OpportunitiesDto> returnValue = new ArrayList<>();

		if (page > 0)
			page = page - 1;

		Pageable pageableRequest = PageRequest.of(page, limit);

		switch (userEntity.getApplyingEducationDegree()) {
		case "Doctoral":
			Page<DoctoralOpportunitiesEntity> doctoralOpportunitiesPage = doctoralOpportunitiesRepository
					.findAll(pageableRequest);
			List<DoctoralOpportunitiesEntity> doctoralOpportunitiesList = doctoralOpportunitiesPage.getContent();

			for (DoctoralOpportunitiesEntity doctoralOpportunitiesEntity : doctoralOpportunitiesList) {

				OpportunitiesDto opportunitiesDto = mapper.map(doctoralOpportunitiesEntity, OpportunitiesDto.class);

				returnValue.add(opportunitiesDto);

			}

			break;
		case "Master":
			Page<MasterOpportunitiesEntity> masterOpportunitiesPage = masterOpportunitiesRepository
					.findAll(pageableRequest);
			List<MasterOpportunitiesEntity> masterOpportunitiesList = masterOpportunitiesPage.getContent();

			for (MasterOpportunitiesEntity masterOpportunitiesEntity : masterOpportunitiesList) {

				OpportunitiesDto opportunitiesDto = mapper.map(masterOpportunitiesEntity, OpportunitiesDto.class);

				returnValue.add(opportunitiesDto);

			}

			break;
		case "Bachelor":
			Page<BachelorOpportunitiesEntity> bachelorOpportunitiesPage = bachelorOpportunitiesRepository
					.findAll(pageableRequest);
			List<BachelorOpportunitiesEntity> bachelorOpportunitiesList = bachelorOpportunitiesPage.getContent();

			for (BachelorOpportunitiesEntity bachelorOpportunitiesEntity : bachelorOpportunitiesList) {

				OpportunitiesDto opportunitiesDto = mapper.map(bachelorOpportunitiesEntity, OpportunitiesDto.class);

				returnValue.add(opportunitiesDto);

			}

			break;
		case "Associate":
			Page<AssociateOpportunitiesEntity> associateOpportunitiesPage = associateOpportunitiesRepository
					.findAll(pageableRequest);
			List<AssociateOpportunitiesEntity> associateOpportunitiesList = associateOpportunitiesPage.getContent();

			for (AssociateOpportunitiesEntity associateOpportunitiesEntity : associateOpportunitiesList) {

				OpportunitiesDto opportunitiesDto = mapper.map(associateOpportunitiesEntity, OpportunitiesDto.class);

				returnValue.add(opportunitiesDto);

			}

			break;

		}

		if (returnValue.isEmpty())
			throw new OpportunitiesServiceException(ErrorMessages.DEGREE_IS_NOT_FOUND.getErrorMessage());

		return returnValue;
	}

	@Override
	public List<OpportunitiesDto> createOpportunities(List<OpportunitiesDto> opportunitiesDtoList) {

		ModelMapper modelMapper = new ModelMapper();
		List<OpportunitiesDto> returnValue = new ArrayList<OpportunitiesDto>();

		for (OpportunitiesDto opportunitiesDto : opportunitiesDtoList) {

			switch (opportunitiesDto.getOpportunityType()) {

			case "Master":
				MasterOpportunitiesEntity masterOpportunitiesEntity = modelMapper.map(opportunitiesDto,
						MasterOpportunitiesEntity.class);
				masterOpportunitiesEntity.setOpportunityId(utils.generateUserId(30));
				MasterOpportunitiesEntity storedMasterOpportunitiesEntity = masterOpportunitiesRepository
						.save(masterOpportunitiesEntity);
				returnValue.add(modelMapper.map(storedMasterOpportunitiesEntity, OpportunitiesDto.class));
				break;
			case "Doctoral":
				DoctoralOpportunitiesEntity doctoralOpportunitiesEntity = modelMapper.map(opportunitiesDto,
						DoctoralOpportunitiesEntity.class);
				DoctoralOpportunitiesEntity storedDoctoralOpportunitiesEntity = doctoralOpportunitiesRepository
						.save(doctoralOpportunitiesEntity);
				returnValue.add(modelMapper.map(storedDoctoralOpportunitiesEntity, OpportunitiesDto.class));
				break;
			case "Associate":
				AssociateOpportunitiesEntity associateOpportunitiesEntity = modelMapper.map(opportunitiesDto,
						AssociateOpportunitiesEntity.class);
				AssociateOpportunitiesEntity storedAssociateOpportunitiesEntity = associateOpportunitiesRepository
						.save(associateOpportunitiesEntity);
				returnValue.add(modelMapper.map(storedAssociateOpportunitiesEntity, OpportunitiesDto.class));
				break;
			case "Bachelor":
				BachelorOpportunitiesEntity bachelorOpportunitiesEntity = modelMapper.map(opportunitiesDto,
						BachelorOpportunitiesEntity.class);
				BachelorOpportunitiesEntity storedBachelorOpportunitiesEntity = bachelorOpportunitiesRepository
						.save(bachelorOpportunitiesEntity);
				returnValue.add(modelMapper.map(storedBachelorOpportunitiesEntity, OpportunitiesDto.class));

			}

		}

		return returnValue;

	}

}
