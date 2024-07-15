package day0617;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DBMS ������Ͽ� ���� �ڵ� ����
 * @author user
 *
 */
public class MySqlDAO implements DAO {

	@Override
	public void insertName(String name) throws SQLException {
		System.out.println(name + "�� MySql DBMS�� �߰��Ǿ���.");
	}

	@Override
	public List<String> selectNames() throws SQLException {
		List<String> list = new ArrayList<String>();
		list.add("ȫ����");
		list.add("��̿�");
		list.add("����ȣ");
		list.add("�ڽ���");
		return list;
	}

}
