/**
 * 
 */
package edu.fjnu.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 
 *
 */


public class DemoAction extends ActionSupport {
	
	 private String userName;
	 private String userPWD;
	 	
	 public String getUserName() {
		return userName;
	 }

	 public void setUserName(String userName) {
		this.userName = userName;
	 }	 
	 
	
	public String getUserPWD() {
		return userPWD;
	}

	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}

	public String toInput() throws Exception{
		return "input";
	}

	public String execute() throws Exception{
		 if(this.userName.equals("") || this.userPWD.equals("")){
			 this.addActionError("用户名或密码错误！");
			 return "input";
		 }
		 this.addActionMessage(userName);
		 return "right";
	 }

}
