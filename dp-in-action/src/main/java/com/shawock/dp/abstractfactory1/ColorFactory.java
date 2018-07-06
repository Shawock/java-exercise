package com.shawock.dp.abstractfactory1;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class ColorFactory extends AbstractFactory {
	@Override
	Shape getShape(String type) {
		throw new UnsupportedOperationException(type);
	}

	@Override
	Color getColor(String type) {
		switch (type) {
			case "RED":
				return new Red();
			case "BLUE":
				return new Blue();
			case "YELLOW":
				return new Yellow();
			default:
				throw new IllegalArgumentException("not supported type " + type);
		}
	}
}
