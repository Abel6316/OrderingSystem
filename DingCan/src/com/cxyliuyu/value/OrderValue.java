package com.cxyliuyu.value;

import java.util.Date;
import java.util.Set;

public class OrderValue {
	private int orderId;
	private UserValue userId;
	private Date orderTime;
	private String status;
	private Set<FoodValue> foods;
	private Set<WaterValue> waters;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public UserValue getUserId() {
		return userId;
	}
	public void setUserId(UserValue userId) {
		this.userId = userId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<FoodValue> getFoods() {
		return foods;
	}
	public void setFoods(Set<FoodValue> foods) {
		this.foods = foods;
	}
	public Set<WaterValue> getWaters() {
		return waters;
	}
	public void setWaters(Set<WaterValue> waters) {
		this.waters = waters;
	}
	
}
