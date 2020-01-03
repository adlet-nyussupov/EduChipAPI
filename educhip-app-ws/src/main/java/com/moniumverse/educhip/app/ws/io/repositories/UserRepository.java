package com.moniumverse.educhip.app.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.moniumverse.educhip.app.ws.entity.UserEntity;



@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>{
	
	UserEntity findByUserId(String userId);
	UserEntity findByEmail(String userEmail);
	
	
}
