package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day0610")
public class IncludeController {
	
	@GetMapping("/jsp_include.do")
	public String useInclude() {
		
		return "day0610/include_test";
	}//useInclude
	
	
	@GetMapping("/temp.do")
	public String tempInclude() {
		
		return "common/jsp/temp";
	}//tempInclude
	
	@GetMapping("/do_include.do")
	public String doInclude() {
		
		return "day0610/do_include";
	}//doInclude
}
