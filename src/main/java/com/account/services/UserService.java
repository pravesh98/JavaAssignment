package com.account.services;

import java.util.List;

import com.account.models.User;

public interface UserService {
	List<User> getUsers();
	User createUser(User user);
}
