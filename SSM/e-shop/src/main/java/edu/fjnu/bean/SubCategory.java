/**
 * 
 */
package edu.fjnu.bean;

import java.util.List;

/**
 * @author ASUS
 *
 */
public class SubCategory {

	private int subId;
	private String subName;
	private TopCategory topCategory;
	private List<Goods> goodsList;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public TopCategory getTopCategory() {
		return topCategory;
	}
	public void setTopCategory(TopCategory topCategory) {
		this.topCategory = topCategory;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
}
