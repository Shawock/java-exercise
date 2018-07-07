package com.shawock.dp.singleton;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class SingletonPatternDemo {
	public static void main(String[] args) throws InterruptedException {
		// 1. 饿汉式单例（类加载时即完成初始化）
		SingleObj obj = SingleObj.getInstance();
		obj.printMe();

		// 2. LazyNotSafe（线程不安全，不建议使用）
		Runnable task1 = () -> LazyNotSafe.getInstance().printMe();
		new Thread(task1).start();
		new Thread(task1).start();
		new Thread(task1).start();
		new Thread(task1).start();

		Thread.sleep(1000);

		// 3. LazySafe（性能较差，不建议使用）
		Runnable task2 = () -> LazySafe.getInstance().printMe();
		new Thread(task2).start();
		new Thread(task2).start();
		new Thread(task2).start();
		new Thread(task2).start();

		Thread.sleep(1000);

		// - LazySafeV2（延迟加载、性能高，可以考虑使用）
		Runnable task3 = () -> LazySafeV2.getInstance().printMe();
		new Thread(task3).start();
		new Thread(task3).start();
		new Thread(task3).start();
		new Thread(task3).start();

		// - LazySafeV3（延迟加载、线程安全，可以考虑使用
		LazySafeV3.getInstance().printMe();

		// - EnumSingleObj（支持自动支持序列化？无线程安全问题、非延迟加载，大神推荐使用）
		EnumSingleObj.INSTANCE.printMe();
	}
}
