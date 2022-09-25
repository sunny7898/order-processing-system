package com.company.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.DAO.EmployeeDAO;
import com.company.model.Employee;

/**
 * Servlet for Employee Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Created");
	}

	
	public void destroy() {
		System.out.println("Servlet Destroyed");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Employee emp = new Employee();
			emp.setUserName(req.getParameter("userName"));
			emp.setPassword(req.getParameter("password"));
			
			emp = EmployeeDAO.login(emp);
			if (emp.isValid()) {
				 HttpSession session = req.getSession(true);
				 session.setAttribute("currentSessionUser", emp);
				 resp.sendRedirect("userLogged.jsp");
			} else {
				resp.sendRedirect("notLoggedIn.jsp");
			}
		} catch (Throwable th) {
			System.out.println(th);
		}
	}


	

	
	
}
