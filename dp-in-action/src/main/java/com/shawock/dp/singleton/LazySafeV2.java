package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LazySafeV2 {
	private static LazySafeV2 instance;

	private LazySafeV2() {
	}

	/*
		初始之前假设有 2 个线程同时访问 getInstance 方法，一开始大家的状态都是 null
		同时进入同步代码块中，只有一个线程完成初始化的动作，另一个线程进入时 instance not null
		后面的线程再进入时由于 instance not null 直接返回不需要执行加锁逻辑，提高了性能
	 */
	public static LazySafeV2 getInstance() {
		if (instance == null) {
			synchronized (LazySafeV2.class) {
				if (instance == null) {
					instance = new LazySafeV2();
				}
			}
		}
		return instance;
	}

	public void printMe() {
		println(this);
	}
}
