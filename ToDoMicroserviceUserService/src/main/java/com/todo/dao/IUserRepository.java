package com.todo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.todo.model.User;

/**
 * purpose: User repository to implements mongo services
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/07/18
 */
public interface IUserRepository extends MongoRepository<User, String> {
	public Optional<User> findByEmail(String email);

}
