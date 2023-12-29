package com.eAcademy.academyApi.controllers.auth;

import com.eAcademy.academyApi.users.Gender;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterReqBody {
	@Size(min = 2, max = 256, message = "invalid name")
	@NotEmpty
	private String username;
	@Size(min = 2, max = 256, message = "invalid user name")
	@NotEmpty
	private String firstname;
	@Size(min = 2, max = 256, message = "invalid first name")
	@NotEmpty
	private String lastname;
	@Email
	private String email;
	@Size(min = 5, max = 256, message = "password must be a minimum of 5 characters long")
	private String password;
	// not required
	private Gender gender;
	// not required
	private String school;

	public RegisterReqBody(@Size(min = 2, max = 256, message = "invalid name") @NotEmpty String username,
			@Size(min = 2, max = 256, message = "invalid user name") @NotEmpty String firstname,
			@Size(min = 2, max = 256, message = "invalid first name") @NotEmpty String lastname, @Email String email,
			@Size(min = 5, max = 256, message = "password must be a minimum of 5 characters long") String password,
			 Gender gender,
			 String school
			) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.school = school;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

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

	public Gender getGender() {
		
		return gender;
	}
	public void setGender(Gender gender) {
	  this.gender = gender;
	}

	public String getSchool() {
		return null;
	}
	public void setSchool(String school) {
		 this.school = school;
	}
	

}
