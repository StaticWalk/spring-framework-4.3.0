package com.xxy;

import com.xxy.demo.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:21:57
 */

/**
 * 	因为自己不是很了解aop和tx的代码怎么写，对ioc aop tx 之间的关系也并不很清楚
 * 		一直想找个能包含这三项的demo，找了多久以为自己找到了 。
 * 	11.5 发现 tx一定包含aop ioc ，aop一定包含ioc ，ioc是最最基础的
 * 	之前自己debug源码一直没有找到加载tx或者aop的bean （执行getBean()）的原因
 * 		是没有认真思考，后来想到注册bean的时候finishBeanFactoryInitialization(beanFactory)中preInstantiateSingletons
 */
public class demoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService= (PersonService) applicationContext.getBean("personService");
		personService.savePerson();

	}
}
