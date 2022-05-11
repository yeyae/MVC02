package com.globalin.controller;

import com.globalin.controller.action.Action;
import com.globalin.controller.action.EmployeeDeleteAction;
import com.globalin.controller.action.EmployeeListAction;
import com.globalin.controller.action.EmployeeUpdateAction;
import com.globalin.controller.action.EmployeeViewAction;
import com.globalin.controller.action.EmployeeWriteAction;
import com.globalin.controller.action.EmployeeWriteFormAction;
import com.globalin.controller.action.EmployeeUpdateFormAction;

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
	}
	
	// �ܺο��� ActionFactory ��ü�� ����ϰ� ������ getInstance() �޼ҵ带 ���
	public static ActionFactory getInstance() {
		return instance;
	}
	
	// �� �׼����丮 Ŭ������ �� ����
	// �Ķ���ͷ� �޾ƿ� command �� ex) employee_list 
	// command ���� ���� �ش� command�� ó������ Action ��ü�� �����ؼ� ��ȯ
	public Action getAction(String command) {
		// �츮�� �������� Action ��ü
		Action action = null;
		System.out.println("Action : " + command);
		if (command.equals("employees_list")) {
			action = new EmployeeListAction();
		} else if (command.equals("employees_write_form")) {
			action = new EmployeeWriteFormAction();
		} else if (command.equals("employees_write")) {
			action = new EmployeeWriteAction();
		} else if (command.equals("employees_view")) {
			action = new EmployeeViewAction();
		} else if (command.equals("employees_delete")) {
			action = new EmployeeDeleteAction();
		} else if (command.equals("employees_update_form")) {
			action = new EmployeeUpdateFormAction();
		} else if (command.equals("employees_update")) {
			action = new EmployeeUpdateAction();
		}
		return action;
	}
	
	
}
