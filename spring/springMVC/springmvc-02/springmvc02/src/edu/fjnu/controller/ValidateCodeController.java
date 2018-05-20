/**
 * 
 */
package edu.fjnu.controller;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import edu.fjnu.common.RandFun;
import edu.fjnu.common.ValidateCodeFun;
/**
 * @author ASUS
 *
 */
public class ValidateCodeController extends BaseController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// ������Ĵ���
		ModelAndView mView = super.handleBase(request, response);
		
		HttpSession session = request.getSession();
		
		//����˼ά���������ɵ��ַ���
		String strCode = RandFun.rand4Num().toString();
		
		session.setAttribute("validateCode", strCode);
		
		//����ַ���תΪͼƬ
		BufferedImage image = ValidateCodeFun.generalImage(strCode);
		
		//BufferedImageͼƬ����Ϊ��Ӧ�ܵ���������
		//��ֹͼ�񻺴�
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		
		//��ͼ�������Servlet�������
		ServletOutputStream outStream = response.getOutputStream();
		ImageIO.write(image,"jpeg",outStream);
		outStream.close();
		
		//ʹ��response��Ӧ����������ͼ������
		return null;
	}

}
