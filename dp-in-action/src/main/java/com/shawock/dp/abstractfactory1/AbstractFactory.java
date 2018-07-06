package com.shawock.dp.abstractfactory1;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String type);

	abstract Color getColor(String type);
}
