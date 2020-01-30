package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		// TODO Auto-generated method stub
		//System.out.println("�� ���� ó��");

		//1. ����� �Է� ���� ����
		//String seq = request.getParameter("seq");
		
		//2. DB ����ó��
		//BoardVO vo = new BoardVO();
		//vo.setSeq(Integer.parseInt(seq));
		
		//BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		//3. ȭ�� �׺���̼�
		/*return "getBoardList.do";*/
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("getBoardList.do");
//		mav.setViewName("redirect:getBoardList.do");
		return "getBoardList.do";
		
	}

}