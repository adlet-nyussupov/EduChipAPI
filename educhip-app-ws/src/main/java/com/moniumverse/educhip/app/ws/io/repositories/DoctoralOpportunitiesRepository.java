package com.moniumverse.educhip.app.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.moniumverse.educhip.app.ws.entity.DoctoralOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.UserEntity;

@Repository
public interface DoctoralOpportunitiesRepository extends PagingAndSortingRepository<DoctoralOpportunitiesEntity, Long> {

}
