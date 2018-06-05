package edu.fjnu.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import edu.fjnu.bean.Member;
import edu.fjnu.service.MemberService;
import edu.fjnu.service.impl.MemberServiceImpl;

public class Testor {

	@Test
	public void test() {
		MemberService memberService = new MemberServiceImpl();
		memberService.insertMember(new Member(1L,"d","d","d","d","d","d",1,"d"));
	}
	
	@Test
	public void test1(){
		MemberService memberService = new MemberServiceImpl();
		memberService.updateMember(new Member(9L,"d","d","d","d","d","d",2,"d"));
	}
	
	@Test
	public void test2(){
		MemberService memberService = new MemberServiceImpl();
		memberService.deleteMember(8L);
	}
	
	@Test
	public void test3(){
		MemberService memberService = new MemberServiceImpl();
		List<Member> memberList= memberService.selectAllMember();
		System.out.println(memberList);
	}

}
