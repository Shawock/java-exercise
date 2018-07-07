package com.shawock.helloworld;

import spark.Spark;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
public class Demo {
	public static void main(String[] args) {
		Spark.get("/hello", (req, res) -> {
			println(req + " - " + res);
			return "Hello, demo.";
		});
	}
}