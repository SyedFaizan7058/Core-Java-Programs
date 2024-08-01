package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon {

	public static void main(String[] args) throws Exception {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##faizan", "faizu123");
		Statement stm = con.createStatement();
		ResultSet e = stm.executeQuery("select * from book");
		while (e.next()) {
			System.out.println(e.getString(1) + "\t" + e.getDouble(2));
		}

	}

}
