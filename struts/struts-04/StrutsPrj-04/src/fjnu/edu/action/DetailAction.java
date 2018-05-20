/**
 * 
 */
package fjnu.edu.action;

import fjnu.edu.domain.User;

/**
 * @author ASUS
 *
 */
public class DetailAction extends BaseAction {

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
	public String detail()throws Exception{
		System.out.println(user.getUserHobby()[0]);
		return "success";
	}
	public void validateDetail(){
		if("".equals(user.getUserName())){
			this.addFieldError("user.userName", "用户名不能为空！");
		}
		if("".equals(user.getUserPass()))
			this.addFieldError("user.userPass","密码不能为空！");
	}
}
