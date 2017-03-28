package party.pjc.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionHelp {

	public static SqlSession getSqlSession() throws IOException{
		String resoure ="party/pjc/date/Configuration.xml";
		Reader reader = Resources.getResourceAsReader(resoure);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession= sqlSessionFactory.openSession();
		return sqlSession;
		
	} 
}
