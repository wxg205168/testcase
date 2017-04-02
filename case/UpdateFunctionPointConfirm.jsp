<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
UpdateFunctionPointConfirm
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

    String sql=new String();
    ResultSet rs=null;
    String textName=new String();
    String textName1=new String();
    String functionPointName=new String();
    long functionPointID=0;

    textName="t"+request.getParameter("radiobutton");
    textName1="u"+request.getParameter("radiobutton");
    functionPointID=Integer.parseInt(request.getParameter(textName));
    functionPointName=(String)request.getParameter(textName1);
    functionPointName=rr.replaceString(functionPointName);
    functionPointName=rr.restore(functionPointName);
    functionPointName=functionPointName.trim();

    if(!rr.checkStringNull(functionPointName)){
      sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID;
      rs=myStatement1.executeQuery(sql);

      if(rs.next()){
        if(((String)request.getParameter(textName)).equals((String)session.getAttribute("FunctionPointID"))){

          session.setAttribute("FunctionPointName",functionPointName);
        }

        sql="update tctc_function_point set fun_n='"+functionPointName+"' where fun_p_id="+functionPointID;
        myStatement2.executeUpdate(sql);
      }
      else{
        session.setAttribute("Error","3.2");
      }
      rs.close();
    }
    else{
      session.setAttribute("Error","3.5");
    }

%>
<script language="JavaScript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%

    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</body>
</html>
