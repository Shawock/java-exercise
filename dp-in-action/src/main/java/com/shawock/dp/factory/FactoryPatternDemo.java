package com.shawock.dp.factory;

import java.util.Optional;

/**
 * Created on 2018/07/04.
 *
 * @author zhouhao
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Optional<Shape> shape = shapeFactory.getShape("CIRCLE");
		shape.ifPresent(Shape::draw);

		shape = shapeFactory.getShape("PENTAGON");
		shape.ifPresent(Shape::draw);

		shape = shapeFactory.getShape("SQUARE");
		shape.ifPresent(Shape::draw);

		shape = shapeFactory.getShape("TRIANGLE");
		shape.ifPresent(Shape::draw);

		shape = shapeFactory.getShape("UNKNOWN");
		shape.ifPresent(Shape::draw);
	}
}
