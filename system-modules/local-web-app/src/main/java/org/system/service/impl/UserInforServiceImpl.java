package org.system.service.impl;

import org.system.dao.UserInforDao;
import org.system.domain.UserInfor;
import org.system.service.UserInforService;

public class UserInforServiceImpl implements UserInforService {
	private UserInforDao userInforDao;

	public void setUserInforDao(UserInforDao userInforDao) {
		this.userInforDao = userInforDao;
	}

	public UserInfor getUserInforById(int userInforId) {
		// TODO Auto-generated method stub
		return userInforDao.getUserInforById(userInforId);
	}

	public void register(UserInfor userInfor) {
		// TODO Auto-generated method stub
		userInforDao.addUserInfor(userInfor);
	}

}
