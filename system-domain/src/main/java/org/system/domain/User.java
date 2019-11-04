package org.system.domain;

import java.sql.*;

public class User {
	private int userId;
	private String userName;
	private String userType;
	private String realName;
	private String gender;
	private String password;
	private String email;
	private String phoneNumber;
	private String address;
	private Date brithday;
	private int productId;
	private int userInforId;
	private int payerId;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the sex
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the brithday
	 */
	public Date getBrithday() {
		return brithday;
	}
	/**
	 * @param brithday the brithday to set
	 */
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * @return the userInforId
	 */
	public Integer getUserInforId() {
		return userInforId;
	}
	/**
	 * @param userInforId the userInforId to set
	 */
	public void setUserInforId(Integer userInforId) {
		this.userInforId = userInforId;
	}
	/**
	 * @return the payerId
	 */
	public Integer getPayerId() {
		return payerId;
	}
	/**
	 * @param payerId the payerId to set
	 */
	public void setPayerId(Integer payerId) {
		this.payerId = payerId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", realName=" + realName
				+ ", gender=" + gender + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", brithday=" + brithday + ", productId=" + productId + ", userInforId="
				+ userInforId + ", payerId=" + payerId + "]";
	}
	public User(int userId, String userName, String userType, String realName, String gender, String password,
			String email, String phoneNumber, String address, Date brithday, int productId, int userInforId,
			int payerId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.realName = realName;
		this.gender = gender;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.brithday = brithday;
		this.productId = productId;
		this.userInforId = userInforId;
		this.payerId = payerId;
	}
	
	public User(String userName, String userType, String realName, String gender, String password, String email,
			String phoneNumber, String address, Date brithday, int productId, int userInforId, int payerId) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.realName = realName;
		this.gender = gender;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.brithday = brithday;
		this.productId = productId;
		this.userInforId = userInforId;
		this.payerId = payerId;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	

}
