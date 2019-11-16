package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Mariya Kin
 * 
 * @impNote Action Servlet implementation class to perform user registration
 * Date-14-11-2019
 * @category Controller class
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @implSpec-->action method to register customer with database
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//encapsulation part
		RegisterBO regbo=new RegisterBO();
		regbo.setName(name);
		regbo.setEmail(email);
		regbo.setUsername(username);
		regbo.setPassword(password);
		ConnectionManager con=new ConnectionManager();
		try
		{
			RegisterDAO.save(con.getConnection(),regbo);
			response.sendRedirect("C:\\Application\\WebContent\\login.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
