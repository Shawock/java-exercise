package com.shawock.helloworld;

import com.shawock.util.Printer;
import spark.Spark;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
public class Demo implements Printer {
	public static void main(String[] args) {
		Spark.get("/hello", (req, res) -> {
			S.out(req + " - " + res);
			return "Hello, demo.";
		});
	}
}