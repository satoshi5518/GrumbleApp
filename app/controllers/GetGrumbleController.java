package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import services.GetGrumbleServices;
import services.entity.PostingEntity;

import common.GrumbleWebCommon;

/*
 * 愚痴の投稿を全て取得する
 */
public class GetGrumbleController extends Controller {

	/*
	 * コンストラクター
	 */
	public GetGrumbleController() {

	}

	/**
	 * 愚痴の投稿を全て取得する。
	 */
	public Result getAllGrumble() {

		List<PostingEntity> result = new ArrayList<PostingEntity>();

		try {
			result = GetGrumbleServices.get();

		} catch (SQLException e) {
			// TODO:エラー判定どうしようかな.
		}

		return ok(GrumbleWebCommon.jsonToString(result));
	}
}
