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
		// Employee ��ü ����
		// ������ Employee ��ü�� id, pass, name, lev.. �Ӽ��� 
		// �Ķ���ͷ� �޾ƿ� ������ ����
		Employees emp = new Employees();
		emp.setId(req.getParameter("id"));
		emp.setPass(req.getParameter("pass"));
		emp.setName(req.getParameter("name"));
		emp.setLev(req.getParameter("lev"));
		emp.setGender(Integer.parseInt(req.getParameter("gender")));
		emp.setPhone(req.getParameter("phone"));
		
		// dao ��ü ����
		EmployeesDao dao = EmployeesDao.getInstance();
		
		// dao�� ���ؼ� update ���� ����
		dao.updateMember(emp);
		
		// ����Ʈ ȭ������ ���ư���
		new EmployeeListAction().execute(req, resp);
		
		// String url = "����Ʈȭ���ûurl"
	}
}
