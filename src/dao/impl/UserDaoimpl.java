package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import dao.UserDao;
import enitiy.User;

/**
 * ʵ�ֵ��ӿ��е�һ������
 * @author ϲ���������
 *
 */
public class UserDaoimpl implements UserDao {

	@Override
	public void save(User user) {
		// ����һ�������������û���Ϣ
		List<User> List = new ArrayList<User>();
		List.add(user);
		for (User user2 : List) {
			System.out.println(user2.getName()+","+user2.getAge());
			
		}
	}

}
