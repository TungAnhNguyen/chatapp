package main.java.com.example.springboot.login.model;

public class LoginOutbound {

	private String userName;

	private String password;

	public LoginOutbound(String name, String content) {
		this.userName = name;
		this.password = content;
	}

	// #region Getter
	public String getName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	// #endregion Getter

	//#region Setter
	public void setName(String name) {
		this.userName = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//#endregion Setter
}