/*package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class UpdateBoardController{

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		// TODO Auto-generated method stub
		System.out.println("�� ���� ó��");
		//1. ����� �Է� ���� ����
		//
		//String title = request.getParameter("EUC-KR");
		//String title = request.getParameter("title");
		//String content = request.getParameter("content");
		//String seq = request.getParameter("seq");
		
		//2.DB ���� ó��
		//BoardVO vo = new BoardVO();
		//vo.setTitle(title);
		//vo.setContent(content);
		//vo.setSeq(Integer.parseInt(seq));
		
		
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
		//3.ȭ�� �׺���̼�
		return "getBoardList.do";
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("getBoardList.do");
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
	}

}
*/