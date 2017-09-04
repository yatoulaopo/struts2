package yatou;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Customer;

public class CustomerAction extends ActionSupport{
	
	public String login() {
		//使用ActionContext对象的.getParameters()方法获取前端表单的键值对
		ActionContext context = ActionContext.getContext();
		Map<String,Object> map = context.getParameters();
		Set<String> set = map.keySet();
		for (String string : set) {
			Object[] arr = (Object[]) map.get(string);
			System.out.println(Arrays.toString(arr)+"......");
		}
		
		return "login";
	}

//	/**
//	 * 属性封装的方式，将表单数据封装到action类中
//	 */
//	private String username;
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	
//	public String login1() {
//		System.out.println(this.username);
//		return "login1";
//	}
//	/**
//	 * 模型驱动封装
//	 */
//	private Customer customer = new Customer();
//
//	@Override
//	public Customer getModel() {
//		
//		return customer;
//	}
//	public String login2() {
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("customer", customer);
//		return "login2";
//	}
//	/**
//	 * 表达式封装
//	 */
//	private Customer customer;
//
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	public String login3() {
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("customer", this.getCustomer());
//		return "login3";
//	}
	
}
