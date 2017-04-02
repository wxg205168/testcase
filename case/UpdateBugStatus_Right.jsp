<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>

</head>
<body bgcolor="#ffffff">

<form>
<%@ page import="java.sql.*,javax.sql.*,java.util.Enumeration,java.util.Date,java.text.DateFormat,java.util.Locale"%>
<jsp:useBean id="tt" scope="page" class="mydb.DatabaseBean" />
<jsp:useBean id="rr" scope="page" class="managestring.mystring" />
<jsp:useBean id="mail" scope="page" class="email.SendEmail"/>

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
	 Statement myStatement1=null;
	 Statement myStatement2=null;
  Statement myStatement3=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();
	myStatement1=myConn.createStatement();
	myStatement2=myConn.createStatement();
	myStatement3=myConn.createStatement();
%>
<%
	 String sql=new String();
String sql1=new String();
 String sql2=new String();
  String sql3=new String();
  ResultSet rs;
  ResultSet rs2;
   ResultSet rs3;

String bugStatus=new String();
String updateDate=new String();
String confirmBy=new String();
String remark=new String();
String summary=new String();
String detail=new String();
  int number=Integer.parseInt((String)session.getAttribute("BUG_ID"));
  bugStatus=(String)request.getParameter("selectstatus");
   updateDate=(String)request.getParameter("dateselect");
   confirmBy=(String)request.getParameter("confirm");
   remark=(String) request.getParameter("textremark");
   summary= (String) request.getParameter("summary");
   detail= (String) request.getParameter("detail");

  bugStatus=rr.restore(bugStatus);
  bugStatus=rr.replaceString(bugStatus);
 confirmBy=rr.restore(confirmBy);
  confirmBy=rr.replaceString(confirmBy);
 remark=rr.restore(remark);
  remark=rr.replaceString(remark);
  confirmBy=rr.removeBlank(confirmBy.trim());
  remark=remark.trim();
Date test=new Date();

  DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
  String today=fmt.format(test);
   sql="update tctc_bug set BUG_STATUS='"+bugStatus+"',BUG_REMARK='"+remark+"',BUG_CONFIRM='"+confirmBy+"',BUG_CONFIRM_DATE='"+today+"'where BUG_ID="+number;
        myStatement.executeUpdate(sql);
sql1="select BUG_CONFIRM from TCTC_BUG where BUG_ID="+number;
		sql2="select BUG_CREATE from TCTC_BUG where BUG_ID="+number;
	sql3="select * from TCTC_EMPLOYEE where em_p='cc'";
	String from = new String();
	String to = new String();
	String cc = new String();
  rs=myStatement1.executeQuery(sql2);
  rs2=myStatement2.executeQuery(sql1);
  rs3=myStatement3.executeQuery(sql3);
  if(rs2.next()){
    from=rs2.getString("BUG_CONFIRM")+"@bhr.com.cn";

  }
  if(rs.next()){
    to=rs.getString("BUG_CREATE")+"@bhr.com.cn";
  }
  System.out.println("to:--------"+to);
 String tos="";
 tos=tos+";"+to;
	if(rs3.next()){
    cc=rs3.getString("EM_N")+"@bhr.com.cn";

  }
  String content="Hi,All\nThis is a TSGS system mail to remind you that the bug has been confirmed.The detail information is following:"+"\nSummary:"+summary+"\nDetail:"+detail+"\nConfirmBy:"+confirmBy+"\nBugStatus:"+bugStatus+
	  "\nRemark:"+remark;
mail.send(from,to,"","","Update Bug Tracker",cc,content);

  %>
  <script language="JavaScript">
  parent.location.href='EnquireBugTracker.jsp'
</script>
<%
    myConn.close();
    myStatement.close();
  }
%>
</form>
</body>
</html>
