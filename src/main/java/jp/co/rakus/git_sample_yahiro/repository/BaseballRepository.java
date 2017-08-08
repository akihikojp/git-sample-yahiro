package jp.co.rakus.git_sample_yahiro.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rakus.git_sample_yahiro.domain.BaseballTeam;

/**
 * 野球チームのレポジトリークラス
 * 
 * @author akihiko.yahiro
 *
 */
@Repository
public class BaseballRepository {

	/**
	 * SQLアクセス
	 */
	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<BaseballTeam> baseballTeamRowMapper = (rs, i) -> {
		BaseballTeam baseballTeam = new BaseballTeam();
		baseballTeam.setId(rs.getInt("id"));
		baseballTeam.setLeagueName(rs.getString("league_name"));
		baseballTeam.setTeamName(rs.getString("team_name"));
		baseballTeam.setHeadquarters(rs.getString("headquarters"));
		baseballTeam.setInauguration(rs.getString("inauguration"));
		baseballTeam.setHistory(rs.getString("history"));
		return baseballTeam;
	};

	public List<BaseballTeam> findAll() {
		String sql = "select id, league_name, team_name, headquarters, inauguration, history from  baseball_teams;";

		List<BaseballTeam> baseballTeam = template.query(sql, baseballTeamRowMapper);

		return baseballTeam;
	}

}
