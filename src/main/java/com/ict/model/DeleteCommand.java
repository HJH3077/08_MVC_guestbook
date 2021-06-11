package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// onelist에서 2개의 파라미터 값을 넘겨주므로 써야함!
		String idx = request.getParameter("idx");
		String pw = request.getParameter("pw");
		
		request.setAttribute("idx", idx);
		request.setAttribute("pw", pw);
		return "view/del.jsp";
	}
}
