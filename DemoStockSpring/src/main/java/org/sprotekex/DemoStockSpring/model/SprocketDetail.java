package org.sprotekex.DemoStockSpring.model;

import java.util.Date;

public class SprocketDetail {
	private String action;
	private Date orderDate;
	private int count;
	private double unitPrice;
	public SprocketDetail(Date orderDate, String action,int count, double unitPrice, double total) {
		super();
		this.orderDate = orderDate;
		this.count = count;
		this.unitPrice = unitPrice;
		Total = total;
		this.action = action;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	private double Total;
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	

}
