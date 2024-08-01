package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBApp1 {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##faizan",
					"faizu123");
			Statement stm = con.createStatement();
			ResultSet e = stm.executeQuery("select * from book");
			while (e.next()) {
				System.out.println(e.getNString(1) + "\t" + e.getDouble(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
