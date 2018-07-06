package com.shawock.dp.abstractfactory1;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class FactoryProducer {

	public static final String TYPE_COLOR = "COLOR";
	public static final String TYPE_SHAPE = "SHAPE";

	public static AbstractFactory getFactory(String type) {
		switch (type) {
			case TYPE_COLOR:
				return new ColorFactory();
			case TYPE_SHAPE:
				return new ShapeFactory();
			default:
				throw new IllegalArgumentException("not supported type " + type);
		}
	}
}
