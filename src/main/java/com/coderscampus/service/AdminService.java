package com.coderscampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.User;
import com.coderscampus.repository.UserRepository;

import antlr.collections.List;

@Service
public class AdminService {
	@Autowired
	private UserRepository userRepo;

	public List<> findAllUsers() {
		return userRepo.findAll();
	}
}
