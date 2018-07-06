package com.shawock.dp.abstractfactory2;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class PcFactoryProducer {
	public enum Factory {
		DELL,
		LENOVO,
	}

	public static PcFactory getPcFactory(Factory series) {
		switch (series) {
			case DELL:
				return new DellPcFactory();
			case LENOVO:
				return new LenovoPcFactory();
			default:
				throw new IllegalArgumentException(series + "not available.");
		}
	}
}
