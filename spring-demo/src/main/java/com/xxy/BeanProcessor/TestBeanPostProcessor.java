package com.xxy.BeanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/26
 * Time:11:03
 */
public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "-->" + "TestBeanPostProcessor->postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "-->" + "TestBeanPostProcessor->postProcessAfterInitialization");
		return bean;
	}
}
