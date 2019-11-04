package org.system.service;

import org.system.domain.User;

public interface UserService {
	int register(User user);
	
	User login(String name,String password);
	
	void updateUser(User user);
}
