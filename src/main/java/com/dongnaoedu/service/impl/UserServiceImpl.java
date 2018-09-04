package com.dongnaoedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongnaoedu.mapper.UserMapper;
import com.dongnaoedu.model.User;
import com.dongnaoedu.service.UserService;
import com.github.pagehelper.PageHelper;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	
	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public List<User> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
	    return userMapper.selectAllUser();
	}

}
