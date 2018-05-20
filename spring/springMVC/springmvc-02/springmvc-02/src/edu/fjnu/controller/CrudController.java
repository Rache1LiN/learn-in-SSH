/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author ASUS
 *
 */
public abstract class CrudController extends BaseController {

	public CrudController(){
		super();
	}
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	protected ModelAndView doCrud(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 调用基类的处理
		ModelAndView mView= super.handleBase(request, response);

		// 取得操作类型
		String oper= request.getParameter("oper");
		if(oper== null) {
			oper= "";
		} else{
			oper= oper.trim().toLowerCase();
		}

		// 根据不同的操作类型,调用不同的处理方法
		switch(oper) {
		case "list":
			mView= list(request, response); // 列表页面
			break;
		case "listdeal":
			mView= listDeal(request, response); // 列表处理
			break;
		case "insert":
			mView= insert(request, response); // 添加页面
			break;
		case "insertdeal":
			mView= insertDeal(request, response); // 添加处理
			break;
		case "update":
			mView= update(request, response); // 修改页面
			break;
		case "updatedeal":
			mView= updateDeal(request, response); // 修改处理
			break;
		case "detail":
			mView= detail(request, response); // 详情页面
			break;
		case "detaildeal":
			mView= detailDeal(request, response); // 详情处理
			break;
		case "deletedeal":
			mView= deleteDeal(request, response); // 删除处理
			break;
		default:
			mView= list(request, response); //    列表页面 : 默认
			break;
		}
		return mView;
	}
	protected abstract ModelAndView list(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView listDeal(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView insert(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView insertDeal(HttpServletRequest request, HttpServletResponse response);
	
	protected abstract ModelAndView delete(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView deleteDeal(HttpServletRequest request, HttpServletResponse response);
	
	protected abstract ModelAndView update(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView updateDeal(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView detail(HttpServletRequest request, HttpServletResponse response);

	protected abstract ModelAndView detailDeal(HttpServletRequest request, HttpServletResponse response);
	

}
