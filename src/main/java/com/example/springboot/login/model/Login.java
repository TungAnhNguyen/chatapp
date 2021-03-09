package main.java.com.example.springboot.login.model;

public class Login {

	private final String name;

	private final String content;

	private final String school;

	public Login(String name, String content, String school) {
		this.name = name;
		this.content = content;
		this.school = school;
	}

	//#region Getter
	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public String getSchool() {
		return school;
	}

	//#endregion Getter
}