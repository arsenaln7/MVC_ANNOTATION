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
		System.out.println("�α׾ƿ� ó��");

/*		// 1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
		HttpSession session = request.getSession();
		session.invalidate();
		// 2..���� ������, ���� ȭ������ �̵��Ѵ�.
		ModelAndView mav = new ModelAndView();
		// mav.setViewName("login.jsp");
		mav.setViewName("redirect:login.jsp");
		return mav;*/
		session.invalidate();
		return "login.jsp";
	}

}
