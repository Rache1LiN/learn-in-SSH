/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author ASUS
 *
 */
public abstract class BaseController extends AbstractController {


	public String Page_Prefix = "jsps";

	public String Url_Format = Page_Prefix + "/" + "%s";
	
	
	public BaseController(){
		super();
		System.out.println(this);
	}

	public ModelAndView getMView(){
		ModelAndView mView = new ModelAndView();
		return mView;
	}
	
	public ModelAndView getMView(String viewName){
		ModelAndView mView = new ModelAndView();
		if(viewName != null && !viewName.isEmpty()){
			mView.setViewName(getDispatcherPath(viewName));
		}
		return mView;
	}
	
	public ModelAndView getMView(String pBeanName,String pOperName){
		ModelAndView mView = new ModelAndView();
		mView.setViewName(getDispatcherPath(pBeanName,pOperName));
		System.out.println(getDispatcherPath(pBeanName,pOperName));
		return mView;
	}
	public String getRedirectPath(String viewName){
		String path = "redirect:" + "/" ;
		path += viewName;
		return path;
	}
	
	public String getRedirectPath(String pBeanName, String pOperName){
		String path = "redirect:" + "/";
		String viewName = String.format(Url_Format, pBeanName + "_" + pOperName);
		path += viewName;
		return path;
	}
	

	public String getRedirectLogin(){
		String viewName = getRedirectPath("Login");
		
		return viewName;
	}
	
	public ModelAndView getRedirectLoginMView(){
		ModelAndView mView = new ModelAndView();
		mView.setViewName(getRedirectLogin());
		return mView;
	}
	
	public String getDispatcherPath(String pFileName){
		String viewName = String.format(Url_Format, pFileName);
		return viewName;
	}
	
	public String getDispatcherPath(String pBeanName,String pOperName){
		String viewName = String.format(Url_Format, pBeanName + "_" + pOperName);
		return viewName;
	}
	
	
	protected ModelAndView handleBase(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView();
		
		return mView;
	}
	
	protected boolean checkLogin(HttpServletRequest request,HttpServletResponse response){
		
		boolean vIsOK = false;
		
		if(request.getSession().getAttribute("loginuser") == null){
			vIsOK = false;
		}else{
			vIsOK = true;
		}
		return vIsOK;
	}
	
	protected boolean checkAdmin(HttpServletRequest request,HttpServletResponse response){
		boolean vIsOK = false;
		
		if(request.getSession().getAttribute("isadmin") == null){
			vIsOK = false;
		}else{
			vIsOK = true;
		}
		return vIsOK;
	}
	
}


