package com.hotel_like.hotellikeapplication.dao;
import org.springframework.data.repository.CrudRepository;

import com.hotel_like.hotellikeapplication.entity.User;

public interface iAuthRepository extends CrudRepository<User, Integer>{
	
	/**
	 * get user account by email and password
	 * @param email
	 * @param password
	 */
	//User findUser(String email, String password);
}
