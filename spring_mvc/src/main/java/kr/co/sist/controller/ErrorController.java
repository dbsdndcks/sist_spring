package kr.co.sist.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day0612")
public class ErrorController {
	
	@PostMapping("/err_405.do")
	public String postMethod() {
		return "day0612/result";
	}

	@GetMapping("/err_500.do")
	public String err500() throws Exception {
		if(new Random().nextBoolean()) {
			throw new Exception("예외 강제 발생");
		}
		
		return "day0612/result";
	}
}
