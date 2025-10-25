package com.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.entities.User;

public interface UserRepository  extends CrudRepository <User, Integer>{
	

}
