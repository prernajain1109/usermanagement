package com.usermanagement.userManagementApp.service;

import java.util.List;

import com.usermanagement.userManagementApp.dto.User;

public interface UserService {

	List<User> getAllUsers();

	User getUser(String id);

	void addUser(User user);

	User updateUser(User user);

	User deleteUser(String id);

}
