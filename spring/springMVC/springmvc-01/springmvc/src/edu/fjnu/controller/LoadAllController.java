/**
 * 
 */
package edu.fjnu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import edu.fjnu.bean.Member;
import edu.fjnu.service.MemberService;

/**
 * @author ASUS
 *
 */
public class LoadAllController extends AbstractController {

	private MemberService memberService;
	
	public MemberService getMemberService() {
		return memberService;
	}

	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView=new ModelAndView();
		List<Member> memberList=memberService.loadAllUsers();
//		Map<String,Object> maps=new HashMap<String,Object>();
//		maps.put("memberList", memberList);
//		modelAndView.addObject("maps",maps);
		modelAndView.addObject("memberList",memberList);
		modelAndView.setViewName("list_members");
		return modelAndView;
	}

}
