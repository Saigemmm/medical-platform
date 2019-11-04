package org.system.dao;

import org.system.domain.UserInfor;

public interface UserInforDao {
	UserInfor getUserInforById(int userInforId);
	
	void addUserInfor(UserInfor userInfor);

}
