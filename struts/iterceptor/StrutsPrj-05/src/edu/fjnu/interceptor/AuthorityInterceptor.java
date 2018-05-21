/**
 * 
 */
package edu.fjnu.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import edu.fjnu.bean.User;

/**
 * @author ASUS
 *
 */
public class AuthorityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		User user=(User)session.get("USER");
		if(user!= null){
			return invocation.invoke();
		}else{
			ActionContext.getContext().put("message", "ÇëÏÈµÇÂ¼");
			return Action.INPUT;
		}
	}

}
