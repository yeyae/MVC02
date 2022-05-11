package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// Action 인터페이스는
	// Servlet이 처리할 요청을 나눠서 정의
	// 만약 Employees를 삽입하는 요청이 왔다.
	// 그요청을 EmployeesWriteAction 이라고 이름을 지어줌
	// EmployeesWriteAction은 요청을 받아서 DB에 사원 정보를 삽입해주는 역할을 함
	// 우리가 기존에 ContextPath / requestUri 로 경로를 잘라서 처리했던
	// else - if 분기 하나를 Action 하나로 처리하는 것처럼 동작
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException;
}
