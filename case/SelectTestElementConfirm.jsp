<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
SelectTestElementConfirm
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
  String testElementName=new String();
  long testElementID=0;

  textName="t"+request.getParameter("radiobutton");
  testElementID=Integer.parseInt(request.getParameter(textName));

  sql="select element_id,element_name from tctc_element where element_id="+testElementID;
  rs=myStatement.executeQuery(sql);

  if(rs.next()){

    testElementName=rs.getString("element_name");
    session.setAttribute("TestElementName",testElementName);
    session.setAttribute("TestElementID",String.valueOf(testElementID));
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");
%>
<script language="JavaScript">
    parent.location.href='EnquireCRInfromation.jsp'
</script>
<%
  }
  else
  {
    session.setAttribute("Error","4.2");
%>
<script language="JavaScript">
    parent.location.href='SelectTestElement.jsp'
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
