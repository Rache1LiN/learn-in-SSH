/**
 * 
 */
package edu.fjnu.bean;

import java.util.List;

/**
 * @author ASUS
 *
 */
public class Member {

	private Long memberId;
	private String memberName;
	private String memberPass;
	private String realName;
	private String memberEmail;
	private String memberAddress;
	private String memberPhone;
	private int memberStatus;
	private String memberCode;
	private List<Order> orderList;
	public Member(){}
	public Member(Long memberId, String memberName, String memberPass,
			String realName, String memberEmail, String memberAddress,
			String memberPhone, int memberStatus, String memberCode) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPass = memberPass;
		this.realName = realName;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberStatus = memberStatus;
		this.memberCode = memberCode;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPass() {
		return memberPass;
	}
	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(int memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName
				+ ", memberPass=" + memberPass + ", realName=" + realName
				+ ", memberEmail=" + memberEmail + ", memberAddress="
				+ memberAddress + ", memberPhone=" + memberPhone
				+ ", memberStatus=" + memberStatus + ", memberCode="
				+ memberCode + "]";
	}
	
}
