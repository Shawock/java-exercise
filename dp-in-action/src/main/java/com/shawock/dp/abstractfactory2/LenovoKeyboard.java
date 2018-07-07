package com.shawock.dp.abstractfactory2;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LenovoKeyboard implements Keyboard {
	@Override
	public void input() {
		println("lenovo keyboard is on...");
	}
}
