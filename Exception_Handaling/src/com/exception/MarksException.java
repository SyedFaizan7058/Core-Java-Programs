package com.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException{
	
	public GreaterMarksException() {
		
	}
	
	public GreaterMarksException(String message) {
		super(message);
	}
}

public class MarksException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks :");
		int marks = sc.nextInt();
		try(sc){
			if(marks>100 || marks<0) {
				throw new GreaterMarksException("Invalid Marks!!");
			}else {
				System.out.println("Your marks is :"+marks);
			}
		}catch(GreaterMarksException g) {
			g.printStackTrace();
		}

	}

}
