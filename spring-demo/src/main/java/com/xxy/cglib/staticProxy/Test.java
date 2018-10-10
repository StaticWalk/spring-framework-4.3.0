package com.xxy.cglib.staticProxy;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/6
 * Time:14:52
 *
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 * 真实主题角色RealSubject和代理角色Proxy是共用接口的
 * RealSubject真实主题角色：定义了代理角色proxy所代表的具体对象
 * Proxy代理角色：保存了一个对实体的引用使得代理可以访问实体
 */
public class Test {
	public static void main(String[] args) {
		ProjectProxy pr=new ProjectProxy();
		pr.action();
	}
}
