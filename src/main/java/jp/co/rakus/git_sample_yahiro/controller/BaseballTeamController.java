package jp.co.rakus.git_sample_yahiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.git_sample_yahiro.domain.BaseballTeam;
import jp.co.rakus.git_sample_yahiro.service.BaseballTeamService;

@Controller
@RequestMapping("5km")
public class BaseballTeamController {

	@Autowired
	BaseballTeamService service;

	/**
	 * 初期表示
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		List<BaseballTeam> teams = service.findAll();
		model.addAttribute("teams", teams);
		return "teams";
	}
	
	@RequestMapping("execute")
	public String execute(Integer id, Model model){
		BaseballTeam baseballTeam = service.load(id);
		model.addAttribute("baseball",baseballTeam);
		return "list";
		
	}

}
