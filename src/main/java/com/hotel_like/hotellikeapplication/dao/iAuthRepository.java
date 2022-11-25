package com.hotel_like.hotellikeapplication.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_like.hotellikeapplication.entity.User;

public interface iAuthRepository extends JpaRepository<User, Integer>{
	
	/**
	 * get user account by email and password
	 * @param email
	 * @param password
	 */
	User findUserByEmailAndPassword(String email, Integer password);
}
