<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
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

function isValid(form){
  if(form.textarea.value!=""){
    return true;
  }
  else{
    alert("Content can not be blank!");
    return false;
  }
}

function testSubmit()
{
  if(confirm("Warning: The correlative information will been deleted!")){
    document.forms[0].action="DeleteCRInformationConfirm.jsp";
    document.forms[0].submit();
  }
}
function testSubmit1()
{
document.forms[1].action="CreateCRInformationConfirm.jsp";
document.forms[1].submit();
}
function testSubmit2()
{
document.forms[0].action="UpdateCRInformationConfirm.jsp";
document.forms[0].submit();
}
</script>

<body>

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />
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
    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement1=null;
    Statement myStatement2=null;
    Statement myStatement3=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
%>

<form method="POST">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-TestElement-Condition-an.jpg" width="285" height="46"></td>
  </tr>
</table>

<%
  String sql=new String();
  ResultSet rs;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();

  if(sError.equals("5.1") || sError.equals("5.2") || sError.equals("5.3") || sError.equals("5.4"))
  {
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=myStatement1.executeQuery(sql);
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
    <td background="image/T2.jpg"><span class="style8">Select any TestElement Condition from list to delete</span>:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="23" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style4" >&nbsp;</TD>
      <TD width="230" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">TestElement Condition</span></TD>
    </TR>

<%
  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  String sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  String sTestElementID=(String)session.getAttribute("TestElementID");
  String checkName=new String();
  String textName=new String();
  String textName1=new String();
  String hidName=new String();
  int number=0;
  long informationID=0;
  String information=new String();

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectProject.jsp'
</script>
<%
  }
  else if(sUseCaseID.equals("null")){
    session.setAttribute("Error","3.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else if(sFunctionPointID.equals("null")){
    session.setAttribute("Error","4.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%
  }
  else{

    long functionPointID = Integer.parseInt(sFunctionPointID);
    long projectID = Integer.parseInt(sProjectID);
    long useCaseID = Integer.parseInt(sUseCaseID);
    long testElementID=0;

    if(sTestElementID.equals("null"))
    {
    }
    else
    {
      noData=1;
      testElementID = Integer.parseInt(sTestElementID);

      sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='c' and project_id="+projectID+" and uc_id="+useCaseID+" and element_id="+testElementID;
      rs=myStatement2.executeQuery(sql);

      if(rs.next()){
        do{
          number=number+1;
          informationID=rs.getLong("inf_id");
          information=rs.getString("inf_dis");
          information=rr.restoreString(information);

          checkName="C"+number;
          textName="T"+number;
          textName1="u"+number;

%>
    <TR align="center" bgColor=#f8f8f8>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input type="checkbox" name=<%=checkName %>></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><textarea name=<%=textName1 %> cols="100" rows="3"><%=information %></textarea><input type = "hidden" name = <%=textName %> value =<%=informationID %> /></TD>
    </TR>
<%
        }while(rs.next());

      }
    }
%>
  </TBODY>
</TABLE>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg"><span class="style8">Select any result from list to delete</span>:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="23" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style4" >&nbsp;</TD>
      <TD width="160" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Result</span></TD>
    </TR>
<%
    sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='r' and project_id="+projectID+" and uc_id="+useCaseID;
    rs=myStatement3.executeQuery(sql);

    if(rs.next()){
      noData=1;

      do{
        number=number+1;
        informationID=rs.getLong("inf_id");
        information=rs.getString("inf_dis");
        information=rr.restoreString(information);

        checkName="C"+number;
        textName="T"+number;
        textName1="u"+number;

%>
    <TR align="center" bgColor=#f8f8f8>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input type="checkbox" name=<%=checkName %>></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><textarea name=<%=textName1 %> cols="100" rows="3"><%=information %></textarea><input type = "hidden" name = <%=textName %> value =<%=informationID %> /></TD>
    </TR>
<%
      }while(rs.next());
    }
    rs.close();
    session.setAttribute("CR_Number", String.valueOf(number));
%>
  </TBODY>
</TABLE>
<%
  if(noData==1){
%>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select4.gif" width="52" height="22" onClick="testSubmit2()">&nbsp;&nbsp;&nbsp;&nbsp;<img src="image/but_select1.gif" width="52" height="22" onClick="testSubmit()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
<%
      }
  }
%>

</form>

<form method="POST" onSubmit="return isValid(this);">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-CreateTestMaterial.jpg" width="285" height="46"></td>
  </tr>
</table>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Please input information:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="50" height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC class="style4" ><span class="style5">Type</span></TD>
      <TD width="220" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">
<%
  String type=(String)session.getAttribute("Type");
  if(type.equals("c")){
%>
            <input type="radio" name="radiobutton" value="1"  checked="checked"/>
            <span class="style13">Condition</span>
            <input type="radio" name="radiobutton" value="2" />
            <span class="style13">Result</span>
<%
  }
  else{
%>
            <input type="radio" name="radiobutton" value="1" />
            <span class="style13">Condition </span>
            <input type="radio" name="radiobutton" value="2"  checked="checked" />
            <span class="style13">Result</span>
<%
  }
%>
	  </span></TD>
    </TR>
    <TR align="center" bgColor=#f8f8f8>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=#74A5E8 class="style4" ><span class="style5">Detail</span></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><textarea name="textarea" cols="96" rows="3"></textarea></TD>
    </TR>
  </TBODY>
</TABLE>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select3.gif" width="52" height="22" onClick="testSubmit1()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>

</form>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
  }
%>
</body>
</html>
