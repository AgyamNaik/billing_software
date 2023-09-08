package com.BillingSoftwareMVC.module;

public interface DOAService {
	public void connectDB();
	public boolean varifylogin(String username,String password);
	public String[] identifyLogin(String username);
	public boolean resisterEmployee(String empname, String empemail, String emppassword, String empMnumber,
			String empgen);
	public void updateEmployee(String empemail);
	public void showEmp();
	public String getEmpname(String str);
	public boolean UpdateEmpDetails(String name, String number, String password, String gender, String email);
	public boolean varifyAdminPassword(String password_old);
	public boolean changeAdminPassword(String password_old);
	public boolean addNewItem(String id, String name, int price);
	public String getItemname(String id);
	public int getItemprice(String price);
	public boolean updateitemdetails(int id, String name, String price);
	
}
