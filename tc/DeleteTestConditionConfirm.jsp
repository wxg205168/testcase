<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
DeleteTestConditionConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
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
    Statement myStatement1=null;
    Statement myStatement2=null;
    Statement myStatement3=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
%>

<%
  String checkName=new String();
  String textName=new String();
  String checkBoxResult=new String();

  String hidResult=new String();
  String sql=new String();
  ResultSet rs;
  String information=new String();

  int number=Integer.parseInt((String)session.getAttribute("CR_Number"));

  for(int i=1;i<(number+1);i++){
    checkName="C"+i;
    textName="T"+i;

    checkBoxResult=request.getParameter(checkName);

    if(checkBoxResult!=null){
      hidResult=request.getParameter(textName);
      sql="select inf_dis from tctc_information where inf_id="+Integer.parseInt(hidResult);
      rs=myStatement1.executeQuery(sql);
      if(rs.next()){
        information=rs.getString("inf_dis");

        sql="delete from tctc_information where inf_id="+Integer.parseInt(hidResult);
        myStatement2.executeUpdate(sql);

        sql="delete from tctc_test_case where  condition = '"+information+"'";
        myStatement3.executeUpdate(sql);
      }
    }

  }

%>
<script language="JavaScript">
  parent.location.href='DeleteTestCondition.jsp'
</script>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
  }
%>
</body>
</html>
