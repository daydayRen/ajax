package cn.oneday.ajaxdemo;
/**
 * @author oneday
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String encoding = "UTF-8";// ×Ö·û±àÂë
		request.setCharacterEncoding(encoding);// ÇëÇó±àÂë
		response.setContentType("text/html;charset=" + encoding);// ÏìÓ¦±àÂë

		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		System.out.println(userName+"hhh");
		String responseText = "UserName" + userName;
		out.println(responseText);
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}