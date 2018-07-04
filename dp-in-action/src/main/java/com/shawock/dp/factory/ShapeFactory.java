package com.shawock.dp.factory;

import java.util.Optional;

/**
 * Created on 2018/07/04.
 *
 * @author zhouhao
 */
class ShapeFactory {
	Optional<Shape> getShape(String shapeType) {
		if (shapeType == null) {
			return Optional.empty();
		}
		switch (shapeType) {
			case "CIRCLE":
				return Optional.of(new Circle());
			case "PENTAGON":
				return Optional.of(new Pentagon());
			case "SQUARE":
				return Optional.of(new Square());
			case "TRIANGLE":
				return Optional.of(new Triangle());
			default:
				return Optional.empty();
		}
	}
}