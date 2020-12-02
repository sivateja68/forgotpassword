package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.User;

public interface IUserService {
	
	public Optional<User> findUserByEmail(String email);
    public Optional<User> findUserByResetToken(String resetToken);
    public void save(User user);
}
