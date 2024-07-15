package kr.co.sist.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/day0611")
public class ExceptionController {
	
	@GetMapping("/test_exception.do")
	public String testException() {
		
		if(new Random().nextBoolean()) {
			throw new RuntimeException("���ƾ�~ ����~!");
			
			}//end if
		
		return "day0611/exception_result";
	}
	
	@GetMapping("/test_exception2.do")
	public String testException2() {
		
		if(new Random().nextBoolean()) {
			throw new RuntimeException("!!!!!!!!!!!!���ܹ߻�!!!!!!!!!!!!!!!");
			
		}//end if
		
		return "day0611/exception_result";
	}
	
	
	//�� controller���� �߻��� ��� RuntimeException�� exceptionProcess method�� ����
	
	@ExceptionHandler(RuntimeException.class)
	//1.@ExceptionHandler�� ���ǵ� Exception�� �Ű������� ����, ��ȯ���� M.A.V����
	public ModelAndView exceptionProcess(RuntimeException re) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("day0611/exception_process");
		mav.addObject("msg",re.getMessage());
		mav.addObject("msg2",re.toString());
		return mav;
		
	}
}
