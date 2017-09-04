package yatou;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;

public class HelloAction extends ActionSupport{
	public String save() {
		User user = new User();
		user.setCity("北京");
		user.setCountry("中国");
		user.setName("张三");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", user);
		return "user";
	}
}
