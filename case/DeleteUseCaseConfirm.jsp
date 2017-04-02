<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
DeletetUseCaseConfirm
</title>
</head>
<body bgcolor="#ffffff">
<form action="SelectUseCase.jsp">

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
    Statement myStatement1=null;
    Statement myStatement2=null;
    Statement myStatement3=null;
    Statement myStatement4=null;
    Statement myStatement5=null;
    Statement myStatement6=null;
    Statement myStatement8=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
    myStatement6=myConn.createStatement();
    myStatement8=myConn.createStatement();
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

  String text_sort_name=new String();
  String sort_id=new String();
  int sortID=0;
  int sortNextID=0;
  String sNumber=new String();
  String sRadioName=new String();
  int radioID=0;
  String text_id_name=new String();
  String sElementID=new String();
  int elementID=0;

  //sort
  text_sort_name="s"+request.getParameter("radiobutton");
  sort_id=(String)request.getParameter(text_sort_name);
  sortID=Integer.parseInt(sort_id);


  sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    if(((String)request.getParameter(textName)).equals((String)session.getAttribute("UseCaseID"))){

      session.setAttribute("UseCaseName","null");
      session.setAttribute("UseCaseID","null");
      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    sql="delete from tctc_uc where uc_id="+useCaseID;
    myStatement2.executeUpdate(sql);

    sql="delete from tctc_function_point where uc_id="+useCaseID;
    myStatement3.executeUpdate(sql);

    sql="delete from tctc_element where uc_id="+useCaseID;
    myStatement4.executeUpdate(sql);

    sql="delete from tctc_information where uc_id="+useCaseID;
    myStatement5.executeUpdate(sql);

    sql="delete from tctc_test_case where uc_id="+useCaseID;
    myStatement6.executeUpdate(sql);

    sql="update tctc_uc set uc_sort_id=uc_sort_id-1 where uc_sort_id>"+sortID+" and project_id ="+projectID;
    myStatement8.executeUpdate(sql);


  }
  else
  {
    session.setAttribute("Error","2.2");
  }
  rs.close();

%>

<script language="JavaScript">
  parent.location.href='SelectUseCase.jsp'
</script>

<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
    myStatement6.close();
    myStatement8.close();
  }
%>
</form>
</body>
</html>
