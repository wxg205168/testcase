<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title></title>
<style type="text/css">
<!--
body {
	background-color: #F6F6F6;
	margin-left: 20px;
	margin-top: 0px;
}
.bold {FONT-WEIGHT: bold
}
-->
</style>
<link href="css.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style5 {color: #FFFFFF; font-weight: bold;font-size: 16px}
.style67 {font-size: 15px}
.style66 {color: #FF0000}
-->
</style>
</head>

<script language="JavaScript">

function testSubmit()
{
document.forms[0].action="EnquireBugTrackerConfirm.jsp";
document.forms[0].submit();
}
function aaa()
{
document.forms[0].action="EnquireBugTrackerStatus.jsp";
document.forms[0].submit();
}


</script>

<body>

<%@ page language="java" import="java.sql.*,java.util.Enumeration,javax.sql.*" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

<form method="post">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-Create-Bug.jpg" width="285" height="46"></td>
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
    <td background="image/T2.jpg">Please select status: <select id="c1" name="status" onchange="aaa()">  
<% String status=(String)session.getAttribute("STATUS");
if (status==null){
	status="Open";}
	else {
		status=status;}
if (status.equals("Open")||(status==null)) {%>
        <option selected>Open</option>
        <option>Fixed</option>
		<option>Close</option>
		<%}%>
		<%if (status.equals("Fixed")) {%>
        <option >Open</option>
        <option selected>Fixed</option>
		<option>Close</option>
		<%}%>
		<%if (status.equals("Close")) {%>
        <option >Open</option>
        <option >Fixed</option>
		<option selected>Close</option>
		<%}%>
		</select></td>
<script>  

</script>  

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
bgcolor="#74A5E8" ><span class="style5">Summary </span></TD>
      <TD width="197" align="center" borderColorLight=#3458AC borderColorDark=#3458AC
bgcolor="#74A5E8" ><span class="style5 bold">Provide By </span></TD>
      <TD width="200" align="center" borderColorLight=#3458AC borderColorDark=#3458AC
bgcolor="#74A5E8" ><span class="style5 bold">Provide Date </span></TD>
    </TR>

	<%

 String radioName=new String();
 String summary = new String();
 String provideBy = new String();
 String provideDate = new String();
 int noData=0;
 int number=0;
  String textName=new String();
  long bugID=0;

 sql="select BUG_ID,bug_summary,bug_create,bug_create_date from tctc_bug where bug_status='"+status+"' order by bug_id";

  rs=myStatement.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
		summary = rs.getString("bug_summary");
		provideBy = rs.getString("bug_create");
        provideDate = rs.getString("bug_create_date");
		bugID=rs.getLong("BUG_ID");

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
><%=summary %><input type="hidden" name=<%=textName %> value=<%=bugID %>></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"
><%=provideBy %></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"
><%=provideDate %></TD>
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

%>
</body>
</html>