<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="tt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<frameset rows="80,*">
	   <frame name="top" src="${pageContext.request.contextPath}static/frame/top.jsp">
	   <frameset cols="150,*" id="main">
	      <frame src="${pageContext.request.contextPath}static/frame/left.jsp"> 
	     <frame name="right" src="${pageContext.request.contextPath}static/frame/right.jsp">
	   </frameset>
	</frameset>
<body> 
</body>
</html>