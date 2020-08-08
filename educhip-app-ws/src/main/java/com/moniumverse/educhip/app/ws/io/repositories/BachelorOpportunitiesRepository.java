package com.moniumverse.educhip.app.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.moniumverse.educhip.app.ws.entity.BachelorOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.UserEntity;

@Repository
public interface BachelorOpportunitiesRepository extends PagingAndSortingRepository<BachelorOpportunitiesEntity, Long> {

}
