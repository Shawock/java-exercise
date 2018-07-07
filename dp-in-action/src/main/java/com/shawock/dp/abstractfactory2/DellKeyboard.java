package com.shawock.dp.abstractfactory2;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class DellKeyboard implements Keyboard {
	@Override
	public void input() {
		println("dell keyboard is on...");
	}
}
