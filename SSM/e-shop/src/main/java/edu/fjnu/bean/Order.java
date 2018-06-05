/**
 * 
 */
package edu.fjnu.bean;

import java.util.Date;
import java.util.List;

/**
 * @author ASUS
 *
 */
public class Order {

	private Long orderId;
	private Date orderDate;
	private double orderTotal;
	private int orderStatus;
	private String orderAddress;
	private String orderPhone;
	private String orderReciever;
	private Member member;
	private List<OrderDetail> orderDetailList;
	public Order(){}
	public Order(Long orderId, Date orderDate, double orderTotal,
			int orderStatus, String orderAddress, String orderPhone,
			String orderReciever, Member member) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.orderStatus = orderStatus;
		this.orderAddress = orderAddress;
		this.orderPhone = orderPhone;
		this.orderReciever = orderReciever;
		this.member = member;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public String getOrderReciever() {
		return orderReciever;
	}
	public void setOrderReciever(String orderReciever) {
		this.orderReciever = orderReciever;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
}
