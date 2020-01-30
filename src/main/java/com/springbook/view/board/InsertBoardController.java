package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		// TODO Auto-generated method stub
		System.out.println("글 등록 처리");
		/*String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");*/
		
		//2.DB 연동 처리
		/*BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);*/
		
		//BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
		/*//3. 화면 네비게이션
		return "getBoardList.do";*/
		
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("getBoardList.do");
//	    mav.setViewName("redirect:getBoardList.do");
//		return mav;
	}

}
