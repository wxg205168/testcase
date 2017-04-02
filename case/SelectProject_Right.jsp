<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Project</title>
<style type="text/css">
<!--
body {
	background-color: #F6F6F6;
	margin-left: 20px;
	margin-top: 0px;
}
.bold {FONT-WEIGHT: bold
}
.style4 {color: #FFFFFF}
.style66 {color: #FF0000}
-->
</style>
<link href="css.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style5 {color: #FFFFFF; font-weight: bold; }
-->
</style>
</head>

<script language="JavaScript">

function testSubmit()
{
document.forms[0].action="SelectProjectConfirm.jsp";
document.forms[0].submit();
}
</script>

<body>
<%@ page language="java" import="java.sql.*,java.util.Enumeration,javax.sql.*" %>

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
<form method="post" >

<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-Project-List.jpg" width="285"
height="46"></td>
  </tr>
</table>
<%
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement=null;
  myConn=ds.getConnection();
  myStatement=myConn.createStatement();


  String sql=new String();
  ResultSet rs=null;
  ResultSet rs1=null;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();

  if(sError.equals("1") || sError.equals("2.1"))
  {
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=myStatement.executeQuery(sql);
    if(rs.next())
    {
      dis=rs.getString("error_dis");

%>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg"><span class="style66">Error:<%=dis %></span></td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>
<%
    }
  }
%>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">You can select a Project form list:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>


<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px;
BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="23" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC
class="style4" >&nbsp;</TD>
      <TD width="320" align="center" borderColorLight=#3458AC borderColorDark=#3458AC
bgcolor="#74A5E8" ><span class="style5">Project Name </span></TD>
      <TD width="197" align="center" borderColorLight=#3458AC borderColorDark=#3458AC
bgcolor="#74A5E8" ><span class="style4 bold">Project Manager </span></TD>
      <TD width="200" align="center" borderColorLight=#3458AC borderColorDark=#3458AC
bgcolor="#74A5E8" ><span class="style4 bold">Project Leader </span></TD>
    </TR>
<%
  String radioName=new String();
  String textName=new String();
  String projectName=new String();
  String projectLeader=new String();
  String projectManager=new String();
  long projectID=0;
  int number=0;
  int noData=0;

//  sql="select pro_id,pro_m,pro_leader,pro_manager from project_info";
  sql="select pro_id,pro_m,pro_l,pro_n from tctc_project";
  rs=myStatement.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      projectName=rs.getString("pro_n");
      projectLeader=rs.getString("pro_l");
      projectManager=rs.getString("pro_m");
//      projectName=rs.getString("pro_m");
//      projectLeader=rs.getString("pro_leader");
//      projectManager=rs.getString("pro_manager");
      projectID=rs.getLong("pro_id");
      number=number+1;
      radioName=String.valueOf(number);
      textName="t"+String.valueOf(number);
%>
    <TR align="center" bgColor=#f8f8f8>
<%
      if(number==1){
%>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input
type="radio" name="radiobutton" value=<%=radioName %> checked="checked"></TD>
<%
      }
      else{
%>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input
type="radio" name="radiobutton" value=<%=radioName %>></TD>
<%
      }
%>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"
><%=projectName %><input type="hidden" name=<%=textName %> value=<%=projectID %>></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"
><%=projectManager %></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"
><%=projectLeader %></TD>
    </TR>
<%
    }while(rs.next());
    rs.close();
  }
  else{
    noData=0;
    rs.close();
  }
%>
  </TBODY>
</TABLE>
<%
  if(noData==1)
  {
 %>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img
src="image/but_select.gif" width="52" height="22" onClick="testSubmit()" ></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9"
height="27"></td>
  </tr>
</table>
<%
  }
%>
</form>
<%
    myConn.close();
    myStatement.close();
  }
%>
</body>
</html>
