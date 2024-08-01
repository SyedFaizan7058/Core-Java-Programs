package com.cmparable;

public class Product implements Comparable<Product> {

	private Integer productNumber;
	private String productName;
	private Double productPrice;

	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProductNumber() {
		return productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	@Override
	public int compareTo(Product p) {

		return this.productName.compareTo(p.productName);
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

}
