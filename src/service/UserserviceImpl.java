package service;

import dao.UserDao;
import dao.impl.UserDaoimpl;
import enitiy.User;

public class UserserviceImpl implements UserService {
	UserDao dao = new UserDaoimpl();
	
	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
