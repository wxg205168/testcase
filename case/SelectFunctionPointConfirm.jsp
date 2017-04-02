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
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();
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
  rs=myStatement.executeQuery(sql);

  if(rs.next()){

    functionPointName=rs.getString("fun_n");
    session.setAttribute("FunctionPointName",functionPointName);
    session.setAttribute("FunctionPointID",String.valueOf(functionPointID));
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");
%>
<script language="JavaScript">
  parent.location.href='SelectTestElement.jsp'
</script>
<%
  }
  else
  {
    session.setAttribute("Error","3.2");
%>
<script language="JavaScript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%

  }


  rs.close();
%>

<%
    myConn.close();
    myStatement.close();
  }
%>
</body>
</html>
