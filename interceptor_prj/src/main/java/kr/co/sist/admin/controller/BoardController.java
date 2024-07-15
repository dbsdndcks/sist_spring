package kr.co.sist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BoardController {
	
	@GetMapping("/board_list.do")
	public String boardList(Model model) {
		return "admin/board/board_list";
	}
}
