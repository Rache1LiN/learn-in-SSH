/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.Member;

/**
 * @author ASUS
 *
 */

public interface MemberMapper {

	public int insertMember(Member member) throws Exception;
	public int updateMember(Member member) throws Exception;
	public int deleteMember(Long memberId) throws Exception;
	public Member selectMemberById(Long memberId) throws Exception;
	public Member selectMemberByName(String memberName) throws Exception;
	public List<Member> selectAllMember() throws Exception;
}
