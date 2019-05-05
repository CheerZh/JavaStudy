package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSqlite {
	
	public static void main(String[] args) {
		
		try {
			//加载驱动
			Class.forName("org.sqlite.JDBC");
			//连接数据库
			Connection connection = DriverManager.getConnection("jdbc:sqlite:how2j.db");
			//创建对象
			Statement statement= connection.createStatement();
			
			statement.executeUpdate("drop table if exists hero");
			//创建表
			statement.executeUpdate("create table hero(id int , name varchar(20),hp int)");
			//插入数据
			
			statement.executeUpdate("insert into hero values (1,'Gareen','452')");
			//搜索数据库
			ResultSet rSet = statement.executeQuery("select* from hero");
			while (rSet.next()) {
				System.out.println("id:"+rSet.getInt(1));
				System.out.println("姓名："+rSet.getString(2));
				System.out.println("血量："+rSet.getString(3));
			}
			rSet.close();
			connection.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
