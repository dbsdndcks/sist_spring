package day0617di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring Container�� ����Ͽ� ������ ���Թ��� ��ü�� �� ����ϴ� Ŭ����
 * @author user
 *
 */
public class Run {
	public static void main(String[] args) {
		//1.Spring Container ����
//		ApplicationContext ac
//		= new ClassPathXmlApplicationContext("day0617di/applicationContext.xml");
		ApplicationContext ac 
		= new FileSystemXmlApplicationContext("C:/dev/workspace_spring/spring_di/src/day0617di/applicationContext.xml");
		
		//2.������ ���Թ��� ��ü ���
		Service service = ac.getBean(ServiceImpl.class);
		//3. ���
		service.addName("��ȣ��ȣ");
		System.out.println(service.searchName());
		
		//4.Spring Container ����
		((FileSystemXmlApplicationContext)ac).close();
	}
}
