package org.system.domain;

import java.sql.Timestamp;

public class UserInfor {
	private int userInforId;
	private String userInforName;
	private String inforType;
	private String isHeathly;
	private String medicalResult;
	private Timestamp insertTime;
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userInforId
	 */
	public int getUserInforId() {
		return userInforId;
	}
	/**
	 * @param userInforId the userInforId to set
	 */
	public void setUserInforId(int userInforId) {
		this.userInforId = userInforId;
	}
	/**
	 * @return the userInforName
	 */
	public String getUserInforName() {
		return userInforName;
	}
	/**
	 * @param userInforName the userInforName to set
	 */
	public void setUserInforName(String userInforName) {
		this.userInforName = userInforName;
	}
	/**
	 * @return the inforType
	 */
	public String getInforType() {
		return inforType;
	}
	/**
	 * @param inforType the inforType to set
	 */
	public void setInforType(String inforType) {
		this.inforType = inforType;
	}
	/**
	 * @return the isHeathly
	 */
	public String getIsHeathly() {
		return isHeathly;
	}
	/**
	 * @param isHeathly the isHeathly to set
	 */
	public void setIsHeathly(String isHeathly) {
		this.isHeathly = isHeathly;
	}
	/**
	 * @return the medicalResult
	 */
	public String getMedicalResult() {
		return medicalResult;
	}
	/**
	 * @param medicalResult the medicalResult to set
	 */
	public void setMedicalResult(String medicalResult) {
		this.medicalResult = medicalResult;
	}
	/**
	 * @return the insert_time
	 */
	public Timestamp getInsertTime() {
		return insertTime;
	}
	/**
	 * @param insert_time the insert_time to set
	 */
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	public UserInfor(int userInforId, String userInforName, String inforType, String isHeathly, String medicalResult,
			Timestamp insertTime,int userId) {
		super();
		this.userInforId = userInforId;
		this.userInforName = userInforName;
		this.inforType = inforType;
		this.isHeathly = isHeathly;
		this.medicalResult = medicalResult;
		this.insertTime = insertTime;
		this.userId=userId;
	}
	public UserInfor() {
		super();
	}
	

}
