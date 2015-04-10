package com.it.service;

import java.util.List;

import com.it.common.service.BaseService;
import com.it.entity.UserInfoVo;

public interface UserService extends BaseService{

	List<UserInfoVo> getAllUsers();

	List getAllUsers2();
	
	
}
