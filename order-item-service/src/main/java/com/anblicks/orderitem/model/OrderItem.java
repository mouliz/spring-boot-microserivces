package com.anblicks.orderitem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ITEM")
public class OrderItem {
	

	/*
	 * // - Product code // - Product name // - Quantity
	 */
	
	
	@Id
	@GeneratedValue(generator = "orderitem_gen", strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ITEM_ID")
	private long id;
	
	@Column(name="PRODCUT_CODE")
	private String productCode;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column (name="QUANTITY")
	private int quantity;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
