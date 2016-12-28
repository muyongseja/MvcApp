package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DepartBean;

public class DepartController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getParameter("depart");
		
		DepartBean bean = new DepartBean();
		ArrayList advice = bean.getAdvice(cmd);
		
		req.setAttribute("advice", advice);
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/WEB-INF/views/departResult.jsp");
		dispatcher.forward(req, resp);
	}
}








