package kr.co.sist.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyBatisDAO {
//	private static MyBatisDAO mbDAO;
	private static SqlSessionFactory ssf; //�̱��� ������ => �������,�ϰ��� ����,���� ����

	private MyBatisDAO() {
		org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
	}
	
//	public static MyBatisDAO getInstance() {
//		if(mbDAO == null) {
//			mbDAO = new MyBatisDAO();
//		}
//		return mbDAO;
//	}//getInstance
	
	/**
	 * SqlSessionFactory�� �������,�ϰ�������, ������ ���̼��� ���ؼ� Singleton Pattern���� ���
	 * @return
	 */
	 static{ //static ���� :  ȣ������ �ʰ� Ŭ�����������Ǹ� �ڵ�ȣ�� �Ǵ� ����.
		if(ssf == null) {
			try {
				//1. �������ϰ� ����
				Reader reader = Resources.getResourceAsReader("kr/co/sist/dao/mybatis-config.xml");
				//2. MyBatis Framework ����
				ssf = new SqlSessionFactoryBuilder().build(reader);
				//3. ��Ʈ�� �ݱ�
				if (reader != null) {reader.close();} //end if
				
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
	}//getSessionFactory
	
	public SqlSession getMyBatisHandler(boolean autoCommit) {
		return ssf.openSession(autoCommit);
	}//getMyBatisHandler
	
	public void closeHandler(SqlSession ss) {
		if(ss != null) {ss.close();} //end if
	}
}
