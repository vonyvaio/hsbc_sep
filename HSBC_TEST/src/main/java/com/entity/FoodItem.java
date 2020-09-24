/*
 * 
 * Author: Ashutosh Hemraj Danwe
 * Purpose: FoodItem pojo Object
 * 
 */


package com.entity;

public class FoodItem {
	
	private String ItemCode;	
	private String ItemName;
	
	private int UnitPrice;
	private String DateOfManufacturing;
	
	private String DateOfExpiry;
	private boolean Vegetarian;
	
	private int sold;
	
	public FoodItem () {
		
		sold = 0;
	}
	
	
	/**
	 * @return the sold
	 */
	public int getSold() {
		return sold;
	}


	/**
	 * @param sold the sold to set
	 */
	public void setSold(int sold) {
		this.sold = sold;
	}


	/**
	 * @return the itemCode
	 */
	
	public String getItemCode() {
		return ItemCode;
	}
	
	/**
	 * @param itemCode the itemCode to set
	 */
	
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	
	/**
	 * @return the itemName
	 */
	
	public String getItemName() {
		return ItemName;
	}
	
	/**
	 * @param itemName the itemName to set
	 */
	
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	
	/**
	 * @return the unitPrice
	 */
	
	public int getUnitPrice() {		
		return UnitPrice;
	}
	
	/**
	 * @param unitPrice the unitPrice to set
	 */
	
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}
	
	/**
	 * @return the dateOfManufacturing
	 */
	
	public String getDateOfManufacturing() {
		return DateOfManufacturing;
	}
	
	/**
	 * @param dateOfManufacturing the dateOfManufacturing to set
	 */
	
	public void setDateOfManufacturing(String dateOfManufacturing) {
		DateOfManufacturing = dateOfManufacturing;
	}
	
	/**
	 * @return the dateOfExpiry
	 */
	
	public String getDateOfExpiry() {
		return DateOfExpiry;
	}
	
	/**
	 * @param dateOfExpiry the dateOfExpiry to set
	 */
	
	public void setDateOfExpiry(String dateOfExpiry) {
		DateOfExpiry = dateOfExpiry;
	}
	
	/**
	 * @return the vegetarian
	 */
	
	public boolean isVegetarian() {
		return Vegetarian;
	}
	
	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(boolean vegetarian) {
		this.Vegetarian = vegetarian;
	}
	

	
	

}
