/**
 * 
 */
package com.demo.bean;

/**
 * @author ASUS
 *
 */
public class User {
	private int ID;
	private String userName;
	private String userPwd;
	
	public User(){}
	public User(String uName,String uPwd){
		this.userName=uName;
		this.userPwd=uPwd;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}
	
	
}
