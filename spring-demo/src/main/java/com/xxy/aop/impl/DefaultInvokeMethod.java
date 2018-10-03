package com.xxy.aop.impl;

import com.xxy.aop.InvokableMethod;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/1
 * Time:20:02
 */
public class DefaultInvokeMethod  implements InvokableMethod{
	@Override
	public Object invokeMethod() {
		System.out.println("执行默认方法。");
		return "";
	}
}
