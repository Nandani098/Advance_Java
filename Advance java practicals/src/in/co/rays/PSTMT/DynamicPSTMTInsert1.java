package in.co.rays.PSTMT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicPSTMTInsert1 {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		
		PreparedStatement pstmt= conn.prepareCall("insert into marksheet values(?,?,?,?,?,?)");
		
		
		pstmt.setInt(1, 12);
		pstmt.setInt(2, 112);
		pstmt.setString(3, "xyz");
		pstmt.setInt(4, 22);
		pstmt.setInt(5, 42);
		pstmt.setInt(6, 52);
		
		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);

	}

}
