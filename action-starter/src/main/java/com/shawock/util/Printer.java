package com.shawock.util;

/**
 * Created by Shawock on 2017/11/15.
 */
public interface Printer {
	SysPrinter S = System.out::println;

	@FunctionalInterface
	interface SysPrinter {
		void out(Object object);
	}
}