package kr.co.dhflour.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/grid" )
public class GridController {

	@RequestMapping( "" )
	public String index() {
		return "/grid/index2";
	}
}
