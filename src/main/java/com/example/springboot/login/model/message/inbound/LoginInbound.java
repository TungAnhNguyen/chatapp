package main.java.com.example.springboot.login.model.message.inbound;

// import org.springframework.web.bind.annotation.GetMapping.ModelAttribute;
import org.springframework.web.bind.annotation.*;

// @ModelAttribute
public class LoginInbound {

	private String userName;

	private String password;

	public LoginInbound() {
		
	}

	public LoginInbound(String name, String content) {
		this.userName = name;
		this.password = content;
	}

	// #region Getter
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	// #endregion Getter

	//#region Setter
	public void setUserName(String name) {
		this.userName = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//#endregion Setter
}