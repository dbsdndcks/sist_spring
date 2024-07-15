package day0617;

import java.sql.SQLException;
import java.util.List;

/**
 * ���������� �����ϴ� Ŭ���� : DB�� ����ϴ� ������ �׷��� �ʴ� ��������
 * @author user
 *
 */
public class ServiceImpl implements Service{

	private DAO dao;
	
	public ServiceImpl(DAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addName(String name) { //�θ� ������ : ��� �ڽ��� �Է��� �� �ִ�.
		try {
			dao.insertName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
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
