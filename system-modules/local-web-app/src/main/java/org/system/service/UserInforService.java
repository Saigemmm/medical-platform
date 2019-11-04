package org.system.service;

import org.system.domain.UserInfor;

public interface UserInforService {
	UserInfor getUserInforById(int userInforId);
	
	void register(UserInfor userInfor);

}
