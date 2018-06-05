/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.TopCategory;

/**
 * @author ASUS
 *
 */
public interface TopCategoryService {

	public int insertTopCategory(TopCategory topCategory);
	public int updateTopCategory(TopCategory topCategory);
	public int deleteTopCategory(int topCategoryId);
	public TopCategory selectTopCategoryByName(String topCategoryName);
	public TopCategory selectTopCategoryById(int topCategoryId);
	public List<TopCategory> selectAllTopCategory();
}
