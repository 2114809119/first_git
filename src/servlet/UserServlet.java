package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enitiy.User;
import impl.UserDaoImpl;

/**
 * @author ϲ���������
 *
 */
//���÷��ʵ�url��Ϣ
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����һ���������ݵı���
		req.setCharacterEncoding("UTF-8");
		UserDaoImpl us = new UserDaoImpl();
		User user = new User();
		//���ҳ���ϵ�����
		String name = req.getParameter("����");
		//ҳ���ϻ�õ��������ݶ���String���ͣ���������int����
		//����װ�ࣩ�����ݽ���ǿת
		int age = Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//����ʵ�����е�set����Ϊ˽�е����Ը�ֵ
		user.setAge(age);
		us.save(user);
	}
	
}
