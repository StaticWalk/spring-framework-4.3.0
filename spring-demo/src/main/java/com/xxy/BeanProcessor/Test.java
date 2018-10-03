package com.xxy.BeanProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/26
 * Time:11:08
 *
 *
 * 通过console和refreash方法可以观察到Bean的生命周期
 * 1.解析xml文件，解析出BeanDefinition
 * 2.Spring容器创建BeanFactoryPosProcessor实例
 * 3.调用BeanFactoryPostProcessor的postProcessBeanFactory方法
 * 4.Spring容器创建BeanPostProcessor实例
 * 5.在需要创建其他Bean实例的时候创建其他Bean
 * 6.调用Bean构造方法
 * 7.Setter
 * 8.调用BeanPostProcessor的postProcessBeforeInitialization方法
 * 9.调用InitializingBean的afterPropertiesSet方法
 * 10.调用BeanPostProcessor的postProcessAfterInitialization方法
 * 11.容器销毁的时候调用DisposableBean的destroy方法
 *
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context=new ClassPathXmlApplicationContext("BeanProcessor/beans.xml");
		TestBean testBean = (TestBean)context.getBean("testBean");
		System.out.println(testBean.getName() + testBean.getAge());
		testBean.destroy();
	}

}
