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
 * @author 喜欢你的名字
 *
 */
//设置访问的url信息
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
		//设置一个请求数据的编码
		req.setCharacterEncoding("UTF-8");
		UserDaoImpl us = new UserDaoImpl();
		User user = new User();
		//获得页面上的数据
		String name = req.getParameter("张三");
		//页面上获得的所有数据都是String类型，而年龄是int类型
		//（包装类）对数据进行强转
		int age = Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//调用实体类中的set方发为私有的属性赋值
		user.setAge(age);
		us.save(user);
	}
	
}
