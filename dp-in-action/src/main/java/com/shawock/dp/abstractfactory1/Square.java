package com.shawock.dp.abstractfactory1;

import static com.shawock.util.PrintUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class Square implements Shape {
	@Override
	public void draw() {
		println("▢");
	}
}
