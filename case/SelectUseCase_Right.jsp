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
  document.forms[0].action="SelectUseCaseConfirm.jsp";
  document.forms[0].submit();
}

function testSubmit1()
{
  if(confirm("Warning: The correlative information will been deleted!")){
    document.forms[0].action="DeleteUseCaseConfirm.jsp";
    document.forms[0].submit();
  }
}

function testSubmit2()
{
  document.forms[0].action="CreateUseCasePreviousConfirm.jsp";
  document.forms[0].submit();
}

function testSubmit3()
{
  document.forms[0].action="UpdateUseCaseConfirm.jsp";
  document.forms[0].submit();
}

function testSubmit4()
{
  document.forms[0].action="CreateUseCaseConfirm.jsp";
  document.forms[0].submit();
}

</script>


<body>

<%@ page language="java" import="java.sql.*,java.util.Enumeration,javax.sql.*" %>
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
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();

%>

<form method="post">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-UseCase-List.jpg" width="285" height="46"></td>
  </tr>
</table>
<%

  String sql=new String();
  ResultSet rs;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();

  if(sError.equals("2.1") || sError.equals("2.2") || sError.equals("2.3") || sError.equals("2.4") || sError.equals("3.1") || sError.equals("2.5"))
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
    <td background="image/T2.jpg">You can select a Usecase form list:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="23" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style4" >&nbsp;</TD>
      <TD width="547" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">UseCase Name </span></TD>
      <TD width="180" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">UseCase Abbreviate</span></TD>
    </TR>
<%
  String radioName=new String();
  String textName=new String();
  String textName1=new String();
  String textName2=new String();
  String UseCaseName=new String();
  String UseCaseAB=new String();
  int sortID=0;
  String text_sort_id=new String();
  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");
%>
<script LANGUAGE="javascript">

  parent.location.href='SelectProject.jsp'

</script>

<%

  }
  else{

  long projectID=Integer.parseInt(sProjectID);
  long UseCaseID=0;

  int number=0;

  sql="select uc_id,uc_name,uc_ab,uc_sort_id from tctc_uc where project_id=" +projectID+" order by uc_sort_id";
  rs=myStatement2.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      sortID=rs.getInt("uc_sort_id");
      UseCaseID=rs.getLong("uc_id");
      UseCaseName=rs.getString("uc_name");
      UseCaseAB=rs.getString("uc_ab");
      UseCaseName=rr.replace(UseCaseName);
      UseCaseName=rr.replaceBlank(UseCaseName);
      UseCaseAB=rr.replace(UseCaseAB);
      UseCaseAB=rr.replaceBlank(UseCaseAB);

      number=number+1;
      radioName=String.valueOf(number);
      textName="t"+String.valueOf(number);
      textName1="u"+String.valueOf(number);
      textName2="uu"+String.valueOf(number);
      text_sort_id="s"+String.valueOf(number);
%>

    <TR align="center" bgColor=#f8f8f8>
<%
      if(number==1){
%>

      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input type="radio" name="radiobutton" value=<%=radioName %> checked="checked" /></TD>
<%
      }
      else{
%>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input type="radio" name="radiobutton" value=<%=radioName %> /></TD>
<%
      }
%>

      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name=<%=textName1 %> type="text" size="84" maxlength="200" value=<%=UseCaseName %>><input type="hidden" name=<%=textName %> value=<%=UseCaseID %>><input type="hidden" name=<%=text_sort_id %> value=<%=sortID %>></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name=<%=textName2 %> type="text" size="25" maxlength="25" value=<%=UseCaseAB %>></TD>
    </TR>

<%
    }while(rs.next());
    rs.close();

  }
  }
%>

  </TBODY>
</TABLE>
<%
  if(noData==1){
%>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select.gif" width="52" height="22" onClick="testSubmit()">&nbsp;&nbsp;&nbsp;<img src="image/but_select4.gif" width="52" height="22" onClick="testSubmit3()">&nbsp;&nbsp;&nbsp;<img src="image/but_select1.gif" width="52" height="22" onClick="testSubmit1()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
<%
  }

%>

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-Create-UseCase.jpg" width="285" height="46"></td>
  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Please input UseCase information:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD height="25" width="570" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">UseCase Name </span></TD>
      <TD height="25" width="180" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">UseCase Abbreviate</span></TD>
    </TR>
    <TR align="center" bgColor=#f8f8f8>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name="usecase" type="text" size="88" maxlength="200"></TD>
      <TD align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><input name="ab" type="text" size="25" maxlength="25"></TD>
    </TR>
  </TBODY>
</TABLE>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_create_previous.gif" width="105" height="22"  onClick="testSubmit2()">&nbsp;&nbsp;&nbsp;<img src="image/but_create_next.gif" width="80" height="22"  onClick="testSubmit4()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>


</form>

<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</body>
</html>
