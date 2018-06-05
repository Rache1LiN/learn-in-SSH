/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.TopCategory;
import edu.fjnu.bean.TopCategory;

/**
 * @author ASUS
 *
 */

public interface TopCategoryMapper {

	public int insertTopCategory(TopCategory topCategory) throws Exception;
	public int updateTopCategory(TopCategory topCategory) throws Exception;
	public int deleteTopCategory(int topId) throws Exception;
	public TopCategory selectTopCategoryByName(String topName) throws Exception;
	public TopCategory selectTopCategoryById(int topId) throws Exception;
	public List<TopCategory> selectAllTopCategory() throws Exception;
}
