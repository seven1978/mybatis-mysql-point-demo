package com.dongnaoedu.service;

import java.util.List;

import com.dongnaoedu.model.User;

public interface UserService {
	
	int addUser(User user);
	
	List<User> findAllUser(int pageNum, int pageSize);
	
}
