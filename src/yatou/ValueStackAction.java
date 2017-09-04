package yatou;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import entity.User;

/**
 * 本类专门用来操作值栈
 * @author Administrator
 *ActionContext 的2个作用：
	①：获取表单数据的map：
	Map<String,Object> map = context.getParameters();
	②：获取值栈：
	ValueStack stack1 = context.getValueStack();
	ServletActionContext类的作用：
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
 */
public class ValueStackAction extends ActionSupport {
	//把对象存入值栈的第3种方式需要声明变量，并生成get方法，然后在方法内部赋值
	private String name;
	public String getName() {
		return name;
	}
	private List<User> list = new ArrayList<User>();
	public List<User> getList() {
		return list;
	}
	private User user = new User();
	public User getUser() {
		return user;
	}
	public String test() {
		ActionContext context = ActionContext.getContext();
		ValueStack stack1 = context.getValueStack();
//		ValueStack stack2 = context.getValueStack();
//		System.out.println(stack1 == stack2);
		
		//向值栈中存值的三种方式：
		stack1.set("杨巧珍", "丫头");
		//第2种方式
		stack1.push("生活");
		stack1.push("杨姐姐");
		//第3种方式最常用:给对象赋值，成员变量声明，生成get方法
		user.setName("石破天");
		user.setCity("侠客岛");
		user.setCountry("中原");
		//第3种方式：给list赋值
		for (int i = 0; i < 5; i++) {
			User user1 = new User();
			user1.setCity("北京"+i);
			user1.setName("李碧华"+i);
			user1.setCountry("china"+i);
			list.add(user1);
		}
		//第3种方式：给字符串赋值
		name = "大漠孤烟直";
		//为了在前端演示如何用ognl获取request域中的值，所以这里存入一个值
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("贝海石", "长乐帮");
		return "valueStack";
	}

}
