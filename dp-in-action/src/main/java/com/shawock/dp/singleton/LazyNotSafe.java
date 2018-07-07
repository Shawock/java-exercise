package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LazyNotSafe {
	private static LazyNotSafe instance;

	private LazyNotSafe() {
	}

	public static LazyNotSafe getInstance() {
		if (instance == null) {
			instance = new LazyNotSafe();
		}
		return instance;
	}

	public void printMe() {
		println(this);
	}
}
