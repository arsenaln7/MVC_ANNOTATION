package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController  {

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		// TODO Auto-generated method stub
		System.out.println("로그아웃 처리");

/*		// 1. 브라우저와 연결된 세션 객체를 강제 종료한다.
		HttpSession session = request.getSession();
		session.invalidate();
		// 2..세선 종료후, 메인 화면으로 이동한다.
		ModelAndView mav = new ModelAndView();
		// mav.setViewName("login.jsp");
		mav.setViewName("redirect:login.jsp");
		return mav;*/
		session.invalidate();
		return "login.jsp";
	}

}
