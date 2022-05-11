package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;
import com.globalin.model.Employees;

public class EmployeeViewAction implements Action {
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 파라미터에서 id 를 가져온다.
		String id = req.getParameter("id");
		
		// id로 employee 객체 db에서 찾은후에 가져와서 생성
		Employees emp = EmployeesDao.getInstance().getMember(id);
		
		/*EmployeesDao dao = EmployeesDao.getInstance();
		Employees emp2 = dao.getMember(id);*/
		
		// request에 담아서 새로운 페이지인 employeeView.jsp로 보낸다.
		
		// url 이 우리가 보낼 페이지
		String url = "/employee/employeeView.jsp";
		
		// request에 보여줄 사원 정보가 담긴 emp 객체 담기
		req.setAttribute("employee", emp);
		
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
}
