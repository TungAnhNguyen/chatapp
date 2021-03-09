package main.java.com.example.springboot.login.model;

public class Register {

	private final String name;

	private final String content;

	private final String school;

	public Register(String name, String content, String school) {
		this.name = name;
		this.content = content;
		this.school = school;
	}

	//#region Getter
	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	//#endregion Getter
}