<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>LoginConfirm</title>
<link rel=stylesheet href="style.css" type="text/css">
</head>

<body>
<%@ page language="java" import="java.sql.*,javax.sql.*" %>

<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean"></jsp:useBean>

<%
    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();


  String name1=request.getParameter("user_id");
  String pwd1=request.getParameter("password");
  String sql="select * from tctc_employee where em_n='" + name1 + "' and em_pwd='" + pwd1 + "'";

//  ResultSet rs=tt.executeQuery(sq1);
  ResultSet rs=myStatement.executeQuery(sql);

  if(rs.next()){
    session.setMaxInactiveInterval(600);
    session.setAttribute("UserName",name1);
    session.setAttribute("ProjectName","null");
    session.setAttribute("ProjectID","null");
    session.setAttribute("UseCaseName","null");
    session.setAttribute("UseCaseID","null");
    session.setAttribute("FunctionPointName","null");
    session.setAttribute("FunctionPointID","null");
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");
    session.setAttribute("C_Number","null");
    session.setAttribute("R_Number","null");
    session.setAttribute("Temp","null");
    session.setAttribute("Error","null");
    session.setAttribute("Temp","null");
    session.setAttribute("Page","null");
    session.setAttribute("UseCasePage","null");
    session.setAttribute("CR_Number2","null");
    session.setAttribute("LoadName","null");
    rs.close();
    myConn.close();
    myStatement.close();
%>
    <jsp:forward page="SelectProject.jsp"></jsp:forward>
<%
  }
  else{
    rs.close();
    myConn.close();
    myStatement.close();

%>
    <jsp:forward page="login.htm"></jsp:forward>

<%
  }


%>

</body>
</html>
