package day0618;

import java.sql.SQLException;
import java.util.List;

import day0617.Service;
import day0617di.DAO;
import lombok.Setter;

/**
 * singletone pattern이 적용된 클래스
 * @author user
 *
 */
public class SingletonServiceImpl implements Service{

	@Setter
	private DAO dao;
	
	private static SingletonServiceImpl ssi;
	
	private SingletonServiceImpl() {
		System.out.println("SingletonServiceImpl의 private 생성자");
	}
	
	public static SingletonServiceImpl getInstance() {
		if(ssi == null) {
			ssi = new SingletonServiceImpl();
		}//end if
		System.out.println("singleton getInstance");
		return ssi;
	}
	
	@Override
	public void addName(String name) {
		try {
			dao.insertName(name);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<String> searchName() {
		List<String> list = null;
		
		try {
			list = dao.selectNames();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}