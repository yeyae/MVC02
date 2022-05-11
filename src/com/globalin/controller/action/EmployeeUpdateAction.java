package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;
import com.globalin.model.Employees;

public class EmployeeUpdateAction implements Action{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Employee 객체 생성
		// 생성한 Employee 객체의 id, pass, name, lev.. 속성을 
		// 파라미터로 받아온 값으로 변경
		Employees emp = new Employees();
		emp.setId(req.getParameter("id"));
		emp.setPass(req.getParameter("pass"));
		emp.setName(req.getParameter("name"));
		emp.setLev(req.getParameter("lev"));
		emp.setGender(Integer.parseInt(req.getParameter("gender")));
		emp.setPhone(req.getParameter("phone"));
		
		// dao 객체 생성
		EmployeesDao dao = EmployeesDao.getInstance();
		
		// dao를 통해서 update 문을 실행
		dao.updateMember(emp);
		
		// 리스트 화면으로 돌아가기
		new EmployeeListAction().execute(req, resp);
		
		// String url = "리스트화면요청url"
	}
}
