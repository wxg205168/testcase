<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateUseCaseConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />
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
  String selectname = new String();
  String uc_name = new String();
  String uc_ab=new String();
  long project_id = 0;
  String sql;
  ResultSet rs;
  selectname=(String)session.getAttribute("ProjectID");
  uc_name=request.getParameter("usecase");
  uc_ab=request.getParameter("ab");
  uc_name=rr.replaceString(uc_name);
  uc_name=rr.restore(uc_name);
  uc_name=uc_name.trim();
  uc_ab=uc_ab.trim();
  uc_ab=rr.replaceString(uc_ab);

  project_id=Integer.parseInt(selectname);

  if(rr.checkString(uc_ab)){

    sql="select * from tctc_uc where project_id="+project_id+" and uc_name='"+uc_name+"'";
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","2.3");
%>
      <script language="JavaScript">
        parent.location.href='SelectUseCase.jsp'
      </script>
<%
    }
    else{

      sql="insert into tctc_uc (uc_id,uc_name,project_id,uc_ab) values(seq_tctc_uc.nextval,'" + uc_name + "'," + project_id+ ",'"+uc_ab+"')";
      myStatement2.executeUpdate(sql);
      session.setAttribute("Temp",uc_name);
      session.setAttribute("Page","1");
      response.sendRedirect("Temp.jsp");

    }
    rs.close();
  }
  else{
    session.setAttribute("Error","2.5");
%>
    <script language="JavaScript">
      parent.location.href='SelectUseCase.jsp'
    </script>
<%
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
