package org.sprotekex.DemoStockSpring.model;

import java.util.List;

public class UserSprocket {
	private String userid;
	private int totalSprocket;
	private double cashAvailable;
	private List<SprocketDetail> detailHistory;

	public UserSprocket(String userid, int totalSprocket, double cashAvailable, List<SprocketDetail> detailHistory) {
		super();
		this.userid = userid;
		this.totalSprocket = totalSprocket;
		this.cashAvailable = cashAvailable;
		this.detailHistory = detailHistory;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getTotalSprocket() {
		return totalSprocket;
	}

	public void setTotalSprocket(int totalSprocket) {
		this.totalSprocket = totalSprocket;
	}

	public double getCashAvailable() {
		return cashAvailable;
	}

	public void setCashAvailable(double cashAvailable) {
		this.cashAvailable = cashAvailable;
	}

	public List<SprocketDetail> getDetailHistory() {
		return detailHistory;
	}

	public void setDetailHistory(List<SprocketDetail> detailHistory) {
		this.detailHistory = detailHistory;
	}

}
