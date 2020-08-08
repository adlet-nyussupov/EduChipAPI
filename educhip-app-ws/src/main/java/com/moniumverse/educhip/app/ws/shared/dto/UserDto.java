package com.moniumverse.educhip.app.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	

	private static final long serialVersionUID = 5695941114328658412L;
	private long id;
	
	private String userId;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String birthday;
	private String currentEducationDegree;
	private String applyingEducationDegree;
	private String whereToStudy;
	
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
