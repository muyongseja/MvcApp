package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookDto;

public class BookshopController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		String url = "";
		
		ArrayList bookList;
		
		if(cmd.equals("CART")){
			url = "/WEB-INF/views/cart.jsp";
			
			BookDto dto = getBook(req);
		}
		else if(cmd.equals("CHKOUT")){
			url = "/WEB-INF/views/checkout.jsp";
		}
			
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
	
	private BookDto getBook(HttpServletRequest req){
		String book = req.getParameter("book");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		
		StringTokenizer token = new StringTokenizer(book, "/");
		String title = token.nextToken().trim();
		String author = token.nextToken().trim();
		int price = Integer.parseInt(token.nextToken().trim());
		
		BookDto dto = new BookDto();
		dto.setAuthor(author);
		dto.setPrice(price);
		dto.setQuantity(quantity);
		dto.setTitle(title);
		return dto;
	}
}








