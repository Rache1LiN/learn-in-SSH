/**
 * 
 */
package edu.fjnu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fjnu.bean.SubCategory;
import edu.fjnu.bean.SubCategory;

/**
 * @author ASUS
 *
 */

public interface SubCategoryMapper {

	public int insertSubCategory(SubCategory subCategory) throws Exception;
	public int updateSubCategory(SubCategory subCategory) throws Exception;
	public int deleteSubCategory(int subId) throws Exception;
	public SubCategory selectSubCategoryByName(String subName) throws Exception;
	public SubCategory selectSubCategoryById(int subId) throws Exception;
	public List<SubCategory> selectSubCategoryByTopId(int topId) throws Exception;
	public List<SubCategory> selectAllSubCategory() throws Exception;
	
}
