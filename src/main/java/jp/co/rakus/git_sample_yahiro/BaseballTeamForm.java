package jp.co.rakus.git_sample_yahiro;

/**
 * 野球チームのドメイン
 * 
 * @author akihiko.yahiro
 *
 */
public class BaseballTeamForm {
	/** id */
	private String id;
	/** セ・パリーグ */
	private String leagueName;
	/** チーム名 */
	private String teamName;
	/** 本社 */
	private String headquarters;
	/** 設立年月日 */
	private String inauguration;
	/** 歴史 */
	private String history;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}