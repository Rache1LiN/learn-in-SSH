/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.Member;

/**
 * @author ASUS
 *
 */
public interface MemberService {

	boolean login(Member member);
	void create(Member member);
	List<Member> loadAllUsers();
	Member findUserById(Long userId);
	void update(Member member);
	Long findIdByName(String userName);
	void delete(Long userId);
}
