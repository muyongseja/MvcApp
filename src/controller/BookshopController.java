package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DepartBean;

public class BookshopController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		String url = "";
		
		if(cmd.equals("CART")){
			url = "cart.jsp";
		}
		else if(cmd.equals("CHKOUT")){
			url = "checkout.jsp";
		}
		
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
}
