package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class SingleObj {
	private static final SingleObj INSTANCE = new SingleObj();

	private SingleObj() {
	}

	public static SingleObj getInstance() {
		return INSTANCE;
	}

	public void printMe() {
		println(this);
	}
}
