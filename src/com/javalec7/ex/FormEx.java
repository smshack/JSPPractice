package com.javalec7.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("========================================================");
		System.out.println("doPost����");
		//��û ���� ���ڵ��� UTF-8�� ó���Ѵ�
		request.setCharacterEncoding("UTF-8");
		
		
		System.out.println("Ŭ���̾�Ʈ���� �޾ƿ� parameter�̸���");
		Enumeration name=request.getParameterNames();
		while(name.hasMoreElements()) {
			String names =(String)name.nextElement();
			System.out.println(names);
		}
		
		String named = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		System.out.println("hobby�� ������ ���");
		for (int i = 0; i < request.getParameterValues("hobby").length; i++) {
			System.out.println(request.getParameterValues("hobby")[i]);
		}
		
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("hobby: "+Arrays.toString(hobbys));
		System.out.println("major: "+major);
		System.out.println("protocol: "+protocol);
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�̸� : " + named + "<br />");
		writer.println("���̵� : " + id + "<br />");
		writer.println("��й�ȣ : " + pw + "<br />" );
		writer.println("��� : " + Arrays.toString(hobbys) + "<br />");
		writer.println("���� : " + major + "<br />");
		writer.println("�������� : " + protocol);
		writer.println("</body></html>");
		
		System.out.println("doPost����");
		System.out.println("========================================================");
		
	}

}
