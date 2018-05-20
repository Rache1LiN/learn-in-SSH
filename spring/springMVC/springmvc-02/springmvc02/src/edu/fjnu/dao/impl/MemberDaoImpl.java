/**
 * 
 */
package edu.fjnu.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.fjnu.bean.Member;
import edu.fjnu.dao.MemberDao;


/**
 * @author ASUS
 *
 */

@Repository("memberDao")
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

	@Override
	public Long insert(Member bean) {
		// TODO Auto-generated method stub

		Long result = 0L;

		String sql = "insert into Member(userName, userPass, email, myId, myIdKey, regIp, regDate, lastLoginIp, lastLoginTime, salt, secques";
		sql += " ,status ,remark ,sortNum ,isDeleted";
		sql += " ,createBy , updateBy ,createOn ,updateOn) ";
		sql += " values(?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?, ?,?,?,?)";

		Object[] params = { bean.getUserName(), bean.getUserPass(), bean.getEmail(), bean.getMyId(), bean.getMyIdKey(),
				bean.getRegIp(), bean.getRegDate(), bean.getLastLoginIp(), bean.getLastLoginTime(), bean.getSalt(),
				bean.getSecques()

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

		String sql = "update Member set isdeleted=1 where userId=? ";
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
	public Long update(Member bean) {
		// TODO Auto-generated method stub

		Long result = 0L;

		String sql = "update Member set userName=?, userPass=?, email=? ,mobile=?"

				+ ", myId=?, myIdKey=?"

				+ ", regIp=?, regDate=?, lastLoginIp=?, lastLoginTime=?"

				+ ", salt=?, secques=?";

		sql += " ,status=? ,remark=? ,sortNum=? ,isDeleted=? ";
		sql += " ,createBy=? ,updateBy=? ,createOn=? ,updateOn=? ";
		sql += " where userId=?";
		
		Object[] params = { bean.getUserName(), bean.getUserPass(), bean.getEmail(), bean.getMobile()

				, bean.getMyId(), bean.getMyIdKey(),

				bean.getRegIp(), bean.getRegDate(), bean.getLastLoginIp(), bean.getLastLoginTime()

				, bean.getSalt(), bean.getSecques()

				, bean.getStatus(), bean.getRemark(), bean.getSortNum(), bean.getIsDeleted()

				, bean.getCreateBy(), bean.getUpdateBy(), bean.getCreateOn(), bean.getUpdateOn()

				, bean.getUserId() };

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
	public Member load(Long id) {
		// TODO Auto-generated method stub

		Member bean = null;

		String sql = "select * from Member where userId=?";
		Object[] params = { id };

		ResultSetExtractor<Member> handler = getRshBeanCustom();

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
	public List<Member> list() {
		// TODO Auto-generated method stub

		List<Member> list = new ArrayList<Member>();

		String sql = "select * from Member";
		Object[] params = {};

		ResultSetExtractor<List<Member>> handler = getRshBeanListCustom();
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

		String sql = "select count(1) from Member";
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
	public List<Member> pager(Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub

		List<Member> list = new ArrayList<Member>();

		String sql = "select * from Member";

		Long startIndex = (pageNum - 1) * pageSize;
		sql += " limit " + startIndex + "," + pageSize;

		Object[] params = {};

		ResultSetExtractor<List<Member>> handler = getRshBeanListCustom();
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
	public Member loadByName(String name) {
		// TODO Auto-generated method stub

		Member bean = null;

		String sql = "select * from Member";
		sql += " where userName=?";
		Object[] params = { name };

		ResultSetExtractor<Member> handler = getRshBeanCustom();

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

		String sql = "select count(1) from Member";
		sql += " where userName=?";

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
	public List<Member> pagerByName(String name, Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub

		List<Member> list = new ArrayList<Member>();

		String sql = "select * from Member";
		sql += " where userName=?";

		Long startIndex = (pageNum - 1) * pageSize;
		sql += " limit " + startIndex + "," + pageSize;

		Object[] params = { name };

		ResultSetExtractor<List<Member>> handler = getRshBeanListCustom();
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
	protected Member toBean(ResultSet rs) {

		Member bean = new Member();

		try {
			bean.setUserId(rs.getLong("userId"));
			bean.setUserName(rs.getString("userName"));
			bean.setUserPass(rs.getString("userPass"));
			bean.setEmail(rs.getString("email"));

			bean.setMyId(rs.getString("myId"));
			bean.setMyIdKey(rs.getString("myIdKey"));
			bean.setRegIp(rs.getString("regIp"));
			bean.setRegDate(rs.getTimestamp("regDate"));
			bean.setLastLoginIp(rs.getString("lastLoginIp"));
			bean.setLastLoginTime(rs.getTimestamp("lastLoginTime"));
			bean.setSalt(rs.getString("salt"));
			bean.setSecques(rs.getString("secques"));

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
