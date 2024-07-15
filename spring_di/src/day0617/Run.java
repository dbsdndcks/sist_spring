package day0617;

/**
 * 의존성 주입받은 객체를 얻어서 사용하는 클래스
 * @author user
 *
 */
public class Run {
	public static void main(String[] args) {
		Assembly ab = new Assembly();
		Service service =  ab.getBean();
		service.addName("아오아오아오아오");
		System.out.println(service.searchName());
	}
}
