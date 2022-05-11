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
		
		// �Ķ���Ϳ��� id �� �����´�.
		String id = req.getParameter("id");
		
		// id�� employee ��ü db���� ã���Ŀ� �����ͼ� ����
		Employees emp = EmployeesDao.getInstance().getMember(id);
		
		/*EmployeesDao dao = EmployeesDao.getInstance();
		Employees emp2 = dao.getMember(id);*/
		
		// request�� ��Ƽ� ���ο� �������� employeeView.jsp�� ������.
		
		// url �� �츮�� ���� ������
		String url = "/employee/employeeView.jsp";
		
		// request�� ������ ��� ������ ��� emp ��ü ���
		req.setAttribute("employee", emp);
		
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
}
