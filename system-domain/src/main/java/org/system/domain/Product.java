package org.system.domain;

import java.sql.Date;

public class Product {
	private int productId;
	private String productName;
	private String productType;
	private String price;
	private Date validityTime;
	/**
	 * @return the product
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param product the product to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the validityTime
	 */
	public Date getValidityTime() {
		return validityTime;
	}
	/**
	 * @param validityTime the validityTime to set
	 */
	public void setValidityTime(Date validityTime) {
		this.validityTime = validityTime;
	}

}
