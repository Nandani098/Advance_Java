package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureInOut {
	
public static void main(String[] args) throws Exception { //we can use try catch also instead of exception
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
	
   CallableStatement callstmt	=conn.prepareCall("{CALL empInOut(?)}");
	
  callstmt.setInt(1, 3);
  
  callstmt.registerOutParameter(1, Types.INTEGER);
  callstmt.execute();

 System.out.println(callstmt.getInt(1));
	
}
}