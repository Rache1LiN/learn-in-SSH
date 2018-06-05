/**
 * 
 */
package edu.fjnu.bean;

/**
 * @author ASUS
 *
 */
public class OrderDetail {

	private Long detailId;
	private Goods goods;
	private Order order;
	private int detailAmount;
	private double detailPrice;
	private int isSettled;
	public Long getDetailId() {
		return detailId;
	}
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getDetailAmount() {
		return detailAmount;
	}
	public void setDetailAmount(int detailAmount) {
		this.detailAmount = detailAmount;
	}
	public double getDetailPrice() {
		return detailPrice;
	}
	public void setDetailPrice(double detailPrice) {
		this.detailPrice = detailPrice;
	}
	public int getIsSettled() {
		return isSettled;
	}
	public void setIsSettled(int isSettled) {
		this.isSettled = isSettled;
	}
	
}
