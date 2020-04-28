package com.authservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authservice.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
    List<User> findAll();
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);
    User save(User account);
    void deleteUserById(Long id);
}
