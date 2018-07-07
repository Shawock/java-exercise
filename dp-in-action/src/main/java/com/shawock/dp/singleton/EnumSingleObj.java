package com.shawock.dp.singleton;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public enum EnumSingleObj {
	INSTANCE;

	public void printMe() {
		println(this);
	}
}
