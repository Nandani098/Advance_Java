package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModel {
	
	public  void add(MarksheetBean bean) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		
	PreparedStatement ps= conn.prepareStatement("insert into marksheet values (?,?,?,?,?,?)");
	
	ps.setInt(1, bean.getId());
	ps.setInt(2, bean.getRollNo());
	ps.setString(3, bean.getName());
	ps.setInt(4, bean.getPhysics());
	ps.setInt(5, bean.getChemistry());
	ps.setInt(6, bean.getMaths());
	
	int i= ps.executeUpdate();
	System.out.println("data add"+i);
	
	}
	
	public void update (MarksheetBean bean) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
	
	PreparedStatement ps= conn.prepareStatement("update marksheet set roll_no=? ,name=?, physics= ?,chemistry=?,maths=? where id = ?");
	
	ps.setInt(1, bean.getRollNo());
	ps.setString(2, bean.getName());
	ps.setInt(3, bean.getPhysics());
	ps.setInt(4, bean.getChemistry());
	ps.setInt(5, bean.getMaths());
	ps.setInt(6,bean.getId());
	
	int i = ps.executeUpdate();
	System.out.println("data updated"+i);
	
	}
	
	
	public void  delete(int id) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
    PreparedStatement ps = conn.prepareStatement(" delete from marksheet where id =?");
    
    ps.setInt(1, id);
    
    int i= ps.executeUpdate();
    System.out.println(" data deleted"+i);
    
    
	}
	
	public void search () throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root","root");
		PreparedStatement ps = conn.prepareStatement("Select * from Marksheet");
		
		ResultSet rs= ps.executeQuery();
		
		while (rs.next()) {
			System.out.print("\t"+ rs.getInt(1));
			System.out.print("\t"+ rs.getInt(2));
			System.out.print("\t" +rs.getString(3));
			System.out.print("\t" +rs.getInt(4));
			System.out.print("\t" +rs.getInt(5));
			System.out.println("\t" +rs.getInt(6));
			
		}	
		}


			}
