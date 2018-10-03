package com.xxy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/24
 * Time:16:38
 */
public class App
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/spring-config.xml");
		com.xxy.ioc.UserService userService = (com.xxy.ioc.UserService) applicationContext.getBean("userService");
		userService.login();
	}
}