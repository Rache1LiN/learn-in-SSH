/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.Order;

/**
 * @author ASUS
 *
 */

public interface OrderMapper {

	public int insertOrder(Order order) throws Exception;
	public int updateOrder(Order order) throws Exception;
	public int deleteOrder(Long orderId) throws Exception;
	public Order selectOrderById(Long orderId) throws Exception;
	public List<Order> selectOrderByMemberId(Long memberId) throws Exception;
	public List<Order> selectAllOrder() throws Exception;
}
