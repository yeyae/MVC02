package com.globalin.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;
import com.globalin.model.Employees;

// 이 액션 클래스는 command=employee_list 요청을 처리
public class EmployeeListAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 이 url은 요청후에 이동할 페이지 주소
		String url = "/employee/employeeList.jsp";
		
		// 여기서 처리할 일은 DB에서 사원 정보 모두 가져오고
		// request에 담아서 보낸다.
		EmployeesDao dao = EmployeesDao.getInstance();
		
		List<Employees> list = dao.selectAllEmployees();
		
		req.setAttribute("elist", list);
		// request 에 "elist" 라는 이름으로 list를 담아서 보낸다.
		// 나중에 request에서 꺼내 쓸때 "elist" 라는 이름으로 꺼내 쓰면 된다.
		
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
}
