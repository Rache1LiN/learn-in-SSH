/**
 * 
 */
package edu.fjnu.action;

import edu.fjnu.domain.User;

/**
 * @author ASUS
 *
 */
public class LoginAction extends BaseAction {

	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String toInput() throws Exception{
		user=new User();
		return "input";
	}
	
	public String login() throws Exception{
		if(user.getUserPWD().length()>10){
			this.addActionError("用户名或密码错误！");
			return "input";
		}
		if(user.getUserStatus().equals("b"))
			this.addActionMessage("欢迎普通用户"+user.getUserName()+"登录！");
		else if(user.getUserStatus().equals("a")){
			this.addActionMessage("欢迎管理员"+user.getUserName()+"登录！");
		}
		else {
			this.addActionError("请确认填写正确");
			return "input";
		}
		return "menu";
	}
}
