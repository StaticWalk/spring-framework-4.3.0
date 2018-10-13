package com.xxy.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/13
 * Time:21:29
 */
public class TestTransaction {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transaction/transaction.xml");
		BookShopService service =(BookShopService) applicationContext.getBean("bookShopService");
		service.purchase("wangp","123");
	}
}