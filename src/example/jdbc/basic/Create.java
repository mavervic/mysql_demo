package example.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo_db";
		String user = "root";
		String password = "123456";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// 新增三筆資料
			String insertSQL = """

					""";
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(insertSQL);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
