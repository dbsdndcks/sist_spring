package day0617;

/**
 * ������ ���Թ��� ��ü�� �� ����ϴ� Ŭ����
 * @author user
 *
 */
public class Run {
	public static void main(String[] args) {
		Assembly ab = new Assembly();
		Service service =  ab.getBean();
		service.addName("�ƿ��ƿ��ƿ��ƿ�");
		System.out.println(service.searchName());
	}
}
