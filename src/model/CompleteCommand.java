package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompleteCommand implements ICommand {

	@Override
	public Object processCommand(HttpServletRequest req, HttpServletResponse resp) {
		// DB¿¬µ¿
		return "member/register_complete.jsp";
	}
}
