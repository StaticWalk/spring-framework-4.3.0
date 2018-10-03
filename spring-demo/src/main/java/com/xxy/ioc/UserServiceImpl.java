package com.xxy.ioc;

import org.springframework.stereotype.Service;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/24
 * Time:16:38
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public void login() {
		System.out.println("login...");
	}
}
