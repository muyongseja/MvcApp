package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookDto;

public class BookshopController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		
		String cmd = req.getParameter("cmd");
		String url = "";
		HttpSession session = req.getSession(); 
				
		ArrayList<BookDto> bookList = 
				(ArrayList)session.getAttribute("bookList");
		
		if(cmd.equals("CART")){
			url = "bookshop.jsp";
			
			if(bookList == null)
				bookList = new ArrayList<BookDto>();
			
			bookList.add(getBook(req));
			session.setAttribute("bookList", bookList);
		}
		else if(cmd.equals("CHKOUT")){
			url = "/WEB-INF/views/checkout.jsp";
		}
		else if(cmd.equals("DEL")){
			url = "bookshop.jsp";
			int idx = Integer.parseInt(req.getParameter("idx"));
			bookList.remove(idx);
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








