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


		//����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		//�ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		//��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);
		
		Emp emp = new Emp();
		emp.setEname("����");
		emp.setBirthday(new Date(0));
		emp.setMoney(200d);
		
		s.insert("com.woniu.domain.EmpMapper.save",emp);
		
		
		
		
		
		
		
		
		
		s.close();
		
		

	}

}
