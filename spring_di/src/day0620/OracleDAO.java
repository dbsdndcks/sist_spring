package day0620;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * DBMS ������Ͽ� ���� �ڵ� ����
 * @author user
 *
 */
@Component
public class OracleDAO{

	public void insertName(String name) throws SQLException {
        System.out.println(name + "이 Oracle DBMS에 추가되었습니다.");
    } // insertName

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
