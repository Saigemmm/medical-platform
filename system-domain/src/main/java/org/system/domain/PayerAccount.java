package org.system.domain;

import java.sql.Date;

public class PayerAccount {
	private int payId;
	private String payerId;
	private String payMode;
	private String accountId;
	private String bankType;
	private Date payTime;
	/**
	 * @return the payId
	 */
	public int getPayId() {
		return payId;
	}
	/**
	 * @param payId the payId to set
	 */
	public void setPayId(int payId) {
		this.payId = payId;
	}
	/**
	 * @return the payerId
	 */
	public String getPayerId() {
		return payerId;
	}
	/**
	 * @param payerId the payerId to set
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	/**
	 * @return the payMode
	 */
	public String getPayMode() {
		return payMode;
	}
	/**
	 * @param payMode the payMode to set
	 */
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @return the payTime
	 */
	public Date getPayTime() {
		return payTime;
	}
	/**
	 * @param payTime the payTime to set
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
}
