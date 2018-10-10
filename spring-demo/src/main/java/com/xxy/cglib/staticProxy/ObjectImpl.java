package com.xxy.cglib.staticProxy;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/6
 * Time:14:51
 */
public class ObjectImpl implements Object {

	@Override
	public void action() {
		System.out.println("======被代理的类ObjectImpl======");
	}
}
