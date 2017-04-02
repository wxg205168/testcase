<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
</title>
</head>
<body bgcolor="#ffffff">
<%
String status=new String();
status=(String)request.getParameter("status");
session.setAttribute("STATUS",status);
%>
<script language="JavaScript">
  parent.location.href='EnquireBugTracker.jsp'
</script>
</body>
</html>