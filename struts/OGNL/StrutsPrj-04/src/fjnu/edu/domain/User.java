/**
 * 
 */
package fjnu.edu.domain;

/**
 * @author ASUS
 *
 */
public class User {

	private String userName;
	private String userPass;
	private String userSex;
	private String[] userHobby;
	private String[] userPerBook;
	private String userMemo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String[] getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String[] userHobby) {
		this.userHobby = userHobby;
	}
	public String[] getUserPerBook() {
		return userPerBook;
	}
	public void setUserPerBook(String[] userPerBook) {
		this.userPerBook = userPerBook;
	}
	public String getUserMemo() {
		return userMemo;
	}
	public void setUserMemo(String userMemo) {
		this.userMemo = userMemo;
	}
	
}
