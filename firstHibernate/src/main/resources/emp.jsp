<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%@ page import="firstHibernate.EmployeeMain" %>
   <jsp:useBean id="obj" class="firstHibernate.Employee"></jsp:useBean>
   <jsp:setProperty property="*" name="obj"/>
   
   <%
        int i = EmployeeMain.register(obj);
        if(i>=1)
        {
        	response.getWriter().write("success");
        }
        else
        	response.getWriter().write("failed");
   %>
   
   
</body>
</html>