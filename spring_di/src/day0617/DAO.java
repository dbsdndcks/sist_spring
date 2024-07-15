package day0617;

import java.sql.SQLException;
import java.util.List;

/**
 * DBMS������ ���� ��ϸ� ���. 
 * @author user
 *
 */
public interface DAO {
	public void insertName(String name) throws SQLException;
	
	public List<String> selectNames()throws SQLException;
}
