/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import edu.fjnu.service.MemberService;

/**
 * @author ASUS
 *
 */
public class DeleteUserController extends AbstractController {

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
		ModelAndView modelAndView= new ModelAndView();
		memberService.delete(Long.parseLong(request.getParameter("userId")));
		modelAndView.setViewName("none");
		return modelAndView;
	}

}
