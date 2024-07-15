package day0618;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0617.Service;
import day0617di.ServiceImpl;

public class UseMethodDependency {

	public static void main(String[] args) {
		//1.Spring Container ����( ApplicationContext)
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0618/applicationContext2.xml");
		
		//2.������ ���� ���� ��ü( bean )�� ���
		day0617di.Service service = ac.getBean(ServiceImpl.class);
		//3. ���.
		service.addName("�����");
		
		//4. Spring Container �ݱ�
		//((ClassPathXmlApplicationContext)ac).close();

		System.out.println("-------------------------------------");
		
		//1. Spring container ����
		//2. Bean ���
		day0617.Service si2 = ac.getBean(SingletonServiceImpl.class);

		//3. ���
		si2.addName("������");
		//4. Spring container �ݱ�
		((ClassPathXmlApplicationContext)ac).close();
	}

}
