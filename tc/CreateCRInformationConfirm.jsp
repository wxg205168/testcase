<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateCRInformationConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
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
    Statement myStatement1=null;
    Statement myStatement2=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
%>

<%

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  String sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  String sTestElementID=(String)session.getAttribute("TestElementID");

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectProject.jsp'
</script>
<%
  }
  else if(sUseCaseID.equals("null")){
    session.setAttribute("Error","3.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else if(sFunctionPointID.equals("null")){
    session.setAttribute("Error","4.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectFunctionPoint.jsp'
</script>
<%
  }
  else{

  long projectID=Integer.parseInt(sProjectID);
  long useCaseID=Integer.parseInt(sUseCaseID);
  long functionPointID=Integer.parseInt(sFunctionPointID);
  long testElementID=0;

  String MaterialType=(String)request.getParameter("radiobutton");
  String type=new String();
  String sType=new String();
  String sql;
  ResultSet rs;


  if((MaterialType.equals("1") && (!sTestElementID.equals("null"))) || MaterialType.equals("2"))
  {

  if(MaterialType.equals("1")){
    type="c";
    sType="condition";
    testElementID=Integer.parseInt(sTestElementID);

  }
  else if(MaterialType.equals("2")){
    type="r";
    sType="result";
  }
  String dis= request.getParameter("textarea");
  dis=rr.replaceString(dis);
  dis=rr.restore(dis);
  dis=dis.trim();

  if(dis==null){
    session.setAttribute("Error","5.3");
%>
<script LANGUAGE="javascript">
  parent.location.href='EnquireCRInfromation.jsp'
</script>
<%

  }
  else{

  sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='"+type +"' and inf_dis='"+dis+"' and project_id="+projectID+" and uc_id="+useCaseID;
  rs=myStatement1.executeQuery(sql);
  if (rs.next()){
    rs.close();
    session.setAttribute("Error","5.2");
%>
<script LANGUAGE="javascript">
  parent.location.href='EnquireCRInfromation.jsp'
</script>
<%
  }
  else{

    if(MaterialType.equals("1")){
      sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id,element_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"','"+testElementID+"')";
    }
    else if(MaterialType.equals("2")){
      sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')";
    }

    myStatement2.executeUpdate(sql);
    rs.close();
    session.setAttribute("Type",type);
%>
<script LANGUAGE="javascript">
    parent.location.href='EnquireCRInfromation.jsp'
</script>
<%

  }
  }
  }
  else
  {
    session.setAttribute("Error","5.1");

%>
<script LANGUAGE="javascript">
  parent.location.href='SelectTestElement.jsp'
</script>
<%
  }
  }
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }
%>

</body>
</html>
