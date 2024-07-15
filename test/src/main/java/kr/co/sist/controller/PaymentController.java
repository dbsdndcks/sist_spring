package kr.co.sist.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.sist.service.PaymentService;


@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@ResponseBody
	@PostMapping("/payment.do")
	public Map<String, Object> payment(@RequestBody Map<String, Object> paymentData,Model model) {
		String impUid = (String)paymentData.get("imp_uid");
		String token = (String)paymentData.get("token");
       
		Map<String, Object> paymentDetails = paymentService.getPaymentInfo(token, impUid);
		
        return paymentDetails; 
	}
	

	
	
}
