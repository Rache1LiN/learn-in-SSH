/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.Goods;

/**
 * @author ASUS
 *
 */

public interface GoodsMapper {

	public int insertGoods(Goods goods) throws Exception;
	public int updateGoods(Goods goods) throws Exception;
	public int deleteGoods(Long goodsId) throws Exception;
	public Goods selectGoodsByName(String goodsName) throws Exception;
	public Goods selectGoodsById(Long goodsId) throws Exception;
	public List<Goods> selectGoodsBySubId(int subId) throws Exception;
	public List<Goods> selectAllGoods() throws Exception;
}
