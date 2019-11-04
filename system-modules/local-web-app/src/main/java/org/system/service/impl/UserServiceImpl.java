package org.system.service.impl;

import org.system.dao.UserDao;
import org.system.dao.hibernateimpl.UserDaoImpl;
import org.system.domain.User;
import org.system.service.UserService;

public class UserServiceImpl implements UserService {

	//UserDao userDao=new UserDaoImpl();
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int register(User user) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<<<<>>>>>"+user.getBrithday());
		if(userDao.getUserByUserName(user.getUserName()) ==null) {
			userDao.addUser(user);
			return 1;
		}else {
			return 0;
		}
	}

	public User login(String name, String password) {
		// TODO Auto-generated method stub
		User user=userDao.getUserByUserName(name);
		if (user!=null) {
			if(password.equals(user.getPassword())) {
				System.out.println(user);
				return user;
			}
		}
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

}
