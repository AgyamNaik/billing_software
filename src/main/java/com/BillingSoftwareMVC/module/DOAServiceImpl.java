package com.BillingSoftwareMVC.module;

import java.sql.*;

public class DOAServiceImpl implements DOAService{
	private Connection con;
	private Statement stmt;
	private ResultSet res;
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project1billingsoftware","root", "test");
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean varifylogin(String username, String password) {
		try {
			res = stmt.executeQuery("select email,password from Register where email='"+username+"' and password='"+password+"'");
			return res.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String[] identifyLogin(String username) {
		String[] val=new String[2];
		val[0]="null";
		val[1]="null";
		try {
			res = stmt.executeQuery("select module,name from Register where email='"+username+"'");
			while(res.next()) {
				val[0]=res.getString(1);
				val[1]=res.getString(2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}

	@Override
	public boolean resisterEmployee(String empname, String empemail, String emppassword, String empMnumber,
			String empgen){
		boolean ret=false;
		try {
			stmt.executeUpdate("insert into Register values('"+empname+"','"+empemail+"','"+emppassword+"','"+empgen+"','"+empMnumber+"','Employee')");
			ret=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return ret;
	}

	@Override
	public void updateEmployee(String empemail) {
		try {
			res = stmt.executeQuery("select name,email from Register where module='Employee'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void showEmp() {
		
		
	}


	@Override
	public String getEmpname(String useremail) {
		String str=null;
		try {
			res = stmt.executeQuery("select name from Register where email='"+useremail+"'");
			while(res.next()) {
				str= res.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("STRING STR IN GETEMPNAME : "+str);
		return str;
	}

	@Override
	public boolean UpdateEmpDetails(String name, String number, String password, String gender, String email) {
		try {
				if(name.length()>=5) {
					stmt.executeUpdate("UPDATE Register SET name = '"+name+"' where email='"+email+"'");
					System.out.println("Name Updated ");
				}
				if(number.length()==10) {
					stmt.executeUpdate("UPDATE Register SET phone = '"+number+"' where email='"+email+"'");
					System.out.println("number Updated ");
				}
				if(password.length()>8) {
					stmt.executeUpdate("UPDATE Register SET password = '"+password+"' where email='"+email+"'");
					System.out.println("password Updated ");
				}
				if(gender!=null) {
					stmt.executeUpdate("UPDATE Register SET gender = '"+gender+"' where email='"+email+"'");
					System.out.println("gender Updated ");
				}
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean varifyAdminPassword(String password_old) {
		try {
			
			if(password_old!=null) {
				ResultSet res = stmt.executeQuery("select password from Register where module='Admin'");
				while(res.next()) {
					if(password_old.equals(res.getString(1))) {
						return true;
					}
				}
			}
			return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean changeAdminPassword(String password_New) {
	try {
			if(password_New!=null) {
				stmt.executeUpdate("UPDATE Register SET password = '"+password_New+"' where module='Admin'");
				return true;
				}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean addNewItem(String id, String name, int price) {
		boolean ret=false;
		try {
			stmt.executeUpdate("insert into Register_item values('"+name+"','"+id+"','"+price+"')");
			ret=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public String getItemname(String id) {
		String str=null;
		try {
			res = stmt.executeQuery("select name from Register_item where id='"+id+"'");
			while(res.next()) {
				str= res.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public int getItemprice(String id) {
		int price1=0;
		try {
			res = stmt.executeQuery("select price from Register_item where id='"+id+"'");
			while(res.next()) {
				price1=Integer.parseInt(res.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return price1;
	}

	@Override
	public boolean updateitemdetails(int id, String name, String price) {
		try {
			if(name!=null) {
				stmt.executeUpdate("UPDATE Register_item SET name = '"+name+"' where id="+id+"");
				System.out.println("Name Updated ");
			}
			if(price!=null) {
				stmt.executeUpdate("UPDATE Register_item SET price = '"+price+"' where id="+id+"");
				System.out.println("price Updated ");
			}
			
			return true;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}
}