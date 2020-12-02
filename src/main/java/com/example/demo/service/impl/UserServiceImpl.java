package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public Optional<User> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public Optional<User> findUserByResetToken(String resetToken) {
		
		return repo.findByResetToken(resetToken);
	}

	@Override
	public void save(User user) {
		repo.save(user);
		
	}

	
}
