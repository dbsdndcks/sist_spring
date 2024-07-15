package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.service.AjaxService;

@Controller
@RequestMapping("/day0611")
public class AjaxController {
	
	@Autowired(required = false)
	private AjaxService ajaxService;
	
	@GetMapping("/ajax.do")
	public String ajaxFrm() {
		
		return "day0611/ajax_frm";
	}//ajaxFrm
	
	@GetMapping("/ajax_result.do")
	public String ajaxFrmProcess(Model model) {
		
		model.addAttribute("jsonObj",ajaxService.jsonData());
		
		return "day0611/ajax_result";
	}//ajaxFrmProcess
	
	@ResponseBody
	//@GetMapping("/ajax_responsebody.do")
	@RequestMapping(value="/ajax_responsebody.do", method=RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String ajaxResponseBody() {
		
		
		return ajaxService.jsonData2();
	}//ajaxResponseBody
	
	public static void main(String[] args) {
		
	}
}
