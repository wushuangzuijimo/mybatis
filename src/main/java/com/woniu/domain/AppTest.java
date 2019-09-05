package com.woniu.domain;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {

	@Test
	public void testSave() throws Exception {


		//加载主配置
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// 创建工厂
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		//从工厂中获取出会话,每一个会话都封装了一个connection
		//获取会话的时候,事务就自动开启了,不写任何api
		SqlSession s = sf.openSession(true);
		
		Emp emp = new Emp();
		emp.setEname("老王");
		emp.setBirthday(new Date(0));
		emp.setMoney(200d);
		
		s.insert("com.woniu.domain.EmpMapper.save",emp);
		
		
		
		
		
		
		
		
		
		s.close();
		
		

	}

}
