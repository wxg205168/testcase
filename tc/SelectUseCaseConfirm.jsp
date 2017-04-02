<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
SelectUseCaseConfirm
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
  String useCaseName=new String();
  long useCaseID=0;
  String sProjectID=(String)session.getAttribute("ProjectID");
  long projectID=Integer.parseInt(sProjectID);

  textName="t"+request.getParameter("radiobutton");
  useCaseID=Integer.parseInt(request.getParameter(textName));

  sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID;
  rs=myStatement.executeQuery(sql);

  if(rs.next()){

    useCaseName=rs.getString("uc_name");
    session.setAttribute("UseCaseName",useCaseName);
    session.setAttribute("UseCaseID",String.valueOf(useCaseID));
    session.setAttribute("FunctionPointName","null");
    session.setAttribute("FunctionPointID","null");
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");
//    response.sendRedirect("SelectUseCase.jsp");
%>
<script language="JavaScript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%

  }
  else
  {
    session.setAttribute("Error","2.2");
//    response.sendRedirect("SelectUseCase.jsp");
%>
<script language="JavaScript">
  parent.location.href='SelectUseCase.jsp'
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
