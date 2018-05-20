/**
 * 
 */
package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.dao.UserDaoImpl;

/**
 * @author ASUS
 *
 */
@Service
public class UserService {

	@Autowired
	public UserDaoImpl userDao;
	
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	public long getCountUser(){
		return userDao.getCountUser();
	}
	public void addUser(User u){
		userDao.addUser(u);
	}
	public User getUserById(int ID){
		return userDao.getUserById(ID);
	}
	public List<User> loadUsers(){
		return userDao.loadUsers();
	}
	
}
