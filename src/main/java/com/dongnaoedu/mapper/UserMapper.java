package com.dongnaoedu.mapper;

import java.util.List;

import com.dongnaoedu.model.User;

public interface UserMapper {

	int insert(User record);
	
	List<User> selectAllUser();
	
}
