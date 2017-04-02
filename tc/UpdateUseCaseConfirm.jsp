<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
UpdatetUseCaseConfirm
</title>
</head>
<body bgcolor="#ffffff">
<form action="SelectUseCase.jsp">


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
    ResultSet rs;
    String textName=new String();
    String textName1=new String();
    String textName2=new String();
    String useCaseName=new String();
    String useCaseAB=new String();
    long useCaseID=0;
    String sProjectID=(String)session.getAttribute("ProjectID");
    long projectID=Integer.parseInt(sProjectID);

    textName="t"+request.getParameter("radiobutton");
    textName1="u"+request.getParameter("radiobutton");
    textName2="uu"+request.getParameter("radiobutton");
    useCaseID=Integer.parseInt(request.getParameter(textName));
    useCaseName=(String)request.getParameter(textName1);
    useCaseAB=(String)request.getParameter(textName2);
    useCaseName=rr.replaceString(useCaseName);
    useCaseName=rr.restore(useCaseName);
    useCaseAB=rr.replaceString(useCaseAB);
    useCaseAB=rr.restore(useCaseAB);

    if(rr.checkString(useCaseAB)){

      sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID;
      rs=myStatement1.executeQuery(sql);

      if(rs.next()){

      sql="update tctc_uc set uc_name='"+useCaseName+"', uc_ab='"+useCaseAB+"' where uc_id="+useCaseID;
      myStatement2.executeUpdate(sql);

      }
      else{
        session.setAttribute("Error","2.2");
      }
      rs.close();
    }
    else{
      session.setAttribute("Error","2.5");
    }
%>

<script language="JavaScript">
  parent.location.href='SelectUseCase.jsp'
</script>

<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</form>
</body>
</html>
