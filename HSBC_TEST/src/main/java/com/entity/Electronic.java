/*
 * 
 * Author: Ashutosh Hemraj Danwe
 * Purpose: Electronic pojo Object
 * 
 */

package com.entity;

public class Electronic {
	
	private String ItemCode;	
	private String ItemName;
	
	private int UnitPrice;
	private int ItemQuantity;
	
	private int ItemWarranty;	
	
	private int sold;
	
	public Electronic () {
		
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
	 * @return the itemWarranty
	 */
	public int getItemWarranty() {
		return ItemWarranty;
	}

	/**
	 * @param itemWarranty the itemWarranty to set
	 */
	public void setItemWarranty(int itemWarranty) {
		ItemWarranty = itemWarranty;
	}

	/**
	 * @return the itemQuantity
	 */
	public int getItemQuantity() {
		return ItemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(int itemQuantity) {
		ItemQuantity = itemQuantity;
	}

}
