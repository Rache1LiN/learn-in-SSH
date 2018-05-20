/**
 * 
 */
package edu.fjnu.service;

import java.util.List;



/**
 * @author ASUS
 *
 */
public interface BaseService<T> {

	Long insert(T bean);

	Long delete(Long id);

	Long update(T bean);

	T load(Long id);

	List<T> list();

	Long count();

	Long countByName(String name);

	T loadByName(String name);

	List<T> pager(Long pageNum, Long pageSize);

	List<T> pagerByName(String name, Long pageNum, Long pageSize);

}
