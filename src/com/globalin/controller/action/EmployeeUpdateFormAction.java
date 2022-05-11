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
		
		// �Ķ���Ϳ��� id ��������
		String id = req.getParameter("id");
		// dao ��ü ��������
		EmployeesDao dao = EmployeesDao.getInstance();
		// dao ��ü���� �츮�� ������ ����� ���� ��������
		// db���� id�� ������� ��������
		Employees emp = dao.getMember(id);
		
		// request�� ��� ���� ���
		req.setAttribute("employee", emp);
		
		// employee/employeeUpdate.jsp �� ������ �̵�
		String url = "employee/employeeUpdate.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
}
