<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>

</head>
<body bgcolor="#ffffff">

<form>
<%@ page import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
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
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();
%>

<%
  String checkName=new String();
  String textName=new String();
  String textName1=new String();
  String checkBoxResult=new String();

  String informationID=new String();
  String information=new String();
  String sql=new String();


  int number=Integer.parseInt((String)session.getAttribute("CR_Number"));

  for(int i=1;i<(number+1);i++){
    checkName="C"+i;
    textName="T"+i;
    textName1="u"+i;

    checkBoxResult=request.getParameter(checkName);

    if(checkBoxResult!=null){
      informationID=request.getParameter(textName);
      information=request.getParameter(textName1);
      information=rr.replaceString(information);
      information=information.trim();

      if(!rr.checkStringNull(information)){
        sql="update tctc_information set inf_dis='"+ information +"' where inf_id="+Integer.parseInt(informationID);
        myStatement.executeUpdate(sql);
      }
    }
  }

%>
<script language="JavaScript">
  parent.location.href='EnquireCRInfromation.jsp'
</script>
<%
    myConn.close();
    myStatement.close();
  }
%>
</form>
</body>
</html>
