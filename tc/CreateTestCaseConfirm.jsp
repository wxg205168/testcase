<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateTestCaseConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
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
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
%>

<%
  String xx=(String)session.getAttribute("R_Number");
  int x=Integer.parseInt(xx);

  xx=(String)session.getAttribute("C_Number");
  int y=Integer.parseInt(xx);

  ResultSet rs;
  String funID = (String)session.getAttribute("FunctionPointID");
  String sUCID=(String)session.getAttribute("UseCaseID");
  String rContent = new String();
  String cContent = new String();
  String cName = new String();
  String sCheckBox=new String();
  String crName1 = new String();
  String crName2 = new String();
  String sql = new String();
  String projectID = (String)session.getAttribute("ProjectID");
  String type=new String();
  boolean write=false;
  boolean first=true;

  for(int i=1;i<(y+1);i++){
    crName1 = "C" + String.valueOf(i);
    cContent = request.getParameter(crName1);
    type=request.getParameter(String.valueOf(i));

    write=false;
    first=true;

    for(int j=1;j<(x+1);j++){

      cName=String.valueOf(j) + "-" + String.valueOf(i);
      sCheckBox=request.getParameter(cName);
      if(sCheckBox!=null){
        crName2 = "R" + String.valueOf(j);
	if(first){
          rContent = request.getParameter(crName2);
	  first=false;
	}
	else{
	  rContent =rContent + " " + request.getParameter(crName2);
	}
        write=true;

      }
    }
    if(write)
    {
      sql="select * from tctc_test_case where pro_id="+Integer.parseInt(projectID)+" and uc_id="+Integer.parseInt(sUCID)+" and fun_p_id="+Integer.parseInt(funID)+" and condition='"+cContent+"' and result='"+rContent+"'";
      rs=myStatement1.executeQuery(sql);
      if(!rs.next()){
        sql="insert into tctc_test_case (test_case_id,condition,result,fun_p_id,pro_id,uc_id,test_case_type) values(seq_tctc_test_case.nextval,'" + cContent + "','" + rContent + "','" + Integer.parseInt(funID) + "','" + Integer.parseInt(projectID) + "','"+Integer.parseInt(sUCID)+"','"+type+"')";
        myStatement2.executeUpdate(sql);
      }
    }
  }

%>
<script language="JavaScript">
  parent.location.href='EnquireTestCase.jsp'
</script>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</body>
</html>
