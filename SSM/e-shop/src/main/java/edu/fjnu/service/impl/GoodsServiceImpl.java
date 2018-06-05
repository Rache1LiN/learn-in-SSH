/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Goods;
import edu.fjnu.mapper.GoodsMapper;
import edu.fjnu.service.GoodsService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Override
	public int insertGoods(Goods goods) {
		SqlSession session = DBUtil.getSession();
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        try {
            int index=mapper.insertGoods(goods);
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
	public int updateGoods(Goods goods) {
		SqlSession session = DBUtil.getSession();
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        try {
            int index=mapper.updateGoods(goods);
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
	public int deleteGoods(Long goodsId) {
		SqlSession session=DBUtil.getSession();
        GoodsMapper mapper=session.getMapper(GoodsMapper.class);
        try {
            int index=mapper.deleteGoods(goodsId); 
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
	public Goods selectGoodsByName(String goodsName) {
		SqlSession session=DBUtil.getSession();
        GoodsMapper mapper=session.getMapper(GoodsMapper.class);
        try {
        Goods goods= mapper.selectGoodsByName(goodsName);
        session.commit();
        	return goods;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public Goods selectGoodsById(Long goodsId) {
		SqlSession session=DBUtil.getSession();
        GoodsMapper mapper=session.getMapper(GoodsMapper.class);
        try {
        Goods goods= mapper.selectGoodsById(goodsId);
        session.commit();
        	return goods;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<Goods> selectAllGoods() {
		SqlSession session=DBUtil.getSession();
        GoodsMapper mapper=session.getMapper(GoodsMapper.class);
        List<Goods> goodsList= new ArrayList<Goods>();
        try {
        goodsList =mapper.selectAllGoods();
        session.commit();
        return goodsList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<Goods> selectGoodsBySubId(int subId) {
		SqlSession session=DBUtil.getSession();
        GoodsMapper mapper=session.getMapper(GoodsMapper.class);
        List<Goods> goodsList= new ArrayList<Goods>();
        try {
        goodsList =mapper.selectGoodsBySubId(subId);
        session.commit();
        return goodsList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}

}
