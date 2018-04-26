package com.shawock.serialize;

import com.shawock.util.Printer;
import lombok.Builder;
import lombok.Data;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created on 2018/04/26.
 *
 * @author zhouhao
 */
public class Demo implements Printer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// write object
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		ObjectOutputStream out = new ObjectOutputStream(bos);

		Person jack = Person.builder().name("Jack").age(28).build();
		out.writeObject(jack);

		// read object
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		String base64 = byte2base64(bytes);
		S.out(base64);
		ObjectInputStream input = new ObjectInputStream(bis);
		Person person = (Person) input.readObject();
		S.out(person);
	}

	@Data
	@Builder
	private static class Person implements Serializable {
		private String name;
		private int age;
	}

	private static String byte2base64(byte[] bytes) {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		return base64Encoder.encode(bytes);
	}
}

