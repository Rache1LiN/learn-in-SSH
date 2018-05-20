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
public class MainController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	public MainController(){
		super();
	}
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	protected ModelAndView main(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView =getMView("Main");
		
		return mView;
	}
	
	protected ModelAndView welcome(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("welcome");
		return mView;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mView = super.handleBase(request, response);
		
		if(!checkLogin(request,response)){
			//Ìø×ªµÇÂ¼½çÃæ
			mView.setViewName(getRedirectLogin());
			return mView;
		}
		
		String oper =request.getParameter("oper");
		
		if(oper != null && oper.equalsIgnoreCase("welcome")){
			mView = welcome(request,response);
		}else{
			mView = main(request,response);
		}
		return mView;
	}

}
