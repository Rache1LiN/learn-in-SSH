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
			this.addActionError("�û������������");
			return "input";
		}
		if(user.getUserStatus().equals("b"))
			this.addActionMessage("��ӭ��ͨ�û�"+user.getUserName()+"��¼��");
		else if(user.getUserStatus().equals("a")){
			this.addActionMessage("��ӭ����Ա"+user.getUserName()+"��¼��");
		}
		else {
			this.addActionError("��ȷ����д��ȷ");
			return "input";
		}
		return "menu";
	}
}
