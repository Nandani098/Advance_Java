package in.co.rays.PSTMT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPSTMTInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(12, 115, 'xyz', 98, 78,89)");

		int i = pstmt.executeUpdate();

		System.out.println("data inserted=" + i);

	}
}
