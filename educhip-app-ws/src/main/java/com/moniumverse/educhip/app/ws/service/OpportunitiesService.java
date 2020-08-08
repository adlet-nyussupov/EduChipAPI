package com.moniumverse.educhip.app.ws.service;

import java.util.List;

import com.moniumverse.educhip.app.ws.shared.dto.OpportunitiesDto;
import com.moniumverse.educhip.app.ws.ui.model.response.OpportunitiesResponse;

public interface OpportunitiesService {

	public List<OpportunitiesDto> getOpportunities(String userId, int page, int limit);

	public List<OpportunitiesDto> createOpportunities(List<OpportunitiesDto> opportunitiesDtoList);

}
