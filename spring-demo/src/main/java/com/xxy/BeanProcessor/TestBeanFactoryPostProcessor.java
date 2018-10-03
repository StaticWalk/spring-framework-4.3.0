package com.xxy.BeanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/26
 * Time:11:04
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("TestBeanFactoryPostProcessor->postProcessBeanFactory");
	}
}
