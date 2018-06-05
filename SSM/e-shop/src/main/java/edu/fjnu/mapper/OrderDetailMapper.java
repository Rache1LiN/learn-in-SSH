/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.OrderDetail;

/**
 * @author ASUS
 *
 */

public interface OrderDetailMapper {

	public int insertOrderDetail(OrderDetail orderDetail) throws Exception;
	public int updateOrderDetail(OrderDetail orderDetail) throws Exception;
	public int deleteOrderDetail(Long detailId) throws Exception;
	public OrderDetail selectOrderDetailById(Long detailId) throws Exception;
	public List<OrderDetail> selectOrderDetailByOrderId(Long orderId) throws Exception;
	public List<OrderDetail> selectAllOrderDetail() throws Exception;
}
