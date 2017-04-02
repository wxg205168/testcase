<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateTestConditionConfirm
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
  String sql=new String();
  ResultSet rs1, rs2;
  int first=1;
  rs1=null;
  rs2=null;
  String checkName=new String();
  String hideName=new String();
  String checkValue=new String();
  String sNumber=(String)session.getAttribute("CR_Number2");
  long number=Integer.parseInt(sNumber);

  String condition=new String();
  String content=new String();
  String sInformationID=new String();
  long informationID=0;


  long functionPointID=Integer.parseInt((String)session.getAttribute("FunctionPointID"));
  long projectID=Integer.parseInt((String)session.getAttribute("ProjectID"));
  long useCaseID=Integer.parseInt((String)session.getAttribute("UseCaseID"));

  for(int i=1;i<(number+1);i++)
  {

    checkName="C"+i;
    checkValue=request.getParameter(checkName);

    hideName="T"+checkValue+checkName;
    sInformationID=request.getParameter(hideName);

    informationID=Integer.parseInt(sInformationID);

    if(first==1){
      content=String.valueOf(informationID);
      first=0;
    }
    else{
      content=content+" "+String.valueOf(informationID);
    }

  }

//  rs1.close();


  if(!content.equals(null))
  {
    sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID+" and inf_dis='"+content+"'";
    rs2=myStatement1.executeQuery(sql);
    if(!rs2.next()){
      sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'condition','" + content + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')";
      myStatement2.executeUpdate(sql);
    }
    rs2.close();
  }

%>
<script language="JavaScript">
  parent.location.href='DeleteTestCondition.jsp'
</script>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>
</body>
</html>
