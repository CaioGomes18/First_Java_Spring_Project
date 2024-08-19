package com.devcaio.userdepart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaio.userdepart.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
