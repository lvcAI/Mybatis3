package party.pjc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import party.pjc.dao.NewsInfoDao;

public class TestApp {

	private NewsInfoDao newsInfoDao = new NewsInfoDao();
	
	

	@Test
	public void demo1(){
		System.out.println(newsInfoDao.finduserByNid());
	}
}
