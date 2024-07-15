package kr.co.sist.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.util.WebUtils;

@SessionAttributes("modelName")
@Controller
@RequestMapping("/day0610")
public class SessionController {
	
	@GetMapping("/set_session.do")
	public String setSession(HttpServletRequest request, HttpSession session, Model model) {
		
		WebUtils.setSessionAttribute(request, "webUtils","이명화");
		session.setAttribute("sesName", "정명호");
		model.addAttribute("modelName", "박시현");
		
		return "day0610/set_session_result"; 
	}//setSession
	
	@GetMapping("/get_session.do")
	public String getSession(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("session : " + session.getAttribute("sesName"));
		System.out.println("model : " + model.getAttribute("modelName"));
		String name1 = (String)WebUtils.getSessionAttribute(request, "sesName");
		String name2 = (String)WebUtils.getSessionAttribute(request, "modelName");
		String name3 = (String)WebUtils.getSessionAttribute(request, "webUtils");
		System.out.println("WebUtils : "+  name1 +"/" + name2 + "/" + name3);
		return "day0610/session_result";
	}//getSession
	
	@GetMapping("/remove_session.do")
	public String removeSession(HttpSession session) {
		session.removeAttribute("sesName"); 
		session.removeAttribute("modelName"); //model을 통해서 설정된 값은 삭제되지 않는다
		
		return "day0610/session_result";
	}//removeSession
	
	@GetMapping("/remove_session2.do")
	public String removeSession2(SessionStatus ss) {
		System.out.println(ss.isComplete());
		ss.setComplete();//세션사용종료 (model에설정된 세선이 삭제된다)
		System.out.println(ss.isComplete());
		
		//redirect로 이동하면 sessionAttribute로 설정한 세션명과 값이 QueryString으로 생성되는 현상이
		//생길수도있다 => 해결 redirect:를 직접사용하지않는다.
		return "day0610/set_session_result";
	}//removeSession2
	
	@GetMapping("/add_cookie.do")
	public String addCookie(HttpServletResponse response) {
		
		//1.쿠키 생성
		Cookie cookie = new Cookie("name", "박시현아");
		Cookie cookieAge = new Cookie("age", "25");
		//2. 생존시간 설정
		cookie.setMaxAge(60*1);
		cookie.setMaxAge(60*1);
		//3.쿠키 심기
		response.addCookie(cookie);
		response.addCookie(cookieAge);
		
		return "day0611/add_cooke_result";
	}
	
	@GetMapping("/cookie_annotation.do")
	public String getCookieAnnotation(@CookieValue(name="name",defaultValue = "정명호") String name, 
			@CookieValue(name="age", defaultValue = "24") int age, 
			Model model) {
		
		model.addAttribute("msg","@Cookie Value annotaion");
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		System.out.println("쿠키값:" + name + "/" +age);
		return "day0611/get_cookie";
	}
	
	@GetMapping("/web_utils.do")
	public String useWebUtils(HttpServletRequest request, Model model) {
		
		Cookie nameCookie = WebUtils.getCookie(request, "name");
		Cookie ageCookie = WebUtils.getCookie(request, "age");
		
		String name="";
		if(nameCookie != null) {
			name = nameCookie.getValue();
		}
		
		String age="";
		if(ageCookie != null) {
			age = ageCookie.getValue();
		}
		
		model.addAttribute("msg","WebUtils");
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		System.out.println("웹유틸스:" + name + "/" +age);
		return "day0611/get_cookie";
	}
	
}
