/**
 * 
 */
package edu.fjnu.controller;

import java.util.List;

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
public class LoginController extends AbstractController {

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
		ModelAndView modelAndView =new ModelAndView();
		Member member=new Member();
		member.setUserName(request.getParameter("userName"));
		member.setUserPass(request.getParameter("userPass"));
		if(memberService.login(member)==true){
			modelAndView.addObject("userId",memberService.findIdByName(request.getParameter("userName")));
			modelAndView.setViewName("main_memu");
		}
		else
			modelAndView.setViewName("login_input");
		return modelAndView;
	}

}
