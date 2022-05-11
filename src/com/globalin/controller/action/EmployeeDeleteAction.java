package com.globalin.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalin.dao.EmployeesDao;

public class EmployeeDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라미터에서 id 가져오기
		String id = req.getParameter("id");
		// dao 객체 가져오기
		EmployeesDao dao = EmployeesDao.getInstance();
		// dao로 삭제 명령 보내기 (DB에서 해당 ID의 사원 정보 삭제)
		dao.deleteMember(id);
		// 사원 리스트 페이지로 이동
		new EmployeeListAction().execute(req, resp);
		// EmployeeListAction 클래스의 execute 메소드를 실행하면
		// db에서 사원 정보 리스트 다 가져오고
		// 사원 리스트 페이지로 이동도 시켜줌
	}
}
