package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;
import com.globalin.model.Employees;

public class EmployeeUpdateFormAction implements Action {
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 파라미터에서 id 가져오기
		String id = req.getParameter("id");
		// dao 객체 가져오기
		EmployeesDao dao = EmployeesDao.getInstance();
		// dao 객체에서 우리가 수정할 사원의 정보 가져오기
		// db에서 id로 사원정보 가져오기
		Employees emp = dao.getMember(id);
		
		// request에 사원 정보 담기
		req.setAttribute("employee", emp);
		
		// employee/employeeUpdate.jsp 로 페이지 이동
		String url = "employee/employeeUpdate.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
}
