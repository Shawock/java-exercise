package com.shawock;

import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static com.shawock.util.SystemUtils.println;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
public class Demo {

	private static Person findPerson(QueryRequest queryRequest) {
		Objects.requireNonNull(queryRequest);
		return new Person();
	}

	private static Person findPersonByName(@NonNull String name) {
		return new Person();
	}

	public static void main(String[] args) {
		println(findPerson(null));
		println(findPerson(new QueryRequest()));

		println(findPersonByName(null));
		println(findPersonByName("zhouhao"));

		println(findPerson2(null).getAge());
		println(findPersonByName2(null));
	}

	@Nullable
	private static Person findPerson2(@NotNull QueryRequest queryRequest) {
		Objects.requireNonNull(queryRequest);
		return new Person();
	}

	@NotNull
	private static Person findPersonByName2(@Nullable String name) {
		println(name.length());
		return new Person();
	}

	private void test() {
		println("hello merge");
	}

	private void test2() {
		println("hello merge");
	}

	@Data
	private static class Human {
		private String name;
	}

	@Data
	private static class Animal {
		private String nickname;
	}

	@Data
	private static class Person {
		private long id;
		private String name;
		private String age;
	}

	@Data
	private static class QueryRequest {
		private String name;
		private String age;
	}
}
