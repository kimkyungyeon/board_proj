package board_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_proj.dto.ActionForward;

public class BoardDeleteFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int page = Integer.parseInt(request.getParameter("page"));
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		
		request.setAttribute("page", page);
		request.setAttribute("board_num", board_num);
		
		ActionForward forward = new ActionForward();
		forward.setPath("/board/qna_board_delete.jsp");
		
		return forward;
	}

}
