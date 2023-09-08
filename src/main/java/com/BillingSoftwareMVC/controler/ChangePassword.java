package com.BillingSoftwareMVC.controler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.BillingSoftwareMVC.module.DOAService;
import com.BillingSoftwareMVC.module.DOAServiceImpl;


public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ChangePassword() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password_old=request.getParameter("password0");
		String password_New=request.getParameter("password1");
		String password_Cnf=request.getParameter("password2");
		boolean change =false;
		if(password_Cnf.equals(password_New)) {
			DOAService service = new DOAServiceImpl();
			service.connectDB();
			boolean varify = service.varifyAdminPassword(password_old);
			if(varify) {
				change = service.changeAdminPassword(password_New);
			}
		}
		if(change) {
			//Successfully Done
		}else {
			//Password change in not completed
		}
	}

}
