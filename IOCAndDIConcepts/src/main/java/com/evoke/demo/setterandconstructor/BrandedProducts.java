package com.evoke.demo.setterandconstructor;

public class BrandedProducts {
	private String product;
	private double price;

	public double getPrice() {
		return price;
	}

	public String getProduct() {
		return product;
	}

//	public void setProduct(String product) {
//		this.product = product;
//	}

	public BrandedProducts(String product) {
		super();
		this.product = product;
	}

	public BrandedProducts(String product, double price) {
		super();
		this.product = product;
		this.price = price;
	}

	public void getproduct() {
		System.out.println("BrandedProducts [product=" + product + "is sold out ]");
		System.out.println("BrandedProducts [product=" + product + "is available and its price " + price + " ]");

	}

}
