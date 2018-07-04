package com.shawock.dp.factory;

import com.shawock.util.Printer;

/**
 * Created on 2018/07/04.
 *
 * @author zhouhao
 */
public class Square implements Shape, Printer {

	@Override
	public void draw() {
		S.out("draw a Square success: ▢");
	}
}
