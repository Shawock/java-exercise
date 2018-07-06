package com.shawock.dp.factory;

import static com.shawock.util.PrintUtils.println;

/**
 * Created on 2018/07/04.
 *
 * @author zhouhao
 */
public class Triangle implements Shape {
	@Override
	public void draw() {
		println("△");
	}
}
