/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import edu.fjnu.bean.Member;
import edu.fjnu.service.MemberService;
import edu.fjnu.util.SpringUtil;

/**
 * @author ASUS
 *
 */
public class LoginController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	MemberService coreUserService = SpringUtil.getBean(MemberService.class);
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public LoginController(){
		super();
	}
	
	protected ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		
		return mView;
	}
	
	protected ModelAndView logoutDeal(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		//清空所有的会话数据
		request.getSession().invalidate();
		
		//跳转登录界面
		mView.setViewName(getRedirectLogin());
		
		return mView;
	}
	
	protected ModelAndView loginDeal(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		HttpSession session = request.getSession();
		
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		String validateCode = request.getParameter("validateCode");
		request.setAttribute("userName", userName);
		
		String vMsg = "";
		if(StringUtils.isEmpty(userName)){
			vMsg += "账号不能为空。";
		}
		if(StringUtils.isEmpty(userPass)){
			vMsg += "密码不能为空。";
		}
		if(StringUtils.isEmpty(validateCode)){
			vMsg += "验证码不能为空。";
		}
		
		//如果验证失败，则将失败内容放到作用域变量，并转发到页面
		if(!StringUtils.isEmpty(vMsg)){
			request.setAttribute("msg", vMsg);
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		if(!validateCode.equals(session.getAttribute(UIConst.VALIDATE_CODE))){
			vMsg += "验证码不正确。";
			// 如果验证失败，则将失败内容放到作用域变量，并转发到页面
			if(!StringUtils.isEmpty(vMsg)){
				request.setAttribute("msg", vMsg);
				System.out.println(vMsg);
				return mView;
			}
		}
		Member bean = coreUserService.loadByName(userName);
		if(bean == null){
			request.setAttribute("msg", "账户不存在。");
			
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		
		if(!bean.getUserPass().equals(userPass)){
			request.setAttribute("msg", "密码错误。");
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		System.out.println("登录成功。");
		
		//登录成功后，将当前登录用户放到session
		//其他页面，根据session是否存在来判断是否已经登录
		request.getSession().setAttribute(UIConst.LOGINUSER, bean);
		//登录成功后，就将是否时管理员的标识保存在session
		if(bean.getUserName().equalsIgnoreCase("admin")){
			request.getSession().setAttribute(UIConst.ISADMIN, true);
		}
		
		// 之后，转发到mian
		mView.setViewName(getRedirectPath("Main"));
		return mView;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 调用基类的处理
		ModelAndView mView = super.handleBase(request, response);
		
		// 取得操作类型
		String oper = request.getParameter("oper");
		
		if(oper != null && oper.equalsIgnoreCase("loginDeal")){
			//处理提交：登录处理
			mView = loginDeal(request,response);
		}else if(oper != null && oper.equalsIgnoreCase("logoutDeal")){
			//注销处理
			mView = logoutDeal(request,response);
		}else{
			//显示登录界面
			mView = login(request,response);
		}
		return mView;
	}

}
