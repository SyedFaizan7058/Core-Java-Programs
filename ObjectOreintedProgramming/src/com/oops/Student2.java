package com.oops;

public class Student2 {
    
	//properties
	String roll;
	String name;
	double height;

	public String talk() {

		return "Student[My Roll Number Is :" + roll + " , My Name Is :" + name + " ,My height :" + height + "]";
	}

	public void WriteExam() {
		System.out.println("My Name is :" + name + " And i have a exam at every saturday!!");
	}

	public static void main(String[] args) {
        //object
		Student2 taha = new Student2();
        //initialization
		taha.roll = "fai123";
		taha.name = "Syed Faizan";
		taha.height = 6.1;
        //calling the behavior
 	    taha.WriteExam();
	    String talk = taha.talk();
	    System.out.println(talk);
	}

}
