package jp.co.rakus.git_sample_yahiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.git_sample_yahiro.service.BaseballTeamService;

@Controller
@RequestMapping("/")
public class BaseballTeamController {

	@Autowired
	BaseballTeamService service;
		
}
