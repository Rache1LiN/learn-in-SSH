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
public class IndexController extends BaseController {

	public IndexController(){
		super();
		System.out.println(this);
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mView = getMView();
		System.out.println("hello,springmvc.");
		mView.setViewName("jsps/index-01");
		return mView;
	}

	
}
