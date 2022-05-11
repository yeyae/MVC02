package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;

public class EmployeeDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// �Ķ���Ϳ��� id ��������
		String id = req.getParameter("id");
		// dao ��ü ��������
		EmployeesDao dao = EmployeesDao.getInstance();
		// dao�� ���� ��� ������ (DB���� �ش� ID�� ��� ���� ����)
		dao.deleteMember(id);
		// ��� ����Ʈ �������� �̵�
		new EmployeeListAction().execute(req, resp);
		// EmployeeListAction Ŭ������ execute �޼ҵ带 �����ϸ�
		// db���� ��� ���� ����Ʈ �� ��������
		// ��� ����Ʈ �������� �̵��� ������
	}
}
