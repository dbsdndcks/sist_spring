package kr.co.sist.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.service.TestService;

@SessionAttributes("id")
@Controller
public class DataController {
	
	@Autowired(required = false)
	private TestService testService;
	
	/**
	 * HttpServletRequest, HttpSession 을 사용한 View에 값 전달.
	 * @return
	 */
	@GetMapping("day0605/hsr_hs.do")
	public String hsrHs(HttpServletRequest request, HttpSession session) {
		
		request.setAttribute("names",testService.searchNames()); //requestScope.names
		session.setAttribute("id",testService.searchId()); //sessionScope.id
		
		return "day0605/hsr_hs";
	}
	
	@GetMapping("day0605/model.do")
	public String useModel(Model model) {
		model.addAttribute("names",testService.searchNames()); //requestScope.names
		model.addAttribute("id",testService.searchId());//requestScope.id
		//model에 값설정
		return "day0605/model";
	}
	
	
}
