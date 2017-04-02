<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateFunctionPointConfirm
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

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  long projectID=0;
  long useCaseID=0;

  if(sProjectID.equals("null") || sProjectID.equals(null)){
    session.setAttribute("Error","2.1");
%>

<script LANGUAGE="javascript">
  parent.location.href='SelectProject.jsp'
</script>

<%
  }
  else if(sUseCaseID.equals("null") || sUseCaseID.equals(null)){
    session.setAttribute("Error","3.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else{
    projectID=Integer.parseInt(sProjectID);
    useCaseID=Integer.parseInt(sUseCaseID);

    String functionPointName = new String();
    String sql=new String();
    ResultSet rs;
    functionPointName=request.getParameter("functionpoint");
    functionPointName=rr.replaceString(functionPointName);
    functionPointName=rr.restore(functionPointName);
    functionPointName=functionPointName.trim();

    sql="select fun_n from tctc_function_point where pro_id="+projectID+" and uc_id=" + useCaseID +" and fun_n='"+functionPointName+"'";
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","3.3");
%>
<script language="JavaScript">
    parent.location.href='SelectFunctionPoint.jsp'
</script>
<%
    }
    else{

      sql="insert into tctc_function_point (fun_p_id,fun_n,pro_id,uc_id) values(seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')";
      myStatement2.executeUpdate(sql);
      session.setAttribute("Temp",functionPointName);
      session.setAttribute("Page","2");
      response.sendRedirect("Temp.jsp");
    }
    rs.close();
  }
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</body>
</html>
