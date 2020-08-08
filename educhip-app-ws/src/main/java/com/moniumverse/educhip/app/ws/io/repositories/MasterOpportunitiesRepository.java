package com.moniumverse.educhip.app.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.moniumverse.educhip.app.ws.entity.MasterOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.UserEntity;

@Repository
public interface MasterOpportunitiesRepository extends PagingAndSortingRepository<MasterOpportunitiesEntity, Long> {

}
