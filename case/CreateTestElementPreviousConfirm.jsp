<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>
CreateTestElementConfirm
</title>
</head>
<body bgcolor="#ffffff">

<%@ page language="java" import="java.sql.*,javax.sql.*,java.util.Enumeration" %>
<jsp:useBean id="tt" scope="request" class="mydb.DatabaseBean" />
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
    Statement myStatement3=null;
    Statement myStatement4=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
%>

<%
  String sProjectID = new String();
  String sUseCaseID=new String();
  String sFunctionPointID=new String();
  String testElementName = new String();
  long projectID=0;
  long useCaseID=0;
  long functionPointID=0;
  String sql=new String();
  ResultSet rs;
  sProjectID=(String)session.getAttribute("ProjectID");
  sUseCaseID=(String)session.getAttribute("UseCaseID");
  sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  testElementName=request.getParameter("testelement");
  projectID=Integer.parseInt(sProjectID);
  useCaseID=Integer.parseInt(sUseCaseID);
  functionPointID=Integer.parseInt(sFunctionPointID);
  testElementName=rr.replaceString(testElementName);
  testElementName=testElementName.trim();


  int iHave=0;
  int sortID=0;
  int sortNextID=0;
  int radioID=0;
  int elementID=0;
  String text_sort_name=new String();
  String sort_id=new String();
  String text_id_name=new String();
  String sNumber=new String();
  String sElementID=new String();
  String sRadioName=new String();

  sql="select * from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID;
  rs=myStatement4.executeQuery(sql);

  if(rs.next()){

    //sort
    text_sort_name="s"+request.getParameter("radiobutton");
    sort_id=(String)request.getParameter(text_sort_name);
    sortID=Integer.parseInt(sort_id);
    sortNextID=sortID+1;
    sNumber=(String)session.getAttribute("elementNumber");
    iHave=1;

  }
  //enquire same record in DB
  if(!rr.checkStringNull(testElementName)){

    sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID+" and element_name='"+testElementName+"'";;
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","4.3");
%>
<script language="JavaScript">
    parent.location.href='SelectTestElement.jsp'
</script>
<%
    }
    else{
      if(iHave==1){
        sRadioName=(String)request.getParameter("radiobutton");

        radioID=Integer.parseInt(sRadioName);

        while(radioID <= Integer.parseInt(sNumber)){

          text_id_name="t"+String.valueOf(radioID);
          sElementID=(String)request.getParameter(text_id_name);
          elementID=Integer.parseInt(sElementID);

          sql="update tctc_element set element_sort_id='"+sortNextID+"' where element_id="+elementID;
          myStatement3.executeUpdate(sql);
          sortNextID++;
          radioID++;
        }

        sql="insert into tctc_element (element_sort_id,element_id,element_name,project_id,uc_id,functionpoint_id) values('"+ sortID+"', seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
        myStatement2.executeUpdate(sql);
      }
      else{
        sql="insert into tctc_element (element_sort_id,element_id,element_name,project_id,uc_id,functionpoint_id) values('1', seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
        myStatement2.executeUpdate(sql);

      }
      session.setAttribute("Temp",testElementName);
      session.setAttribute("Page","3");
      response.sendRedirect("Temp.jsp");
    }
    rs.close();
  }
  else{
    session.setAttribute("Error","4.5");
%>
<script language="JavaScript">
    parent.location.href='SelectTestElement.jsp'
</script>
<%
  }

    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
  }
%>
</body>
</html>
