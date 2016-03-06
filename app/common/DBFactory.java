package common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import play.db.DB;

public class DBFactory {

	/**
	 * コンストラクター
	 */
	private DBFactory() {

	}

	/**
	 * Queryを発行する
	 *
	 * @param sql
	 *            SQL文
	 * @return Query結果
	 * @throws SQLException
	 */
	public static ResultSet executeQuery(String sql) throws SQLException {
		// コネクションの確立
		Connection connection = DB.getConnection();

		// ステートメントを発行
		Statement statement = connection.createStatement();

		// Queryの発行
		return statement.executeQuery(sql);
	}
}
