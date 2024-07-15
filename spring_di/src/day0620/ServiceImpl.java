package day0620;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ���������� �����ϴ� Ŭ���� : DB�� ����ϴ� ������ �׷��� �ʴ� ��������
 * @author user
 *
 */
@Component
public class ServiceImpl{
	
	//field injection
	//@Autowired(required = false)
	private OracleDAO dao;
	
	public ServiceImpl() {
		System.out.println("기본생성자");
	}
	
	@Autowired(required = false)
	public ServiceImpl(OracleDAO dao) {
		this.dao = dao;
		System.out.println("기본생성자 임플");
	}
	
	public void addName(String name) { //�θ� ������ : ��� �ڽ��� �Է��� �� �ִ�.
		try {
			dao.insertName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<String> searchName() { //dao�� ����ϸ� �Է¹��� �ڽ��� method�� ȣ��(��ü ������)
		List<String> list = null;
		try {
			list = 	dao.selectNames();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
