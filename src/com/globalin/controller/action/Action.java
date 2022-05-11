package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// Action �������̽���
	// Servlet�� ó���� ��û�� ������ ����
	// ���� Employees�� �����ϴ� ��û�� �Դ�.
	// �׿�û�� EmployeesWriteAction �̶�� �̸��� ������
	// EmployeesWriteAction�� ��û�� �޾Ƽ� DB�� ��� ������ �������ִ� ������ ��
	// �츮�� ������ ContextPath / requestUri �� ��θ� �߶� ó���ߴ�
	// else - if �б� �ϳ��� Action �ϳ��� ó���ϴ� ��ó�� ����
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException;
}
