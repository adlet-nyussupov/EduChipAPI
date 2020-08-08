package com.moniumverse.educhip.app.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Users")

public class UserEntity implements Serializable {

	private static final long serialVersionUID = -4405736579134343222L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false, length = 50)
	private String password;
	
	@Column(nullable = false, length = 120)
	private String email;
	
	@Column(nullable = false, length = 50)
	private String firstName;
	
	@Column(nullable = false, length = 50)
	private String lastName;
	
	@Column(nullable = false, length = 12)
	private String phone;
	
	@Column(nullable = true, length = 10)
	private String birthday;
	
	@Column(nullable = false, length = 25)
	private String currentEducationDegree;
	
	@Column(nullable = false, length = 25)
	private String applyingEducationDegree;
	
	@Column(nullable = false, length = 25)
	private String whereToStudy;
	

	private String encryptedPassword;

	@Column(nullable = false)
	private String emailVerificationToken;

	@Column(nullable = false)
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

}
