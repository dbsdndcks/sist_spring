package day0618;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0617.Service;
import day0617di.ServiceImpl;

public class UseMethodDependency {

	public static void main(String[] args) {
		//1.Spring Container 생성( ApplicationContext)
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0618/applicationContext2.xml");
		
		//2.의존성 주입 받을 객체( bean )을 얻기
		day0617di.Service service = ac.getBean(ServiceImpl.class);
		//3. 사용.
		service.addName("양수민");
		
		//4. Spring Container 닫기
		//((ClassPathXmlApplicationContext)ac).close();

		System.out.println("-------------------------------------");
		
		//1. Spring container 생성
		//2. Bean 얻기
		day0617.Service si2 = ac.getBean(SingletonServiceImpl.class);

		//3. 사용
		si2.addName("진수현");
		//4. Spring container 닫기
		((ClassPathXmlApplicationContext)ac).close();
	}

}
