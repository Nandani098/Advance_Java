package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SMarksheetModel {

	public void search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("Select * from marksheet");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getInt(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));
		}
	}

	public SMarksheetBean findByPk(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from Marksheet where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		SMarksheetBean bean = new SMarksheetBean();

		while (rs.next()) {

			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));

		}

		return bean;

	}

	public List searchSimple() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from Marksheet ");

		ResultSet rs = ps.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			SMarksheetBean bean = new SMarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}

		return list;

	}

	public List searchD(SMarksheetBean bean, int pageNo, int pageSize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandani", "root", "root");

		StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");

		if (bean != null) {

			if (bean.getId() > 0) {
				sql.append(" and id = " + bean.getId());
			}

			if (bean.getName() != null && bean.getName().length() > 0) {
				sql.append(" and name like '" + bean.getName() + "%'");
			}

		}
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + ", " + pageSize);
		}

		System.out.println("sql => " + sql);

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new SMarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}

		return list;
	}
}
