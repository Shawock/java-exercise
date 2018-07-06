package com.shawock.dp.abstractfactory2;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class LenovoPcFactory extends PcFactory {
	@Override
	Mouse createMouse() {
		return new LenovoMouse();
	}

	@Override
	Keyboard createKeyboard() {
		return new LenovoKeyboard();
	}
}
