package com.shawock.dp.abstractfactory1;

import static com.shawock.dp.abstractfactory1.FactoryProducer.TYPE_COLOR;
import static com.shawock.dp.abstractfactory1.FactoryProducer.TYPE_SHAPE;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(TYPE_SHAPE);

		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory(TYPE_COLOR);

		Color red = colorFactory.getColor("RED");
		red.fill();

		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}
}
