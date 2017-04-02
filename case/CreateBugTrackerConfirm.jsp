<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
</title>
</head>
<body bgcolor="#ffffff">


<%@ page language="java" import="java.sql.*,java.util.Enumeration,javax.sql.*,java.util.Date,java.text.DateFormat,java.util.Locale" %>


<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />
<jsp:useBean id="rr" scope="page" class="managestring.mystring"/>
<jsp:useBean id="mail" scope="page" class="email.SendEmail"/>

<%
  //prepare DB connection
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement1=null;
  Statement myStatement2=null;
  Statement myStatement3=null;

  try{
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
	myStatement2=myConn.createStatement();
	 myStatement3=myConn.createStatement();
  }
  catch(SQLException ex){
    session.setAttribute("Error","6.1");
    System.err.println("aq.executeQuery: " + ex.getMessage());
%>
<script language="JavaScript">
  parent.location.href='CreateBugTracker.jsp'
</script>
<%
  }


  //define bug information
  String sql=new String();
  String frequency=new String();
  String ponderance=new String();
  String summary=new String();
  String detail=new String();
  String provide=new String();
  Date test=new Date();

  String sql1=new String();
  String sql2=new String();
  String sql3=new String();
  ResultSet rs;
   ResultSet rs2;
   ResultSet rs3;

  DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
  String today=fmt.format(test);

  frequency=(String)request.getParameter("select");
  ponderance=(String)request.getParameter("select2");
  summary=(String)request.getParameter("textfield");
  detail=(String)request.getParameter("textarea");
  provide=(String)request.getParameter("textfield2");

  frequency=rr.restore(frequency);
  frequency=rr.replaceString(frequency);
  ponderance=rr.restore(ponderance);
  ponderance=rr.replaceString(ponderance);
  summary=rr.restore(summary);
  summary=rr.replaceString(summary);
  detail=rr.restore(detail);
  detail=rr.replaceString(detail);
  provide=rr.restore(provide);
  provide=rr.removeBlank(rr.replaceString(provide));
  frequency=frequency.trim();
  ponderance=ponderance.trim();
  summary=summary.trim();
  detail=detail.trim();
  provide=provide.trim();

  //check string is null
  if(rr.checkStringNull(frequency)||rr.checkStringNull(ponderance)||rr.checkStringNull(summary)||rr.checkStringNull(detail)||rr.checkStringNull(provide)){

    session.setAttribute("Error","6.3");
%>
<script language="JavaScript">
  parent.location.href='CreateBugTracker.jsp'
</script>
<%
  }
  else{
  //insert record into DB
  try{


    sql="insert into tctc_bug(bug_id,bug_frequency,bug_ponderance,bug_summary,bug_detail,bug_create,bug_create_date,bug_status) values(seq_tctc_bug.nextval,'" + frequency + "','" + ponderance+ "','"+summary+"','"+detail+"','"+provide+"','"+today+"','Open')";
    myStatement1.executeUpdate(sql);

sql1="select * from TCTC_EMPLOYEE where em_p='from'";
	sql2="select * from TCTC_EMPLOYEE where em_p='to'";
	sql3="select * from TCTC_EMPLOYEE where em_p='cc'";
	String from = new String();
	String to = new String();
	String cc = new String();
  rs=myStatement1.executeQuery(sql2);
  rs2=myStatement2.executeQuery(sql1);
  rs3=myStatement3.executeQuery(sql3);
  if(rs2.next()){
    from=rs2.getString("EM_N")+"@bhr.com.cn";
  }
  if(rs.next()){
    to=rs.getString("EM_N")+"@bhr.com.cn";
  }

	if(rs3.next()){
    cc=rs3.getString("EM_N")+"@bhr.com.cn";

  }
  String content="Hi,All\nThis is a TSGS system mail to remind you that a bug has been added.The detail information is following:"+"\nFrequency:"+frequency+"\nPonderance:"+ponderance+"\nSummary:"+summary+"\nDetail:"+detail+
	  "\nProvide By:"+provide;
mail.send(from,to,"","","Add Bug Tracker",cc,content);

%>
<script language="JavaScript">
  parent.location.href='CreateBugTracker.jsp'
</script>
<%
  }
  catch(SQLException ex){
    session.setAttribute("Error","6.2");
    System.err.println("aq.executeQuery: " + ex.getMessage());
    System.err.println("sql: " + sql);
%>
<script language="JavaScript">
  parent.location.href='CreateBugTracker.jsp'
</script>
<%
    }
  }

%>
<form method="post">


</form>
<%
  myConn.close();
  myStatement1.close();
  myStatement2.close();
   myStatement3.close();
%>
</body>
</html>
