package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import dao.UserDao;
import enitiy.User;

/**
 * 实现到接口中的一个操作
 * @author 喜欢你的名字
 *
 */
public class UserDaoimpl implements UserDao {

	@Override
	public void save(User user) {
		// 创建一个集合来保存用户信息
		List<User> List = new ArrayList<User>();
		List.add(user);
		for (User user2 : List) {
			System.out.println(user2.getName()+","+user2.getAge());
			
		}
	}

}
