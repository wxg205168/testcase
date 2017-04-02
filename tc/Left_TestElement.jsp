<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title></title>
<style type="text/css">
<!--
body {
	background-image: url(image/left_bg.jpg);
	margin-left: 0px;
	margin-top: 0px;
}
.style2 {
	font-size: 18px;
	font-weight: bold;
	color: #FFFFFF;
}
-->
</style>
</head>

<body>
<%@ page language="java" import="java.util.Enumeration" %>
<jsp:useBean id="rr" scope="page" class="managestring.mystring" />

<%
  Enumeration ss=session.getAttributeNames();

  if(!ss.hasMoreElements()){
%>
<script LANGUAGE="javascript">
  parent.location.href='login.htm'
</script>
<%
  }
  else{
%>

<%
  String temp;
%>
<table width="180" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="10">&nbsp;</td>
    <td width="170"><span class="style2"> Project:</span></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
<%
  temp=new String();
  temp=(String)session.getAttribute("ProjectName");
  if(temp.equals("null")){
    temp="N.A.";
  }
%>
    <td height="50"><%=rr.replace(temp) %></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td> <span class="style2">Usecase:</span></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
<%
  temp=new String();
  temp=(String)session.getAttribute("UseCaseName");
  if(temp.equals("null")){
    temp="N.A.";
  }
%>
    <td height="50"><%=rr.replace(temp) %></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><span class="style2">FunctionPoint:</span></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
<%
  temp=new String();
  temp=(String)session.getAttribute("FunctionPointName");
  if(temp.equals("null")){
    temp="N.A.";
  }
%>
    <td height="50"><%=rr.replace(temp) %></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><span class="style2">TestElement:</span></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
<%
  temp=new String();
  temp=(String)session.getAttribute("TestElementName");
  if(temp.equals("null")){
    temp="N.A.";
  }
%>
    <td height="50"><%=rr.replace(temp) %></td>
  </tr>
</table>

<%
  }
%>
</body>
</html>
