package com.priyam.converter;

public class UserDTO {
	private Integer userId;
	private String userName;
	private String emailId;
	private Integer age;

	public UserDTO(Integer id, String name, String email, Integer age) {
		this.userId = id;
		this.userName = name;
		this.emailId = email;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override public String toString() {
		return "UserDTO{" + "userId=" + userId + ", userName='" + userName + '\'' + ", emailId='" + emailId + '\''
				+ ", age=" + age + '}';
	}
}
