package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("id") 
@Controller
@RequestMapping("/day0610")
public class MoveController {
	
	@GetMapping("/use_redirect.do")
	public String useRedircet() {
		
		//return "day0610/test.jsp"; //viewResolver�� ���ؼ� ���� => WEB-INF/views/day0610/test.jsp.jsp
		//return "redirect:test.jsp"; //redirect: �� ����ϸ� ViewResolver�� ��ġ�� �ʰ� URL�� ������â�Ѵ�
		return "redirect:http://stu18.sist.co.kr/spring_mvc/day0610/test.jsp"; 
	}
	
	@GetMapping("/use_redirect2.do")
	public String useRedircet2() {
		
		//return "../day0605/hsr_hs.do"; //ViewResolver���ؼ� ���� => WEB-INF/day0605/hsr_hs.do.jsp
		//return "redirect:../day0605/hsr_hs.do"; //redirect:�� ����ϸ� ViewResolver�� ��ġ���ʰ� URL�� ���� ��û
		return "redirect:http://stu18.sist.co.kr/spring_mvc/day0605/hsr_hs.do"; //redirect:�� ����ϸ� ViewResolver�� ��ġ���ʰ� URL�� ���� ��û
	}
	
	
	//////////////////////////FOWARD CHAIN//////////////////////////////
	
	//forward_a.do�� ��û�� �߻��ϸ� forward_b.do�� �̵��Ѵ�
	@GetMapping("/forward_a.do")
	public String useForwardA() {
		//return "forward_b.do"; //ViewResolver => WEB-INF/views/forward_b.do.jsp
		return "forward:forward_b.do"; //ViewResolver�� ��ġ���ʰ� do�����Ͽ� ȣ��
	}//useForwardA
	
	//forward_b.do�� ��û�� �߻��ϸ� forward_c.do�� �̵��Ѵ�
	@GetMapping("/forward_b.do")
	public String useForwardB(Model model) {
		model.addAttribute("id","kim"); //request ,@SessionAttributes("id") => session
		return "forward:forward_c.do";
	}//useForwardB
	
	//forward_c.do �������� ����� �����ִ� ������
	@GetMapping("/forward_c.do")
	public String useForwardC(String year, String month, Model model) {
		System.out.println(year + "/" + month + "/" + model.getAttribute("id"));
		return "day0610/forward_result";
	}//useForwardC
	
}
