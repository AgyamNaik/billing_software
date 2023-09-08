package com.BillingSoftwareMVC.controler;
import java.io.IOException;
import com.BillingSoftwareMVC.module.DOAService;
import com.BillingSoftwareMVC.module.DOAServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Addnewitem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Addnewitem() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("Item_Id");
		String name =request.getParameter("Item_Name");
		int price =Integer.parseInt(request.getParameter("Item_price")) ;
		
		DOAService service = new DOAServiceImpl();
		service.connectDB();
		boolean result = service.addNewItem(id,name,price);
		if(result) {
			//item Added Successfully
			//AddItem.jsp
		}else {
			//item fail to add
			//AddItem.jsp
		}
		
	}

}
