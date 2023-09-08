package com.BillingSoftwareMVC.controler;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("/changeEmployeeselfPassword")
public class changeEmployeeselfPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public changeEmployeeselfPassword() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		System.out.println(password2+" "+Password1);
		String email = request.getParameter("Empemail");
		System.out.println("PAssword change with the email : "+email);
	
	}

}
