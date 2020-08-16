package com.anblicks.order.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


/**
 * @author Chandramouli
 *
 */

@Entity
@Table(name = "ORDER_TABLE")
public class Order {

//	
//	-	Customer name
//	-	Order date
//	-	Shipping address
//	-	Order items
//	-	Total ($)
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
	private long id;
	
	@NotBlank(message="CustomerName Should be Requied")
	@Column(name= "CUSTOMER_NAME")
	private String customerName;
	
	@Column (name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "SHIPPING_ADDRES")
	private String shippingAddres;
	

	@Column (name ="TOTAL")
	private double total;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddres() {
		return shippingAddres;
	}
	public void setShippingAddres(String shippingAddres) {
		this.shippingAddres = shippingAddres;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
}
