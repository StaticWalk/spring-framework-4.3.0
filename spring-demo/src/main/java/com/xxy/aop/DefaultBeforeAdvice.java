package com.xxy.aop;


import org.aopalliance.aop.Advice;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/1
 * Time:20:05
 */
public class DefaultBeforeAdvice  implements Advice{

	public void before(){
		System.out.println("in DefaultBeforeAdvice!!!!");
	}
}
