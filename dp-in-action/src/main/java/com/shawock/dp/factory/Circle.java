package com.shawock.dp.factory;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/04.
 *
 * @author zhouhao
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		println("◯");
	}
}
