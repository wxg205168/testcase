import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import java.util.Enumeration;
import javax.sql.*;

public class CreateBugTracker_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style5 {color: #FFFFFF; font-weight: bold;font-size: 16px}\r\n.style67 {font-size: 15px}\r\n.style66 {color: #FF0000}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<script language=\"JavaScript\">\r\n\r\nfunction textCounter(field, countfield, maxlimit) {\r\n\r\n  if (field.value.length > maxlimit)\r\n    field.value = field.value.substring(0, maxlimit);\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\n  document.forms[0].action=\"CreateBugTrackerConfirm.jsp\";\r\n  document.forms[0].submit();\r\n}\r\n\r\nfunction testSubmit1()\r\n{\r\n  document.forms[0].action=\"EnquireBugTracker_Right.jsp\";\r\n  document.forms[0].submit();\r\n}\r\n");
      out.write("</script>\r\n\r\n\r\n");
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
      out.write("\r\n\r\n");
      out.write("<form method=\"post\">\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-Create-Bug.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");

  String sql=new String();
  String sError=(String)session.getAttribute("Error");
  String dis=new String();
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement1=null;
  ResultSet rs;

  try{
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
  }
  catch(SQLException ex){
    session.setAttribute("Error","6.1");
    System.err.println("aq.executeQuery: " + ex.getMessage());

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='CreateBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

  }

  if(!sError.equals("null")){
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=myStatement1.executeQuery(sql);
    if(rs.next()){
      dis=rs.getString("error_dis");

      out.write("\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">");
      out.write("<span class=\"style66\">Error:");
      out.print(dis );
      out.write("</span>");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

    }
    rs.close();
  }
  myConn.close();
  myStatement1.close();


      out.write("\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">Please input information:");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Frequency");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"594\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<select name=\"select\">\r\n        ");
      out.write("<option>Always");
      out.write("</option>\r\n        ");
      out.write("<option>Random");
      out.write("</option>\r\n        ");
      out.write("<option>Sometimes");
      out.write("</option>\r\n      ");
      out.write("</select>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Ponderance");
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<select name=\"select2\">\r\n        ");
      out.write("<option>New");
      out.write("</option>\r\n        ");
      out.write("<option>Negligible");
      out.write("</option>\r\n        ");
      out.write("<option>Spelling");
      out.write("</option>\r\n        ");
      out.write("<option>GUI");
      out.write("</option>\r\n        ");
      out.write("<option>Subordination");
      out.write("</option>\r\n        ");
      out.write("<option>Graveness");
      out.write("</option>\r\n      ");
      out.write("</select>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Summary");
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<input name=\"textfield\" type=\"text\" size=\"98\" maxlength=\"100\">");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Detail");
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<textarea name=\"textarea\" cols=\"75\" rows=\"10\" onKeyDown=\"textCounter(this.form.textarea,this.form.remLen,300);\" onKeyUp=\"textCounter(this.form.textarea,this.form.remLen,300);\">");
      out.write("</textarea>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Provide By ");
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<input name=\"textfield2\" type=\"text\" size=\"12\" maxlength=\"20\">");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select3.gif\" width=\"52\" height=\"22\"  onClick=\"testSubmit()\">&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"image/but_select5.gif\" width=\"52\" height=\"22\"  onClick=\"testSubmit1()\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n\r\n");
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
