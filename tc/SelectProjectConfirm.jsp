<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
SelectProjectConfirm
</title>
</head>
<body bgcolor="#ffffff">
<form>

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
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
  String textName=new String();
  String projectName=new String();
  long projectID=0;
  textName="t"+request.getParameter("radiobutton");
  String sProjectID=request.getParameter(textName);

  projectID=Integer.parseInt(sProjectID);

  String sql=new String();
  ResultSet rs;

  sql="select pro_id,pro_n,pro_l from tctc_project where pro_id="+projectID;
  rs=myStatement.executeQuery(sql);
  if(rs.next()){
    projectName=rs.getString("pro_n");

    session.setAttribute("ProjectName",projectName);
    session.setAttribute("ProjectID",String.valueOf(projectID));
    session.setAttribute("UseCaseName","null");
    session.setAttribute("UseCaseID","null");
    session.setAttribute("FunctionPointName","null");
    session.setAttribute("FunctionPointID","null");
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");

    rs.close();
//    response.sendRedirect("SelectProject.jsp");
%>
<script language="JavaScript">
  parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else
  {
    rs.close();
    session.setAttribute("Error","1");
//    response.sendRedirect("SelectProject.jsp");
%>
<script language="JavaScript">
  parent.location.href='SelectProject.jsp'
</script>
<%

  }
%>
<%
    myConn.close();
    myStatement.close();
  }
%>
</form>

</body>
</html>
