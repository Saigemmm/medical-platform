package org.system.dao;

import java.util.List;
import org.system.domain.User;

public interface UserDao {
	void addUser(User user);
	
	void deleteUser(int id);
	
	void updateUser(User user);
	
	User getUserById(int id);
	
	List<User> getAllUser();
	
	User getUserByUserName(String Name);

}
