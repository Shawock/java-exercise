package com.shawock.dp.singleton;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class SingletonPatternDemo {
	public static void main(String[] args) throws InterruptedException {
		// - classic
		SingleObj obj = SingleObj.getInstance();
		obj.printMe();

		// - LazyNotSafe
		Runnable task1 = () -> LazyNotSafe.getInstance().printMe();
		new Thread(task1).start();
		new Thread(task1).start();
		new Thread(task1).start();
		new Thread(task1).start();

		Thread.sleep(1000);

		// - LazySafe
		Runnable task2 = () -> LazySafe.getInstance().printMe();
		new Thread(task2).start();
		new Thread(task2).start();
		new Thread(task2).start();
		new Thread(task2).start();

		Thread.sleep(1000);

		// - LazySafeV2
		Runnable task3 = () -> LazySafeV2.getInstance().printMe();
		new Thread(task3).start();
		new Thread(task3).start();
		new Thread(task3).start();
		new Thread(task3).start();
	}
}
