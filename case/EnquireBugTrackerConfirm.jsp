<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
EnquireBugTrackerConfirm
</title>
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
document.forms[0].action="UpdateBugStatus_Right.jsp";
document.forms[0].submit();
}
</script>
<body bgcolor="#ffffff">


<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

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
    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();
%>
<%
  String textName=new String();
  String summary=new String();
  String frequency = new String();
  String ponderance = new String();
  String detail = new String();
  String confirmBy = new String();
  String bugStatus = new String();
  String updateDate = new String();
  String remark = new String();
  long bugID=0;
  textName="t"+request.getParameter("radiobutton");
  String sBugID=request.getParameter(textName);

  bugID=Integer.parseInt(sBugID);

  String sql=new String();
  ResultSet rs;

  sql="select * from tctc_bug where bug_id="+bugID;
  rs=myStatement.executeQuery(sql);
   if(rs.next()){
    summary=rs.getString("BUG_SUMMARY");
	frequency=rs.getString("BUG_FREQUENCY");
	ponderance=rs.getString("BUG_PONDERANCE");
	detail=rs.getString("BUG_DETAIL");
	confirmBy=rs.getString("BUG_CONFIRM");
	bugStatus=rs.getString("BUG_STATUS");
	updateDate=rs.getString("BUG_CONFIRM_DATE");
    bugID=rs.getLong("BUG_ID");
	remark=rs.getString("BUG_REMARK");

if (confirmBy==null){
	confirmBy="";}
	else{
		confirmBy=rs.getString("BUG_CONFIRM");}
		if (remark==null){
	remark="";}
	else{
		remark=rs.getString("BUG_REMARK");}
	session.setAttribute("BUG_ID",String.valueOf(bugID));
rs.close();
%>
<form method="post">

<table width="750" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-Create-Bug.jpg" width="285" height="46"></td>
  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Please update bug status:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>
<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
    <TR align="center" bgColor=#74A5E8>
      <TD width="150" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Frequency</TD>
	  <TD width="594" align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"><%=frequency%></TD></TR>
	  <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Ponderance</TD>
	   <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" >
	   <%=ponderance%></TD>
	   </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Summary</TD>
	  <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF"><input name="summary" type="text" readonly=true  value=<%=summary%> size="83">
	  </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Detail</TD>
	  <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" >
	  <textarea name="detail" readonly=true cols="85" rows="10"><%=detail%></textarea></TD>
    </TR>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Confirm By </TD>
	   <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name="confirm" type="text"  ize="12" maxlength="20" value=<%=confirmBy%>></TD>
    </TR>
	<TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Bug Status </TD>
	   <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" >
	   <% if (bugStatus.equals("Open")) {%>
	   <select name="selectstatus">
        <option selected>Open</option>
        <option>Fixed</option>
        <option>Close</option>
      </select>
	  <%}%>
	  <% if (bugStatus.equals("Fixed")) {%>
	   <select name="selectstatus">
        <option >Open</option>
        <option selected>Fixed</option>
        <option>Close</option>
      </select>
	  <%}%>
	  <% if (bugStatus.equals("Close")) {%>
	   <select name="selectstatus">
        <option >Open</option>
        <option >Fixed</option>
        <option selected>Close</option>
      </select>
	  <%}%>
	  </TD>
    </TR>
<TR align="center" bgColor=#74A5E8>
      <TD height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5">&nbsp;Remark</TD>
	  <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" >
	  <textarea name="textremark"
	  cols="85" rows="5" onKeyDown="textCounter(this.form.textremark,this.form.remLen,300);" onKeyUp="textCounter(this.form.textremark,this.form.remLen,300);"><%=remark%></textarea></TD>
    </TR>
	</TABLE>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select4.gif" width="52" height="22"  onClick="testSubmit()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
</form>

<%
  }
  else
  {
    rs.close();
    session.setAttribute("Error","1");
//    response.sendRedirect("SelectProject.jsp");
%>
<script language="JavaScript">
  parent.location.href='EnquireBugTracker.jsp'
</script>
<%

  }
%>
<%
    myConn.close();
    myStatement.close();
  }
%>


</body>
</html>


