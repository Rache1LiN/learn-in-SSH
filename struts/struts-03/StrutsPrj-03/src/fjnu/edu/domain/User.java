/**
 * 
 */
package fjnu.edu.domain;

import java.util.Date;

/**
 * @author ASUS
 *
 */
public class User {

	private String userName;
	private Integer userId;
	private String userPass;
	private Integer userAge;
	private Date userBirth;
	private Double userHigh;
	private String userMail;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
	public Double getUserHigh() {
		return userHigh;
	}
	public void setUserHigh(Double userHigh) {
		this.userHigh = userHigh;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
}
