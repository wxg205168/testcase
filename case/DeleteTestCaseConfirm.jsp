<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
DeleteTestCaseConfirm
</title>
</head>
<body bgcolor="#ffffff">
<%@ page import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />

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
  String checkBoxName=new String();
  String hideName=new String();
  String checkBoxResult=new String();
  String testCaseID=new String();
  String sql=new String();

  int number=Integer.parseInt((String)session.getAttribute("CR_Number"));

  for(int i=1;i<(number+1);i++){
    checkBoxName="C"+i;
    hideName="H"+i;

    checkBoxResult=request.getParameter(checkBoxName);

    if(checkBoxResult!=null){
      testCaseID=request.getParameter(hideName);
      sql="delete from tctc_test_case where test_case_id="+Integer.parseInt(testCaseID);
      myStatement.executeUpdate(sql);

    }
  }
%>
<script language="JavaScript">
  parent.location.href='EnquireTestCase1.jsp'
</script>
<%
    myConn.close();
    myStatement.close();
  }
%>

</body>
</html>
