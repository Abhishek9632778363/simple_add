package Abhi;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/@WebServlet("add")
public class Addservlets extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		
			int i =Integer.parseInt(req.getParameter("num1"));
			int j =Integer.parseInt(req.getParameter("num2"));
			int k = i+j;
			   res.getWriter().println(k);
	}

}
