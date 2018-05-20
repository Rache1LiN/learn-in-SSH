/**
 * 
 */
package edu.fjnu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import edu.fjnu.bean.Member;
import edu.fjnu.service.MemberService;
import edu.fjnu.util.SpringUtil;

/**
 * @author ASUS
 *
 */
public class LoginController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	MemberService coreUserService = SpringUtil.getBean(MemberService.class);
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public LoginController(){
		super();
	}
	
	protected ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		
		return mView;
	}
	
	protected ModelAndView logoutDeal(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		//������еĻỰ����
		request.getSession().invalidate();
		
		//��ת��¼����
		mView.setViewName(getRedirectLogin());
		
		return mView;
	}
	
	protected ModelAndView loginDeal(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mView = getMView("login");
		HttpSession session = request.getSession();
		
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		String validateCode = request.getParameter("validateCode");
		request.setAttribute("userName", userName);
		
		String vMsg = "";
		if(StringUtils.isEmpty(userName)){
			vMsg += "�˺Ų���Ϊ�ա�";
		}
		if(StringUtils.isEmpty(userPass)){
			vMsg += "���벻��Ϊ�ա�";
		}
		if(StringUtils.isEmpty(validateCode)){
			vMsg += "��֤�벻��Ϊ�ա�";
		}
		
		//�����֤ʧ�ܣ���ʧ�����ݷŵ��������������ת����ҳ��
		if(!StringUtils.isEmpty(vMsg)){
			request.setAttribute("msg", vMsg);
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		if(!validateCode.equals(session.getAttribute(UIConst.VALIDATE_CODE))){
			vMsg += "��֤�벻��ȷ��";
			// �����֤ʧ�ܣ���ʧ�����ݷŵ��������������ת����ҳ��
			if(!StringUtils.isEmpty(vMsg)){
				request.setAttribute("msg", vMsg);
				System.out.println(vMsg);
				return mView;
			}
		}
		Member bean = coreUserService.loadByName(userName);
		if(bean == null){
			request.setAttribute("msg", "�˻������ڡ�");
			
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		
		if(!bean.getUserPass().equals(userPass)){
			request.setAttribute("msg", "�������");
			System.out.println(vMsg);
			mView.setViewName(getDispatcherPath("login"));
			return mView;
		}
		System.out.println("��¼�ɹ���");
		
		//��¼�ɹ��󣬽���ǰ��¼�û��ŵ�session
		//����ҳ�棬����session�Ƿ�������ж��Ƿ��Ѿ���¼
		request.getSession().setAttribute(UIConst.LOGINUSER, bean);
		//��¼�ɹ��󣬾ͽ��Ƿ�ʱ����Ա�ı�ʶ������session
		if(bean.getUserName().equalsIgnoreCase("admin")){
			request.getSession().setAttribute(UIConst.ISADMIN, true);
		}
		
		// ֮��ת����mian
		mView.setViewName(getRedirectPath("Main"));
		return mView;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// ���û���Ĵ���
		ModelAndView mView = super.handleBase(request, response);
		
		// ȡ�ò�������
		String oper = request.getParameter("oper");
		
		if(oper != null && oper.equalsIgnoreCase("loginDeal")){
			//�����ύ����¼����
			mView = loginDeal(request,response);
		}else if(oper != null && oper.equalsIgnoreCase("logoutDeal")){
			//ע������
			mView = logoutDeal(request,response);
		}else{
			//��ʾ��¼����
			mView = login(request,response);
		}
		return mView;
	}

}
