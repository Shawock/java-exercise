package com.shawock.chapter_10;

import lombok.Getter;

import java.util.Optional;

/**
 * Created by Shawock on 2017/11/15.
 */
public class OptionalDemo {
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

	private static String getInsuranceName(Optional<Person> person) {
		return person
			.flatMap(Person::getCar)
			.flatMap(Car::getInsurance)
			.map(Insurance::getName)
			.orElse("Unknown");
	}

	private static String getNewInsuranceName(NewPerson person) {
		return Optional.ofNullable(person)
			.map(NewPerson::getCar)
			.map(NewCar::getInsurance)
			.map(NewInsurance::getName)
			.orElse("Unknown");
	}

	private static String getNewInsuranceName2(NewPerson person) {
		/*Optional<NewPerson> optionalPerson = Optional.ofNullable(person);
		return optionalPerson
			.flatMap(NewPerson::getCar)
			.flatMap(NewCar::getInsurance)
			.map(NewInsurance::getName)
			.orElse("Unknown");*/
		return null;
	}

	public static void main(String[] args) {
		System.out.println(getInsuranceName(Optional.empty()));
	}
}