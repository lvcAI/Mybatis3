package party.pjc.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import party.pjc.db.SqlSessionHelp;
import party.pjc.model.User;

public class UserDao {

	
	
	public User findUserById(int id){
		SqlSession sqlSession =null;
		 User user2=null;
		try {

			 sqlSession =SqlSessionHelp.getSqlSession();
			
			 user2= sqlSession.selectOne("finduserbyid", id);
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return user2;
	}
	
	public void deleteUser(User user){
		SqlSession sqlSession =null;
		 int result=0;
		try {

			 sqlSession =SqlSessionHelp.getSqlSession();
			
			 result= sqlSession.delete("delete", user);
			 System.out.println("删除的行数："+result);
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
	}
	
	public int updateUser(User user){
		SqlSession sqlSession =null;
		 int result=0;
		try {

			 sqlSession =SqlSessionHelp.getSqlSession();
			
			 result= sqlSession.update("update",user);
			 System.out.println("删除的行数："+result);
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
		return result;
		
	}
	
	public int saveUser(User user){
		SqlSession sqlSession =null;
		 int result=0;
		try {

			 sqlSession =SqlSessionHelp.getSqlSession();
			 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			 result= userMapper.insert(user);
			
			 System.out.println("删除的行数："+result);
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
		return result;
	}
	
	public List<User> findAll(){
		SqlSession sqlSession =null;
		List<User> userList =null;
		try {

			 sqlSession =SqlSessionHelp.getSqlSession();
			 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			 userList= userMapper.findAll();
			 
			
		  sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
		return userList;
	}
	
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		User user= new User();
		
		user.setUsername("lisi");
		user.setPassword("3838438");
		List<User> users = userDao.findAll();
		for (User user2 : users) {
			System.out.println(user2);
		}
	}
}
