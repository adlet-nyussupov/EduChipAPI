package com.moniumverse.educhip.app.ws.ui.model.request;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class UserDetailsRequestModel {
	
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String birthday;
	private String currentEducationDegree;
	private String applyingEducationDegree;
	private String whereToStudy;
	
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCurrentEducationDegree() {
		return currentEducationDegree;
	}
	public void setCurrentEducationDegree(String currentEducationDegree) {
		this.currentEducationDegree = currentEducationDegree;
	}
	public String getApplyingEducationDegree() {
		return applyingEducationDegree;
	}
	public void setApplyingEducationDegree(String applyingEducationDegree) {
		this.applyingEducationDegree = applyingEducationDegree;
	}
	public String getWhereToStudy() {
		return whereToStudy;
	}
	public void setWhereToStudy(String whereToStudy) {
		this.whereToStudy = whereToStudy;
	}
	
	
	
	
	
	
}
