package kr.co.sist.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
public class TestController {
	@GetMapping("/index.do")
	public String main() {
		
		return "index"; 
	}//main
	
//	@RequestMapping("/get.do")
//	@RequestMapping(value="/get.do", method=RequestMethod.GET)
	@GetMapping("/get.do")
	public String get(HttpServletRequest request, Model model) {
		model.addAttribute("method",request.getMethod());
		System.out.println("get Mehotd-----------------------");
		return "day0604/result";
	}
	
	@PostMapping("/post.do")
	public String post(HttpServletRequest request, Model model) {
		
		model.addAttribute("method",request.getMethod());
		return "day0604/result";
	}
	
	@RequestMapping(value={"/a.do","/b.do","/yana.do"},method=GET)
	public String intergrateUrl(Model model) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE");
		model.addAttribute("date",sdf.format(new Date()));
		return "day0605/intergrated";
				
	}
}//class
