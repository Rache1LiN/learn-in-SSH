/**
 * 
 */
package edu.fjnu.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import edu.fjnu.bean.User;

/**
 * @author ASUS
 *
 */
public class LoginAction extends BaseAction implements SessionAware{


	private User user;
	private Map<String,Object> session;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String toInput() throws Exception{
		user = new User();
		return "input";
	}
	public String create()throws Exception{
		session.put("USER",user);
		return "success";
	}
	
	public String add() throws Exception{
		return "add";
	}
	public void validateCreate(){
		if("".equals(user.getUserName())){
			this.addFieldError("user.userName", "用户名不能为空！");
		}
		if("".equals(user.getUserPass()))
			this.addFieldError("user.userPass","密码不能为空！");
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
}
