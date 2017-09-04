<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 值栈 -->
<s:property value="'haha'.length()"/>
<s:debug></s:debug>
<!-- 获取值栈中的值的第一种方式：stack.set(String,Object); -->
<s:property value="杨巧珍"/><br/>
------------------------------------------
<!-- 获取值栈中的值的第二种方式：stack.push(Object) -->
<s:property value="​[0].top"/>
<s:property value="​[1].top"/><br/>
----------------------------------------------
<!-- 第3种方式：字符串 -->
<s:property value="name"/><br/>
<!-- 第3种方式：对象 -->
<s:property value="user.name"/>
<s:property value="user.city"/>
<s:property value="user.country"/><br/>
<!-- 第3种方式：list集合方式一 -->
<s:property value="list[0].name"/>
<s:property value="list[0].city"/>
<s:property value="list[0].country"/><br/>
<!-- 第3种方式：list集合方式二 -->
<s:iterator value="list">
	<s:property value="name"/>
	<s:property value="city"/>
	<s:property value="country"/>
</s:iterator><br/>
<!-- 第3种方式：list集合方式三----注意：这种方式，会自动把每一个对象存入值栈的context部分，也就是变成map方式 -->
<s:iterator value="list" var="user">
	<s:property value="#user.name"/>
	<s:property value="#user.city"/>
	<s:property value="#user.country"/>
</s:iterator><br/>
<!-- ognl如何获取request域中的值 -->
<s:property value="#request['贝海石']"/>

</body>
</html>