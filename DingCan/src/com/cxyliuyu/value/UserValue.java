package com.cxyliuyu.value;

import java.util.Set;

public class UserValue {
	private int UserId;
	private String userName;
	private String password;
	private String permission;
	private Set<OrderValue> orders;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Set<OrderValue> getOrders() {
		return orders;
	}
	public void setOrders(Set<OrderValue> orders) {
		this.orders = orders;
	}
}
