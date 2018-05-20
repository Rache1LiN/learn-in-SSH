/**
 * 
 */
package edu.fjnu.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.fjnu.bean.NewsCat;
import edu.fjnu.dao.NewsCatDao;


/**
 * @author ASUS
 *
 */

@Repository("newsCatDao")
public class NewsCatDaoImpl extends BaseDaoImpl<NewsCat> implements NewsCatDao {

	@Override
	public Long insert(NewsCat bean) {
		// TODO Auto-generated method stub

		Long result = 0L;

		String sql = "insert into NewsCat(catName, catDesc, parentId";
		sql += " ,status ,remark ,sortNum ,isDeleted";
		sql += " ,createBy , updateBy ,createOn ,updateOn) ";
		sql += " values(?,?,?, ?,?,?,?, ?,?,?,?)";

		Object[] params = { bean.getCatName(), bean.getCatDesc(), bean.getParentId()
			
				, bean.getStatus(), bean.getRemark(), bean.getSortNum(), bean.getIsDeleted()

				, bean.getCreateBy(), bean.getUpdateBy(), bean.getCreateOn(), bean.getUpdateOn()

		};

		try {
			Integer num = getTmpl().update(sql, params);

			if (num > 0) {
				sql = "Select @@identity";
				result = getTmpl().queryForObject(sql, Long.class);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public Long delete(Long id) {
		Long result = 0L;

		String sql = "update NewsCat set isdeleted=1 where catId=? ";
		Object[] params = { id };

		try {
			Integer num = getTmpl().update(sql, params);
			result = num.longValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public Long update(NewsCat bean) {
		// TODO Auto-generated method stub

		Long result = 0L;

		String sql = "update NewsCat set catName=?, catDesc=?, parentId=? ";

		sql += " ,status=? ,remark=? ,sortNum=? ,isDeleted=? ";
		sql += " ,createBy=? ,updateBy=? ,createOn=? ,updateOn=? ";
		sql += " where catId=?";
		
		Object[] params = { bean.getCatName(), bean.getCatDesc(), bean.getParentId()
			
				, bean.getStatus(), bean.getRemark(), bean.getSortNum(), bean.getIsDeleted()

				, bean.getCreateBy(), bean.getUpdateBy(), bean.getCreateOn(), bean.getUpdateOn()

				, bean.getCatId() };

		try {
			Integer num = getTmpl().update(sql, params);
			result = num.longValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public NewsCat load(Long id) {
		// TODO Auto-generated method stub

		NewsCat bean = null;

		String sql = "select * from NewsCat where catId=?";
		Object[] params = { id };

		ResultSetExtractor<NewsCat> handler = getRshBeanCustom();

		try {
			bean = getTmpl().query(sql, handler, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return bean;
	}

	@Override
	public List<NewsCat> list() {
		// TODO Auto-generated method stub

		List<NewsCat> list = new ArrayList<NewsCat>();

		String sql = "select * from NewsCat";
		Object[] params = {};

		ResultSetExtractor<List<NewsCat>> handler = getRshBeanListCustom();
		try {
			list = getTmpl().query(sql, handler, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return list;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub

		Long result = 0L;

		String sql = "select count(1) from NewsCat";
		Object[] params = {};

		try {

			result = getTmpl().queryForObject(sql, params, Long.class);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public List<NewsCat> pager(Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub

		List<NewsCat> list = new ArrayList<NewsCat>();

		String sql = "select * from NewsCat";

		// 分页
		Long startIndex = (pageNum - 1) * pageSize;
		sql += " limit " + startIndex + "," + pageSize;

		Object[] params = {};

		ResultSetExtractor<List<NewsCat>> handler = getRshBeanListCustom();
		try {
			list = getTmpl().query(sql, handler, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return list;

	}

	@Override
	public NewsCat loadByName(String name) {
		// TODO Auto-generated method stub

		NewsCat bean = null;

		String sql = "select * from NewsCat";
		sql += " where catName=?";
		Object[] params = { name };

		ResultSetExtractor<NewsCat> handler = getRshBeanCustom();

		try {
			bean = getTmpl().query(sql, handler, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return bean;
	}

	@Override
	public Long countByName(String name) {
		// TODO Auto-generated method stub
		Long result = 0L;

		String sql = "select count(1) from NewsCat";
		sql += " where catName=?";

		Object[] params = { name };

		try {

			result = getTmpl().queryForObject(sql, params, Long.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public List<NewsCat> pagerByName(String name, Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub

		List<NewsCat> list = new ArrayList<NewsCat>();

		String sql = "select * from NewsCat";
		sql += " wherer catName=?";

		// 分页
		Long startIndex = (pageNum - 1) * pageSize;
		sql += " limit " + startIndex + "," + pageSize;

		Object[] params = { name };

		ResultSetExtractor<List<NewsCat>> handler = getRshBeanListCustom();
		try {
			list = getTmpl().query(sql, handler, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return list;

	}

	@Override
	protected NewsCat toBean(ResultSet rs) {

		NewsCat bean = new NewsCat();

		try {
			bean.setCatId(rs.getLong("catId"));
			bean.setCatName(rs.getString("catName"));
			bean.setCatDesc(rs.getString("catDesc"));
			bean.setParentId(rs.getLong("parentId"));
			
			
			bean.setStatus(rs.getString("status"));
			bean.setRemark(rs.getString("remark"));
			bean.setSortNum(rs.getLong("sortNum"));
			bean.setIsDeleted(rs.getLong("isDeleted"));

			bean.setCreateBy(rs.getLong("createBy"));
			bean.setUpdateBy(rs.getLong("updateBy"));
			bean.setCreateOn(rs.getTimestamp("createOn"));
			bean.setUpdateOn(rs.getTimestamp("updateOn"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new RuntimeException(e);
		}

		return bean;
	}

}
