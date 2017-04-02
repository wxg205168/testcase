import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;
import java.util.ArrayList;

public class EnquireTestCase_0005fRight_0005fTop_0002ejsp_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    javax.servlet.jsp.PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>");
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.usecase.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"UseCase Name can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteTestCaseConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\n\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestCaseConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n");
      out.write("</script>\r\n\r\n");
      out.write("<body>\r\n\r\n");
      out.write("\r\n");
      mydb.DatabaseBean tt = null;
      synchronized (pageContext) {
        tt = (mydb.DatabaseBean) pageContext.getAttribute("tt", PageContext.PAGE_SCOPE);
        if (tt == null){
          try {
            tt = (mydb.DatabaseBean) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "mydb.DatabaseBean");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "mydb.DatabaseBean", exc);
          }
          pageContext.setAttribute("tt", tt, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      managestring.mystring rr = null;
      synchronized (pageContext) {
        rr = (managestring.mystring) pageContext.getAttribute("rr", PageContext.PAGE_SCOPE);
        if (rr == null){
          try {
            rr = (managestring.mystring) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "managestring.mystring");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "managestring.mystring", exc);
          }
          pageContext.setAttribute("rr", rr, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      compages.compagesData cc = null;
      synchronized (pageContext) {
        cc = (compages.compagesData) pageContext.getAttribute("cc", PageContext.PAGE_SCOPE);
        if (cc == null){
          try {
            cc = (compages.compagesData) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "compages.compagesData");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "compages.compagesData", exc);
          }
          pageContext.setAttribute("cc", cc, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n\r\n");

  Enumeration ss=session.getAttributeNames();

  if(!ss.hasMoreElements()){

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='login.htm'\r\n");
      out.write("</script>\r\n");

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
    Statement myStatement7=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();
    myStatement7=myConn.createStatement();

      out.write("\r\n\r\n");
      out.write("<form method=\"post\">\r\n\r\n  ");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    ");
      out.write("<tr>\r\n      ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n    ");
      out.write("</tr>\r\n  ");
      out.write("</table>\r\n\r\n  ");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    ");
      out.write("<tr>\r\n      ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n      ");
      out.write("<td background=\"image/T2.jpg\">Select Test Case to delete from list:");
      out.write("</td>\r\n      ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("</tr>\r\n  ");
      out.write("</table>\r\n  ");
      out.write("<table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\n  style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    ");
      out.write("<tbody>\r\n      ");
      out.write("<tr align=\"center\" bgcolor=#74A5E8>\r\n        ");
      out.write("<td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;");
      out.write("</td>\r\n        ");
      out.write("<td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Condition");
      out.write("</span>");
      out.write("</td>\r\n        ");
      out.write("<td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Result");
      out.write("</span>");
      out.write("</td>\r\n      ");
      out.write("</tr>\r\n\r\n");

      int noData=0;
      int x=0;

      String sProjectID=(String)session.getAttribute("ProjectID");
      String sUseCaseID=(String)session.getAttribute("UseCaseID");
      String sFunctionPointID=(String)session.getAttribute("FunctionPointID");

      ResultSet rs1,rs2,rs3;
      rs1=null;
      rs2=null;
      rs3=null;

      String checkBoxName=new String();
      String hideName=new String();

      long testCaseID=0;
      int number=0;

      if(sProjectID.equals("null")){
        session.setAttribute("Error","2.1");

      out.write("\r\n        ");
      out.write("<script LANGUAGE=\"javascript\">\r\n          parent.location.href='SelectProject.jsp'\r\n        ");
      out.write("</script>\r\n");

      }
      else if(sUseCaseID.equals("null")){
        session.setAttribute("Error","3.1");

      out.write("\r\n        ");
      out.write("<script LANGUAGE=\"javascript\">\r\n          parent.location.href='SelectUseCase.jsp'\r\n        ");
      out.write("</script>\r\n");

      }
      else if(sFunctionPointID.equals("null")){
        session.setAttribute("Error","4.1");

      out.write("\r\n        ");
      out.write("<script LANGUAGE=\"javascript\">\r\n          parent.location.href='SelectFunctionPoint.jsp'\r\n        ");
      out.write("</script>\r\n");

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
            sql=sql+") order by inf_id";

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
            sql=sql+") order by inf_id";

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

            testCaseID=rs1.getLong("test_case_id");
            checkBoxName="C"+number;
            hideName="H"+number;


      out.write("\r\n            ");
      out.write("<tr align=\"center\" bgcolor=#f8f8f8>\r\n              ");
      out.write("<td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC >");
      out.write("<input type=\"checkbox\" name=");
      out.print(checkBoxName );
      out.write(" />");
      out.write("</td>\r\n              ");
      out.write("<td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(cDis );
      out.write("</td>\r\n              ");
      out.write("<td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(rDis );
      out.write("<input type = \"hidden\" name = ");
      out.print(hideName );
      out.write(" value =");
      out.print(testCaseID );
      out.write(" />");
      out.write("</td>\r\n            ");
      out.write("</tr>\r\n");

          }while(rs1.next());
          session.setAttribute("CR_Number", String.valueOf(number));
          rs3.close();
        }
        rs1.close();
      }

      out.write("\r\n    ");
      out.write("</tbody>\r\n  ");
      out.write("</table>\r\n\r\n");

  if(noData==1){

      out.write("\r\n\r\n    ");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      ");
      out.write("<tr>\r\n        ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n        ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">");
      out.write("</td>\r\n        ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n        ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n      ");
      out.write("</tr>\r\n    ");
      out.write("</table>\r\n");

    noData=0;
  }

      out.write("\r\n");
      out.write("</form>\r\n\r\n");
      out.write("<form method=\"post\" >\r\n\r\n  ");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    ");
      out.write("<tr>\r\n      ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-Testmatrix.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n    ");
      out.write("</tr>\r\n  ");
      out.write("</table>\r\n\r\n");

    if(sProjectID.equals("null")){
      session.setAttribute("Error","2.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectProject.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else if(sUseCaseID.equals("null")){
      session.setAttribute("Error","3.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectUseCase.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else if(sFunctionPointID.equals("null")){
      session.setAttribute("Error","4.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectFunctionPoint.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else{

      long functionPointID=Integer.parseInt(sFunctionPointID);

      sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID;
      rs1=myStatement4.executeQuery(sql);
      int y=0;
      if(rs1.next()){
          y=rs1.getInt("count(*)");
      }
      else{
        y=0;
      }

      sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
      rs2=myStatement5.executeQuery(sql);
      if(rs2.next()){
        x=rs2.getInt("count(*)");
      }
      else{
        x=0;
      }

      String CheckName = new String();
      String content = new String();
      long id=0;
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
      int i=0;
      int nn=0;
      long projectID=Integer.parseInt(sProjectID);
      long useCaseID=Integer.parseInt(sUseCaseID);
      String cDis=new String();
      String rDis=new String();

      if(x>0 && y>0){

      out.write("\r\n  ");
      out.write("<TABLE width=");
      out.print(x*163+147 );
      out.write(" border=1 cellPadding=0 cellSpacing=0\r\n    style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    ");
      out.write("<TBODY>\r\n");


        sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
        rs2=myStatement7.executeQuery(sql);
        rs2.next();

          if(x>0 && y>0)
          {

      out.write("\r\n              ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n");

              for(int j=0;j<(x+1);j++)
              {
                CheckName = null;

                if(j==1 && i==0){

      out.write("\r\n                  ");
      out.write("<td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("</td>\r\n");

                }

                if(i==0 && j==0){

      out.write("\r\n                  ");
      out.write("<TD width=\"163\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("</TD>\r\n");

                }
                if(j>0 && i==0){
                  CheckName = "R" + String.valueOf(j);
                  content = rs2.getString("inf_dis");
                  id=rs2.getLong("inf_id");
                  content=rr.replace(content);
//                  content=rr.replaceBlank(content);

      out.write("\r\n                  ");
      out.write("<TD width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">");
      out.write("<textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >");
      out.print(content );
      out.write("</textarea>");
      out.write("<input type=\"hidden\" name=");
      out.print(CheckName );
      out.write(" value=");
      out.print(id );
      out.write(">");
      out.write("</span>");
      out.write("</TD>\r\n");

                  rs2.next();
                }
              }

      out.write("\r\n              ");
      out.write("</TR>\r\n");

          }

      out.write("\r\n    ");
      out.write("</TBODY>\r\n  ");
      out.write("</TABLE>\r\n");

      }
      rs2.close();
      rs1.close();
    }

      out.write("\r\n\r\n");
      out.write("</form>\r\n\r\n");

    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
    myStatement7.close();
    }
      catch(SQLException ex){
        System.err.println("aq.executeQuery: " + ex.getMessage());
        System.err.println("aq.executeQuery: " + sql);
      }
  }

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }
}
