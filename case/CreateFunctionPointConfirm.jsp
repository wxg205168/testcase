<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateFunctionPointConfirm
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

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  long projectID=0;
  long useCaseID=0;

  if(sProjectID.equals("null") || sProjectID.equals(null)){
    session.setAttribute("Error","2.1");
%>

<script LANGUAGE="javascript">
  parent.location.href='SelectProject.jsp'
</script>

<%
  }
  else if(sUseCaseID.equals("null") || sUseCaseID.equals(null)){
    session.setAttribute("Error","3.1");
%>
<script LANGUAGE="javascript">
  parent.location.href='SelectUseCase.jsp'
</script>
<%
  }
  else{
    projectID=Integer.parseInt(sProjectID);
    useCaseID=Integer.parseInt(sUseCaseID);

    String functionPointName = new String();
    String sql=new String();
    ResultSet rs;
    functionPointName=request.getParameter("functionpoint");
    functionPointName=rr.replaceString(functionPointName);
    functionPointName=functionPointName.trim();

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

    sql="select * from tctc_function_point where pro_id=" +projectID+" and uc_id="+useCaseID;
    rs=myStatement4.executeQuery(sql);

    if(rs.next()){

      //sort
      text_sort_name="s"+request.getParameter("radiobutton");

      sort_id=(String)request.getParameter(text_sort_name);
      sortID=Integer.parseInt(sort_id);
      sortNextID=sortID+2;
      sNumber=(String)session.getAttribute("functionpointNumber");
      iHave=1;

    }

    //enquire same record
    if(!rr.checkStringNull(functionPointName)){

    sql="select fun_n from tctc_function_point where pro_id="+projectID+" and uc_id=" + useCaseID +" and fun_n='"+functionPointName+"'";
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","3.3");
%>
<script language="JavaScript">
    parent.location.href='SelectFunctionPoint.jsp'
</script>
<%
    }
    else{
      if(iHave==1){
        sRadioName=(String)request.getParameter("radiobutton");

        radioID=Integer.parseInt(sRadioName);
        radioID=radioID+1;

        while(radioID <= Integer.parseInt(sNumber)){

          text_id_name="t"+String.valueOf(radioID);
          sElementID=(String)request.getParameter(text_id_name);
          elementID=Integer.parseInt(sElementID);

          sql="update tctc_function_point set fun_sort_id='"+sortNextID+"' where fun_p_id="+elementID;
          myStatement3.executeUpdate(sql);
          sortNextID++;
          radioID++;
        }

        sortID=sortID+1;
        sql="insert into tctc_function_point (fun_sort_id,fun_p_id,fun_n,pro_id,uc_id) values('"+ sortID+"',seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')";
        myStatement2.executeUpdate(sql);
      }
      else{
        sql="insert into tctc_function_point (fun_sort_id,fun_p_id,fun_n,pro_id,uc_id) values('1',seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')";
        myStatement2.executeUpdate(sql);
      }

      session.setAttribute("Temp",functionPointName);
      session.setAttribute("Page","2");
      response.sendRedirect("Temp.jsp");
    }
    rs.close();
    }
    else{
    session.setAttribute("Error","3.5");
%>
    <script language="JavaScript">
      parent.location.href='SelectFunctionPoint.jsp'
    </script>
<%
    }
  }
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
  }
%>
</body>
</html>
