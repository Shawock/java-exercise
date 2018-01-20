package com.shawock.util;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
public interface Printer {
	SysPrinter S = System.out::println;

	@FunctionalInterface
	interface SysPrinter {
		void out(Object object);
	}
}