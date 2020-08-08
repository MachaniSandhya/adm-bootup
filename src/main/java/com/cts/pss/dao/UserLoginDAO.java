package com.cts.pss.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.User;

public interface UserLoginDAO extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String userName);
}
