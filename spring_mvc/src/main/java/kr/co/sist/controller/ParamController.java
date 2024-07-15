package kr.co.sist.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.vo.ParamVO;

@Controller
public class ParamController {
	
	@GetMapping("/day0604/param_frm.do")
	public String paramFrm(){
		return "day0604/param_frm"; 
	}
	
	/**
	 * HTML Form Control의 name속성에 이름과 method의 parameter명이 같아야한다.
	 * String이 아닌 경우에 Framework에서 동일형으로 변환해준다. (int->Integer.parseInt)
	 * ==> 장: VO를 안만들어도됨
	 * ==> 단: 값을 전달하기가 불편함, 코드가 지저분하다.
	 * @return
	 */
	@GetMapping("/day0604/single_param.do")
	public String singleDataType(String name, @RequestParam(defaultValue="0") int age, String email,Model model) {
		//web parameter의 유효성 검증, Service객체로 전달.관계유지
		
		model.addAttribute("msg","GET방식의요청");
		System.out.println(name +" "+age+" " + email);
		return "day0604/single_param";
	}
	
	@PostMapping("/day0604/single_param.do")
	public String postSingleDataType(HttpServletRequest request ,String name, int age, String email,Model model) throws UnsupportedEncodingException {
		//web parameter의 유효성 검증, Service객체로 전달.관계유지
		model.addAttribute("msg","POST방식의요청");
		System.out.println("POST방식"+name +" "+age+" " + email);
		//POST방식일때 Filter를 사용하지 않으면 한글을 encoding하여 사용한
//		System.out.println(new String(name.getBytes("8859_1"),"UTF-8"));
//		System.out.println(URLDecoder.decode(URLEncoder.encode( name,"8859_1"),"UTF-8"));
		
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/vo_param.do")
	public String voParam(ParamVO pVO, Model model) {
		
		model.addAttribute("msg","GET방식의 VO를 사용한 요청 값 처리");
		return "day0604/single_param";
	}
	
	@PostMapping("/day0605/post_vo_param.do")
	public String postVoParam(ParamVO pVO , Model model) {
		model.addAttribute("msg" , "POST방식의 VO를 사용한 요청 값 처리");
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/hsr_param.do")
	public String hsrParam(HttpServletRequest request) {
		request.setAttribute("msg", "HttpServletRequest를 사용한 요청 값 처리");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name +"/" + age);
		
		//접속자의 정보를 얻을 수 있다.
		System.out.println("접속자 IP " + request.getRemoteAddr() +
				"/접속자 port" + request.getRemotePort());
		
		Enumeration<String> en = request.getHeaderNames();
		String headerName = "";
		while(en.hasMoreElements()) {
			headerName = en.nextElement();
			System.out.println(headerName);
		}
		
		return "day0604/single_param";
	}
	
	@PostMapping("/day0605/post_hsr_param.do")
	public String postHsrParam(HttpServletRequest request) {
		request.setAttribute("msg", "HttpServletRequest를 사용한 요청 값 처리");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name +"/" + age);
		
		//접속자의 정보를 얻을 수 있다.
		System.out.println("접속자 IP " + request.getRemoteAddr() +
				"/접속자 port" + request.getRemotePort());
		
		String referer = request.getHeader("referer");
		String accept_laguage = request.getHeader("accept-language");
		System.out.println("이 페이지를 요청한 URL : " + referer);
		System.out.println("이 페이지를 요청한 lang : " + accept_laguage);
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/btn_rp.do")
	public String useRequestParam(
		
		@RequestParam(name="name", required = false,defaultValue = "윤웅찬")String myName,
		@RequestParam(defaultValue = "0")int age,
		@RequestParam(defaultValue = "1")String currentPage,
		Model model) {
		
		model.addAttribute("msg","RequestParam사용");
		
		System.out.println("myName : " + myName);
		System.out.println("age : "+age);
		return "day0604/single_param";
	}
	
}
