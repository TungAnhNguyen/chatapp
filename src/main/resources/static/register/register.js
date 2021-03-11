function validateRegister() {
	var username = document.getElementById("usernameField").value;
	var password = document.getElementById("passwordField").value;
	var passwordAgain = document.getElementById("passwordAgainField").value;

	if (username.length == 0) {
		alert("username can't be empty!");
		return false;
	}

	if (password.length == 0) {
		alert("password can't be empty!");
		return false;
	}

	if (password.localeCompare(passwordAgain) != 0) {
		alert("password not match!" + password + " || " + passwordAgain);
		return false;
	}

	return true;
}