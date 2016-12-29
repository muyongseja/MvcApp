package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CompleteCommand;
import model.ConfirmCommand;
import model.ICommand;
import model.MainCommand;
import model.RegisterCommand;

public class MemberController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		String cmd = req.getParameter("cmd");
		String url = "";
		
		if(cmd.equals("REGISTER")){
			url = "member/register.html";
		}
		else if(cmd.equals("CONFIRM")){
			// 입력값 확인
			// 입력값이 잘못 되었을 경우 에러 페이지로 이동
			url = "member/register_confirm.jsp";
		}
		else if(cmd.equals("COMPLETE")){
			// DB연동
			url = "member/register_complete.jsp";
		}
		else if(cmd.equals("MAIN")){
			url = "index.html";
		}
		else{
			// 잘못된 요청에 대한 처리
		}
		*/
		
		String cmd = req.getParameter("cmd");
		ICommand iCmd = null;		
		
		if(cmd.equals("REGISTER")){
			iCmd = new RegisterCommand();
		}
		else if(cmd.equals("CONFIRM")){
			iCmd = new ConfirmCommand();
		}
		else if(cmd.equals("COMPLETE")){
			iCmd = new CompleteCommand();
		}
		else if(cmd.equals("MAIN")){
			iCmd = new MainCommand();
		}
		else{
			// 잘못된 요청에 대한 처리
		}
		
		String url = (String)iCmd.processCommand(req, resp);
		RequestDispatcher view = req.getRequestDispatcher(url);
		view.forward(req, resp);
	}	
}










