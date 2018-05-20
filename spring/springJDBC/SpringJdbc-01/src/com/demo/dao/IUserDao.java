/**
 * 
 */
package com.demo.dao;

import java.util.List;

import com.demo.bean.User;

/**
 * @author ASUS
 *
 */
public interface IUserDao {

	long getCountUser();
	void addUser(User u);
	User getUserById(int ID);
	List<User> loadUsers();
}
