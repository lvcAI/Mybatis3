package party.pjc.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import party.pjc.db.SqlSessionHelp;
import party.pjc.model.NewsInfo;
import party.pjc.model.User;

public class NewsInfoDao {

	public NewsInfo finduserByNid(){
		SqlSession sqlSession =null;
		NewsInfo newsInfo =null;
		try {

			sqlSession =SqlSessionHelp.getSqlSession();
			newsInfo=(NewsInfo) sqlSession.selectOne("selectByPrimaryKey", 1);
			 
			
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
		return newsInfo;	
	}
}
