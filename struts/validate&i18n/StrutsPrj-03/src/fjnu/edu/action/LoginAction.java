/**
 * 
 */
package fjnu.edu.action;

import fjnu.edu.domain.User;

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
	public String toInput()throws Exception{
		user=new User();
		return "input";
	}
	public String login()throws Exception{
		return "success";
	}
	/*@Override
	public void validate(){
		if("".equals(user.getUserName())){
			this.addFieldError("user.userName", "�û�������Ϊ�գ�");
		}
		if("".equals(user.getUserPass()))
			this.addFieldError("user.userPass","���벻��Ϊ�գ�");
	}
	public void validateLogin(){
		if("".equals(user.getUserName())){
			this.addFieldError("user.userName", "�û�������Ϊ�գ�");
		}
		if("".equals(user.getUserPass()))
			this.addFieldError("user.userPass","���벻��Ϊ�գ�");
	}*/
}
