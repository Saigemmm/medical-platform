package org.system.dao.hibernateimpl;

import org.system.dao.BaseHibernateDao;
import org.system.dao.UserInforDao;
import org.system.domain.UserInfor;

public class UserInforDaoImpl extends BaseHibernateDao implements UserInforDao {

	public UserInfor getUserInforById(int userInforId) {
		// TODO Auto-generated method stub
		return (UserInfor) super.get(UserInfor.class, userInforId);
	}

	public void addUserInfor(UserInfor userInfor) {
		// TODO Auto-generated method stub
		super.add(userInfor);
	}

}
