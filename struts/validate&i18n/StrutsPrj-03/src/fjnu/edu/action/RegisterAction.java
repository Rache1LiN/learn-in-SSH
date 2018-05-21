/**
 * 
 */
package fjnu.edu.action;

import fjnu.edu.domain.User;

/**
 * @author ASUS
 *
 */
public class RegisterAction extends BaseAction {

	private User user;
	private String rePass;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getRePass() {
		return rePass;
	}

	public void setRePass(String rePass) {
		this.rePass = rePass;
	}

	public String toInput()throws Exception{
		user=new User();
		return "input";
	}
	
	public String register()throws Exception{
		return "success";
	}
}
