package com.xxy.cglib.staticProxy;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/6
 * Time:14:50
 */
public class ProjectProxy implements Object {

	Object obj;

	public ProjectProxy() {
	 	System.out.println("======代理类ProjectProxy======");
		obj = new ObjectImpl();
	}

	@Override
	public void action() {
		System.out.println("======代理开始======");
		obj.action();
		System.out.println("======代理结束======");
	}
}
