package com.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		
}
