package com.woniuxy.b_parameter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
//		User user = new User();
//		user.setName("��������");
//		user.setBirthday(new Date());
//		user.setMoney(999d);
//		
//		s.insert("com.woniuxy.b_parameter.UserMapper.save",user);
		
//		Foo f = new Foo(11,"��«��", new Date(),1000d);
//		s.insert("com.woniuxy.b_parameter.UserMapper.save",f);
		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("eid",23);
		 * map.put("ename","֩����"); map.put("birthday",new Date()); map.put("money",
		 * 2000d);
		 * 
		 * s.insert("com.woniuxy.b_parameter.EmpMapper.save",map);
		 */
		
		
		
		
		List<Emp> list = s.selectList("com.woniuxy.b_parameter.EmpMapper.findall");
		
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
		// ======================================================================
		// �ύ����
		// s.commit();
		// �رջỰ
		s.close();
		
	}
	
	
}
