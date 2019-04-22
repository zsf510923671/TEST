<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>在线通讯录</h1>
    
    <form action="index">
    	查找联系人:<input type="text" name="cname" id="cname"><input type="submit" value="查找">
    </form>
    
    <a href="add">添加联系人</a>
    
    <table border="1">
    	<tr>
    		<th>序号</th>
    		<th>姓名</th>
    		<th>手机</th>
    		<th>QQ</th>
    		<th>Email</th>
    		<th>地址</th>
    	</tr>
    	<c:forEach var="contact" items="${list }" varStatus="i">
    	<tr 
    		<c:if test="${i.index%2==0 }">style="background-color:pink"</c:if>>
    		<td>${i.index+1 }</td>
    		<td><a href="update?id=${contact.id }">${contact.cname }</a></td>
    		<td>${contact.mobile }</td>
    		<td>${contact.qq }</td>
    		<td>${contact.email }</td>
    		<td>${contact.address }</td>
    	</tr>	
    	</c:forEach>
    </table>
    	<a href="index?pageNo=1&cname=${cname }">首页</a>
    	<c:if test="${page.pageNo>1 }"><a href="index?pageNo=${page.pageNo-1}&cname=${cname }">上一页</a></c:if>
    	<c:if test="${page.pageNo<page.pageSum }"><a href="index?pageNo=${page.pageNo+1}&cname=${cname }">下一页</a></c:if>
    	<a href="index?pageNo=${page.pageSum }&cname=${cname }">末页</a>
    	第${page.pageNo }/共${page.pageSum }页
  </body>
  
  <script type="text/javascript" src="statics/js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
  		$(function(){
  			$("form").submit(function(){
  				var cname = $("#cname").val();
  				if(cname==null||cname==""){
  					alert("请填写搜索关键字!");
  					return false;
  				}
  				return true;
  			});
  		});
  		
  </script>
</html>
