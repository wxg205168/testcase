import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import java.util.Enumeration;
import javax.sql.*;

public class EnquireBugTracker_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"EnquireBugTrackerConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\nfunction aaa()\r\n{\r\ndocument.forms[0].action=\"EnquireBugTrackerStatus.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n\r\n\r\n");
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
      out.write("\r\n\r\n");
      out.write("<form method=\"post\">\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-Create-Bug.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");

  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement=null;
  myConn=ds.getConnection();
  myStatement=myConn.createStatement();


  String sql=new String();
  ResultSet rs=null;
  ResultSet rs1=null;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();

  if(sError.equals("1") || sError.equals("2.1"))
  {
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=myStatement.executeQuery(sql);
    if(rs.next())
    {
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
  }


      out.write("\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">Please select status: ");
      out.write("<select id=\"c1\" name=\"status\" onchange=\"aaa()\">  \r\n");
 String status=(String)session.getAttribute("STATUS");
if (status==null){
	status="Open";}
	else {
		status=status;}
if (status.equals("Open")||(status==null)) {
      out.write("\r\n        ");
      out.write("<option selected>Open");
      out.write("</option>\r\n        ");
      out.write("<option>Fixed");
      out.write("</option>\r\n\t\t");
      out.write("<option>Close");
      out.write("</option>\r\n\t\t");
}
      out.write("\r\n\t\t");
if (status.equals("Fixed")) {
      out.write("\r\n        ");
      out.write("<option >Open");
      out.write("</option>\r\n        ");
      out.write("<option selected>Fixed");
      out.write("</option>\r\n\t\t");
      out.write("<option>Close");
      out.write("</option>\r\n\t\t");
}
      out.write("\r\n\t\t");
if (status.equals("Close")) {
      out.write("\r\n        ");
      out.write("<option >Open");
      out.write("</option>\r\n        ");
      out.write("<option >Fixed");
      out.write("</option>\r\n\t\t");
      out.write("<option selected>Close");
      out.write("</option>\r\n\t\t");
}
      out.write("\r\n\t\t");
      out.write("</select>");
      out.write("</td>\r\n");
      out.write("<script>  \r\n\r\n");
      out.write("</script>  \r\n\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px;\r\nBORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  ");
      out.write("<TBODY>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC\r\nclass=\"style4\" >&nbsp;");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"320\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC\r\nbgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Summary ");
      out.write("</span>");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"197\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC\r\nbgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5 bold\">Provide By ");
      out.write("</span>");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"200\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC\r\nbgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5 bold\">Provide Date ");
      out.write("</span>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n\r\n\t");


 String radioName=new String();
 String summary = new String();
 String provideBy = new String();
 String provideDate = new String();
 int noData=0;
 int number=0;
  String textName=new String();
  long bugID=0;

 sql="select BUG_ID,bug_summary,bug_create,bug_create_date from tctc_bug where bug_status='"+status+"' order by bug_id";

  rs=myStatement.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
		summary = rs.getString("bug_summary");
		provideBy = rs.getString("bug_create");
        provideDate = rs.getString("bug_create_date");
		bugID=rs.getLong("BUG_ID");

		  number=number+1;
      radioName=String.valueOf(number);
		textName="t"+String.valueOf(number);
		
		
      out.write("\r\n\t\t  ");
      out.write("<TR align=\"center\" bgColor=#f8f8f8>\r\n");

      if(number==1){

      out.write("\r\n      ");
      out.write("<TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC >");
      out.write("<input\r\ntype=\"radio\" name=\"radiobutton\" value=");
      out.print(radioName );
      out.write(" checked=\"checked\">");
      out.write("</TD>\r\n");

      }
      else{

      out.write("\r\n      ");
      out.write("<TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC >");
      out.write("<input\r\ntype=\"radio\" name=\"radiobutton\" value=");
      out.print(radioName );
      out.write(">");
      out.write("</TD>\r\n");

      }

      out.write("\r\n");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\"\r\n>");
      out.print(summary );
      out.write("<input type=\"hidden\" name=");
      out.print(textName );
      out.write(" value=");
      out.print(bugID );
      out.write(">");
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\"\r\n>");
      out.print(provideBy );
      out.write("</TD>\r\n      ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\"\r\n>");
      out.print(provideDate );
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");

    }while(rs.next());
    rs.close();
  }
  else{
    noData=0;
    rs.close();
  }

      out.write("\r\n  ");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");

  if(noData==1)
  {
 
      out.write("\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img\r\nsrc=\"image/but_select.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\" >");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\"\r\nheight=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

  }

      out.write("\r\n");
      out.write("</form>\r\n");

    myConn.close();
    myStatement.close();


      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
