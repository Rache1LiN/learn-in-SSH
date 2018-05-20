/**
 * 
 */
package edu.fjnu.controller;

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
public class UpdateUserController extends AbstractController {

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
		Member member=new Member();
		member.setUserAddress(request.getParameter("userAddress"));
		member.setUserId(Long.parseLong(request.getParameter("userId")));
		member.setUserMail(request.getParameter("userMail"));
		member.setUserName(request.getParameter("userName"));
		member.setUserPass(request.getParameter("userPass"));
		member.setUserPhone(request.getParameter("userPhone"));
		member.setUserSex(request.getParameter("userSex"));
		memberService.update(member);
		modelAndView.setViewName("none");
		return modelAndView;
	}

}
