package com.shawock.spring;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2018/01/20.
 *
 * @author zhouhao
 */
@Configuration
public class ConditionConfig {

	@Data
	@Builder
	@NoArgsConstructor
	public static class Person {
		private String name;
		private String age;
		private int gender;
	}

	@Bean
	public Person male() {
		return Person.builder().gender(1).build();
	}

	@Bean
	public Person female() {
		return Person.builder().gender(2).build();
	}
}