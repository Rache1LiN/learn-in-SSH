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

	public int insertMember(Member member);
	public int updateMember(Member member);
	public int deleteMember(Long memberId);
	public Member selectMemberById(Long memberId);
	public Member selectMemberByName(String memberName);
	public List<Member> selectAllMember();
}
