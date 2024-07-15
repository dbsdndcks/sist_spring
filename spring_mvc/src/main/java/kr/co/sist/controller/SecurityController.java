package kr.co.sist.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.vo.LoginVO;

@Controller
@RequestMapping("/day0614")
public class SecurityController {
	
	@PostMapping("/login_process.do")
	public String loginProcess(LoginVO lVO,Model model) {
		
		//서비스를 사용하여 입력된 아이디와 비밀번호를 쿼리문에 넣어 실행한다
		PasswordEncoder pe = new BCryptPasswordEncoder();
//		//2. 암호화
		String dbPass ="test1234";
		String cipherPass = pe.encode(dbPass);
//		
		boolean loginFlag = pe.matches(lVO.getPass(), cipherPass);
		model.addAttribute("loginResult",loginFlag);
		
		
		return "day0614/login_result";
	}//loginProcess
	
	@GetMapping("/plain_text.do")
	public String searchUser(Model model) {
		//DBMS에서 조회된 결과
		String name = "ce948213088faa0c39f834c3704ff70349f5c759a505955c5f41632553847506";
		String email =  "940316a955854ec0f75e5e2e5a4eff32c98f6554b7a2a4331c6e71c2dcd47caa";
		
		String key ="test1234";
		String salt = "12345678";

		//1.암호화 객체 생성
		TextEncryptor te = Encryptors.text(key, salt);
		
		//2. 복호화
		model.addAttribute("name", te.decrypt(name));
		model.addAttribute("email", te.decrypt(email));
		return "day0614/plain_text";
	}
	
	public static void main(String[] args) {
//		
//		//1. 암호화 객체 생성
//		PasswordEncoder pe = new BCryptPasswordEncoder();
//		
//		//2. 암호화
//		String plainPass = "test1234";
//		String cipherPass =pe.encode(plainPass);
//		System.out.println("평분 비번 : " + plainPass);
//		System.out.println("암호화 비번 : " +cipherPass);
//		
//		//3. 비교
//		String inputPass = "test1234";
//		String cipherPass2 =pe.encode(inputPass);
//		System.out.println("암호화 비번 : " +cipherPass2);
//		boolean flag = pe.matches(inputPass, cipherPass);
//		System.out.println(flag);
		
		//암호화, 복호화
		String name= "이명화";
		String email = "lee@test.com";
		
		String key ="test1234";
		String salt = "12345678";
		
		//1. 암호화 객체 생성
		TextEncryptor te = Encryptors.text(key, salt);
	
		//2. 암호화(DB에 insert)
		String cipherName = te.encrypt(name);
		String cipherEmail = te.encrypt(email);
		
		System.out.println("암호화 이름 : " + cipherName);
		System.out.println("암호화 이메일 : " + cipherEmail);
		
		//4. 복호화 (사용자에게 보여질때)
		String pName = te.decrypt(cipherName);
		String pEmail = te.decrypt(cipherEmail);
		
		System.out.println("복호화 이름 : " + pName);
		System.out.println("복호화 이메일 : " + pEmail);
		
	}//main
}//class
