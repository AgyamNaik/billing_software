package com.BillingSoftwareMVC.controler;

import java.io.IOException;

import com.BillingSoftwareMVC.module.DOAService;
import com.BillingSoftwareMVC.module.DOAServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ViewEmpdetailsforupdate1")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewEmployee() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		
		String str = request.getParameter("emailres");
		String name = service.getEmpname(str);
		
		
		request.setAttribute("name", name);
		request.setAttribute("email", str);
		RequestDispatcher rd = request.getRequestDispatcher("UpdateEmp.jsp");
		rd.forward(request, response);
		
	}

}
