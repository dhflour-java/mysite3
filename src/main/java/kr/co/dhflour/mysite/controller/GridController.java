package kr.co.dhflour.mysite.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.dhflour.mysite.service.GridService;

@Controller
@RequestMapping( "/grid" )
public class GridController {

	@Autowired
	private GridService gridService;
	
	@RequestMapping( "" )
	public String index() {
		return "/grid/index";
	}
	
	@ResponseBody
	@RequestMapping( "/api/list" )
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = gridService.getGridList();
		return list;
	}
	
	
}
