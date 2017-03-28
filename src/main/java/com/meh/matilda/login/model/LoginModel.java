package com.meh.matilda.login.model;

import org.hibernate.validator.constraints.*;

import com.meh.matilda.security.model.MatildaUser;

public class LoginModel {

	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
	private static final String EMAIL_MESSAGE = "{email.message}";

    @NotBlank(message = LoginModel.NOT_BLANK_MESSAGE)
	@Email(message = LoginModel.EMAIL_MESSAGE)
	private String email;

    @NotBlank(message = LoginModel.NOT_BLANK_MESSAGE)
	private String password;

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MatildaUser createAccount() {
        return new MatildaUser(getEmail(), getPassword(), "ROLE_USER");
	}
}
