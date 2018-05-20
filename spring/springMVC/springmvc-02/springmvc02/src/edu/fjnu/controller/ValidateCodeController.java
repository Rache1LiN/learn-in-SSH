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
		// 调用类的处理
		ModelAndView mView = super.handleBase(request, response);
		
		HttpSession session = request.getSession();
		
		//生成思维随机数字组成的字符串
		String strCode = RandFun.rand4Num().toString();
		
		session.setAttribute("validateCode", strCode);
		
		//随机字符串转为图片
		BufferedImage image = ValidateCodeFun.generalImage(strCode);
		
		//BufferedImage图片，作为响应管道的输入流
		//禁止图像缓存
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		
		//将图像输出到Servlet输出流中
		ServletOutputStream outStream = response.getOutputStream();
		ImageIO.write(image,"jpeg",outStream);
		outStream.close();
		
		//使用response响应流，不用视图解析器
		return null;
	}

}
