<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
DeleteTestElementConfirm
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
    Statement myStatement6=null;
    Statement myStatement7=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
    myStatement6=myConn.createStatement();
    myStatement7=myConn.createStatement();
%>

<%
  String sql=new String();
  ResultSet rs,rs1;
  String textName=new String();
  String testElementName=new String();
  long testElementID=0;
  long informationID=0;
  String sInformationID=new String();
  String[] inforID;
  int num=0;
  int i=0;

  textName="t"+request.getParameter("radiobutton");
  testElementID=Integer.parseInt(request.getParameter(textName));

  sql="select * from tctc_element where element_id="+testElementID;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    if(((String)request.getParameter(textName)).equals((String)session.getAttribute("TestElementID"))){

      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    sql="select count(*) from tctc_information where element_id="+testElementID+" and inf_type='c'";
    rs1=myStatement2.executeQuery(sql);

    if(rs1.next()){
      num=rs1.getInt("count(*)");
    }

    inforID=new String[num];

    if(num>0){
      sql="select inf_id from tctc_information where element_id="+testElementID+" and inf_type='c'";
      rs1=myStatement3.executeQuery(sql);
      if(rs1.next()){
        do{
          informationID=rs1.getLong("inf_id");
          sInformationID="%"+String.valueOf(informationID)+"%";
          inforID[i]=sInformationID;
          i++;
        }while(rs1.next());
      }
    }

    for(i=0;i<inforID.length;i++){

      sInformationID=inforID[i];

      sql="delete from tctc_test_case where  condition like '"+sInformationID+"'";
      myStatement4.executeUpdate(sql);

      sql="delete from tctc_information where inf_dis like '"+sInformationID+"'";
      myStatement5.executeUpdate(sql);
    }

    sql="delete from tctc_element where element_id="+testElementID;
    myStatement6.executeUpdate(sql);

    sql="delete from tctc_information where element_id="+testElementID;
    myStatement7.executeUpdate(sql);


    rs1.close();
  }
  else
  {
    session.setAttribute("Error","4.2");

  }


  rs.close();
%>
<script language="JavaScript">
  parent.location.href='SelectTestElement.jsp'
</script>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
    myStatement6.close();
    myStatement7.close();
  }
%>
</body>
</html>
