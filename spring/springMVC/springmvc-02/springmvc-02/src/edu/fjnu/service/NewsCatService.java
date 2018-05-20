/**
 * 
 */
package edu.fjnu.service;

import edu.fjnu.bean.NewsCat;

/**
 * @author ASUS
 *
 */
public interface NewsCatService extends BaseService<NewsCat> {

	Long testTxInit();

	Long testTxYes();

	Long testTxNo();
}
