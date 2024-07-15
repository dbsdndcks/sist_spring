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
	 * HTML Form Control�� name�Ӽ��� �̸��� method�� parameter���� ���ƾ��Ѵ�.
	 * String�� �ƴ� ��쿡 Framework���� ���������� ��ȯ���ش�. (int->Integer.parseInt)
	 * ==> ��: VO�� �ȸ�����
	 * ==> ��: ���� �����ϱⰡ ������, �ڵ尡 �������ϴ�.
	 * @return
	 */
	@GetMapping("/day0604/single_param.do")
	public String singleDataType(String name, @RequestParam(defaultValue="0") int age, String email,Model model) {
		//web parameter�� ��ȿ�� ����, Service��ü�� ����.��������
		
		model.addAttribute("msg","GET����ǿ�û");
		System.out.println(name +" "+age+" " + email);
		return "day0604/single_param";
	}
	
	@PostMapping("/day0604/single_param.do")
	public String postSingleDataType(HttpServletRequest request ,String name, int age, String email,Model model) throws UnsupportedEncodingException {
		//web parameter�� ��ȿ�� ����, Service��ü�� ����.��������
		model.addAttribute("msg","POST����ǿ�û");
		System.out.println("POST���"+name +" "+age+" " + email);
		//POST����϶� Filter�� ������� ������ �ѱ��� encoding�Ͽ� �����
//		System.out.println(new String(name.getBytes("8859_1"),"UTF-8"));
//		System.out.println(URLDecoder.decode(URLEncoder.encode( name,"8859_1"),"UTF-8"));
		
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/vo_param.do")
	public String voParam(ParamVO pVO, Model model) {
		
		model.addAttribute("msg","GET����� VO�� ����� ��û �� ó��");
		return "day0604/single_param";
	}
	
	@PostMapping("/day0605/post_vo_param.do")
	public String postVoParam(ParamVO pVO , Model model) {
		model.addAttribute("msg" , "POST����� VO�� ����� ��û �� ó��");
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/hsr_param.do")
	public String hsrParam(HttpServletRequest request) {
		request.setAttribute("msg", "HttpServletRequest�� ����� ��û �� ó��");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name +"/" + age);
		
		//�������� ������ ���� �� �ִ�.
		System.out.println("������ IP " + request.getRemoteAddr() +
				"/������ port" + request.getRemotePort());
		
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
		request.setAttribute("msg", "HttpServletRequest�� ����� ��û �� ó��");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name +"/" + age);
		
		//�������� ������ ���� �� �ִ�.
		System.out.println("������ IP " + request.getRemoteAddr() +
				"/������ port" + request.getRemotePort());
		
		String referer = request.getHeader("referer");
		String accept_laguage = request.getHeader("accept-language");
		System.out.println("�� �������� ��û�� URL : " + referer);
		System.out.println("�� �������� ��û�� lang : " + accept_laguage);
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/btn_rp.do")
	public String useRequestParam(
		
		@RequestParam(name="name", required = false,defaultValue = "������")String myName,
		@RequestParam(defaultValue = "0")int age,
		@RequestParam(defaultValue = "1")String currentPage,
		Model model) {
		
		model.addAttribute("msg","RequestParam���");
		
		System.out.println("myName : " + myName);
		System.out.println("age : "+age);
		return "day0604/single_param";
	}
	
}
