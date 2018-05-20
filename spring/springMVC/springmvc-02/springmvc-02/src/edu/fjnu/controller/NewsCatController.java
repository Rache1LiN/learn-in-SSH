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
		// 跳转到登录页面
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

		// 分页步骤1. 创建PagerIter对象, 处理url传过来的pagesize和pageindex
			PagerItem pagerItem= new PagerItem();
			pagerItem.parsePageSize(request.getParameter(pagerItem.getParamPageSize()));
			pagerItem.parsePageNum(request.getParameter(pagerItem.getParamPageNum()));
		// 分页步骤2.1. 根据条件，   查找符合条件的所有记录数 ***** count()要根据实际换成其它方法
			Long rowCount= newsCatService.count();
		// 分页步骤2.2. 将记录数赋给pagerItem，以便进行分页的各类计算
			pagerItem.changeRowCount(rowCount);
		// 分页步骤2.3.    从数据库取指定分页的数据 ***** pager()要根据实际换成其它方法
			vList= newsCatService.pager(pagerItem.getPageNum(), pagerItem.getPageSize());
		// 分页步骤2.4. 设置页面的跳转url
			pagerItem.changeUrl(SysFun.generalUrl(request.getRequestURI(), request.getQueryString()));
		// 分页步骤3. 将分页对象,放到作用域,以便页面可以访问
			request.setAttribute("pagerItem", pagerItem);

			request.setAttribute("dataList", vList);
		// 转发到列表页面
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
		// 分页步骤1. 创建PagerIter对象, 处理url传过来的pagesize和pageindex
		PagerItem pagerItem= new PagerItem();
		pagerItem.parsePageSize(request.getParameter(pagerItem.getParamPageSize()));
		pagerItem.parsePageNum(request.getParameter(pagerItem.getParamPageNum()));
		// 分页步骤2.1. 根据条件，   查找符合条件的所有记录数 ***** count()要根据实际换成其它方法
		Long rowCount= newsCatService.countByName(catName);
		// 分页步骤2.2. 将记录数赋给pagerItem，以便进行分页的各类计算
		pagerItem.changeRowCount(rowCount);
		// 分页步骤2.3.    从数据库取指定分页的数据 ***** pager()要根据实际换成其它方法
		vList= newsCatService.pagerByName(catName, pagerItem.getPageNum(), pagerItem.getPageSize());
		// 分页步骤2.4. 设置页面的跳转url
		pagerItem.changeUrl(SysFun.generalUrl(request.getRequestURI(), request.getQueryString()));
		// 分页步骤3. 将分页对象,放到作用域,以便页面可以访问
		request.setAttribute("pagerItem", pagerItem);

		request.setAttribute("dataList", vList);
		// 转发到列表页面
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
		// ***** Servlet的doxxx方法中的6个标准对象（含request和response）
		// 从request里获取session对象和application对象
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		/* 
		----------------------------------------------------------------- */

		String catName= request.getParameter("catName");
		String catDesc= request.getParameter("catDesc");
		// 为了在输入页面回显原来的旧值,需要将旧值放到作用域,页面中进行获取
		request.setAttribute("catName", catName);
		request.setAttribute("catDesc", catDesc);
		String vMsg= "";
		if(SysFun.isNullOrEmpty(catName)) {
			vMsg+= "名称不能为空。";
		}
		if(SysFun.isNullOrEmpty(catDesc)) {
			vMsg+= "描述不能为空。";
		}
		// 如果验证失败,则将失败内容放到作用域变量,并转发到页面
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
			vMsg+= "添加失败，原因："+ e.getMessage();
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
		// 取得主键，再根据主键，获取记录
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
		// ***** Servlet的doxxx方法中的6个标准对象（含request和response）
		// 从request里获取session对象和application对象
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		// 取得主键，再根据主键，获取记录
		String vId= request.getParameter("id");
		if(!SysFun.isNullOrEmpty(vId)) {

			Long iId= SysFun.parseLong(vId);
			NewsCat bean= newsCatService.load(iId);
			
			if(bean!= null) {
			// 使用对象来回显
			// request.setAttribute("bean", bean);
		
			// 为了在输入页面回显原来的旧值,需要将旧值放到作用域,页面中进行获取
				request.setAttribute("catId", bean.getCatId());
				request.setAttribute("catName", bean.getCatName());
				request.setAttribute("catDesc", bean.getCatDesc());
			// 转发到列表页面
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
		// ***** Servlet的doxxx方法中的6个标准对象（含request和response）
		// 从request里获取session对象和application对象
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		
		/* 
		----------------------------------------------------------------- */

		String catId= request.getParameter("catId");
		String catName= request.getParameter("catName");
		String catDesc= request.getParameter("catDesc");

		// 为了在输入页面回显原来的旧值,需要将旧值放到作用域,页面中进行获取
		request.setAttribute("catId", catId);
		request.setAttribute("catName", catName);
		request.setAttribute("catDesc", catDesc);
		String vMsg= "";
		if(SysFun.isNullOrEmpty(catId)) {
			vMsg+= "主键不能为空。";
		}
		if(SysFun.isNullOrEmpty(catName)) {
			vMsg+= "名称不能为空。";
		}
		if(SysFun.isNullOrEmpty(catDesc)) {
			vMsg+= "描述不能为空。";
		}
		Long iId= SysFun.parseLong(catId);
		NewsCat bean= newsCatService.load(iId);

		if(bean== null) {
			vMsg+= "记录不存在。";
		}
		
		// 如果验证失败,则将失败内容放到作用域变量,并转发到页面
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
			vMsg+= "修改失败，原因："+ e.getMessage();
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
		// ***** Servlet的doxxx方法中的6个标准对象（含request和response）
		// 从request里获取session对象和application对象
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();

		// 取得主键，再根据主键，获取记录
		String vId= request.getParameter("id");

		if(!SysFun.isNullOrEmpty(vId)) {

			Long iId= SysFun.parseLong(vId);
			NewsCat bean= newsCatService.load(iId);

			if(bean!= null) {
				// 使用对象来回显
				// request.setAttribute("bean", bean);

				// 为了在输入页面回显原来的旧值,需要将旧值放到作用域,页面中进行获取
				request.setAttribute("catId", bean.getCatId());
				request.setAttribute("catName", bean.getCatName());
				request.setAttribute("catDesc", bean.getCatDesc());
				// 转发到列表页面
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
