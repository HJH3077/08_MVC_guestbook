package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.VO;

public class OnelistCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		VO vo = DAO.getInstance().selectOne(idx);					 
		request.setAttribute("vo", vo); // 로그인은 session에 저장
		return "view/onelist.jsp";
	}
}
