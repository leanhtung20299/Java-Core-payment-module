package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static Connection con;
	
	public DAO(){
		if(con == null){
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433;databaseName=CNPMModulthanhtoan3;user=sa;password=b3k0jl0v3");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
