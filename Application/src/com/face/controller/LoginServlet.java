package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Mariya Kin
 * 
 * @impNote Action Servlet implementation class to perform user login
 * Date-14-11-2019
 * @category Controller class
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

    /**
     * @implSpec-->action method to login customer with database
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Welcome to servlet");
        ConnectionManager con=new ConnectionManager();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		LoginBO logbo=new LoginBO();
		logbo.setUsername(username);
		logbo.setPassword(password);
		logbo.setName(name);
		try
		{
		boolean status=	LoginDAO.save(con.getConnection(),logbo);
				
			if(status==true)
			{
				List<String>agentlist=new ArrayList<String>();
				agentlist.add(logbo.getName());
				agentlist.add(logbo.getEmail());
				agentlist.add(logbo.getUsername());
				agentlist.add(logbo.getPassword());			
				request.setAttribute("data", agentlist);
				RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
				if(dispatcher!=null)
				{
					dispatcher.forward(request, response);
					
				}
				//response.sendRedirect("http://localhost:8095/Application/home.jsp");
				
			}
			else
			{
				response.sendRedirect("C:\\Application\\WebContent\\register.jsp");
					}
							
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
