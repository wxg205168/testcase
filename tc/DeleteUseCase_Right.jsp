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
.style7 {font-size: large}
.style8 {font-size: small}
.style12 {font-size: small; color: #FF0000; }
.style13 {
	color: #0000FF;
	font-weight: bold;
}
-->
</style>
</head>


<body>


<div id="pagecell2">
  <img alt="" src="tl_curve_white.gif" height="6" width="6" id="tl" /> <img alt="" src="tr_curve_white.gif" height="6" width="6" id="tr" />
  <div id="breadCrumb">

<form method="post" action="DeleteUseCaseConfirm.jsp">
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

  <p></p>
      <center>
	  <table width="750" border="0">
	    <tr>
		  <td align="left"><h3>
		    <label><span class="style7">UseCase List</span></label>
		  </h3></td>
		</tr>
		<tr><td height="30"></td></tr>
<%
  String sql=new String();
  ResultSet rs;
%>
	    <tr>
		  <td align="left"><h3>
		    <label><span class="style8">You can select a usecase to delete from list:</span></label>
		  </h3></td>
	   </tr>
	  </table>
      <table width="750" border="1">
        <tr>
          <td width="20">&nbsp;</td>
          <td width="710" align="left"><span class="style13">Use Name </span></td>
        </tr>
<%
  String radioName=new String();
  String textName=new String();
  String UseCaseName=new String();
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

  sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID;
  rs=tt.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      UseCaseID=rs.getLong("uc_id");
      UseCaseName=rs.getString("uc_name");
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
          <td align="center"><input type="radio" name="radiobutton" value=<%=radioName %> /></td>
<%
      }
%>

          <td align="left"><%=UseCaseName %><input type="hidden" name=<%=textName %> value=<%=UseCaseID %>></td>
        </tr>
<%
    }while(rs.next());
    rs.close();
%>
      </table>
<%
  }
%>
<%
  }

  if(noData==1){

%>
      <p>&nbsp;</p>
      <input type="Submit" name="Submit" value="Delete UseCase">
	  </center>
  <p></p>
<%
  }
%>
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
<!--end pagecell1-->

</form>
</body>
</html>
