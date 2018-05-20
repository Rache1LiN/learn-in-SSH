/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Member;
import edu.fjnu.dao.MemberDao;
import edu.fjnu.service.MemberService;

/**
 * @author ASUS
 *
 */

@Service("memberService")
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService{

	private MemberDao memberDao;

	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public Long testTxInit() {
		// TODO Auto-generated method stub
		String strInit = "init";
		Long idA1 = 1L;
		Long idA2 = 1L;
		
		Long idB1 = 3L;
		Long idB2 = 4L;
		
		Member beanA1 = memberDao.load(idA1);
		Member beanA2 = memberDao.load(idA2);
		Member beanB1 = memberDao.load(idB1);
		Member beanB2 = memberDao.load(idB2);
		
		beanA1.setRemark(strInit);
		beanA2.setRemark(strInit);
		beanB1.setRemark(strInit);
		beanB2.setRemark(strInit);
		
		memberDao.update(beanA1);
		memberDao.update(beanA2);
		memberDao.update(beanB1);
		memberDao.update(beanB2);
		
		return 1L;
	}

	@Override
	public Long testTxYes() {
		// TODO Auto-generated method stub
		Long result = 0L;
		String strNewTxt = "testTxYes()";
		Long idA1 = 1L;
		Long idA2 = 2L;
		try{
			Member beanA2 = memberDao.load(idA2);
			Member beanA1 = memberDao.load(idA1);
			beanA1.setRemark(strNewTxt);
			beanA2.setRemark(strNewTxt);
			
			// 1)改ID为1的remark
			memberDao.update(beanA1);
			
			// 2)除0操作，会抛出异常
			Integer numA = 0;
			Integer numB = 3 / numA;
			
			// 3)改ID为2的remark
			memberDao.update(beanA2);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return result;
	}

	@Override
	public Long testTxNo() {
		// TODO Auto-generated method stub
		Long result = 0L;
		String strNewTxt = "testTxNo()";
		Long idA1 = 1L;
		Long idA2 = 2L;
		try{
			Member beanA2 = memberDao.load(idA2);
			Member beanA1 = memberDao.load(idA1);
			beanA1.setRemark(strNewTxt);
			beanA2.setRemark(strNewTxt);
			
			// 1)改ID为1的remark
			memberDao.update(beanA1);
			
			// 2)除0操作，会抛出异常
			Integer numA = 0;
			Integer numB = 3 / numA;
			
			// 3)改ID为2的remark
			memberDao.update(beanA2);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return result;
	}

	@Override
	public Long insert(Member bean) {
		// TODO Auto-generated method stub
		return memberDao.insert(bean);
	}

	@Override
	public Long delete(Long id) {
		// TODO Auto-generated method stub
		return memberDao.delete(id);
	}

	@Override
	public Long update(Member bean) {
		// TODO Auto-generated method stub
		return memberDao.update(bean);
	}

	@Override
	public Member load(Long id) {
		// TODO Auto-generated method stub
		return memberDao.load(id);
	}

	@Override
	public List<Member> list() {
		// TODO Auto-generated method stub
		return memberDao.list();
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return memberDao.count();
	}

	@Override
	public Long countByName(String name) {
		// TODO Auto-generated method stub
		return memberDao.countByName(name);
	}

	@Override
	public Member loadByName(String name) {
		// TODO Auto-generated method stub
		return memberDao.loadByName(name);
	}

	@Override
	public List<Member> pager(Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub
		return memberDao.pager(pageNum, pageSize);
	}

	@Override
	public List<Member> pagerByName(String name, Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub
		return memberDao.pagerByName(name, pageNum, pageSize);
	}

}
