package com.it.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.common.service.BaseServiceImpl;
import com.it.entity.UserInfoVo;
import com.it.orm.ibatis.dao.IMenuDao;
import com.it.orm.mybatis.dao.IUserInfoDao;
import com.it.orm.mybatis.vo.UserInfo;
import com.it.service.UserService;

/**
 * 用户管理与授权业务实现类
 * 
 * @author XiongChun
 * @since 2010-04-13
 */
@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Autowired
	private IMenuDao menuDao;
	
	@Autowired
	private IUserInfoDao userInfoDao;
	
	@SuppressWarnings({"rawtypes" })
	public List<UserInfoVo> getAllUsers() {
		List list = userInfoDao.queryForList();
		list = menuDao.queryForList("Menu.getMenus");
		return list;
	}
	
	@SuppressWarnings({"rawtypes" })
	public List getAllUsers2() {
		UserInfo user = new UserInfo();
		user.setId(1);
		List list = userInfoDao.queryForList();
		list = userInfoDao.select(user);
		return list;
	}

	

}
