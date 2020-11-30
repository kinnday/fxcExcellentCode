package com.fxc.oracleExpImp;

import javax.swing.text.DateFormatter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcOracleTest {
	static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@10.128.91.131:3436:ORCL";
	static final String USER = "cuim_chengdu";
	static final String PASS1 = "cuim#chengdu1912";

	/**
	 *  批量执行sql！
	 * @param insertSql
	 * @param insertList
	 */
	public static void executeSqlByList(String insertSql, List<String> insertList,List<String> typeList) {
		Connection conn = null;
		PreparedStatement stmt = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// STEP 2: 注册驱动
			Class.forName(JDBC_DRIVER);

			// STEP 3: 获得一个连接
//			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS1);
//			System.out.println(">>>>>>>>>>>>>>>>>connect-db-"+DB_URL);

			// STEP 4: 创建一个查询
			stmt = conn.prepareStatement(insertSql);
			System.out.println(">>exec-size=:"+insertList.size()+"; sql="+insertSql);
			final int batchSize = 1000;
			int count = 0;
			for (int i=0 ;i<insertList.size();i++) {
				String rows = insertList.get(i);
				String [] cols = rows.split("\",\"");
				for(int k=0 ;k<cols.length;k++){
					String val = cols[k].replaceAll("\"","");
					if("DATE".equals(typeList.get(k))){
						if("".equals(val.trim())){
							stmt.setDate(k+1, null);
						}else if(val.indexOf(":")>0){
							stmt.setDate(k+1, new Date(sdf.parse(val).getTime()) );
						}else{
							stmt.setDate(k+1, new Date(sdfDate.parse(val).getTime()) );
						}

//					}else if("NUMBER".equals(typeList.get(k))){
//						stmt.setInt(k+1, Integer.valueOf(cols[1]));
					}else{
						stmt.setString(k+1, val);
					}
				}
				stmt.addBatch();
				if(++count % batchSize == 0) {
					stmt.executeBatch();
				}
			}
			stmt.executeBatch();

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
				if (stmt != null){
					stmt.close();

				}
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null){
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	public static List<Map> getColsTypeList(String tableName) {
		Connection conn = null;
		PreparedStatement stmt = null;
		List<Map> rst =new ArrayList<>();
		try {
			// STEP 2: 注册驱动
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS1);
			// STEP 4: 创建一个查询
			String selSql = "select column_name,data_type from user_tab_columns where table_name =? order by column_id";
			stmt = conn.prepareStatement(selSql);
			stmt.setString(1, tableName);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Map tmpMap = new HashMap();
				tmpMap.put("column_name",rs.getString("column_name"));
				tmpMap.put("data_type",rs.getString("data_type"));
				rst.add(tmpMap);
			}

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
				if (stmt != null){
					stmt.close();

				}
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null){
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return rst;
	}


	public static void deleteTable(String tableName) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// STEP 2: 注册驱动
			Class.forName(JDBC_DRIVER);

			// STEP 3: 获得一个连接
			conn = DriverManager.getConnection(DB_URL, USER, PASS1);
			String delSql = "delete from "+tableName;
			System.out.println(">>>>>>>>>>>>>>>>>delete-sql:"+delSql);
			// STEP 4: 创建一个查询
			stmt = conn.prepareStatement(delSql);
			stmt.execute();
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
				if (stmt != null){
					stmt.close();

				}
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null){
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
