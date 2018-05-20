/**
 * 
 */
package edu.fjnu.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


/**
 * @author ASUS
 *
 */
public abstract class BaseDaoImpl<T> {

	public BaseDaoImpl() {
		System.out.println(this);
	}

	private JdbcTemplate jdbcTemplate = null;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * ��daoimpl������ʹ��
	 * 
	 * @return
	 */
	public JdbcTemplate getTmpl() {
		return jdbcTemplate;
	}

	/**
	 * �Զ���ӳ����00: ����תΪʵ��
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	protected T toBean(ResultSet rs) {
		return null;
	}

	/**
	 * �Զ���ӳ����03: ���������[ʵ��]������������������һ��ʱʹ��
	 * 
	 * @return
	 */
	public ResultSetExtractor<T> getRshBeanCustom() {

		ResultSetExtractor<T> handler = new ResultSetExtractor<T>() {

			@Override
			public T extractData(ResultSet arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if (arg0.next()) {
					return toBean(arg0);
				} else {
					return null;
				}
			}

		};
		return handler;
	}

	/**
	 * �Զ���ӳ����04: ���������[ʵ���б�]������������������һ��ʱʹ��
	 * 
	 * @return
	 */
	public ResultSetExtractor<List<T>> getRshBeanListCustom() {
		ResultSetExtractor<List<T>> handler = new ResultSetExtractor<List<T>>() {

			@Override
			public List<T> extractData(ResultSet arg0) throws SQLException, DataAccessException {
				List<T> vList = new ArrayList<T>();
				try {
					while (arg0.next()) {
						vList.add(toBean(arg0));
					}
				} catch (SQLException e) {
					e.printStackTrace();

					throw new RuntimeException(e);
				}
				return vList;
			}

		};
		return handler;
	}

}
