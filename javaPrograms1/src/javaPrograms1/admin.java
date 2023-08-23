package javaPrograms1;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class Admin {
		public Connection con;
		public static String admin_id;
		public static String admin_pwd;

		public String getAdmin_id() {
			return admin_id;
		}

		public void setAdmin_id(String admin_id) {
			this.admin_id = admin_id;
		}

		public String getAdmin_pwd() {
			return admin_pwd;
		}

		public void setAdmin_pwd(String admin_pwd) {
			this.admin_pwd = admin_pwd;
		}

		public Admin() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection
						("jdbc:mysql://localhost:3306/dest_projects","root","root");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}


}
