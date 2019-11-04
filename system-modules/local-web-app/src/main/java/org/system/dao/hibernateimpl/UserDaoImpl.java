package org.system.dao.hibernateimpl;

import java.util.List;

import org.system.dao.BaseHibernateDao;
import org.system.dao.UserDao;
import org.system.domain.User;

public class UserDaoImpl extends BaseHibernateDao implements UserDao {

	public void addUser(User user) {
		System.out.println(user.getRealName());
		super.add(user);
	}

	public void deleteUser(int id) {
		super.delete(User.class, id);
	}

	public void updateUser(User user) {
		super.update(user);
	}

	public User getUserById(int id) {
		return (User) super.get(User.class, id);
	}

	public List<User> getAllUser() {
		return super.find("from User", null);
	}

	public User getUserByUserName(String userName) {
		List<User> list = super.find1("from User u where u.userName = ?", userName);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

}
