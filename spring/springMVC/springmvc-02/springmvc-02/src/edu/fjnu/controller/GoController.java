/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author ASUS
 *
 */
public class GoController extends BaseController {
	private static final long serialVersionUID = 1L;
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public GoController(){
		super();
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mView= super.handleBase(request, response);
		
		 // 取得操作类型
		 String oper= request.getParameter("oper");
		
		 if(oper!= null&& oper.equalsIgnoreCase("ok")) {
		 mView.setViewName(getDispatcherPath("Go","ok"));
		 } else if(oper!= null&& oper.equalsIgnoreCase("no")) {
		 mView.setViewName(getDispatcherPath("Go","no"));
		 } else if(oper!= null&& oper.equalsIgnoreCase("err")) {
		 mView.setViewName(getDispatcherPath("Go","err"));
		 } else if(oper!= null&& oper.equalsIgnoreCase("noright")) {
		 mView.setViewName(getDispatcherPath("Go","noright"));
		 } else if(oper!= null&& oper.equalsIgnoreCase("preload")) {
		 mView.setViewName(getDispatcherPath("Go","preload"));
		 } else if(oper!= null&& oper.equalsIgnoreCase("reload")) {
		 mView.setViewName(getDispatcherPath("Go","reload"));
		 } else{
		 mView.setViewName(getDispatcherPath("Go","blank"));
		 }
		return mView;
	}

}
