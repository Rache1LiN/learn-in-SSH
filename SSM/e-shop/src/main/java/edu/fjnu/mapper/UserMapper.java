/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.User;

/**
 * @author ASUS
 *
 */

public interface UserMapper {

	public int insertUser(User user) throws Exception;
	public int updateUser(User user) throws Exception;
	public int deleteUser(String userName) throws Exception;
	public User selectUserByName(String userName) throws Exception;
	public List<User> selectAllUser() throws Exception;
}
