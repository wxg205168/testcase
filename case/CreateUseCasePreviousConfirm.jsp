<%@ page contentType="text/html; charset=GBK" %>
<html>
<head>
<title>
CreateUseCaseConfirm
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
    Statement myStatement4=null;
    Statement myStatement3=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement3=myConn.createStatement();

%>

<%
  String selectname = new String();
  String uc_name = new String();
  String uc_ab=new String();
  long project_id = 0;
  String sql;
  ResultSet rs;
  selectname=(String)session.getAttribute("ProjectID");
  uc_name=request.getParameter("usecase");
  uc_ab=request.getParameter("ab");
  uc_name=rr.replaceString(uc_name);
  uc_name=rr.restore(uc_name);
  uc_name=uc_name.trim();
  uc_ab=uc_ab.trim();
  uc_ab=rr.replaceString(uc_ab);

  project_id=Integer.parseInt(selectname);

  int iHave=0;
  int sortID=0;
  int sortNextID=0;
  int radioID=0;
  int elementID=0;
  String text_sort_name=new String();
  String sort_id=new String();
  String text_id_name=new String();
  String sElementID=new String();
  String sRadioName=new String();

  sql="select * from tctc_uc where project_id=" +project_id;
  rs=myStatement4.executeQuery(sql);

  if(rs.next()){

    //sort
    text_sort_name="s"+request.getParameter("radiobutton");

    sort_id=(String)request.getParameter(text_sort_name);
    sortID=Integer.parseInt(sort_id);
    sortNextID=sortID+2;
    iHave=1;
  }

  if(rr.checkString(uc_ab) && (!rr.checkStringNull(uc_name))){

    sql="select * from tctc_uc where project_id="+project_id+" and uc_name='"+uc_name+"'";
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","2.3");
%>
      <script language="JavaScript">
        parent.location.href='SelectUseCase.jsp'
      </script>
<%
    }
    else{
      if(iHave==1){

        sRadioName=(String)request.getParameter("radiobutton");

        radioID=Integer.parseInt(sRadioName);
        radioID=radioID+1;

        sql="update tctc_uc set uc_sort_id=uc_sort_id+1 where uc_sort_id>="+sortID+" and project_id ="+project_id;
        myStatement3.executeUpdate(sql);

//        sortID=sortID+1;
        sql="insert into tctc_uc (uc_sort_id,uc_id,uc_name,project_id,uc_ab) values('"+ sortID+"',seq_tctc_uc.nextval,'" + uc_name + "'," + project_id+ ",'"+uc_ab+"')";
        myStatement2.executeUpdate(sql);

      }
      else{
        sql="insert into tctc_uc (uc_sort_id,uc_id,uc_name,project_id,uc_ab) values('1',seq_tctc_uc.nextval,'" + uc_name + "'," + project_id+ ",'"+uc_ab+"')";
        myStatement2.executeUpdate(sql);
      }

      session.setAttribute("Temp",uc_name);
      session.setAttribute("Page","1");
      response.sendRedirect("Temp.jsp");

    }
    rs.close();
  }
  else{
    session.setAttribute("Error","2.5");
%>
    <script language="JavaScript">
      parent.location.href='SelectUseCase.jsp'
    </script>
<%
  }
%>
<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement4.close();
    myStatement3.close();

  }
%>
</body>
</html>
