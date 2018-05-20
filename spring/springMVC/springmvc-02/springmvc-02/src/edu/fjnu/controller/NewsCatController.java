/**
 * 
 */
package edu.fjnu.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import edu.fjnu.bean.NewsCat;
import edu.fjnu.common.PagerItem;
import edu.fjnu.common.SysFun;
import edu.fjnu.service.NewsCatService;
import edu.fjnu.util.SpringUtil;

/**
 * @author ASUS
 *
 */
public class NewsCatController extends CrudController {
	private static final long serialVersionUID = -8982711103557870431L;
	
	NewsCatService newsCatService = SpringUtil.getBean(NewsCatService.class);
	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#list(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public NewsCatController(){
		super();
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request ,HttpServletResponse response){
		ModelAndView mView= super.handleBase(request, response);

		if(!checkLogin(request, response)) {
		// ��ת����¼ҳ��
			mView.setViewName(getRedirectPath("login"));
			return mView;
		}
		try {
			mView= doCrud(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mView;
	}
	@Override
	protected ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "list");

		List<NewsCat> vList= null;

		// ��ҳ����1. ����PagerIter����, ����url��������pagesize��pageindex
			PagerItem pagerItem= new PagerItem();
			pagerItem.parsePageSize(request.getParameter(pagerItem.getParamPageSize()));
			pagerItem.parsePageNum(request.getParameter(pagerItem.getParamPageNum()));
		// ��ҳ����2.1. ����������   ���ҷ������������м�¼�� ***** count()Ҫ����ʵ�ʻ�����������
			Long rowCount= newsCatService.count();
		// ��ҳ����2.2. ����¼������pagerItem���Ա���з�ҳ�ĸ������
			pagerItem.changeRowCount(rowCount);
		// ��ҳ����2.3.    �����ݿ�ȡָ����ҳ������ ***** pager()Ҫ����ʵ�ʻ�����������
			vList= newsCatService.pager(pagerItem.getPageNum(), pagerItem.getPageSize());
		// ��ҳ����2.4. ����ҳ�����תurl
			pagerItem.changeUrl(SysFun.generalUrl(request.getRequestURI(), request.getQueryString()));
		// ��ҳ����3. ����ҳ����,�ŵ�������,�Ա�ҳ����Է���
			request.setAttribute("pagerItem", pagerItem);

			request.setAttribute("dataList", vList);
		// ת�����б�ҳ��
			mView.setViewName(getDispatcherPath("NewsCat", "list"));
			return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#listDeal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView listDeal(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		ModelAndView mView= getMView("NewsCat", "list");
		String catName= request.getParameter("catName");
		request.setAttribute("catName", catName);
		if(!SysFun.isNullOrEmpty(catName)) {
			catName= catName.trim();
		} else{
			catName= "";
		}
		List<NewsCat> vList= null;
		// ��ҳ����1. ����PagerIter����, ����url��������pagesize��pageindex
		PagerItem pagerItem= new PagerItem();
		pagerItem.parsePageSize(request.getParameter(pagerItem.getParamPageSize()));
		pagerItem.parsePageNum(request.getParameter(pagerItem.getParamPageNum()));
		// ��ҳ����2.1. ����������   ���ҷ������������м�¼�� ***** count()Ҫ����ʵ�ʻ�����������
		Long rowCount= newsCatService.countByName(catName);
		// ��ҳ����2.2. ����¼������pagerItem���Ա���з�ҳ�ĸ������
		pagerItem.changeRowCount(rowCount);
		// ��ҳ����2.3.    �����ݿ�ȡָ����ҳ������ ***** pager()Ҫ����ʵ�ʻ�����������
		vList= newsCatService.pagerByName(catName, pagerItem.getPageNum(), pagerItem.getPageSize());
		// ��ҳ����2.4. ����ҳ�����תurl
		pagerItem.changeUrl(SysFun.generalUrl(request.getRequestURI(), request.getQueryString()));
		// ��ҳ����3. ����ҳ����,�ŵ�������,�Ա�ҳ����Է���
		request.setAttribute("pagerItem", pagerItem);

		request.setAttribute("dataList", vList);
		// ת�����б�ҳ��
		mView.setViewName(getDispatcherPath("NewsCat", "list"));
		return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#insert(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView insert(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "insert");
		return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#insertDeal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView insertDeal(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "insert");
		// ***** Servlet��doxxx�����е�6����׼���󣨺�request��response��
		// ��request���ȡsession�����application����
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		/* 
		----------------------------------------------------------------- */

		String catName= request.getParameter("catName");
		String catDesc= request.getParameter("catDesc");
		// Ϊ��������ҳ�����ԭ���ľ�ֵ,��Ҫ����ֵ�ŵ�������,ҳ���н��л�ȡ
		request.setAttribute("catName", catName);
		request.setAttribute("catDesc", catDesc);
		String vMsg= "";
		if(SysFun.isNullOrEmpty(catName)) {
			vMsg+= "���Ʋ���Ϊ�ա�";
		}
		if(SysFun.isNullOrEmpty(catDesc)) {
			vMsg+= "��������Ϊ�ա�";
		}
		// �����֤ʧ��,��ʧ�����ݷŵ����������,��ת����ҳ��
		if(!SysFun.isNullOrEmpty(vMsg)) {
			request.setAttribute("msg", vMsg);
			System.out.println(vMsg);
			return mView;
		}

		NewsCat bean= new NewsCat();
		bean.setCatName(catName);
		bean.setCatDesc(catDesc);
		bean.setParentId(0L);
		Long result= 0L;
		try{
			result= newsCatService.insert(bean);
		} catch(Exception e) {
			vMsg+= "���ʧ�ܣ�ԭ��"+ e.getMessage();
		}
		if(result> 0) {
			mView.setViewName(getDispatcherPath("Go", "preload"));
			return mView;
		} else{
			request.setAttribute("msg", vMsg);
			return mView;
		}
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#delete(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "delete");
		return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#deleteDeal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView deleteDeal(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "delete");
		/* 
		----------------------------------------------------------------- */
		// ȡ���������ٸ�����������ȡ��¼
		String vId= request.getParameter("id");

		if(!SysFun.isNullOrEmpty(vId)) {
		
			Long iId= SysFun.parseLong(vId);
			Long result= newsCatService.delete(iId);
			if(result> 0) {
			System.out.print("ok");
				mView.setViewName(getDispatcherPath("Go", "ok"));
				return mView;
			}
		}
		mView.setViewName(getDispatcherPath("Go", "no"));
		return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#update(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "update");
		// ***** Servlet��doxxx�����е�6����׼���󣨺�request��response��
		// ��request���ȡsession�����application����
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		// ȡ���������ٸ�����������ȡ��¼
		String vId= request.getParameter("id");
		if(!SysFun.isNullOrEmpty(vId)) {

			Long iId= SysFun.parseLong(vId);
			NewsCat bean= newsCatService.load(iId);
			
			if(bean!= null) {
			// ʹ�ö���������
			// request.setAttribute("bean", bean);
		
			// Ϊ��������ҳ�����ԭ���ľ�ֵ,��Ҫ����ֵ�ŵ�������,ҳ���н��л�ȡ
				request.setAttribute("catId", bean.getCatId());
				request.setAttribute("catName", bean.getCatName());
				request.setAttribute("catDesc", bean.getCatDesc());
			// ת�����б�ҳ��
				return mView;
			}
		}

		mView.setViewName(getDispatcherPath("Go", "preload"));
		return mView;
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#updateDeal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView updateDeal(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "update");
		// ***** Servlet��doxxx�����е�6����׼���󣨺�request��response��
		// ��request���ȡsession�����application����
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		/* 
		----------------------------------------------------------------- */

		String catId= request.getParameter("catId");
		String catName= request.getParameter("catName");
		String catDesc= request.getParameter("catDesc");

		// Ϊ��������ҳ�����ԭ���ľ�ֵ,��Ҫ����ֵ�ŵ�������,ҳ���н��л�ȡ
		request.setAttribute("catId", catId);
		request.setAttribute("catName", catName);
		request.setAttribute("catDesc", catDesc);
		String vMsg= "";
		if(SysFun.isNullOrEmpty(catId)) {
			vMsg+= "��������Ϊ�ա�";
		}
		if(SysFun.isNullOrEmpty(catName)) {
			vMsg+= "���Ʋ���Ϊ�ա�";
		}
		if(SysFun.isNullOrEmpty(catDesc)) {
			vMsg+= "��������Ϊ�ա�";
		}
		Long iId= SysFun.parseLong(catId);
		NewsCat bean= newsCatService.load(iId);

		if(bean== null) {
			vMsg+= "��¼�����ڡ�";
		}
		
		// �����֤ʧ��,��ʧ�����ݷŵ����������,��ת����ҳ��
		if(!SysFun.isNullOrEmpty(vMsg)) {
			request.setAttribute("msg", vMsg);
			System.out.println(vMsg);
			return mView;
		}

		bean.setCatName(catName);
		bean.setCatDesc(catDesc);
		Long result= 0L;
		try{
			result= newsCatService.update(bean);
		} catch(Exception e) {
			vMsg+= "�޸�ʧ�ܣ�ԭ��"+ e.getMessage();
		}

		if(result> 0) {
			mView.setViewName(getDispatcherPath("Go", "preload"));
			return mView;
		} else{
			request.setAttribute("msg", vMsg);
			return mView;
		}

	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#detail(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView detail(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "detail");
		// ***** Servlet��doxxx�����е�6����׼���󣨺�request��response��
		// ��request���ȡsession�����application����
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();

		// ȡ���������ٸ�����������ȡ��¼
		String vId= request.getParameter("id");

		if(!SysFun.isNullOrEmpty(vId)) {

			Long iId= SysFun.parseLong(vId);
			NewsCat bean= newsCatService.load(iId);

			if(bean!= null) {
				// ʹ�ö���������
				// request.setAttribute("bean", bean);

				// Ϊ��������ҳ�����ԭ���ľ�ֵ,��Ҫ����ֵ�ŵ�������,ҳ���н��л�ȡ
				request.setAttribute("catId", bean.getCatId());
				request.setAttribute("catName", bean.getCatName());
				request.setAttribute("catDesc", bean.getCatDesc());
				// ת�����б�ҳ��
				return mView;
			}

		}
		mView.setViewName(getDispatcherPath("Go", "preload"));
		return mView;

	}

	/* (non-Javadoc)
	 * @see edu.fjnu.controller.CrudController#detailDeal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView detailDeal(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mView= getMView("NewsCat", "detail");
		return mView;
	}

}
