package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        System.out.println("^^^^^^^^^^^^^^^^^^^");
        System.out.println("HelloServlet().....");
        System.out.println("===================");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("^^^^^^^^^^^^");
        System.out.println("doGet().....");
        System.out.println("============");
        
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!Doctype html>");
        out.println("<html>");
        
        out.println("<head>");
        out.println("<title>HelloServlet</title>");
        out.println("</head>");
        
        out.println("<body>");
        out.println("Method = " + request.getMethod() +"<br>");
        out.println("Remote addr = " + request.getRemoteAddr());
        for (int i=1; i<=10; i++) {
        out.println("<h1>HelloServlet 실행 확인됨 # = "+i+" </h1>");
        }
        out.println("</body>");
        
        out.println("</html>");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("^^^^^^^^^^^^^");
        System.out.println("doPost().....");
        System.out.println("=============");
		doGet(request, response);
	}

}
