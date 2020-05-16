package com.priyam.converter;

public class User {
	private Integer id;
	private String name;
	private String email;
	private Integer age;

	public User(Integer userId, String userName, String emailId, Integer age) {
		this.id = userId;
		this.name = userName;
		this.email = emailId;
		this.age = age;
	}

	@Override public String toString() {
		return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age=" + age + '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
