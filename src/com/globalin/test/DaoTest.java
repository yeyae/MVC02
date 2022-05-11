package com.globalin.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import com.globalin.dao.EmployeesDao;
import com.globalin.model.Employees;

public class DaoTest {
	
	private static EmployeesDao dao = EmployeesDao.getInstance();
	
	@Test
	public void testSelect() {
		Employees e = dao.getMember("admin");
		System.out.println(e);
		// "관리자" : 기대값
		// e.getName : 실제값
		// aseertEquals메소드 : 테스트 실행 결과 두 값이 같을 것이다. 라고 예상
		// 두 값이 다르면 테스트 실패
		// 두 값이 같으면 테스트 성공!
		assertEquals("관리자", e.getName());
		
		List<Employees> list = dao.selectAllEmployees();
		System.out.println(list);
		// 1 : 기대값
		// list.size() : 실제 값
		//assertEquals(1, list.size());
		
		int result = dao.deleteMember("minseok");
		
		Employees e1 = dao.getMember("minseok");
		
		// e1 객체가 null 일것이다. 라고 예상
		assertNull(e1);
		
	}
	
}
