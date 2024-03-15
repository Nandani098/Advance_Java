package in.co.rays.textMarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksheetModel {
	
	int pk= 0;

	public Integer nextPk() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
	PreparedStatement ps = conn.prepareStatement(" select max(id) from marksheet");
	
	ResultSet rs= ps.executeQuery();
	
	while(rs.next()) {
		pk= rs.getInt(1);
	}
	return pk+1;
	
	}
	
	public void add(MarksheetBean bean) throws Exception {
		int pk = nextPk();
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		
		ps.setInt(1, pk);
		ps.setInt(2, bean.getRollno());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
		int i = ps.executeUpdate();
		
		System.out.println("data added="+i);
		
		
	}
	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update marksheet set rollno=?, name=?, physics=?, chemistry=?, maths=?, where id =?");
		
		ps.setInt(1, bean.getRollno());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getId());
		
		int i= ps.executeUpdate();
		System.out.println("data updated="+i);
		
		
	}
	
	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id =?");
		
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();
		System.out.println("data deleted="+i);
		
		
	}
}
