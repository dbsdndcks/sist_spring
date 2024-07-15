package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.service.TokenSerivce;
import kr.co.sist.service.testService;

@Controller
public class TestController {
	
	@Autowired
	testService service;
	@Autowired
	TokenSerivce tokenSerivce;
	
	@GetMapping("/test.do")
	public String main(){
		
		return "payment";
	}
	
	@ResponseBody
	@GetMapping("/getToken.do")
	public String getToekn() {
		String token = tokenSerivce.getImportToken();
		
		return token;
	}
}
