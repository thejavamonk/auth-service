package com.authservice.authmodel.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.authservice.authmodel.User;


public interface UserRepo extends Repository<User, Long>{
	
    Collection<User> findAll();
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);
    User save(User account);
    void deleteUserById(Long id);
}
