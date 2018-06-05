/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Member;
import edu.fjnu.bean.Member;
import edu.fjnu.mapper.MemberMapper;
import edu.fjnu.mapper.MemberMapper;
import edu.fjnu.mapper.MemberMapper;
import edu.fjnu.mapper.MemberMapper;
import edu.fjnu.service.MemberService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	
	@Override
	public int insertMember(Member member) {
		SqlSession session = DBUtil.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        try {
            int index=mapper.insertMember(member);
            session.commit(); 
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int updateMember(Member member) {
		SqlSession session = DBUtil.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        try {
            int index=mapper.updateMember(member);
            session.commit(); 
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int deleteMember(Long memberId) {
		SqlSession session=DBUtil.getSession();
        MemberMapper mapper=session.getMapper(MemberMapper.class);
        try {
            int index=mapper.deleteMember(memberId); 
            session.commit(); 
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback(); 
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public Member selectMemberById(Long memberId) {
		SqlSession session=DBUtil.getSession();
        MemberMapper mapper=session.getMapper(MemberMapper.class);
        try {
        Member member= mapper.selectMemberById(memberId);
        session.commit();
        	return member;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public Member selectMemberByName(String memberName) {
		SqlSession session=DBUtil.getSession();
        MemberMapper mapper=session.getMapper(MemberMapper.class);
        try {
        Member member= mapper.selectMemberByName(memberName);
        session.commit();
        	return member;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<Member> selectAllMember() {
		SqlSession session=DBUtil.getSession();
        MemberMapper mapper=session.getMapper(MemberMapper.class);
        List<Member> memberList= new ArrayList<Member>();
        try {
        memberList =mapper.selectAllMember();
        session.commit();
        return memberList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	
}
