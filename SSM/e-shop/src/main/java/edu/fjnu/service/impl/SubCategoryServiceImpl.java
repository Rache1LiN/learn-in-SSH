/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.SubCategory;
import edu.fjnu.bean.SubCategory;
import edu.fjnu.mapper.SubCategoryMapper;
import edu.fjnu.mapper.SubCategoryMapper;
import edu.fjnu.mapper.SubCategoryMapper;
import edu.fjnu.mapper.SubCategoryMapper;
import edu.fjnu.service.SubCategoryService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("subCategoryService")
public class SubCategoryServiceImpl implements SubCategoryService {

	
	@Override
	public List<SubCategory> selectAllSubCategory() {
		SqlSession session=DBUtil.getSession();
        SubCategoryMapper mapper=session.getMapper(SubCategoryMapper.class);
        List<SubCategory> subCategoryList= new ArrayList<SubCategory>();
        try {
        subCategoryList =mapper.selectAllSubCategory();
        session.commit();
        return subCategoryList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public int insertSubCategory(SubCategory subCategory) {
		SqlSession session = DBUtil.getSession();
        SubCategoryMapper mapper = session.getMapper(SubCategoryMapper.class);
        try {
            int index=mapper.insertSubCategory(subCategory);
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
	public int updateSubCategory(SubCategory subCategory) {
		SqlSession session = DBUtil.getSession();
        SubCategoryMapper mapper = session.getMapper(SubCategoryMapper.class);
        try {
            int index=mapper.updateSubCategory(subCategory);
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
	public int deleteSubCategory(int subCategoryId) {
		SqlSession session=DBUtil.getSession();
        SubCategoryMapper mapper=session.getMapper(SubCategoryMapper.class);
        try {
            int index=mapper.deleteSubCategory(subCategoryId); 
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
	public SubCategory selectSubCategoryByName(String subCategoryName) {
		SqlSession session=DBUtil.getSession();
        SubCategoryMapper mapper=session.getMapper(SubCategoryMapper.class);
        try {
        SubCategory subCategory= mapper.selectSubCategoryByName(subCategoryName);
        session.commit();
        	return subCategory;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public SubCategory selectSubCategoryById(int subCategoryId) {
		SqlSession session=DBUtil.getSession();
        SubCategoryMapper mapper=session.getMapper(SubCategoryMapper.class);
        try {
        SubCategory subCategory= mapper.selectSubCategoryById(subCategoryId);
        session.commit();
        	return subCategory;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<SubCategory> selectSubCategoryByTopId(int topId) {
		SqlSession session=DBUtil.getSession();
        SubCategoryMapper mapper=session.getMapper(SubCategoryMapper.class);
        List<SubCategory> subList = null;
        try {
	        subList= mapper.selectSubCategoryByTopId(topId);
	        session.commit();
        	return subList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}

}
