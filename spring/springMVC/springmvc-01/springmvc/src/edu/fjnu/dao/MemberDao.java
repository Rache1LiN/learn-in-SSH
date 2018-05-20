/**
 * 
 */
package edu.fjnu.dao;

import java.util.List;

import edu.fjnu.bean.Member;

/**
 * @author ASUS
 *
 */
public interface MemberDao {

	void addUser(Member member);
	List<Member> loadAllUsers();
	Member findUserById(Long userId);
	void updateUser(Member member);
	Long findIdByName(String userName);
	void delete(Long userId);
}
