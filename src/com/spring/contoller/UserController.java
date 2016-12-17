package com.spring.contoller;

import com.spring.dao.UserDao;
import com.spring.vo.User;

public class UserController {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public int saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

}
