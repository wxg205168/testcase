<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>

</head>
<body bgcolor="#ffffff">

<form>
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
    Statement myStatement4=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
%>

<%
  String checkName=new String();
  String textName=new String();
  String checkBoxResult=new String();

  String informationID=new String();
  String sql=new String();


  int number=Integer.parseInt((String)session.getAttribute("CR_Number"));

  for(int i=1;i<(number+1);i++){
    checkName="C"+i;
    textName="T"+i;

    checkBoxResult=request.getParameter(checkName);

    if(checkBoxResult!=null){
      informationID=request.getParameter(textName);
      sql="delete from tctc_information where inf_id="+Integer.parseInt(informationID);
      myStatement1.executeUpdate(sql);

      informationID="%"+informationID+"%";

      sql="delete from tctc_information where  inf_dis like '"+informationID+"'";
      myStatement2.executeUpdate(sql);

      sql="delete from tctc_test_case where  condition like '"+informationID+"'";
      myStatement3.executeUpdate(sql);

      sql="delete from tctc_test_case where  result like '"+informationID+"'";
      myStatement4.executeUpdate(sql);

    }
  }

%>
<script language="JavaScript">
  parent.location.href='EnquireCRInfromation.jsp'
</script>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
  }
%>
</form>
</body>
</html>
