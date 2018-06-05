/**
 * 
 */
package edu.fjnu.service;

import java.util.List;

import edu.fjnu.bean.SubCategory;

/**
 * @author ASUS
 *
 */
public interface SubCategoryService {

	public int insertSubCategory(SubCategory subCategory);
	public int updateSubCategory(SubCategory subCategory);
	public int deleteSubCategory(int subCategoryId);
	public SubCategory selectSubCategoryByName(String subCategoryName);
	public SubCategory selectSubCategoryById(int subCategoryId);
	public List<SubCategory> selectSubCategoryByTopId(int topId);
	public List<SubCategory> selectAllSubCategory();
}
