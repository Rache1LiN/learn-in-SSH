/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.User;

/**
 * @author ASUS
 *
 */
public interface UserService {

	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(String userName);
	public User selectUserByName(String userName);
	public List<User> selectAllUser();
}
