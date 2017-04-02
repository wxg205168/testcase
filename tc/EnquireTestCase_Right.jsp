<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title></title>
<style type="text/css">
<!--
body {
	background-color: #F6F6F6;
	margin-left: 20px;
	margin-top: 0px;
}
.bold {FONT-WEIGHT: bold
}
.style4 {color: #FFFFFF}
-->
</style>
<link href="css.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style5 {color: #FFFFFF; font-weight: bold; }
-->
</style>
</head>
<script language="JavaScript">

function isValid(form){
  if(form.usecase.value!=""){
    return true;
  }
  else{
    alert("UseCase Name can not be blank!");
    return false;
  }
}

function testSubmit()
{
  if(confirm("Warning: The correlative information will been deleted!")){
    document.forms[0].action="DeleteTestCaseConfirm.jsp";
    document.forms[0].submit();
  }
}

function testSubmit1()
{
document.forms[1].action="CreateTestCaseConfirm.jsp";
document.forms[1].submit();
}

</script>

<body>

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
      String sql=new String();

    try{
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
    Statement myStatement8=null;
    Statement myStatement9=null;
    Statement myStatement10=null;
    Statement myStatement11=null;
    Statement myStatement12=null;
    Statement myStatement13=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
    myStatement6=myConn.createStatement();
    myStatement7=myConn.createStatement();
    myStatement8=myConn.createStatement();
    myStatement9=myConn.createStatement();
    myStatement10=myConn.createStatement();
    myStatement11=myConn.createStatement();
    myStatement12=myConn.createStatement();
    myStatement13=myConn.createStatement();
%>

<form method="post">

  <table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td align="left" valign="top"><img src="image/TT-TestCase-List.jpg" width="285" height="46"></td>
    </tr>
  </table>

  <table width="750" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="31"><img src="image/T1.jpg" width="31" height="26"></td>
      <td background="image/T2.jpg">Select Test Case to delete from list:</td>
      <td width="17"><img src="image/T3.jpg" width="17" height="26"></td>
    </tr>
  </table>
  <table width="750" border=1 cellpadding=0 cellspacing=0
  style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
    <tbody>
      <tr align="center" bgcolor=#74A5E8>
        <td width="23" height="25" align="left" bordercolorlight=#3458AC bordercolordark=#3458AC class="style4" >&nbsp;</td>
        <td width="230" align="center" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Condition</span></td>
        <td width="230" align="center" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor="#74A5E8" ><span class="style5">Test Result</span></td>
      </tr>

<%
      int noData=0;
      int x=0;

      String sProjectID=(String)session.getAttribute("ProjectID");
      String sUseCaseID=(String)session.getAttribute("UseCaseID");
      String sFunctionPointID=(String)session.getAttribute("FunctionPointID");

      ResultSet rs1,rs2,rs3,rs4,rs5;
      rs1=null;
      rs2=null;
      rs3=null;
      rs4=null;
      rs5=null;

      String checkBoxName=new String();
      String hideName=new String();

      long testCaseID=0;
      int number=0;

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

        String functionPointName=new String();
        String useCaseName=new String();
        String cDis = new String();
        String rDis = new String();
        String[] temp;
        String condition1=new String();
        int first=1;
        int first1=1;
        int nn=0;

        sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
        rs1=myStatement1.executeQuery(sql);

        if(rs1.next())
        {
          noData=1;
          do
          {
            number++;
            cDis=rs1.getString("condition");
            rDis=rs1.getString("result");
            first=1;
            first1=1;

            temp=rr.getID(cDis);
            sql="select inf_dis from tctc_information where inf_id in ( ";
            for(int i=0;i<temp.length;i++){
              if(first==1){
                sql=sql+Integer.parseInt(temp[i]);
                first=0;
              }
              else{
                sql=sql+","+Integer.parseInt(temp[i]);
              }
            }
            sql=sql+")";

            rs3=myStatement2.executeQuery(sql);
            first=1;

            while(rs3.next()){
              condition1=rs3.getString("inf_dis");
              condition1=rr.replace(condition1);
              if(first==1){
                cDis=condition1;
                first=0;
              }
              else{
                cDis=cDis+"<br>"+condition1;
              }
            }

            temp=rr.getID(rDis);
            sql="select inf_dis from tctc_information where inf_id in ( ";
            for(int i=0;i<temp.length;i++){
              if(first1==1){
                sql=sql+Integer.parseInt(temp[i]);
                first1=0;
              }
              else{
                sql=sql+","+Integer.parseInt(temp[i]);
              }
            }
            sql=sql+")";

            rs3=myStatement3.executeQuery(sql);
            first1=1;

            while(rs3.next()){
              condition1=rs3.getString("inf_dis");
              condition1=rr.replace(condition1);
              if(first1==1){
                rDis=condition1;
                first1=0;
              }
              else{
                rDis=rDis+"<br>"+condition1;
              }
            }

            rs3.close();

            testCaseID=rs1.getLong("test_case_id");
            checkBoxName="C"+number;
            hideName="H"+number;

%>
            <tr align="center" bgcolor=#f8f8f8>
              <td height="25" align="left" bordercolorlight=#3458AC bordercolordark=#3458AC ><input type="checkbox" name=<%=checkBoxName %> /></td>
              <td width="363" align="left" valign="top" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor="#FFFFFF" ><%=cDis %></td>
              <td width="363" align="left" valign="top" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor="#FFFFFF" ><%=rDis %><input type = "hidden" name = <%=hideName %> value =<%=testCaseID %> /></td>
            </tr>
<%
          }while(rs1.next());
          session.setAttribute("CR_Number", String.valueOf(number));
        }
      }
%>
    </tbody>
  </table>

<%
  if(noData==1){
%>

    <table width="750" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
        <td width="710" align="right" background="image/table_left1.jpg"><img src="image/but_select1.gif" width="52" height="22" onClick="testSubmit()"></td>
        <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
        <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
      </tr>
    </table>
<%
    noData=0;
  }
%>
</form>

<form method="post" >

  <table width="660" height="60" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td align="left" valign="top"><img src="image/TT-Testmatrix.jpg" width="285" height="46"></td>
    </tr>
  </table>


  <TABLE width="0" border=1 cellPadding=0 cellSpacing=0
    style="BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; " >
    <TBODY>
<%
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

      long functionPointID=Integer.parseInt(sFunctionPointID);

      sql="select count(*) from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID;
      rs1=myStatement4.executeQuery(sql);
      int y=0;
      if(rs1.next()){
//        y=rs1.getInt("Expr1000");
          y=rs1.getInt("count(*)");
      }
      else{
        y=0;
      }

      sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
      rs2=myStatement5.executeQuery(sql);
//      int x=0;
      if(rs2.next()){
        x=rs2.getInt("count(*)");
      }
      else{
        x=0;
      }

      String CheckName = new String();
      String content = new String();
      long id=0;
      rs1=null;
      rs2=null;
      int first2=1;
      String[] temp;
      String condition1=new String();
      String information=new String();
      String condition2=new String();
      String result2=new String();
      String[] con;
      String[] rel;

      int l=0;
      int lll=0;
      int cPosition=0;
      int rPosition=0;
      int have1=1;
      int have2=1;
      int nn=0;
      long projectID=Integer.parseInt(sProjectID);
      long useCaseID=Integer.parseInt(sUseCaseID);
      String cDis=new String();
      String rDis=new String();

      if(x>0 && y>0){
        String[] resultArray=new String[x];
        String[] conditionArray=new String[y];

        session.setAttribute("R_Number",String.valueOf(x));
        session.setAttribute("C_Number",String.valueOf(y));

        sql="select inf_dis from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID;
        rs1=myStatement6.executeQuery(sql);
        rs1.next();

        sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
        rs2=myStatement7.executeQuery(sql);
        rs2.next();

        sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
        rs4=myStatement8.executeQuery(sql);
        if(rs4.next()){
          do{
            resultArray[l]=rs4.getString("inf_id");
            l++;
          }while(rs4.next());
        }

        sql="select inf_dis,inf_id from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID;
        rs4=myStatement9.executeQuery(sql);
        if(rs4.next()){
          do{
            conditionArray[lll]=rs4.getString("inf_dis");
            lll++;
          }while(rs4.next());
        }

        sql="select count(*) from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
        rs4=myStatement10.executeQuery(sql);
        if(rs4.next()){
          nn=rs4.getInt("count(*)");
        }

        if(nn>0){
          con=new String[nn];
          rel=new String[nn];

          sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
          rs5=myStatement11.executeQuery(sql);

          if(rs5.next())
          {
            nn=0;
            do
            {
              cDis=rs5.getString("condition");
              rDis=rs5.getString("result");
              con[nn]=cDis;
              rel[nn]=rDis;
              nn++;
            }while(rs5.next());
          }

          if(x>0 && y>0)
          {
            noData=1;

            for(int i=0;i<(y+1);i++)
            {
%>
              <TR align="center" bgColor=#74A5E8>
<%
              for(int j=0;j<(x+1);j++)
              {
                CheckName = null;

                if(j==1 && i==0){
%>
                  <td width="100" align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"></td>
<%
                }

                if(j==1 && i!=0){
%>
                  <td width="100" align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"><select name=<%=String.valueOf(i) %>><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>
<%
                }

                if(i==0 && j==0){
%>
                  <TD height="25" width="150" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" >&nbsp;</TD>
<%
                }
                if(j>0 && i==0){
                  CheckName = "R" + String.valueOf(j);
                  content = rs2.getString("inf_dis");
                  id=rs2.getLong("inf_id");
                  content=rr.replace(content);
%>
                  <TD width="150" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5"><textarea name="testarea" cols="20" rows="5" readonly="true"><%=content %></textarea><input type="hidden" name=<%=CheckName %> value=<%=id %>></span></TD>
<%
                  rs2.next();
                }
                else if(i>0 && j==0){
                  CheckName = "C" + String.valueOf(i);
                  content = rs1.getString("inf_dis");

                  first2=1;
                  temp=rr.getID(content);
                  content="\""+content+"\"";

                  sql="select inf_dis from tctc_information where inf_id in ( ";
                  for(int ii=0;ii<temp.length;ii++){
                    if(first2==1){
                      sql=sql+Integer.parseInt(temp[ii]);
                      first2=0;
                    }
                    else{
                      sql=sql+","+Integer.parseInt(temp[ii]);
                    }
                  }
                  sql=sql+")";

                  rs3=myStatement12.executeQuery(sql);
                  first2=1;

                  while(rs3.next()){
                    condition1=rs3.getString("inf_dis");
                    if(first2==1){
                      information=condition1;
                      first2=0;
                    }
                    else{
                      information=information+"\n"+condition1;
                    }
                  }

                  information=rr.replace(information);
%>
                  <td width="150" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5"><textarea name="testarea" cols="20" rows="5" readonly="true"><%=information %></textarea><input type="hidden" name=<%=CheckName %> value=<%=content %>></span></td>
<%
                  rs1.next();
                }
                else if(j>0 && i>0){
                  CheckName = String.valueOf(j) + "-" + String.valueOf(i);

                  result2=resultArray[j-1];
                  condition2=conditionArray[i-1];

                  cPosition=-1;
                  rPosition=-1;
                  have1=0;
                  have2=0;

                  for(int ll=0;ll<con.length;ll++){
                    cPosition=con[ll].indexOf(condition2);
                    if(cPosition!=-1){
                      rPosition=rel[ll].indexOf(result2);
                      if(rPosition!=-1){
                        have1=1;
                        cPosition=-1;
                        rPosition=-1;
                      }
                    }
                  }

                  if(have1==1){
%>
                    <td align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"><input type="checkbox" name=<%=CheckName %> value="checkbox"  checked="checked"></td>
<%
                  }
                  else{
%>
                    <td align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"><input type="checkbox" name=<%=CheckName %> value="checkbox"></td>
<%
                  }
                }
              }
%>
              </TR>
<%
            }
          }
          rs1.close();
          rs2.close();
          rs3.close();
          rs4.close();
          rs5.close();
        }
        else{

          if(x>0 && y>0)
          {
            noData=1;
            for(int i=0;i<(y+1);i++)
            {
%>
              <TR align="center" bgColor=#74A5E8>
<%
              for(int j=0;j<(x+1);j++)
              {
                CheckName = null;

                if(j==1 && i==0){
%>
                  <td width="100" align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"></td>
<%
                }

                if(j==1 && i!=0){
%>
                  <td width="100" align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"><select name=<%=String.valueOf(i) %>><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>
<%
                }

                if(i==0 && j==0){
%>
                  <TD height="25" width="150" align="center" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" >&nbsp;</TD>
<%
                }
                if(j>0 && i==0){
                  CheckName = "R" + String.valueOf(j);
                  content = rs2.getString("inf_dis");
                  id=rs2.getLong("inf_id");
                  content=rr.replace(content);
%>
                  <TD width="150" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5"><textarea name="testarea" cols="20" rows="5" readonly="true"><%=content %></textarea><input type="hidden" name=<%=CheckName %> value=<%=id %>></span></TD>
<%
                  rs2.next();
                }
                else if(i>0 && j==0){
                  CheckName = "C" + String.valueOf(i);
                  content = rs1.getString("inf_dis");

                  first2=1;
                  temp=rr.getID(content);
                  content="\""+content+"\"";

                  sql="select inf_dis from tctc_information where inf_id in ( ";
                  for(int ii=0;ii<temp.length;ii++){
                    if(first2==1){
                      sql=sql+Integer.parseInt(temp[ii]);
                      first2=0;
                    }
                    else{
                      sql=sql+","+Integer.parseInt(temp[ii]);
                    }
                  }
                  sql=sql+")";

                  rs3=myStatement13.executeQuery(sql);
                  first2=1;

                  while(rs3.next()){
                    condition1=rs3.getString("inf_dis");
                    if(first2==1){
                      information=condition1;
                      first2=0;
                    }
                    else{
                      information=information+"\n"+condition1;
                    }
                  }

                  information=rr.replace(information);

%>
                  <td width="150" align="left" valign="top" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8" ><span class="style5"><textarea name="testarea" cols="20" rows="5" readonly="true"><%=information %></textarea><input type="hidden" name=<%=CheckName %> value=<%=content %>></span></td>
<%
                  rs1.next();
                }
                else if(j>0 && i>0){
                  CheckName = String.valueOf(j) + "-" + String.valueOf(i);
%>
                  <td align="center" valign="middle"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor="#74A5E8"><input type="checkbox" name=<%=CheckName %> value="checkbox"></td>
<%
                }
              }
%>
              </TR>
<%
            }
          }
          rs1.close();
          rs2.close();
          rs3.close();
        }
      }
    }

%>
    </TBODY>
  </TABLE>

<%
  if(noData==1){
    x=x+1;
%>

    <table width=<%=x*163+147 %> border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="17"><img src="image/table_left.jpg" width="17" height="27"></td>
        <td align="right" background="image/table_left1.jpg"><img src="image/but_select3.gif" width="52" height="22" onClick="testSubmit1()"></td>
        <td width="14" align="right" background="image/table_left1.jpg">&nbsp;</td>
        <td width="9" background="image/T2.jpg"><img src="image/table_left2.jpg" width="9" height="27"></td>
      </tr>
    </table>
<%
  }
%>
</form>

<%
    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
    myStatement6.close();
    myStatement7.close();
    myStatement8.close();
    myStatement9.close();
    myStatement10.close();
    myStatement11.close();
    myStatement12.close();
    myStatement13.close();
    }
      catch(SQLException ex){
        System.err.println("aq.executeQuery: " + ex.getMessage());
        System.err.println("aq.executeQuery: " + sql);
      }
  }
%>
</body>
</html>
