package com.project.DroolsDemoProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

	private String name;
	private String cardType;
	private int discount;
	private int price;
	private Date date;

	SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) throws ParseException {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
