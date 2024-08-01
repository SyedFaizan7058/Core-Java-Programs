package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try (sc;){
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##faizan","faizu123");
			Statement stm = con.createStatement();
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			ResultSet e = stm.executeQuery("select * from customer_info where customername='"+name+"'");
			if(e.next()) {
				System.out.println(e.getString(1));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
