package com.basic;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many amount you want : ");
	    int amount=sc.nextInt();
	    
	    int oldcycle=1200;
	    int repair=250;
	    int coloring=350;
	    int acce=500;
	    
	    int Totalcost=oldcycle+repair+coloring+acce;
	    
	    int selling_price=Totalcost+amount;
	    
	    System.out.println("profit="+amount);
	    System.out.println("selling price="+ selling_price);
	    
	    sc.close();
	}

}
