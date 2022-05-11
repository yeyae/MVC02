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
	
	// 외부에서 ActionFactory 객체를 사용하고 싶으면 getInstance() 메소드를 사용
	public static ActionFactory getInstance() {
		return instance;
	}
	
	// 이 액션팩토리 클래스가 할 일은
	// 파라미터로 받아온 command 값 ex) employee_list 
	// command 값에 따라 해당 command를 처리해줄 Action 객체를 생성해서 반환
	public Action getAction(String command) {
		// 우리가 리턴해줄 Action 객체
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
