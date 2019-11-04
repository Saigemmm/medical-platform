package org.system.domain;

import java.sql.Timestamp;

public class Example {
	private int exampleId;
	private String exampleName;
	private String exampleDesc;
	private Timestamp insertTime;
	private String goodsImg;
	
	public Example() {
		super();
	}
	public Example(int exampleId, String exampleName, String exampleDesc, Timestamp insertTime, String goodsImg) {
		super();
		this.exampleId = exampleId;
		this.exampleName = exampleName;
		this.exampleDesc = exampleDesc;
		this.insertTime = insertTime;
		this.goodsImg = goodsImg;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	/**
	 * @return the exampleId
	 */
	public int getExampleId() {
		return exampleId;
	}
	/**
	 * @param exampleId the exampleId to set
	 */
	public void setExampleId(int exampleId) {
		this.exampleId = exampleId;
	}
	/**
	 * @return the exampleName
	 */
	public String getExampleName() {
		return exampleName;
	}
	/**
	 * @param exampleName the exampleName to set
	 */
	public void setExampleName(String exampleName) {
		this.exampleName = exampleName;
	}
	/**
	 * @return the exampleDesc
	 */
	public String getExampleDesc() {
		return exampleDesc;
	}
	/**
	 * @param exampleDesc the exampleDesc to set
	 */
	public void setExampleDesc(String exampleDesc) {
		this.exampleDesc = exampleDesc;
	}
	/**
	 * @return the insertTime
	 */
	public Timestamp getInsertTime() {
		return insertTime;
	}
	/**
	 * @param timestamp the insertTime to set
	 */
	public void setInsertTime(Timestamp timestamp) {
		this.insertTime = timestamp;
	}

}
