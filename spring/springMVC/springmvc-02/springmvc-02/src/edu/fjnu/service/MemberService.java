/**
 * 
 */
package edu.fjnu.service;

import edu.fjnu.bean.Member;

/**
 * @author ASUS
 *
 */
public interface MemberService extends BaseService<Member> {

	Long testTxInit();

	Long testTxYes();

	Long testTxNo();
}
