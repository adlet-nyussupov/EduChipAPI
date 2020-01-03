package com.moniumverse.educhip.app.ws.ui.model.request;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class UserDetailsRequestModel {
	
	private String login;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String age;
	private String currentEducationDegree;
	private String applyingEducationDegree;
	private String whereToStudy;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
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
