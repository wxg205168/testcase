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

function textCounter(field, countfield, maxlimit) {

  if (field.value.length > maxlimit)
    field.value = field.value.substring(0, maxlimit);
}

function testSubmit()
{
  document.forms[0].action="CreateBugTrackerConfirm.jsp";
  document.forms[0].submit();
}

function testSubmit1()
{
  document.forms[0].action="EnquireBugTracker_Right.jsp";
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
  String sql=new String();
  String sError=(String)session.getAttribute("Error");
  String dis=new String();
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement1=null;
  ResultSet rs;

  try{
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
  }
  catch(SQLException ex){
    session.setAttribute("Error","6.1");
    System.err.println("aq.executeQuery: " + ex.getMessage());
%>
<script language="JavaScript">
  parent.location.href='CreateBugTracker.jsp'
</script>
<%
  }

  if(!sError.equals("null")){
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=myStatement1.executeQuery(sql);
    if(rs.next()){
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
    rs.close();
  }
  myConn.close();
  myStatement1.close();

%>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Please input information:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
    <TR align="center" bgColor=#74A5E8>
      <TD width="150" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Frequency</TD>
      <TD width="594" align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><select name="select">
        <option>Always</option>
        <option>Random</option>
        <option>Sometimes</option>
      </select></TD>
    </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Ponderance</TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><select name="select2">
        <option>New</option>
        <option>Negligible</option>
        <option>Spelling</option>
        <option>GUI</option>
        <option>Subordination</option>
        <option>Graveness</option>
      </select></TD>
    </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Summary</TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name="textfield" type="text" size="98" maxlength="100"></TD>
    </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Detail</TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><textarea name="textarea" cols="75" rows="10" onKeyDown="textCounter(this.form.textarea,this.form.remLen,300);" onKeyUp="textCounter(this.form.textarea,this.form.remLen,300);"></textarea></TD>
    </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Provide By </TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name="textfield2" type="text" size="12" maxlength="20"></TD>
    </TR>
</TABLE>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select3.gif" width="52" height="22"  onClick="testSubmit()">&nbsp;&nbsp;&nbsp;<img src="image/but_select5.gif" width="52" height="22"  onClick="testSubmit1()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
</form>

</body>
</html>
