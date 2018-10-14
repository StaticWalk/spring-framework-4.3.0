package com.xxy.transaction;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/13
 * Time:21:29
 */
public class UserAccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserAccountException() {
		super();
	}

	public UserAccountException(String arg0, Throwable arg1, boolean arg2,
								boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserAccountException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserAccountException(String arg0) {
		super(arg0);
	}

	public UserAccountException(Throwable arg0) {
		super(arg0);
	}
}