package com.xxy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/1
 * Time:16:16
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/aop.xml");
		InvokableMethod defaultInvokeMethod = (InvokableMethod) applicationContext.getBean("defaultInvokeMethod");
		defaultInvokeMethod.invokeMethod();
	}
}
