import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class EnquireTestSpec_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>ÎÞ±êÌâÎÄµµ");
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"SendTestSpecConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n\r\n");
      out.write("</script>\r\n\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n\r\n");

  Enumeration ss=session.getAttributeNames();

  if(!ss.hasMoreElements()){

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='login.htm'\r\n");
      out.write("</script>\r\n");

  }
  else{
    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement1=null;
    Statement myStatement2=null;
    Statement myStatement3=null;
    Statement myStatement4=null;
    Statement myStatement5=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();
    myStatement5=myConn.createStatement();

      out.write("\r\n\r\n");
      out.write("<form method=\"post\">\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-TestSpec-List.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">View Test Case from list:");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  ");
      out.write("<TBODY>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"100\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Object");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Condition");
      out.write("</span>");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Result");
      out.write("</span>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");

  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");

  String sql=new String();
  ResultSet rs1,rs2,rs3,rs4;
  rs4=null;

  long testCaseID=0;
  int number=0;

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectProject.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{
    long projectID=Integer.parseInt(sProjectID);
    long functionPointID=0;
    String functionPointName=new String();
    String cDis = new String();
    String rDis = new String();
    int first=1;
    int first2=1;
    int first3=1;
    String sUseCaseID=(String)session.getAttribute("UseCaseID");
    long useCaseID=0;
    String[] temp;
    String condition1=new String();

//   if(sUseCaseID.equals(null) || sUseCaseID.equals("null")){
//     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id";
//   }

//   else{
//     useCaseID=Integer.parseInt(sUseCaseID);
//     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id" +" and uc_id="+useCaseID;
//   }

    try{
      useCaseID=Integer.parseInt(sUseCaseID);
      sql="select fun_p_id from tctc_test_case where pro_id=" +projectID +" and uc_id="+useCaseID + " group by fun_p_id";
    }
    catch(NumberFormatException ex){
      sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id";
    }

    rs1=myStatement1.executeQuery(sql);
    if(rs1.next())
    {
      noData=1;
      do
      {
        first=1;
        functionPointID=rs1.getLong("fun_p_id");
        sql="select fun_n from tctc_function_point where fun_p_id="+functionPointID;

        rs2=myStatement2.executeQuery(sql);
        if(rs2.next())
        {
          functionPointName=rs2.getString("fun_n");
          functionPointName=rr.replace(functionPointName);
          sql="select condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID;
          rs3=myStatement3.executeQuery(sql);
          while(rs3.next())
          {
            cDis=rs3.getString("condition");
            rDis=rs3.getString("result");

            first2=1;
            first3=1;

            temp=rr.getID(cDis);

        sql="select inf_dis from tctc_information where inf_id in ( ";
        for(int i=0;i<temp.length;i++){
          if(first2==1){
            sql=sql+Integer.parseInt(temp[i]);
            first2=0;
          }
          else{
            sql=sql+","+Integer.parseInt(temp[i]);
          }

        }
        sql=sql+") order by inf_id";

        rs4=myStatement4.executeQuery(sql);
        first2=1;

        while(rs4.next()){
          condition1=rs4.getString("inf_dis");
          condition1=rr.replace(condition1);
          if(first2==1){
            cDis=condition1;
            first2=0;
          }
          else{
            cDis=cDis+"<br>"+condition1;
          }
        }

         temp=rr.getID(rDis);

         sql="select inf_dis from tctc_information where inf_id in ( ";
         for(int i=0;i<temp.length;i++){
           if(first3==1){
             sql=sql+Integer.parseInt(temp[i]);
             first3=0;
           }
           else{
             sql=sql+","+Integer.parseInt(temp[i]);
           }

         }
         sql=sql+")";

         rs4=myStatement5.executeQuery(sql);
         first3=1;

         while(rs4.next()){
           condition1=rs4.getString("inf_dis");
           condition1=rr.replace(condition1);
           if(first3==1){
             rDis=condition1;
             first3=0;
           }
           else{
             rDis=rDis+"<br>"+condition1;
           }

         }



            rs4.close();


      out.write("\r\n\r\n    ");
      out.write("<TR align=\"center\" bgColor=#f8f8f8>\r\n");

            if(first==1){
              first=0;

      out.write("\r\n      ");
      out.write("<TD width=\"100\" height=\"25\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC >");
      out.print(functionPointName );
      out.write("</TD>\r\n");

            }
            else{

      out.write("\r\n      ");
      out.write("<TD width=\"100\" height=\"25\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC >&nbsp;");
      out.write("</TD>\r\n");

            }

      out.write("\r\n\r\n\r\n      ");
      out.write("<TD width=\"325\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(cDis );
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"325\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(rDis );
      out.write("</TD>\r\n\r\n\r\n    ");
      out.write("</TR>\r\n");

          }
        }
      }while(rs1.next());
    }
  }

      out.write("\r\n  ");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n\r\n");

  if(noData==1){

      out.write("\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select2.gif\" width=\"52\" height=\"22\" onclick=\"testSubmit()\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

  }

      out.write("\r\n\r\n");
      out.write("</form>\r\n");

    myConn.close();
    myStatement1.close();
    myStatement2.close();
    myStatement3.close();
    myStatement4.close();
    myStatement5.close();
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
