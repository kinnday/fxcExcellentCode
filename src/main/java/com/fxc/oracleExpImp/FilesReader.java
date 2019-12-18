package com.fxc.oracleExpImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesReader {
	static final String dir1 = "D:\\2019-电信卡管系统\\6-四川电信UIM重构\\6-2-测试库迁移\\csv-格式\\dc_upload_big\\";
//	static final String dir1 = "D:\\2019-电信卡管系统\\6-四川电信UIM重构\\6-2-测试库迁移\\csv-格式\\dc_upload\\";

	/**
	 *  在哪个数据库执行建表语句！
	 */
	public static void readeFolder() {
		File file = new File(dir1);
        File [] files = file.listFiles(); // 文件列表
        String [] names = file.list();  // 文件名列表
        if(names != null){
            for(int i=0;i<names.length;i++){
            	if(files[i].isDirectory()){
            		continue;
				}
            	String tableName = names[i].replace(".csv","");
//            	只导入某个表
//				if(!"MID_INTF_TASK".equals(tableName)){
//					continue;
//				}
//            	1.获取表的字段类型
				List<Map> colsList = JdbcOracleTest.getColsTypeList(tableName);
				List<String> typeList = new ArrayList<>();

				StringBuffer insertSql = new StringBuffer("insert into ");
				StringBuffer valueSql = new StringBuffer(" values( ");
//				2.拼接insert语句
				insertSql.append(tableName).append("(");
				for(Map tmpMap :colsList ){
					insertSql.append(tmpMap.get("column_name")).append(",");
					valueSql.append("?,");
					typeList.add(tmpMap.get("data_type").toString());
				}

				String realSql = insertSql.substring(0,insertSql.length()-1)+") "
						+ valueSql.substring(0,valueSql.length()-1) +")";
//				3.读取文件
				List<String> insertList = new ArrayList();
				File currFile = files[i];
				/* 读取数据 */
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(currFile),"GBK"));
					String lineTxt = null;
					while ((lineTxt = br.readLine()) != null) {
						if(!"".equals(lineTxt.trim())){
							insertList.add(lineTxt);
						}
					}
					br.close();
				} catch (Exception e) {
					System.err.println("read errors :" + e);
				}
//				4.批量执行
				JdbcOracleTest.deleteTable(tableName);
				JdbcOracleTest.executeSqlByList(realSql,insertList,typeList);
            }
        }

//        for(File a:files){
//            if(a.isDirectory()){//如果文件夹下有子文件夹，获取子文件夹下的所有文件全路径。
//                getAllFileName(a.getAbsolutePath()+"\\",listFileName);
//            }
//        }
	}


	 public static void main(String[] args){
		 readeFolder();
    }
}
