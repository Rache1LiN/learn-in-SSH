/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.TopCategory;
import edu.fjnu.bean.TopCategory;
import edu.fjnu.mapper.TopCategoryMapper;
import edu.fjnu.mapper.TopCategoryMapper;
import edu.fjnu.mapper.TopCategoryMapper;
import edu.fjnu.mapper.TopCategoryMapper;
import edu.fjnu.service.TopCategoryService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("topCategoryService")
public class TopCategoryServiceImpl implements TopCategoryService {

	

	@Override
	public List<TopCategory> selectAllTopCategory() {
		SqlSession session=DBUtil.getSession();
        TopCategoryMapper mapper=session.getMapper(TopCategoryMapper.class);
        List<TopCategory> topCategoryList= new ArrayList<TopCategory>();
        try {
        topCategoryList =mapper.selectAllTopCategory();
        session.commit();
        return topCategoryList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public int insertTopCategory(TopCategory topCategory) {
		SqlSession session = DBUtil.getSession();
        TopCategoryMapper mapper = session.getMapper(TopCategoryMapper.class);
        try {
            int index=mapper.insertTopCategory(topCategory);
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
	public int updateTopCategory(TopCategory topCategory) {
		SqlSession session = DBUtil.getSession();
        TopCategoryMapper mapper = session.getMapper(TopCategoryMapper.class);
        try {
            int index=mapper.updateTopCategory(topCategory);
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
	public int deleteTopCategory(int topCategoryId) {
		SqlSession session=DBUtil.getSession();
        TopCategoryMapper mapper=session.getMapper(TopCategoryMapper.class);
        try {
            int index=mapper.deleteTopCategory(topCategoryId); 
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
	public TopCategory selectTopCategoryByName(String topCategoryName) {
		SqlSession session=DBUtil.getSession();
        TopCategoryMapper mapper=session.getMapper(TopCategoryMapper.class);
        try {
        TopCategory topCategory= mapper.selectTopCategoryByName(topCategoryName);
        session.commit();
        	return topCategory;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public TopCategory selectTopCategoryById(int topCategoryId) {
		SqlSession session=DBUtil.getSession();
        TopCategoryMapper mapper=session.getMapper(TopCategoryMapper.class);
        try {
        TopCategory topCategory= mapper.selectTopCategoryById(topCategoryId);
        session.commit();
        	return topCategory;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}

}
