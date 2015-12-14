package com.webwork.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webwork.DbWriter;
import com.webwork.dataobjects.*;
/**
 * Servlet implementation class SaveShipperServlet
 */
@WebServlet("/saveShipper")
public class SaveShipperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveShipperServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Shipper s = new Shipper();
		s.setName(request.getParameter("companyName"));
		s.setPhone(request.getParameter("phone"));
		s.setId(Integer.parseInt(request.getParameter("id")));
		
		DbWriter.saveShipper(s);
		
		response.sendRedirect("ShowShippers.jsp");
	}

}
