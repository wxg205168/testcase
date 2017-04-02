<body>
<form method="post" action="load.jsp">
<%@ page language="java" import="java.util.Date,java.util.Enumeration" %>
<jsp:useBean id="excel" scope="page" class="excel.GenerateExcel" />
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
%>

<%
  String projectName=(String)session.getAttribute("ProjectName");
  String sProjectID=(String)session.getAttribute("ProjectID");
  Date today=new Date();

  String temp=String.valueOf(today);

//  Tue Aug 02 15:57:00 CST 2005
  String temp1=temp.substring(4,7);
  temp1=temp1+"_"+temp.substring(8,10);
  temp1=temp1+"_"+temp.substring(24,28);

  if(!sProjectID.equals("null")){


    long projectID=Integer.parseInt(sProjectID);
    String fileName="D:\\TestSpecs_"+projectName+"_"+temp1+".xls";
    excel.getExcel(sProjectID,fileName);
    session.setAttribute("LoadName",fileName);

  }
%>
<script language="JavaScript">
  parent.location.href='load.jsp'
</script>
<%
  }
%>
</form>
</body>
