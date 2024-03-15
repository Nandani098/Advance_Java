package in.co.rays.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import in.co.rays.user.UserBean;
import in.co.rays.user.UserModel;
import in.co.rays.util.JDBCDataSource;
import in.co.rays.user.UserModel;
import in.co.rays.user.UserBean;

	public class TestJDBC {

			public static void main(String[] args) throws Exception {

				for (int i = 1; i <= 20; i++) {

					System.out.println("Connection = " + i);

					//testGet();ye sir ki h apne isme nai cchlegi
					
					testSearch ();
				
					
				}
			}



//			private static void testGet() throws Exception {
//
//				Connection conn = JDBCDataSource.getConnection();
//
//				PreparedStatement pstmt = conn.prepareStatement("select * from marksheet where id = 1");
//
//				ResultSet rs = pstmt.executeQuery();
//
//				while (rs.next()) {
//					System.out.print(rs.getInt(1));
//					System.out.print("\t" + rs.getInt(2));
//					System.out.print("\t" + rs.getString(3));
//					System.out.print("\t" + rs.getInt(4));
//					System.out.print("\t" + rs.getInt(5));
//					System.out.println("\t" + rs.getInt(6));
//				}
//
//				// conn.close();
			//ye upper sir vala h unhone bna rhi get hmne nai
//
			private static void testSearch () throws Exception {
				
				Connection conn = JDBCDataSource.getConnection();
				
				UserBean bean = new UserBean();
				bean.setFirstName("x");

				UserModel model = new UserModel();

				List list = model.search(bean, 1, 5);

				Iterator it = list.iterator();

				while (it.hasNext()) {

					System.out.print(bean.getId());
					System.out.print("\t" + bean.getFirstName());
					System.out.print("\t" + bean.getLastName());
					System.out.print("\t" + bean.getLoginId());
					System.out.print("\t" + bean.getPassword());
					System.out.print("\t" + bean.getDob());
					System.out.println("\t" + bean.getAddress());
		            bean = (UserBean) it.next();

			}	
				conn.close();
			}
			
	}
