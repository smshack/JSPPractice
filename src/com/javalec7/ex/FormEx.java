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
		System.out.println("doPost시작");
		//요청 값의 인코딩을 UTF-8로 처리한다
		request.setCharacterEncoding("UTF-8");
		
		
		System.out.println("클라이언트에서 받아온 parameter이름들");
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
		
		System.out.println("hobby의 값들을 출력");
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
		writer.println("이름 : " + named + "<br />");
		writer.println("아이디 : " + id + "<br />");
		writer.println("비밀번호 : " + pw + "<br />" );
		writer.println("취미 : " + Arrays.toString(hobbys) + "<br />");
		writer.println("전공 : " + major + "<br />");
		writer.println("프로토콜 : " + protocol);
		writer.println("</body></html>");
		
		System.out.println("doPost종료");
		System.out.println("========================================================");
		
	}

}
