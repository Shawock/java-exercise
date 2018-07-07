package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LazySafe {
	private static LazySafe instance;

	private LazySafe() {
	}

	/*
		如果在方法级别加锁导致后面所有获取实例的地方在同一时刻只能有一个线程获取到
		性能有问题
	 */
	public static synchronized LazySafe getInstance() {
		if (instance == null) {
			instance = new LazySafe();
		}

		return instance;
	}

	public void printMe() {
		println(this);
	}
}
