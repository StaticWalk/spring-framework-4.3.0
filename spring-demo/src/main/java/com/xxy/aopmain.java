package com.xxy;

import com.xxy.demo.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:21:57
 */
public class aopmain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService= (PersonService) applicationContext.getBean("personService");
		personService.savePerson();

	}
}
