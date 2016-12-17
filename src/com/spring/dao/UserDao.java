package com.spring.dao;

import com.spring.vo.User;


public class UserDao {


	public int save(User user) {
		// TODO Auto-generated method stub
		int money = 1000/user.getAge();
		System.out.println("save user ... "+user+"  , he has "+(1000/user.getAge())+" dollars");
		return money;
	}

}
