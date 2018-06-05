/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.Order;

/**
 * @author ASUS
 *
 */
public interface OrderService {

	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrder(Long orderId);
	public Order selectOrderById(Long orderId);
	public List<Order> selectOrderByMemberId(Long memberId);
	public List<Order> selectAllOrder();
}
