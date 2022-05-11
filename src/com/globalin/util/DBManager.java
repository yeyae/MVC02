package com.globalin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	// URL USERNAME PASSWORD
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "minseok";
	private static final String PASSWORD = "1234";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	// 우리가 전에 finally 블록에서 처리해줬던 close 메소드를 만들어줍니다.
	/* 
	 * finally {
	 * 	if(conn!=null)
	 * 		conn.close;
	 * 	if(pstmt!=null)
	 * 		pstmt.close;
	 *  if(rs!=null)
	 * 		ptmst.close;
	 */
	// select 문 전용 close 메소드, executeQuery() 실행 후 처리
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs!=null) 
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DML (insert, update, delebe) 문 전용 close 메소드, executeUpdate() 실행 후 처리
	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
