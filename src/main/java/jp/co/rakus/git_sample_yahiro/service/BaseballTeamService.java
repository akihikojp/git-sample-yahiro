package jp.co.rakus.git_sample_yahiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.rakus.git_sample_yahiro.domain.BaseballTeam;
import jp.co.rakus.git_sample_yahiro.repository.BaseballTeamRepository;

/**
 * 野球チームのサービスクラス
 * @author akihiko.yahiro
 *
 */
@Service
@Transactional
public class BaseballTeamService {

	@Autowired
	BaseballTeamRepository repository;

	/**
	 * 全チームの情報検索
	 * @return
	 */
	public List<BaseballTeam> findAll() {
		return repository.findAll();

	}
	
	/**
	 * チームのid情報検索
	 * @return
	 */
	public BaseballTeam load(Integer id){
		return repository.load(id);

	}
}

