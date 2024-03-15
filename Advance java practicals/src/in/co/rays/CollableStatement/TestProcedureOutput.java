package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureOutput {
	
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
	
	CallableStatement cs = conn.prepareCall("{ Call empOut(?)}");
	
	cs.setInt(1, 1);//if we set here 2 instead of 1 so it will always gave value of 1 
	//due to by default query of out procedure where we apply id =1
	//mtlb vala id= 1 de diya to usim ka hoga iddhr output..in m esa nai rehta .
	
	  cs.execute();
	
	cs.registerOutParameter(1, Types.INTEGER);
	
	System.out.println("output =" + cs.getInt(1));
}
}