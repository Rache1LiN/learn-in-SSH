/**
 * 
 */
package edu.fjnu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ASUS
 *
 */
public class DBUtils {

	private static final String URL="jdbc:oracle:thin:@10.143.184.22:1521:orcl";
	private static final String USER="homework";
	private static final String PASSWORD="abc123";
	public static Connection getConn(){
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void releaseRes(Connection conn,PreparedStatement ptmt,ResultSet rset){
		try{
			if(conn!=null) conn.close();
			if(ptmt!=null) ptmt.close();
			if(rset!=null) rset.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
