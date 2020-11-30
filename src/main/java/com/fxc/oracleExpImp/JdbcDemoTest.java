package com.fxc.oracleExpImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoTest {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//	static final String DB_URL = "jdbc:mysql://***?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
	static final String DB_URL_MYCAT = "10.45.4.100:18166/UIM_MYCAT";
	static final String PASS_MYCAT = "root@3316#pass";
	static final String USER = "root";
	static final String DB_URL[] ={
			"10.45.4.100:3306/uim_mycat01","10.45.4.100:3306/uim_mycat02","10.45.4.100:3306/uim_mycat03","10.45.4.100:3306/uim_mycat04",
			"10.45.4.99:3306/uim_mycat01","10.45.4.99:3306/uim_mycat02","10.45.4.99:3306/uim_mycat03","10.45.4.99:3306/uim_mycat04",
			"10.45.4.99:3309/uim_mycat01","10.45.4.99:3309/uim_mycat02","10.45.4.99:3309/uim_mycat03","10.45.4.99:3309/uim_mycat04",
			"10.45.4.97:3306/uim_mycat01","10.45.4.97:3306/uim_mycat02","10.45.4.97:3306/uim_mycat03","10.45.4.97:3306/uim_mycat04",
			"10.45.4.97:3309/uim_mycat01","10.45.4.97:3309/uim_mycat02","10.45.4.97:3309/uim_mycat03","10.45.4.97:3309/uim_mycat04",
			"10.45.4.96:3306/uim_mycat01","10.45.4.96:3306/uim_mycat02","10.45.4.96:3306/uim_mycat03","10.45.4.96:3306/uim_mycat04",
			"10.45.4.96:3307/uim_mycat01","10.45.4.96:3307/uim_mycat02","10.45.4.96:3307/uim_mycat03","10.45.4.96:3307/uim_mycat04",
			"10.45.4.96:3309/uim_mycat01","10.45.4.96:3309/uim_mycat02","10.45.4.96:3309/uim_mycat03","10.45.4.96:3309/uim_mycat04"};
	// Database credentials
	static final String PASS1 = "root@3306#pass";
	static final String PASS2 = "root@3307#pass";
	static final String PASS3 = "root@3309#pass";

	/**
	 *  在哪个数据库执行建表语句！
	 * @param createSql
	 * @param dbNo
	 */
	public static void executeSqlByDBno(String createSql,int dbNo) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: 注册mysql的驱动
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: 获得一个连接
			System.out.println("Connecting to database...");
			if(dbNo == 0){
				String dbURL = "jdbc:mysql://"+DB_URL_MYCAT+"?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
				conn = DriverManager.getConnection(dbURL, USER, PASS_MYCAT);
				System.out.println(">>>>>>>>>>>>>>>>>connect-db-"+DB_URL_MYCAT);
			}else{
				int no = dbNo-1;
				String dbURL = "jdbc:mysql://"+DB_URL[no]+"?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";

				if(DB_URL[no].indexOf("3306")>0){
					conn = DriverManager.getConnection(dbURL, USER, PASS1);
				} else if(DB_URL[no].indexOf("3307")>0){
					conn = DriverManager.getConnection(dbURL, USER, PASS2);
				}else if(DB_URL[no].indexOf("3309")>0){
					conn = DriverManager.getConnection(dbURL, USER, PASS3);
				}
				System.out.println(">>>>>>>>>>>>>>>>>connect-db-"+DB_URL[no]);
			}

			// STEP 4: 创建一个查询
			stmt = conn.createStatement();
			System.out.println(">>>>>>>>>>>>>>>>>execute-sql:"+createSql);
			stmt.execute(createSql);

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("-------------------------");
	}


}
