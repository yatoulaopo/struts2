<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>HTML注册表单</title></head>
<body>
<form action="${pageContext.request.contextPath}/customer_login.action" method="post">
<table>
<tr>
	<td>用户名：</td><td><input type="text" name="username" value="" /></td>
</tr>

<tr>
	<td>密码</td><td> <input type="password" name="password" value="" /></td>
</tr>
<tr>
	<td>确认密码：</td><td> <input type="password" name="repassword" value="" /></td>
</tr>
<tr>
	<td>性别：</td><td> <input type="radio" name="sex" value="男" checked=”checked” />男
<input type="radio" name="sex" value="女" />女</td>
</tr>
<tr>
	<td>城市:</td><td><select name="city">
	<option value="郑州">郑州</option>
	<option value="上海">上海</option>
	<option value="天津">天津</option>
	<option value="深圳">深圳</option>
	</select></td>
</tr>
<tr>
	<td>兴趣爱好:</td><td>
	<input type="checkbox" name="hobbies" value="阅读" />阅读 
	<input type="checkbox" name="hobbies" value="旅游" />旅游
	 <input type="checkbox" name="hobbies" value="上网" />上网
<input type="checkbox" name="hobbies" value="跑步" />跑步
 <input type="checkbox" name="hobbies" value="朗读" />朗读
  <input type="checkbox" name="hobbies" value="看电影" />看电影</td>
</tr>
<tr>
	<td>上网个人简介:</td><td> <textarea rows="5" cols="30" name="description"></textarea> </td> 
</tr>
<tr>
	<td colspan="2"><input type="submit" value="提交"/></td>
</tr>
</table>
</form>
</body>
</html>