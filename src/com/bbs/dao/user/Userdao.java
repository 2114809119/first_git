package com.bbs.dao.user;

import java.text.ParseException;
import java.util.List;

import com.bbs.entity.User;

public interface Userdao {
	/**
	 * //��֤��¼�ķ���
	 * @param userId��¼�û���
	 * @param userPsw��¼����
	 * @return�û�����������ͬ�ĸ���
	 */
	
	int Verification(String userId,String userPsw);

	int save(User user);

	List<User> getUserList() throws ParseException;

	User findEdit(String userId);

	int delAll(String[] uids);

	int delById(String userId);

	List<User> findById(String userId);

	int update(User user);
	
	
}
