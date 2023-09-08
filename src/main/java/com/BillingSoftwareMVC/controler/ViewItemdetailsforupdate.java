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

@WebServlet("/ViewItemdetailsForUpdate")
public class ViewItemdetailsforupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewItemdetailsforupdate() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		
		String id = request.getParameter("itemid");
		String name = service.getItemname(id);
		
		System.out.println("ID :"+id);
		System.out.println("name :"+name);
		
		request.setAttribute("name", name);
		request.setAttribute("id", id);
//		UpdateItem.jsp
		
		RequestDispatcher rd = request.getRequestDispatcher("UpdateItem.jsp");
		rd.forward(request, response);
	}

}
