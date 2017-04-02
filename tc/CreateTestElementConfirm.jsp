<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateTestElementConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="request" class="mydb.DatabaseBean" />
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
  String sProjectID = new String();
  String sUseCaseID=new String();
  String sFunctionPointID=new String();
  String testElementName = new String();
  long projectID=0;
  long useCaseID=0;
  long functionPointID=0;
  String sql=new String();
  ResultSet rs;
  sProjectID=(String)session.getAttribute("ProjectID");
  sUseCaseID=(String)session.getAttribute("UseCaseID");
  sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  testElementName=request.getParameter("testelement");
  projectID=Integer.parseInt(sProjectID);
  useCaseID=Integer.parseInt(sUseCaseID);
  functionPointID=Integer.parseInt(sFunctionPointID);
  testElementName=rr.replaceString(testElementName);
  testElementName=rr.restore(testElementName);
  testElementName=testElementName.trim();

  sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID+" and element_name='"+testElementName+"'";;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    session.setAttribute("Error","4.3");
%>
<script language="JavaScript">
    parent.location.href='SelectTestElement.jsp'
</script>
<%
  }
  else{

    sql="insert into tctc_element (element_id,element_name,project_id,uc_id,functionpoint_id) values(seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
    myStatement2.executeUpdate(sql);
    session.setAttribute("Temp",testElementName);
    session.setAttribute("Page","3");
    response.sendRedirect("Temp.jsp");
  }
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
