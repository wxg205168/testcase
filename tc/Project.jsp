<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- DW6 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Test Case System</title>
<link rel="stylesheet" href="emx_nav_left.css" type="text/css" />

<style type="text/css">
<!--
.style1 {font-size: small}
.style88 {
	font-weight: bold;
	font-size: 36px;
	font-family: Arial, Helvetica, sans-serif;
}
.style6 {font-size: small}
.style8 {font-size: small}
.style11 {
	color: #3399FF;
	font-size: small;
}
.style7 {font-size:large}
.style10 {
	color: #0000FF;
	font-weight: bold;
}
.style12 {font-size: small; color: #FF0000; }
.style100 {font-size: large}
-->
</style>
</head>

<body>

<form method="post" action="SelectProjectConfirm.jsp">

<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

<div id="masthead2">
  <center>
  <h1 class="style88" id="siteName">Test Case Generator</h1>
  <div id="globalNav" class="style1">
    <img alt="" src="gblnav_left.gif" height="32" width="4" id="gnl" /> <img alt="" src="glbnav_right.gif" height="32" width="4" id="gnr" />
    <div id="globalLink1">

      <a href="Project.jsp" target="_parent" id="gl1" class="glink" >Project
      </a><a href="UseCase.jsp" target='_parent' id="gl2" class="glink" >Use Case
      </a><a href="FunctionPoint.jsp" target='_parent' id="gl3" class="glink" >Function Point
      </a><a href="TestElement.jsp" target='_parent' id="gl4" class="glink" >Test Element
      </a><a href="EnquireCRInfromation.jsp" target='_parent' id="gl5" class="glink" >Test Case Material
      </a><a href="DeleteTestCondition.jsp" target='_parent' id="gl6" class="glink" >Test Condition
      </a><a href="EnquireTestCase.jsp" target='_parent' id="gl7" class="glink" >Test Case
      </a><a href="EnquireTestSpec.jsp" target='_parent' id="gl7" class="glink" >Test Spec
      </a>
    </div>

  </div>
</center>
</div>

<div id="pagecell3">
  <!--pagecell1-->
  <img alt="" src="tl_curve_white.gif" height="6" width="6" id="tl" /> <img alt="" src="tr_curve_white.gif" height="6" width="6" id="tr" />

  <div id="col2">
    <div class="feature">
  <p></p>
      <center>

      <table width="750" border="0">
	    <tr>
		  <td align="left"><h3><label><span class="style7">Project List</span></label></h3></td>
		</tr>
		<tr><td height="30"></td></tr>

<%
  String sql=new String();
  ResultSet rs;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();


  if(sError.equals("1") || sError.equals("2.1"))
  {
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=tt.executeQuery(sql);
    if(rs.next())
    {
      dis=rs.getString("error_dis");

%>
		<tr><td align="left"><h3><label><span class="style12">Error:<%=dis %></span></label></h3></td></tr>
<%
    }
  }
%>
        <tr>
          <td align="left"><h3>
            <label><span class="style8">You can select a project from list:</span></label>
          </h3></td>
        </tr>
      </table>
      <table width="750" border="1">
        <tr>
          <td width="20">&nbsp;</td>
          <td width="452" align="left" class="style10">Project Name </td>
          <td width="130" align="left" class="style10">Project Manager </td>
          <td width="120" align="left" class="style10">Project Leader </td>
        </tr>

<%
  String radioName=new String();
  String textName=new String();
  String projectName=new String();
  String projectLeader=new String();
  String projectManager=new String();
  long projectID=0;
  int number=0;
  int noData=0;

  sql="select pro_id,pro_n,pro_r,pro_l from tctc_project";
  rs=tt.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      projectName=rs.getString("pro_n");
      projectLeader=rs.getString("pro_l");
      //projectManager=rs.getString("pro_m");
      projectID=rs.getLong("pro_id");
      number=number+1;
      radioName=String.valueOf(number);
      textName="t"+String.valueOf(number);
%>

        <tr>
<%
      if(number==1){
%>

          <td align="center"><input type="radio" name="radiobutton" value=<%=radioName %> checked="checked" /></td>
<%
      }
      else{
%>
          <td align="center"><input type="radio" name="radiobutton" value=<%=radioName %>  /></td>
<%
      }
%>

          <td align="left"><%=projectName %><input type="hidden" name=<%=textName %> value=<%=projectID %>></td>
          <td align="left"><%=projectManager %></td>
          <td align="left"><%=projectLeader %></td>
        </tr>
<%
    }while(rs.next());
    rs.close();
  }
  else{
    noData=0;
    rs.close();
  }
%>

      </table>
      <p>&nbsp;</p>
<%
  if(noData==1)
  {
 %>
      <input type="Submit" name="Submit" value="Select Project">
<%
  }
%>

      </center>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
    </div>
  </div>
  <!--end col2 -->
  <div id="pageNav">
    <div id="sectionLinks">
      <p><label><span class="style100">Project:</span></p><p><span class="style11"><%=session.getAttribute("ProjectName") %></span></label></p>
      <p><label><span class="style100">Usecase:</span></p><p><span class="style11"><%=session.getAttribute("UseCaseName") %></span></label></p>
      <p><label><span class="style100">FunctionPoint:</span></p><p><span class="style11"><%=session.getAttribute("FunctionPointName") %></span></label></p>
      <p><label><span class="style100">TestElement:</span></p><p><span class="style11"><%=session.getAttribute("TestElementName") %></span></label></p>
    </div>
  </div>
</div>
<br />
</form>
</body>
</html>
