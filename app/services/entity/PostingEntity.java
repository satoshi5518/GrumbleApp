package services.entity;

import java.sql.Date;

/**
 * 愚痴テーブルのEntity
 *
 * @author satoshi
 *
 */
public class PostingEntity {

	/**
	 * コンストラクター
	 */
	public PostingEntity() {

	}

	/**
	 * 投稿ID
	 */
	private Integer id;

	/**
	 * 投稿内容
	 */
	private String post_contents;

	/**
	 * 愚痴区分
	 */
	private Integer grumble_division;

	/**
	 * 画像バイナリーデータ
	 */
	private Byte image;

	/**
	 * いいね数
	 */
	private Integer goos_count;

	/**
	 * 投稿者名
	 */
	private String contributor_name;

	/**
	 * 投稿IPアドレス(IPv4)
	 */
	private String ipAddres;

	/**
	 * 投稿日
	 */
	private Date post_date;

	/**
	 * 論理削除フラグ
	 */
	private Boolean logic_delet_flag;

	/**
	 * 投稿IDの取得
	 *
	 * @return 投稿ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 投稿IDの設定
	 *
	 * @param id
	 *            投稿ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 投稿内容の取得
	 *
	 * @return 投稿内容
	 */
	public String getPost_contents() {
		return post_contents;
	}

	/**
	 * 投稿内容の設定
	 *
	 * @param post_contents
	 *            投稿内容
	 */
	public void setPost_contents(String post_contents) {
		this.post_contents = post_contents;
	}

	/**
	 * 愚痴区分の取得
	 *
	 * @return 愚痴区分
	 */
	public Integer getGrumble_division() {
		return grumble_division;
	}

	/**
	 * 愚痴区分の設定
	 *
	 * @param grumble_division
	 *            愚痴区分
	 */
	public void setGrumble_division(Integer grumble_division) {
		this.grumble_division = grumble_division;
	}

	/**
	 * 画像バイナリーデータの取得
	 *
	 * @return 画像バイナリーデータ
	 */
	public Byte getImage() {
		return image;
	}

	/**
	 * 画像バイナリーデータの設定
	 *
	 * @param image
	 *            画像バイナリーデータ
	 */
	public void setImage(Byte image) {
		this.image = image;
	}

	/**
	 * いいね数の取得
	 *
	 * @return いいね数
	 */
	public Integer getGoos_count() {
		return goos_count;
	}

	/**
	 * いいね数の設定
	 *
	 * @param goos_count
	 *            いいね数
	 */
	public void setGoos_count(Integer goos_count) {
		this.goos_count = goos_count;
	}

	/**
	 * 投稿者名の取得
	 *
	 * @return 投稿者名
	 */
	public String getContributor_name() {
		return contributor_name;
	}

	/**
	 * 投稿者名の設定
	 *
	 * @param contributor_name
	 *            投稿者名
	 */
	public void setContributor_name(String contributor_name) {
		this.contributor_name = contributor_name;
	}

	/**
	 * 投稿IPアドレス(IPv4)の取得
	 *
	 * @return 投稿IPアドレス(IPv4)
	 */
	public String getIpAddres() {
		return ipAddres;
	}

	/**
	 * 投稿IPアドレス(IPv4)の設定
	 *
	 * @param ipAddres
	 *            投稿IPアドレス(IPv4)
	 */
	public void setIpAddres(String ipAddres) {
		this.ipAddres = ipAddres;
	}

	/**
	 * 投稿日の取得
	 *
	 * @return 投稿日
	 */
	public Date getPost_date() {
		return post_date;
	}

	/**
	 * 投稿日の設定
	 *
	 * @param post_date
	 *            投稿日
	 */
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}

	/**
	 * 論理削除フラグの取得
	 *
	 * @return 論理削除フラグ
	 */
	public Boolean getLogic_delet_flag() {
		return logic_delet_flag;
	}

	/**
	 * 論理削除フラグの設定
	 *
	 * @param logic_delet_flag
	 *            論理削除フラグ
	 */
	public void setLogic_delet_flag(Boolean logic_delet_flag) {
		this.logic_delet_flag = logic_delet_flag;
	}
}
