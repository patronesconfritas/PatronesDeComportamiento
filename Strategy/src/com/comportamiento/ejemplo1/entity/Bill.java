package com.comportamiento.ejemplo1.entity;

import java.util.List;

public class Bill {

	private double totalMoney;
	private String billDate;
	private List<Item> itemList;

	public Bill() {

	}

	public double getTotalMoney() {
		for(Item i : itemList) {
			this.totalMoney+=i.getMoney();
		}
		return totalMoney;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
