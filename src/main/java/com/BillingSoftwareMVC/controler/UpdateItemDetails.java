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

@WebServlet("/UpdateItemDetailscontroller")
public class UpdateItemDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateItemDetails() {
        super();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		String id1 = request.getParameter("id");
		String price = request.getParameter("price");
		String name = request.getParameter("name");
		System.out.println("ID : "+id1+" Name : "+name+" Price : "+price);
		int id = Integer.parseInt(id1);
//		input done
		
		
		
		
		
//		UpdateItem.jsp
		if(id1!=null) {
			boolean result = service.updateitemdetails(id,name,price);
			if(result) {
				request.setAttribute("msg", "Sucessfully Done");
				RequestDispatcher rd= request.getRequestDispatcher("UpdateItem.jsp");
				rd.forward(request, response);
			}
		}else {
			request.setAttribute("msg", "Plese Select id Field");
			RequestDispatcher rd= request.getRequestDispatcher("UpdateItem.jsp");
			rd.forward(request, response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("UpdateItem.jsp");
		rd.forward(request, response);
	}

}
