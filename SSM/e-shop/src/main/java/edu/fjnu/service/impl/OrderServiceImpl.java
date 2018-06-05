/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Order;
import edu.fjnu.bean.Order;
import edu.fjnu.mapper.OrderMapper;
import edu.fjnu.mapper.OrderMapper;
import edu.fjnu.mapper.OrderMapper;
import edu.fjnu.mapper.OrderMapper;
import edu.fjnu.service.OrderService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	
	@Override
	public int insertOrder(Order order) {
		SqlSession session = DBUtil.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        try {
            int index=mapper.insertOrder(order);
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
	public int updateOrder(Order order) {
		SqlSession session = DBUtil.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        try {
            int index=mapper.updateOrder(order);
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
	public int deleteOrder(Long orderId) {
		SqlSession session=DBUtil.getSession();
        OrderMapper mapper=session.getMapper(OrderMapper.class);
        try {
            int index=mapper.deleteOrder(orderId); 
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
	public Order selectOrderById(Long orderId) {
		SqlSession session=DBUtil.getSession();
        OrderMapper mapper=session.getMapper(OrderMapper.class);
        try {
        Order order= mapper.selectOrderById(orderId);
        session.commit();
        	return order;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}

	@Override
	public List<Order> selectAllOrder() {
		SqlSession session=DBUtil.getSession();
        OrderMapper mapper=session.getMapper(OrderMapper.class);
        List<Order> orderList= new ArrayList<Order>();
        try {
        orderList =mapper.selectAllOrder();
        session.commit();
        return orderList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<Order> selectOrderByMemberId(Long memberId) {
		SqlSession session=DBUtil.getSession();
        OrderMapper mapper=session.getMapper(OrderMapper.class);
        List<Order> orderList= new ArrayList<Order>();
        try {
        orderList =mapper.selectOrderByMemberId(memberId);
        session.commit();
        return orderList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}

}
