package common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * サーバ側の共通クラス
 *
 * @author satoshi
 *
 */
public class GrumbleWebCommon {

	/**
	 * 任意のクラスをjson形式に文字列変換する
	 * 
	 * @param objcet
	 * @return json形式の文字列
	 */
	public static String jsonToString(Object objcet) {

		String json = "";

		try {
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(objcet);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			json = "json変換エラー";
		}

		return json;
	}
}
