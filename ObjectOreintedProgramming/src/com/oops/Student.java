package com.oops;

public class Student {

	// properties
	String roll;
	String name;
	double height;
	String digree;

	public String talk() {

		return "Student[Roll no is :" + roll + " , Name is :" + name + " , Height is :" + height + " ,digree is :"
				+ digree + "]";

	}

	public void getExam() {

		System.out.println(" hello every one my name is " + name + " every saturday we have a exam on java!!");

	}

	public static void main(String[] args) {

		// object
		Student faizan = new Student();

		// initializing the object
		faizan.roll = "fai123";
		faizan.name = "Faizan";
		faizan.height = 6.0;
		faizan.digree = "BCA";

		// calling the behavior
		faizan.getExam();
		String talk = faizan.talk();
		System.out.println(talk);

		System.out.println("==========================================");

		Student aman = new Student();

		aman.roll = "am124";
		aman.name = "Aman";
		aman.height = 5.6;
		aman.digree = "BCA";

		aman.getExam();
		talk = aman.talk();
		System.out.println(talk);

		System.out.println("==========================================");

		Student vish = new Student();

		vish.roll = "vi125";
		vish.name = "vishnu";
		vish.height = 5.8;
		vish.digree = "BCA";

		vish.getExam();
		talk = vish.talk();
		System.out.println(talk);

	}

}
