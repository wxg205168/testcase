<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
SelectFunctionPointConfirm
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
    Statement myStatement1=null;
    Statement myStatement2=null;
    Statement myStatement3=null;
    Statement myStatement4=null;
    Statement myStatement5=null;
    Statement myStatement8=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
    myStatement8=myConn.createStatement();
%>

<%
  String sql=new String();
  ResultSet rs;
  String textName=new String();
  String functionPointName=new String();
  long functionPointID=0;

  textName="t"+request.getParameter("radiobutton");
  functionPointID=Integer.parseInt(request.getParameter(textName));


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
  sortNextID=sortID;
  sNumber=(String)session.getAttribute("functionpointNumber");


  sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    if(((String)request.getParameter(textName)).equals((String)session.getAttribute("FunctionPointID"))){

      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    sql="delete from tctc_function_point where fun_p_id="+functionPointID;
    myStatement2.executeUpdate(sql);

    sql="delete from tctc_element where functionpoint_id="+functionPointID;
    myStatement3.executeUpdate(sql);

    sql="delete from tctc_information where fun_p_id="+functionPointID;
    myStatement4.executeUpdate(sql);

    sql="delete from tctc_test_case where fun_p_id="+functionPointID;
    myStatement5.executeUpdate(sql);

    sRadioName=(String)request.getParameter("radiobutton");
    radioID=Integer.parseInt(sRadioName)+1;

    while(radioID <= Integer.parseInt(sNumber)){

      text_id_name="t"+String.valueOf(radioID);
      sElementID=(String)request.getParameter(text_id_name);
      elementID=Integer.parseInt(sElementID);

      sql="update tctc_function_point set fun_sort_id='"+sortNextID+"' where fun_p_id="+elementID;
      myStatement8.executeUpdate(sql);
      sortNextID++;
      radioID++;

    }


  }
  else
  {
    session.setAttribute("Error","3.2");

  }

%>
<script language="JavaScript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%

  rs.close();
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
    myStatement8.close();
  }
%>

</body>
</html>
