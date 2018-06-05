/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.OrderDetail;
import edu.fjnu.bean.OrderDetail;
import edu.fjnu.mapper.OrderDetailMapper;
import edu.fjnu.mapper.OrderDetailMapper;
import edu.fjnu.mapper.OrderDetailMapper;
import edu.fjnu.mapper.OrderDetailMapper;
import edu.fjnu.service.OrderDetailService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {

	
	@Override
	public int insertOrderDetail(OrderDetail orderDetail) {
		SqlSession session = DBUtil.getSession();
        OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
        try {
            int index=mapper.insertOrderDetail(orderDetail);
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int updateOrderDetail(OrderDetail orderDetail) {
		SqlSession session = DBUtil.getSession();
        OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
        try {
            int index=mapper.updateOrderDetail(orderDetail);
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int deleteOrderDetail(Long orderDetailId) {
		SqlSession session=DBUtil.getSession();
        OrderDetailMapper mapper=session.getMapper(OrderDetailMapper.class);
        try {
            int index=mapper.deleteOrderDetail(orderDetailId); 
            session.commit(); 
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback(); 
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public OrderDetail selectOrderDetailById(Long orderDetailId) {
		SqlSession session=DBUtil.getSession();
        OrderDetailMapper mapper=session.getMapper(OrderDetailMapper.class);
        try {
        OrderDetail orderDetail= mapper.selectOrderDetailById(orderDetailId);
        session.commit();
        	return orderDetail;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<OrderDetail> selectAllOrderDetail() {
		SqlSession session=DBUtil.getSession();
        OrderDetailMapper mapper=session.getMapper(OrderDetailMapper.class);
        List<OrderDetail> orderDetailList= new ArrayList<OrderDetail>();
        try {
        orderDetailList =mapper.selectAllOrderDetail();
        session.commit();
        return orderDetailList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<OrderDetail> selectOrderDetailByOrderId(Long orderId) {
		SqlSession session=DBUtil.getSession();
        OrderDetailMapper mapper=session.getMapper(OrderDetailMapper.class);
        List<OrderDetail> orderDetailList= new ArrayList<OrderDetail>();
        try {
        orderDetailList =mapper.selectOrderDetailByOrderId(orderId);
        session.commit();
        return orderDetailList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	

}
