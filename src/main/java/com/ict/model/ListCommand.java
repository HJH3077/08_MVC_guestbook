package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.VO;

public class ListCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		List<VO> list = DAO.getInstance().getSelectAll();

		// jstl 사용하기 위해 쓰는 것
		request.setAttribute("list", list);
		
		
		return "view/list.jsp"; // 무조건 list로 가니까 String 따로안만들고 이렇게 처리
	}
}
