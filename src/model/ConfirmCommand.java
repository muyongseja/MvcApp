package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmCommand implements ICommand {
	@Override
	public Object processCommand(HttpServletRequest req, HttpServletResponse resp) {
		// 입력값 확인
		// 입력값이 잘못 되었을 경우 에러 페이지로 이동
		return "member/register_confirm.jsp";
	}
}
