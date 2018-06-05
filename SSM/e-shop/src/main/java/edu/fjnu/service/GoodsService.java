/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.Goods;

/**
 * @author ASUS
 *
 */
public interface GoodsService {

	public int insertGoods(Goods goods);
	public int updateGoods(Goods goods);
	public int deleteGoods(Long goodsId);
	public Goods selectGoodsByName(String goodsName);
	public Goods selectGoodsById(Long goodsId);
	public List<Goods> selectGoodsBySubId(int subId);
	public List<Goods> selectAllGoods();
}
