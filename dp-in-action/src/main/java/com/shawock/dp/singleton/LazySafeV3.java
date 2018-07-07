package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LazySafeV3 {
	private LazySafeV3() {
	}

	private static class InstanceHolder {
		private static final LazySafeV3 INSTANCE = new LazySafeV3();
	}

	public static LazySafeV3 getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public void printMe() {
		println(this);
	}
}
