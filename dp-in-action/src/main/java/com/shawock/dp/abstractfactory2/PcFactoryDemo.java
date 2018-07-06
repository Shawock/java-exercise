package com.shawock.dp.abstractfactory2;

import static com.shawock.dp.abstractfactory2.PcFactoryProducer.Factory.DELL;
import static com.shawock.dp.abstractfactory2.PcFactoryProducer.Factory.LENOVO;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class PcFactoryDemo {
	public static void main(String[] args) {
		PcFactory pcFactory1 = PcFactoryProducer.getPcFactory(DELL);

		Mouse mouse1 = pcFactory1.createMouse();
		mouse1.move();

		Keyboard keyboard1 = pcFactory1.createKeyboard();
		keyboard1.input();

		PcFactory pcFactory2 = PcFactoryProducer.getPcFactory(LENOVO);

		Mouse mouse2 = pcFactory2.createMouse();
		mouse2.move();

		Keyboard keyboard2 = pcFactory2.createKeyboard();
		keyboard2.input();
	}
}
