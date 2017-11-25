package com.shawock.helloworld;

import com.shawock.util.Printer;
import spark.Spark;

/**
 * Created by Shawock on 2017/11/25.
 */
public class Demo implements Printer {
	public static void main(String[] args) {
		Spark.get("/hello", (req, res) -> {
			S.out(req + " - " + res);
			return "Hello, demo.";
		});
	}
}