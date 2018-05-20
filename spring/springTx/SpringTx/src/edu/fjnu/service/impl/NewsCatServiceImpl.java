/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.Member;
import edu.fjnu.bean.NewsCat;
import edu.fjnu.dao.MemberDao;
import edu.fjnu.dao.NewsCatDao;
import edu.fjnu.service.NewsCatService;


/**
 * @author ASUS
 *
 */
@Service("newsCatService")
public class NewsCatServiceImpl extends BaseServiceImpl<NewsCat> implements
		NewsCatService {

	public NewsCatDao newsCatDao;
	
	public MemberDao memberDao;
	
	
	public NewsCatDao getNewsCatDao() {
		return newsCatDao;
	}

	@Autowired
	public void setNewsCatDao(NewsCatDao newsCatDao) {
		this.newsCatDao = newsCatDao;
	}

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
		
		Member beanA1 = memberDao.load(idA1);
		NewsCat beanA2 = newsCatDao.load(idA2);
		
		beanA1.setRemark(strInit);
		beanA2.setRemark(strInit);
		
		return 1L;
	}

	@Override
	public Long testTxYes() {
		// TODO Auto-generated method stub
		Long result = 0L;
		String strNewTxt = "testTxYes()";
		Long idA1 = 1L;
		Long idA2 = 1L;
		
		try{
			Member beanA1 = memberDao.load(idA1);
			NewsCat beanA2 = newsCatDao.load(idA2);
			
			beanA1.setRemark(strNewTxt);
			beanA2.setRemark(strNewTxt);
			
			memberDao.update(beanA1);
			
			Integer numA = 0;
			Integer numB = 3 / numA;
			
			newsCatDao.update(beanA2);
			
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
		Long idA2 = 1L;
		
		try{
			Member beanA1 = memberDao.load(idA1);
			NewsCat beanA2 = newsCatDao.load(idA2);
			
			beanA1.setRemark(strNewTxt);
			beanA2.setRemark(strNewTxt);
			
			memberDao.update(beanA1);
			
			Integer numA = 0;
			Integer numB = 3 / numA;
			
			newsCatDao.update(beanA2);
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return result;
	}

	@Override
	public Long insert(NewsCat bean) {
		// TODO Auto-generated method stub
		return newsCatDao.insert(bean);
	}

	@Override
	public Long delete(Long id) {
		// TODO Auto-generated method stub
		return newsCatDao.delete(id);
	}

	@Override
	public Long update(NewsCat bean) {
		// TODO Auto-generated method stub
		return newsCatDao.update(bean);
	}

	@Override
	public NewsCat load(Long id) {
		// TODO Auto-generated method stub
		return newsCatDao.load(id);
	}

	@Override
	public List<NewsCat> list() {
		// TODO Auto-generated method stub
		return newsCatDao.list();
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return newsCatDao.count();
	}

	@Override
	public Long countByName(String name) {
		// TODO Auto-generated method stub
		return newsCatDao.countByName(name);
	}

	@Override
	public NewsCat loadByName(String name) {
		// TODO Auto-generated method stub
		return newsCatDao.loadByName(name);
	}

	@Override
	public List<NewsCat> pager(Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub
		return newsCatDao.pager(pageNum, pageSize);
	}

	@Override
	public List<NewsCat> pagerByName(String name, Long pageNum, Long pageSize) {
		// TODO Auto-generated method stub
		return newsCatDao.pagerByName(name, pageNum, pageSize);
	}

}
