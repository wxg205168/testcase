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
  if(confirm("Warning: The correlative information will been deleted!")){
    document.forms[0].action="DeleteTestConditionConfirm.jsp";
    document.forms[0].submit();
  }
}
function testSubmit1()
{
document.forms[1].action="CreateTestConditionConfirm.jsp";
document.forms[1].submit();
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
    Statement myStatement4=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
%>

<form method="POST">


<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-TestCondition-List.jpg" width="285" height="46"></td>
  </tr>
</table>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Select any Test Condition to delete from list:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>
<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="23" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style4" >&nbsp;</TD>
      <TD width="230" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Condition</span></TD>
    </TR>
<%
  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  String sFunctionPointID=(String)session.getAttribute("FunctionPointID");

  String sql,sql1;
  ResultSet rs,rs1,rs2,rs3;
  rs3=null;

  String checkName=new String();
  String textName=new String();

  long informationID=0;
  String information=new String();
  int number=0;


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
    String[] temp;
    String condition1=new String();
    int first=1;

    sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID;
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      noData=1;
      do{
        number++;
        informationID=rs.getLong("inf_id");
        information=rs.getString("inf_dis");

        first=1;
        temp=rr.getID(information);

        sql="select inf_dis from tctc_information where inf_id in ( ";
        for(int i=0;i<temp.length;i++){
          if(first==1){
            sql=sql+Integer.parseInt(temp[i]);
            first=0;
          }
          else{
            sql=sql+","+Integer.parseInt(temp[i]);
          }

        }
        sql=sql+")";

        rs3=myStatement2.executeQuery(sql);
        first=1;

        while(rs3.next()){
          condition1=rs3.getString("inf_dis");
          condition1=rr.replace(condition1);
          if(first==1){
            information=condition1;
            first=0;
          }
          else{
            information=information+"<br>"+condition1;
          }
        }

        rs3.close();

        checkName="C"+number;
        textName="T"+number;
%>
    <TR align="center" bgColor=#f8f8f8>
      <TD height="25" align="center" borderColorLight=#3458AC borderColorDark=#3458AC ><input type="checkbox" name=<%=checkName %> /></TD>
      <TD width="725" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><%=information %><input type = "hidden" name = <%=textName %> value =<%=informationID %> /></TD>
    </TR>
<%
      }while(rs.next());
    }
    rs.close();
    session.setAttribute("CR_Number", String.valueOf(number));

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
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select1.gif" width="52" height="22" onClick="testSubmit()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
<%
    noData=0;
  }
%>

</form>

<form method="POST">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-CreateTestCondition.jpg" width="285" height="46"></td>
  </tr>
</table>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">Create Test Condition by Test Element Condition:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1>
    <TR align="center" bgColor=#74A5E8>
      <TD width="150" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5" >Test Element</TD>
      <TD width="23" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">&nbsp;</span></TD>
      <TD width="577" align="left" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">Condition</span></TD>
    </TR>
</TABLE>

<%
  int first=1;
  int number1=0;
  int elementNumber=0;
  String ElementName=new String();
  long ElementID=0;
  long InformationID=0;
  String condition=new String();


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
    long ProjectID=Integer.parseInt(sProjectID);
    long UseCaseID=Integer.parseInt(sUseCaseID);
    long FunctionPointID=Integer.parseInt(sFunctionPointID);

    sql="select element_id,element_name from tctc_element where project_id="+ProjectID+" and uc_id="+UseCaseID+" and functionpoint_id="+FunctionPointID;
    rs1=myStatement3.executeQuery(sql);

    if(rs1.next())
    {
      do
      {
%>

<TABLE width="750" border=1>

<%

        ElementID=rs1.getLong("element_id");
        ElementName=rs1.getString("element_name");
        first=1;
        number=0;


        sql1="select inf_id,inf_dis from tctc_information where inf_type='c' and project_id="+ProjectID+" and uc_id="+UseCaseID+" and fun_p_id="+FunctionPointID+" and element_id="+ElementID;
        rs2=myStatement4.executeQuery(sql1);

        if(rs2.next())
        {
          elementNumber++;
          checkName="C"+elementNumber;

          noData=1;
          do
          {
            number++;
            condition=rs2.getString("inf_dis");
            condition=rr.replace(condition);
            InformationID=rs2.getLong("inf_id");
            textName="T"+number+checkName;

%>
    <TR align="center" bgColor=#f8f8f8>
<%
          if(first==1)
          {
            first=0;
%>
      <TD width="150" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5" bgColor=#74A5E8><%=ElementName %></TD>
      <TD width="23"  align="center" borderColorLight=#3458AC borderColorDark=#3458AC widt="23" ><input type="radio" name=<%=checkName %> value=<%=number %> checked="checked" /></TD>
<%

          }
          else
          {
%>
      <TD width="150" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5" bgColor=#74A5E8>&nbsp;</TD>
      <TD width="23"  align="center" borderColorLight=#3458AC borderColorDark=#3458AC widt="23" ><input type="radio" name=<%=checkName %> value=<%=number %> /></TD>
<%
          }
%>
      <TD width="577" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" widt="627" ><%=condition %><input type = "hidden" name = <%=textName %> value =<%=InformationID %> /></TD>
    </TR>
<%
          }while(rs2.next());
        }
        rs2.close();
%>

</TABLE>
<%
      }while(rs1.next());
      session.setAttribute("CR_Number2",String.valueOf(elementNumber));
    }
    rs1.close();

  }
%>


<%
  if(noData==1){
%>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select3.gif" width="52" height="22" onClick="testSubmit1()"></td>
    <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
    <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
  </tr>
</table>
<%
  }
%>

</form>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();

  }
%>
</body>
</html>
