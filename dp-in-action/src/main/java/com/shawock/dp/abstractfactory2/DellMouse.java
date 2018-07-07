package com.shawock.dp.abstractfactory2;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class DellMouse implements Mouse {
	@Override
	public void move() {
		println("dell mouse moving...");
	}
}
