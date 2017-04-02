<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
UpdateTestElementConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt"  scope="page" class="mydb.DatabaseBean"/>
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

<%
  String sql=new String();
  ResultSet rs;
  String textName=new String();
  String textName1=new String();
  String testElementName=new String();
  long testElementID=0;

  textName="t"+request.getParameter("radiobutton");
  textName1="u"+request.getParameter("radiobutton");
  testElementID=Integer.parseInt(request.getParameter(textName));
  testElementName=(String)request.getParameter(textName1);
  testElementName=rr.replaceString(testElementName);
  testElementName=rr.restore(testElementName);

  sql="select * from tctc_element where element_id="+testElementID;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    if(((String)request.getParameter(textName)).equals((String)session.getAttribute("TestElementID"))){
      session.setAttribute("TestElementName",testElementName);
    }

    sql="update tctc_element set element_name='"+testElementName+"' where element_id="+testElementID;
    myStatement2.executeUpdate(sql);

  }
  else
  {
    session.setAttribute("Error","4.2");

  }

%>
<script language="JavaScript">
  parent.location.href='SelectTestElement.jsp'
</script>
<%

  rs.close();
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>

</body>
</html>
