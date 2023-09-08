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

@WebServlet("/UpdateEmpDetailslist")
public class UpdateEmp12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEmp12() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		service.showEmp();
		String name = request.getParameter("Empname");
		String number = request.getParameter("EmpMnumber");
		String password = request.getParameter("Emppassword");
		String gender = request.getParameter("Empgen");
		String email =  request.getParameter("Empemail");
		System.out.println("inputs ars : "+name+" "+number+" "+password+" "+gender+" "+email);
		if(email!=null) {
			boolean update = service.UpdateEmpDetails(name,number,password,gender,email);
			System.out.println(update);
			if(update) {
				request.setAttribute("Updateempdetails", "Sucessfully Done");
				RequestDispatcher rd= request.getRequestDispatcher("UpdateEmp.jsp");
				rd.forward(request, response);
			}
		}else {
			request.setAttribute("Updateempdetails", "Plese Select email Field");
			RequestDispatcher rd= request.getRequestDispatcher("UpdateEmp.jsp");
			rd.forward(request, response);
		}
	}

}
