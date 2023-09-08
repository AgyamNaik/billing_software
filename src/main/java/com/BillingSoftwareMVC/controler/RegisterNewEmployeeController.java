package com.BillingSoftwareMVC.controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

import com.BillingSoftwareMVC.module.DOAService;
import com.BillingSoftwareMVC.module.DOAServiceImpl;
@WebServlet("/RegisterNewEmployeeCreate")
public class RegisterNewEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterNewEmployeeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Empname=request.getParameter("Empname");
		String Empemail=null;;
		if(request.getParameter("Empemail").endsWith("@gmail.com")){
			Empemail=request.getParameter("Empemail");
		}
		
		String Emppassword=request.getParameter("Emppassword");
		String EmpMnumber=request.getParameter("EmpMnumber");
		String Empgen=request.getParameter("Empgen");
		if(Empname!=null && Empemail!=null && Emppassword!=null && EmpMnumber!=null && Empgen!=null) {
			DOAService service = new DOAServiceImpl();
			service.connectDB();
			boolean result = service.resisterEmployee(Empname, Empemail,Emppassword,EmpMnumber,Empgen);
			
			if(result) {			
					request.setAttribute("Update", "Resistration Sucessfully done for :"+Empname);
					RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/ViewAdmin/AdminPage.jsp");
					rd.forward(request, response);
					
				}else {
					request.setAttribute("Update", "Resistration Incomplete Email/mobileNumber is alread exixt");
					RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
					rd.forward(request, response);
				}
		}else {
			request.setAttribute("Update", "Resistration Incomplete Please fill all or Enter a Valid your email");
			RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
			rd.forward(request, response);
		}
	}

}
