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
document.forms[0].action="SendTestSpecConfirm.jsp";
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
    Statement myStatement4=null;
    Statement myStatement5=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
%>

<form method="post">

<table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="left" valign="top"><img src="image/TT-TestSpec-List.jpg" width="285" height="46"></td>
  </tr>
</table>

<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
    <td background="image/T2.jpg">View Test Case from list:</td>
    <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
  </tr>
</table>

<TABLE width="750" border=1 cellPadding=0 cellSpacing=0
style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
  <TBODY>
    <TR align="center" bgColor=#74A5E8>
      <TD width="100" height="25" align="left" borderColorLight=#3458AC borderColorDark=#3458AC class="style5" >Test Object</TD>
      <TD width="325" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Condition</span></TD>
      <TD width="325" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Result</span></TD>
    </TR>
<%
  int noData=1;

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");

  String sql=new String();
  ResultSet rs1,rs2,rs3,rs4;
  rs4=null;

  long testCaseID=0;
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
  else{
    long projectID=Integer.parseInt(sProjectID);
    long functionPointID=0;
    String functionPointName=new String();
    String cDis = new String();
    String rDis = new String();
    int first=1;
    int first2=1;
    int first3=1;
    sUseCaseID=(String)session.getAttribute("UseCaseID");
    long useCaseID=0;
    String[] temp;
    String condition1=new String();

//   if(sUseCaseID.equals(null) || sUseCaseID.equals("null")){
//     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id";
//   }

//   else{
//     useCaseID=Integer.parseInt(sUseCaseID);
//     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id" +" and uc_id="+useCaseID;
//   }

    try{
      useCaseID=Integer.parseInt(sUseCaseID);
//      sql="select fun_p_id from tctc_test_case where pro_id=" +projectID +" and uc_id="+useCaseID + " group by fun_p_id";
      sql="select fun_p_id from tctc_function_point where pro_id="+projectID+" and uc_id="+useCaseID+" order by fun_sort_id";
    }
    catch(NumberFormatException ex){
      sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id";
    }

    rs1=myStatement1.executeQuery(sql);
    if(rs1.next())
    {
      noData=1;
      do
      {
        first=1;
        functionPointID=rs1.getLong("fun_p_id");
        sql="select fun_n from tctc_function_point where fun_p_id="+functionPointID;

        rs2=myStatement2.executeQuery(sql);
        if(rs2.next())
        {
          functionPointName=rs2.getString("fun_n");
          functionPointName=rr.replace(functionPointName);
          sql="select condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID;
          rs3=myStatement3.executeQuery(sql);
          while(rs3.next())
          {
            cDis=rs3.getString("condition");
            rDis=rs3.getString("result");

            first2=1;
            first3=1;

            temp=rr.getID(cDis);

        sql="select inf_dis from tctc_information where inf_id in ( ";
        for(int i=0;i<temp.length;i++){
          if(first2==1){
            sql=sql+Integer.parseInt(temp[i]);
            first2=0;
          }
          else{
            sql=sql+","+Integer.parseInt(temp[i]);
          }

        }
//        sql=sql+") order by inf_id";
        sql=sql+")";

        rs4=myStatement4.executeQuery(sql);
        first2=1;

        while(rs4.next()){
          condition1=rs4.getString("inf_dis");
          condition1=rr.replace(condition1);
          if(first2==1){
            cDis=condition1;
            first2=0;
          }
          else{
            cDis=cDis+"<br>"+condition1;
          }
        }

         temp=rr.getID(rDis);

         sql="select inf_dis from tctc_information where inf_id in ( ";
         for(int i=0;i<temp.length;i++){
           if(first3==1){
             sql=sql+Integer.parseInt(temp[i]);
             first3=0;
           }
           else{
             sql=sql+","+Integer.parseInt(temp[i]);
           }

         }
         sql=sql+")";

         rs4=myStatement5.executeQuery(sql);
         first3=1;

         while(rs4.next()){
           condition1=rs4.getString("inf_dis");
           condition1=rr.replace(condition1);
           if(first3==1){
             rDis=condition1;
             first3=0;
           }
           else{
             rDis=rDis+"<br>"+condition1;
           }

         }
         rs4.close();

%>

    <TR align="center" bgColor=#f8f8f8>
<%
            if(first==1){
              first=0;
%>
      <TD width="100" height="25" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC ><%=functionPointName %></TD>
<%
            }
            else{
%>
      <TD width="100" height="25" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC >&nbsp;</TD>
<%
            }
%>


      <TD width="325" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><%=cDis %></TD>
      <TD width="325" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#FFFFFF" ><%=rDis %></TD>


    </TR>
<%
          }
        }
      }while(rs1.next());
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
    <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select2.gif" width="52" height="22" onclick="testSubmit()"></td>
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
    myStatement5.close();
  }
%>
</body>
</html>
