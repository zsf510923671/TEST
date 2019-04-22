<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
    <h1>添加联系人</h1>
    <form method="post" action="doAdd" modelAttribute="contact" >
    	姓名:<input type="text" name="cname" id="cname"><br>
    	手机:<input type="text" name="mobile" id="mobile"><br>
    	QQ:<input type="text" name="qq" id="qq"><br>
    	Email:<input type="text" name="email" id="email"><br>
    	地址:<input type="text" name="address" id="address"><br>
    	<input type="submit" value="保存"><br>
    	<input type="reset" value="重置">
    </form>
  </body>
  
  <script type="text/javascript" src="statics/js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("form").submit(function(){
  			var cname = $("#cname").val();
  			var mobile = $("#mobile").val();
  			var qq = $("#qq").val();
  			var email = $("#email").val();
  			var address = $("#address").val();
  			
  			if(cname==null||cname==""){
  				alert("必须填写联系人姓名!");
  				return false;
  			}else if(mobile==null||mobile==""){
  				alert("手机号码不能为空!");
  				return false;
  			}else if(qq==null||qq==""){
  				alert("请正确填写QQ!");
  				return false;
  			}else if(email==null||email==""){
  				alert("请正确填写Email!");
  				return false;
  			}
  			return true;
  		});
  	});
  		
  </script>
</html>
