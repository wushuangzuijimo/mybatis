package com.woniuxy.A;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {

	@Test
	public void testSave() throws Exception {

		// ����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// �ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		// ��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);

		Emp emp = new Emp();
		emp.setEname("����");
		emp.setBirthday(new Date(0));
		emp.setMoney(200d);

		s.insert("com.woniu.domain.EmpMapper.save", emp);
		s.close();

	}

	@Test
	public void testDelete() throws Exception {

		// ����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// �ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		// ��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);

		s.delete("com.woniu.domain.EmpMapper.delete", 2);

		s.close();

	}

	@Test
	public void testUpdate() throws Exception {

		// ����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// �ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		// ��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);

		Emp emp = new Emp();
		emp.setEid(3);
		emp.setEname("С��");
		emp.setBirthday(new Date());
		emp.setMoney(900d);

		s.update("com.woniu.domain.EmpMapper.update", emp);

		s.close();

	}

	@Test
	public void testFindAll() throws Exception {
		// ����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// �ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		// ��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);

		List<Emp> list = s.selectList("com.woniu.domain.EmpMapper.findall");

		for (Emp emp : list) {
			System.out.println(emp);
		}
		s.close();
	}

	@Test
	public void testFindOne() throws Exception {
		// ����������
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// ��������
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// �ӹ����л�ȡ���Ự,ÿһ���Ự����װ��һ��connection
		// ��ȡ�Ự��ʱ��,������Զ�������,��д�κ�api
		SqlSession s = sf.openSession(true);
		/*
		 * Emp emp = s.selectOne("com.woniu.domain.EmpMapper.findone", 3);
		 * System.out.println(emp);
		 */
		List<Emp> list = s.selectList("com.woniu.domain.EmpMapper.findone",3);
		System.out.println(list);
		


		s.close();
	}

}
