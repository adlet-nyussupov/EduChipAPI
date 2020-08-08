package com.moniumverse.educhip.app.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.moniumverse.educhip.app.ws.entity.AssociateOpportunitiesEntity;
import com.moniumverse.educhip.app.ws.entity.UserEntity;

@Repository
public interface AssociateOpportunitiesRepository extends PagingAndSortingRepository<AssociateOpportunitiesEntity, Long> {

}
