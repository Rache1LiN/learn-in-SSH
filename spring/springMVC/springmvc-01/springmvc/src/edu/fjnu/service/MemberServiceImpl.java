/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Member;
import edu.fjnu.dao.MemberDao;

/**
 * @author ASUS
 *
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	
	private MemberDao memberDao;
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void create(Member member) {
		memberDao.addUser(member);
		
	}

	@Override
	public List<Member> loadAllUsers() {
		return memberDao.loadAllUsers();
	}

	@Override
	public Member findUserById(Long userId) {
		return memberDao.findUserById(userId);
	}

	@Override
	public boolean login(Member member) {
		List<Member> memberList=this.loadAllUsers();
		for(Member m:memberList){
			if(m.getUserName().equals(member.getUserName())&& m.getUserPass().equals(member.getUserPass()))
				return true;
		}
		return false;
	}

	@Override
	public void update(Member member) {
		memberDao.updateUser(member);
		
	}

	@Override
	public Long findIdByName(String userName) {
		return memberDao.findIdByName(userName);
	}

	@Override
	public void delete(Long userId) {
		memberDao.delete(userId);
		
	}

}
