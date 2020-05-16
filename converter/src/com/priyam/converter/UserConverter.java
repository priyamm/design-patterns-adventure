package com.priyam.converter;

import java.util.function.Function;

public class UserConverter extends Converter<User, UserDTO>  {
	public UserConverter() {
		super(UserConverter::convertToDTO, UserConverter::convertToEntity);
	}

	public static final UserDTO convertToDTO(User user) {
		return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getAge());
	}

	public static final User convertToEntity(UserDTO userDTO) {
		return new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getEmailId(), userDTO.getAge());
	}
}
