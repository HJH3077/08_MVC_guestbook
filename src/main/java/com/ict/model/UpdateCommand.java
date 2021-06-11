package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.VO;

public class UpdateCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// onelist에서 파라미터 값을 넘겨주므로 써야함!
		String idx = request.getParameter("idx");

		VO vo = DAO.getInstance().selectOne(idx);
		request.setAttribute("vo", vo);

		return "view/update.jsp";
	}
}
