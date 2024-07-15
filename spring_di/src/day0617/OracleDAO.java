package day0617;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DBMS ������Ͽ� ���� �ڵ� ����
 * @author user
 *
 */
public class OracleDAO implements DAO {

	@Override
	public void insertName(String name) throws SQLException {
		System.out.println(name + "�� Oracle DBMS�� �߰��Ǿ���.");
	}

	@Override
	public List<String> selectNames() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("�赿��");
		list.add("�躴��");
		list.add("�ּ���");
		list.add("������");
		list.add("������");
		return list;
	}

}
