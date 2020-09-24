/*
 * 
 * Author: Ashutosh Hemraj Danwe
 * Purpose: Appreal pojo Object
 * 
 */

package com.entity;

public class Apparel {
	
	private String ItemCode;	
	private String ItemName;
	
	private int UnitPrice;
	private String ItemSize;	
	
	private String ItemMaterial;
	private String ItemQuantity;
	
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
	private int sold;
	
	public Apparel () {
		
		UnitPrice = sold = 0;
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
	 * @return the itemSize
	 */
	public String getItemSize() {
		return ItemSize;
	}
	/**
	 * @param itemSize the itemSize to set
	 */
	public void setItemSize(String itemSize) {
		ItemSize = itemSize;
	}
	/**
	 * @return the itemMaterial
	 */
	public String getItemMaterial() {
		return ItemMaterial;
	}
	/**
	 * @param itemMaterial the itemMaterial to set
	 */
	public void setItemMaterial(String itemMaterial) {
		ItemMaterial = itemMaterial;
	}
	/**
	 * @return the itemQuantity
	 */
	public String getItemQuantity() {
		return ItemQuantity;
	}
	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(String itemQuantity) {
		ItemQuantity = itemQuantity;
	}


}
