package com.it.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.entity.UserInfoVo;
import com.it.service.UserService;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
	
	@Autowired
	private UserService userServiceImpl;

	@RequestMapping(value="get")
	@ResponseBody
	public List<UserInfoVo> getMenu(){
		List<UserInfoVo> list = userServiceImpl.getAllUsers2();
		return list;
	}
	
}
