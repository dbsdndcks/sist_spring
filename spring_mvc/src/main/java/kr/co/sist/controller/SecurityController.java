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
		
		//���񽺸� ����Ͽ� �Էµ� ���̵�� ��й�ȣ�� �������� �־� �����Ѵ�
		PasswordEncoder pe = new BCryptPasswordEncoder();
//		//2. ��ȣȭ
		String dbPass ="test1234";
		String cipherPass = pe.encode(dbPass);
//		
		boolean loginFlag = pe.matches(lVO.getPass(), cipherPass);
		model.addAttribute("loginResult",loginFlag);
		
		
		return "day0614/login_result";
	}//loginProcess
	
	@GetMapping("/plain_text.do")
	public String searchUser(Model model) {
		//DBMS���� ��ȸ�� ���
		String name = "ce948213088faa0c39f834c3704ff70349f5c759a505955c5f41632553847506";
		String email =  "940316a955854ec0f75e5e2e5a4eff32c98f6554b7a2a4331c6e71c2dcd47caa";
		
		String key ="test1234";
		String salt = "12345678";

		//1.��ȣȭ ��ü ����
		TextEncryptor te = Encryptors.text(key, salt);
		
		//2. ��ȣȭ
		model.addAttribute("name", te.decrypt(name));
		model.addAttribute("email", te.decrypt(email));
		return "day0614/plain_text";
	}
	
	public static void main(String[] args) {
//		
//		//1. ��ȣȭ ��ü ����
//		PasswordEncoder pe = new BCryptPasswordEncoder();
//		
//		//2. ��ȣȭ
//		String plainPass = "test1234";
//		String cipherPass =pe.encode(plainPass);
//		System.out.println("��� ��� : " + plainPass);
//		System.out.println("��ȣȭ ��� : " +cipherPass);
//		
//		//3. ��
//		String inputPass = "test1234";
//		String cipherPass2 =pe.encode(inputPass);
//		System.out.println("��ȣȭ ��� : " +cipherPass2);
//		boolean flag = pe.matches(inputPass, cipherPass);
//		System.out.println(flag);
		
		//��ȣȭ, ��ȣȭ
		String name= "�̸�ȭ";
		String email = "lee@test.com";
		
		String key ="test1234";
		String salt = "12345678";
		
		//1. ��ȣȭ ��ü ����
		TextEncryptor te = Encryptors.text(key, salt);
	
		//2. ��ȣȭ(DB�� insert)
		String cipherName = te.encrypt(name);
		String cipherEmail = te.encrypt(email);
		
		System.out.println("��ȣȭ �̸� : " + cipherName);
		System.out.println("��ȣȭ �̸��� : " + cipherEmail);
		
		//4. ��ȣȭ (����ڿ��� ��������)
		String pName = te.decrypt(cipherName);
		String pEmail = te.decrypt(cipherEmail);
		
		System.out.println("��ȣȭ �̸� : " + pName);
		System.out.println("��ȣȭ �̸��� : " + pEmail);
		
	}//main
}//class
