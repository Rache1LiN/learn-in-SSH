/**
 * 
 */
package edu.fjnu.dao;

import java.util.List;


/**
 * @author ASUS
 *
 */
public interface BaseDao<T> {

	Long insert(T bean);

	Long delete(Long id);

	Long update(T bean);

	T load(Long id);

	java.util.List<T> list();

	Long count();

	Long countByName(String name);

	T loadByName(String name);

	List<T> pager(Long pageNum, Long pageSize);

	List<T> pagerByName(String name, Long pageNum, Long pageSize);

}
