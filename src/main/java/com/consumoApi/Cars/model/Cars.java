package com.consumoApi.Cars.model;

public class Cars {
	
	private String _id;
	
	private String title;
	
	private String brand;
	
	private String price;
	
	private Number age;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(Number age) {
		this.age = age;
	}

	public Cars(String _id, String title, String brand, String price, Number age) {
		this._id = _id;
		this.title = title;
		this.brand = brand;
		this.price = price;
		this.age = age;
	}

	public Cars() {
	}

}