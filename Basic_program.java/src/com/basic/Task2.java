package com.basic;

public class Task2 {
	public static void main(String[] args) {
		int TVprice=32500;
		
		double profit=TVprice*0.27;
		double VAT=TVprice*0.127;
		double service=TVprice*0.0387;
		
		System.out.println("Vat="+VAT);
		System.out.println("Service="+service);
		
		double TotalSellingPrice=TVprice+profit+VAT+service;
		
		System.out.println("Total selling price="+TotalSellingPrice);
	}

}
