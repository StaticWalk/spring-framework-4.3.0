package com.xxy.cglib;


/**
 * Created by xiongxiaoyu
 * Data:2018/10/6
 * Time:10:51
 */

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义MethodInterceptor
 */
public class MyMethodInterceptor implements MethodInterceptor {


	/**
	 *
	 * @param o  cglib生成的代理对象
	 * @param method  被代理的对象方法
	 * @param objects  方法入参
	 * @param methodProxy 代理方法
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("======插入前置通知======");
		Object object = methodProxy.invokeSuper(o, objects);
		System.out.println("======插入后者通知======");
		return object;
	}
}
