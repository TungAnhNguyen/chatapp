function validateLogin() {
	var username = document.getElementById("usernameField").value;
	var password = document.getElementById("passwordField").value;

	if (username.length == 0) {
		alert("username can't be empty!");
		return false;
	}

	if (username.length > 20) {
		alert("username can only be 20 characters!");
		return false;
	}

	if (password.length == 0) {
		alert("password can't be empty!");
		return false;
	}

	return true;
}