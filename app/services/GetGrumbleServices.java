package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import play.api.db.DB;
import services.entity.PostingEntity;

/**
 * postingテーブルのすべてのレコードを取得する。
 *
 * @author satoshi
 *
 */
public class GetGrumbleServices {

	public static List<PostingEntity> get() throws SQLException {
		// コネクションの確立
		Connection connection = DB.getConnection("defult", true, null);

		// ステートメントを発行
		Statement statement = connection.createStatement();

		// SQL文の発行
		String sql = "select * from posting";

		// Queryの発行
		ResultSet result = statement.executeQuery(sql);

		List<PostingEntity> postingEntityList = new ArrayList<PostingEntity>();

		while (result.next()) {
			PostingEntity postingEntity = new PostingEntity();

			postingEntity.setId(result.getInt("id"));
			postingEntity.setPost_contents(result.getString("post_contents"));
			postingEntity.setGrumble_division(result.getInt("grumble_dvision"));
			postingEntity.setImage(result.getByte("image"));
			postingEntity.setGoos_count(result.getInt("goos_count"));
			postingEntity.setContributor_name(result
					.getString("contributor_name"));
			postingEntity.setIpAddres(result.getString("ipaddres"));
			postingEntity.setPost_date(result.getDate("post_date"));
			postingEntity.setLogic_delet_flag(result
					.getBoolean("logic_delet_flag"));

			postingEntityList.add(postingEntity);
		}

		return postingEntityList;

	}
}
