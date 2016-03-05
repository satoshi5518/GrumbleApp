package controllers;

import play.mvc.Controller;
import play.mvc.Result;

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
		return ok("test");
	}
}
