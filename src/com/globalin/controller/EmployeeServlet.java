package com.globalin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.controller.action.Action;

// � ����� ��û�� ó���Ұ��� �����ֱ�
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	protected void doAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		// command �Ķ���� ��������
		String command = req.getParameter("command");
		
		// ��û�� ó������ action ��ü�� ���� �����ϱ�
		
		// 1. action ���丮 �����
		ActionFactory af = ActionFactory.getInstance();
		// 2. action ���丮�� getAction(command) �޼ҵ� ȣ���ؼ� 
		// 		command�� �´� action ��ü ����
		Action action = af.getAction(command);
		// 3. action ��ü�� excute() �޼ҵ� ����
		if(action != null) {
			action.execute(req, resp);
		}
		
	}

}
