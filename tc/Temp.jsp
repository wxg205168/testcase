<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
</head>
<body bgcolor="#ffffff">
<%@ page language="java" import="java.sql.*,javax.sql.*" %>
<jsp:useBean id="tt" scope="request" class="mydb.DatabaseBean" />
<form method="POST" action="UseCase.jsp">
<%
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement=null;
  myConn=ds.getConnection();
  myStatement=myConn.createStatement();

  String sPage=(String)session.getAttribute("Page");
  String temp=(String)session.getAttribute("Temp");
  String sql=new String();
  String sProjectID=new String();
  String sUseCaseID=new String();
  String sFunctionPointID=new String();
  ResultSet rs;

  if(sPage.equals("1")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sql="select uc_id from tctc_uc where project_id="+Integer.parseInt(sProjectID)+" and uc_name='"+temp+"'";
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("uc_id");

      session.setAttribute("UseCaseName",temp);
      session.setAttribute("UseCaseID",String.valueOf(id));
      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","2.4");
    }
//    response.sendRedirect("UseCase.jsp");
%>
<script language="JavaScript">
    parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else if(sPage.equals("2")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sUseCaseID=(String)session.getAttribute("UseCaseID");
    sql="select fun_p_id from tctc_function_point where pro_id="+Integer.parseInt(sProjectID)+" and uc_id=" + Integer.parseInt(sUseCaseID) +" and fun_n='"+temp+"'";
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("fun_p_id");
      session.setAttribute("FunctionPointName",temp);
      session.setAttribute("FunctionPointID",String.valueOf(id));
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","3.4");
    }
%>
<script language="JavaScript">
    parent.location.href='SelectFunctionPoint.jsp'
</script>
<%
  }
  else if(sPage.equals("3")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sUseCaseID=(String)session.getAttribute("UseCaseID");
    sFunctionPointID=(String)session.getAttribute("FunctionPointID");
    sql="select element_id,element_name from tctc_element where project_id=" +Integer.parseInt(sProjectID)+" and uc_id="+Integer.parseInt(sUseCaseID) + " and functionpoint_id="+Integer.parseInt(sFunctionPointID)+" and element_name='"+temp+"'";;
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("element_id");
      session.setAttribute("TestElementName",temp);
      session.setAttribute("TestElementID",String.valueOf(id));
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","4.4");
    }
%>
<script language="JavaScript">
    parent.location.href='SelectTestElement.jsp'
</script>
<%
  }
  myConn.close();
  myStatement.close();

%>

</form>
</body>
</html>
