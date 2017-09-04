package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 拦截器是在action对象创建后，方法未执行之前执行。比如对于查看购物车，点击链接后，本来应该进入查看购物车的页面
 * 但是可以先进行拦截，只有登录用户，才可以看
 * @author Administrator
 *
 */
public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("user");
		if(obj == null) {
			return "login";
		}else {
			return arg0.invoke();
		}
	}

}
