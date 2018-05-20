/**
 * 
 */
package edu.fjnu.ui.win;

import edu.fjnu.bean.Member;
import edu.fjnu.bean.NewsCat;
import edu.fjnu.service.MemberService;
import edu.fjnu.service.NewsCatService;
import edu.fjnu.util.SpringUtil;

/**
 * @author ASUS
 *
 */
public class Start_Member_And_NewsCat {

	private static MemberService memberService = SpringUtil.getBean(MemberService.class);
	private static NewsCatService newsCatService = SpringUtil.getBean(NewsCatService.class);
	public static void main(String[] args){
		System.out.println("starting");
		
		Long idA1 = 1L;
		Long idA2 = 1L;
		
//		newsCatService.testTxInit();
//		newsCatService.testTxYes();
//		newsCatService.testTxNo();
		list();
		
	}
	public static void list(){
		Long idA1 = 1L;
		Long idA2 = 1L;
		
		Member bean1 = memberService.load(idA1);
		NewsCat bean2 = newsCatService.load(idA2);
		
		System.out.println("id为"+idA1+"的会员信息如下：");
		System.out.println(bean1.getUserName()+"\t"+bean1.getRemark());
		
		System.out.println("id为"+idA2+"的类目信息如下：");
		System.out.println(bean2.getCatName()+"\t"+bean2.getRemark());
		
	}
}
