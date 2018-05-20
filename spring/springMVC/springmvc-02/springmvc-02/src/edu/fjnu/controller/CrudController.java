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

		// ���û���Ĵ���
		ModelAndView mView= super.handleBase(request, response);

		// ȡ�ò�������
		String oper= request.getParameter("oper");
		if(oper== null) {
			oper= "";
		} else{
			oper= oper.trim().toLowerCase();
		}

		// ���ݲ�ͬ�Ĳ�������,���ò�ͬ�Ĵ�����
		switch(oper) {
		case "list":
			mView= list(request, response); // �б�ҳ��
			break;
		case "listdeal":
			mView= listDeal(request, response); // �б���
			break;
		case "insert":
			mView= insert(request, response); // ���ҳ��
			break;
		case "insertdeal":
			mView= insertDeal(request, response); // ��Ӵ���
			break;
		case "update":
			mView= update(request, response); // �޸�ҳ��
			break;
		case "updatedeal":
			mView= updateDeal(request, response); // �޸Ĵ���
			break;
		case "detail":
			mView= detail(request, response); // ����ҳ��
			break;
		case "detaildeal":
			mView= detailDeal(request, response); // ���鴦��
			break;
		case "deletedeal":
			mView= deleteDeal(request, response); // ɾ������
			break;
		default:
			mView= list(request, response); //    �б�ҳ�� : Ĭ��
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
