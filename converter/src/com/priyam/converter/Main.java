package com.priyam.converter;

public class Main {

	public static void main(String[] args) {
		User user = new User(12345, "Ram", "ram@gmail.com", 22);
		System.out.println(user);
		UserConverter userConverter = new UserConverter();
		UserDTO userDTO = userConverter.getDTOFromEntity(user);
		System.out.println(userDTO);
	}
}
