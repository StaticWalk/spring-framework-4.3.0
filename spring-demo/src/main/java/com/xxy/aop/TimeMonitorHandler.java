package com.xxy.aop;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/1
 * Time:20:04
 */
public class TimeMonitorHandler {

	private long before;

	public void before() {
		before = System.currentTimeMillis();
		System.out.println("CurrentTime:" + before);
	}

	public void after() {
		System.out.println("CurrentTime:" + System.currentTimeMillis());
		System.out.println("执行方法共用时："+(System.currentTimeMillis()-before));
	}
}
