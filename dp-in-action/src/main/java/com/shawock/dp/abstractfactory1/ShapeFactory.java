package com.shawock.dp.abstractfactory1;


/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class ShapeFactory extends AbstractFactory {
	@Override
	Shape getShape(String type) {
		switch (type) {
			case "CIRCLE":
				return new Circle();
			case "SQUARE":
				return new Square();
			case "TRIANGLE":
				return new Triangle();
			default:
				throw new IllegalArgumentException("not supported type " + type);
		}
	}

	@Override
	Color getColor(String type) {
		throw new UnsupportedOperationException(type);
	}
}
