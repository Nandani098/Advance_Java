 package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestProcedureInput {

	public static void main(String[] args) throws Exception {
		//can use try catch instead of exception
		
		//try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
			
		CallableStatement cs =conn.prepareCall("{Call empIn(?)}");
		
		 cs.setInt(1, 2);
		 
		 cs.execute();
		 
		 ResultSet Nn =cs.getResultSet();
		 
		 while (Nn.next()) {
			 
			 System.out.print(Nn.getInt(1));
			 System.out.print(Nn.getString(2));
			 System.out.print(Nn.getInt(3));
			
		}
		
	//}catch(Exception e){
		//System.out.println(e.getMessage());
	//}
		
	}
}
