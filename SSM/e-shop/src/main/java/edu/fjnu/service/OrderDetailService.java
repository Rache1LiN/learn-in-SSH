/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.OrderDetail;

/**
 * @author ASUS
 *
 */
public interface OrderDetailService {

	public int insertOrderDetail(OrderDetail orderDetail);
	public int updateOrderDetail(OrderDetail orderDetail);
	public int deleteOrderDetail(Long orderDetailId);
	public OrderDetail selectOrderDetailById(Long orderDetailId);
	public List<OrderDetail> selectAllOrderDetail();
	public List<OrderDetail> selectOrderDetailByOrderId(Long orderId);
}
