package com.BillingSoftwareMVC.controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.BillingSoftwareMVC.module.DOAService;
import com.BillingSoftwareMVC.module.DOAServiceImpl;

@WebServlet("/verifyloginid")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("UserId");
		String Password=request.getParameter("password");
		
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		boolean result = service.varifylogin(userid, Password);
		if(result) {
			//DOAServiceImpl2
			service.connectDB();
			String[] val = service.identifyLogin( userid);
			String Desingnation = val[0];
			String name = val[1];
			String email = userid;
			
			if(Desingnation.equalsIgnoreCase("Admin")) {
//				System.out.println("Welcome "+Desingnation +" : "+ name);
				request.setAttribute("hello", "Welcome"+name);
				RequestDispatcher rd= request.getRequestDispatcher("AdminPage.jsp");
				rd.forward(request, response);
				
			}else if(Desingnation.equalsIgnoreCase("Employee")) {
//				System.out.println("Welcome "+Desingnation +" : "+ name);
				request.setAttribute("email", email);
				request.setAttribute("hello", "Welcome"+name);
				RequestDispatcher rd= request.getRequestDispatcher("EmployeePage.jsp");
				rd.forward(request, response);
			}else {
				System.out.println("Costomer");
			}
			//here i have to write further
	
		}else {
			request.setAttribute("Error", "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
			rd.forward(request, response);
		}
	}
}
