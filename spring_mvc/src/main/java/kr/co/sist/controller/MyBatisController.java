package kr.co.sist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.domain.EmpDomain;
import kr.co.sist.service.MyBatisService;

@Controller
@RequestMapping("/day0613")
public class MyBatisController {
	
	@Autowired(required = false)
	private MyBatisService myBatisService;
	
	@GetMapping("/mybatis_search.do")
	public String searchEmp(@RequestParam(required = false, defaultValue = "10") int deptno, Model model) {
		
		List<EmpDomain> list = myBatisService.searchEmp(deptno);
		model.addAttribute("listEmp",list);
		
		return "day0613/emp_result";
				
	}
	
}
