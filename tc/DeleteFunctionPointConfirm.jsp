<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
SelectFunctionPointConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt"  scope="page" class="mydb.DatabaseBean"/>

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

<%
  String sql=new String();
  ResultSet rs;
  String textName=new String();
  String functionPointName=new String();
  long functionPointID=0;

  textName="t"+request.getParameter("radiobutton");
  functionPointID=Integer.parseInt(request.getParameter(textName));

  sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    if(((String)request.getParameter(textName)).equals((String)session.getAttribute("FunctionPointID"))){

      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    sql="delete from tctc_function_point where fun_p_id="+functionPointID;
    myStatement2.executeUpdate(sql);

    sql="delete from tctc_element where functionpoint_id="+functionPointID;
    myStatement3.executeUpdate(sql);

    sql="delete from tctc_information where fun_p_id="+functionPointID;
    myStatement4.executeUpdate(sql);

    sql="delete from tctc_test_case where fun_p_id="+functionPointID;
    myStatement5.executeUpdate(sql);

  }
  else
  {
    session.setAttribute("Error","3.2");

  }

%>
<script language="JavaScript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%

  rs.close();
%>
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
