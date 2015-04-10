package com.ibatis.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.service.UserService;

public class UserServiceTest {

	public static void main(String[] args) {
		ApplicationContext appContext =new ClassPathXmlApplicationContext("classpath:config/spring.xml");
		UserService userService=(UserService) appContext.getBean("userService");
		System.out.println(userService.getAllUsers());

	}

}
