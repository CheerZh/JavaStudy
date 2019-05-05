package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSqlite {
	
	public static void main(String[] args) {
		
		try {
			//��������
			Class.forName("org.sqlite.JDBC");
			//�������ݿ�
			Connection connection = DriverManager.getConnection("jdbc:sqlite:how2j.db");
			//��������
			Statement statement= connection.createStatement();
			
			statement.executeUpdate("drop table if exists hero");
			//������
			statement.executeUpdate("create table hero(id int , name varchar(20),hp int)");
			//��������
			
			statement.executeUpdate("insert into hero values (1,'Gareen','452')");
			//�������ݿ�
			ResultSet rSet = statement.executeQuery("select* from hero");
			while (rSet.next()) {
				System.out.println("id:"+rSet.getInt(1));
				System.out.println("������"+rSet.getString(2));
				System.out.println("Ѫ����"+rSet.getString(3));
			}
			rSet.close();
			connection.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
