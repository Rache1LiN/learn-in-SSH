/**
 * 
 */
package edu.fjnu.ui.win;

import java.util.List;

import edu.fjnu.bean.Member;
import edu.fjnu.service.MemberService;
import edu.fjnu.util.SpringUtil;

/**
 * @author ASUS
 *
 */
public class Start_Member {

	public static MemberService memberService = SpringUtil.getBean(MemberService.class);
	
	public static void main(String[] args){
//		memberService.testTxInit();
//		memberService.testTxYes();
//		memberService.testTxNo();
		list();
	}
	
	public static void list(){
		
		List<Member> list = memberService.list();
		
		for(Member bean: list){
			System.out.println(bean.getUserId()+"\t"+bean.getUserName()+"\t"+bean.getRemark()+"\t");
		}
	}
}
