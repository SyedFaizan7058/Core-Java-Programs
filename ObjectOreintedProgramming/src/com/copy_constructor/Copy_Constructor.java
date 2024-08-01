package com.copy_constructor;

public class Copy_Constructor {

	public static void main(String[] args) {
 
		Employee faizan=new Employee(1001, "faizan");
		
		System.out.println(faizan);
		
		Manager m=new Manager(faizan);
		System.out.println(m);
		
	}

}
