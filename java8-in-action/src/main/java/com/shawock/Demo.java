package com.shawock;

import com.shawock.util.Printer;
import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
public class Demo implements Printer {

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

	private static Person findPerson(QueryRequest queryRequest) {
		Objects.requireNonNull(queryRequest);
		return new Person();
	}

	private static Person findPersonByName(@NonNull String name) {
		return new Person();
	}

	public static void main(String[] args) {
		S.out(findPerson(null));
		S.out(findPerson(new QueryRequest()));

		S.out(findPersonByName(null));
		S.out(findPersonByName("zhouhao"));

		S.out(findPerson2(null).getAge());
		S.out(findPersonByName2(null));
	}

	@Nullable
	private static Person findPerson2(@NotNull QueryRequest queryRequest) {
		Objects.requireNonNull(queryRequest);
		return new Person();
	}

	@NotNull
	private static Person findPersonByName2(@Nullable String name) {
		S.out(name.length());
		return new Person();
	}
}
