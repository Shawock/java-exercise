package com.shawock.dp.abstractfactory2;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class DellPcFactory extends PcFactory {
	@Override
	Mouse createMouse() {
		return new DellMouse();
	}

	@Override
	Keyboard createKeyboard() {
		return new DellKeyboard();
	}
}
