package com.application.productsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.productsale.model.Users;

public interface UserRespository extends JpaRepository<Users, Integer> {
	

}
