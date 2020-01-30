package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController  {

	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		// TODO Auto-generated method stub
		System.out.println("로그인 처리");
		// 1. 사용자 정보 추출
		//String id = request.getParameter("id");
		//String password = request.getParameter("password");

		// 2. DB 연동처리
		//UserVO vo = new UserVO();
		//vo.setId(id);
		//vo.setPassword(password);

		//UserDAO userDAO = new UserDAO();
		//UserVO user = userDAO.getUser(vo);

		// 3. 화면 네비게이션
		/*if (user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}*/
	//	ModelAndView mav = new ModelAndView();
	//	if(user != null){
	//		mav.setViewName("getBoardList.do");
	//		mav.setViewName("redirect:getBoardList.do");
	//	} else {
	//		mav.setViewName("login.jsp");
	//		mav.setViewName("redirect:login.jsp");
	//	}
	//	return mav;
		if(userDAO.getUser(vo)!=null) return "getBoardList.do";
		else return "login.jsp";
	}

}
