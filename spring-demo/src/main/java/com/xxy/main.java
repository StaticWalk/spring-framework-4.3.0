package com.xxy;

import com.xxy.demo.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:21:21
 */
public class main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService= (AccountService) applicationContext.getBean("accountService");
		accountService.transfer("aaa","bbb",200d);
	}
}
