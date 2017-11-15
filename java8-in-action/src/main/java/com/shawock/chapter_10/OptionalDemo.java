package com.shawock.chapter_10;

import com.shawock.Printer;
import lombok.Getter;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by Shawock on 2017/11/15.
 */
public class OptionalDemo implements Printer {
	@Getter
	private static class Person {
		private Optional<Car> car;
	}

	@Getter
	private static class Car {
		private Optional<Insurance> insurance;
	}

	@Getter
	private static class Insurance {
		private String name;
	}

	@Getter
	private static class NewPerson {
		private int age;
		private NewCar car;
	}

	@Getter
	private static class NewCar {
		private NewInsurance insurance;
	}

	@Getter
	private static class NewInsurance {
		private String name;
	}

	/**
	 * Optional#map 是返回 Optional 包装过的对象，因此对于返回就是 Optional 的对象不能用 map 方法
	 * Optional#flatMap 是将 Optional 对象打平的方法
	 */
	private static String getInsuranceName(Optional<Person> person) {
		return person
			.flatMap(Person::getCar)
			.flatMap(Car::getInsurance)
			.map(Insurance::getName)
			.orElse("Unknown");
	}

	/**
	 * 对于返回是原生对象的类，直接使用 map 方法即可
	 */
	private static String getNewInsuranceName(NewPerson person) {
		return Optional.ofNullable(person)
			.map(NewPerson::getCar)
			.map(NewCar::getInsurance)
			.map(NewInsurance::getName)
			.orElse("Unknown");
	}

	/**
	 * Optional#filter 不符合条件的值会被处理成 empty
	 */
	private static String getNewInsuranceName(NewPerson person, int minAge) {
		return Optional.ofNullable(person)
			.filter(p -> p.getAge() >= minAge)
			.map(NewPerson::getCar)
			.map(NewCar::getInsurance)
			.map(NewInsurance::getName)
			.orElse("Unknown");
	}

	/**
	 * Optional 整合
	 */
	private static int readDuration(Properties properties, String name) {
		return Optional.ofNullable(properties.getProperty(name))
			.flatMap(OptionalDemo::string2IntNoThrow)
			.filter(i -> i > 0)
			.orElse(0);
	}

	private static Optional<Integer> string2IntNoThrow(String s) {
		try {
			return Optional.of(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		S.out("1. ----------------");
		S.out(getInsuranceName(Optional.empty()));
		S.out(getNewInsuranceName(null));

		Properties properties = new Properties();
		properties.setProperty("aaa", "123");
		properties.setProperty("bbb", "bbb");
		properties.setProperty("ccc", "-3");
		properties.setProperty("ddd", "");

		S.out("2. ----------------");
		S.out(readDuration(properties, "aaa"));
		S.out(readDuration(properties, "bbb"));
		S.out(readDuration(properties, "ccc"));
		S.out(readDuration(properties, "ddd"));
		S.out(readDuration(properties, "eee"));
	}
}