package day0617;

/**
 * ������ ������ �����ϴ� Ŭ����
 * @author user
 *
 */
public class Assembly {
	public Service getBean() {
		//1. ������ ������ Ŭ������ ��üȭ
//		OracleDAO oDAO = new OracleDAO();
		MySqlDAO oDAO = new MySqlDAO();
		//2. ������ ���Թ��� Ŭ������ ��üȭ
		ServiceImpl si = new ServiceImpl(oDAO);
		//3. ������ ���� ���� ��ü�� ��ȯ
		return si;
	}
}
