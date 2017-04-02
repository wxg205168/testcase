import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class EnquireBugTrackerConfirm_0002ejsp_jsp extends HttpJspBase {


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
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>\r\nEnquireBugTrackerConfirm\r\n");
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style5 {color: #FFFFFF; font-weight: bold;font-size: 16px}\r\n.style67 {font-size: 15px}\r\n.style66 {color: #FF0000}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"JavaScript\">\r\nfunction textCounter(field, countfield, maxlimit) {\r\n\r\n  if (field.value.length > maxlimit)\r\n    field.value = field.value.substring(0, maxlimit);\r\n}\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"UpdateBugStatus_Right.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n\r\n\r\n");
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
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();

      out.write("\r\n");

  String textName=new String();
  String summary=new String();
  String frequency = new String();
  String ponderance = new String();
  String detail = new String();
  String confirmBy = new String();
  String bugStatus = new String();
  String updateDate = new String();
  String remark = new String();
  long bugID=0;
  textName="t"+request.getParameter("radiobutton");
  String sBugID=request.getParameter(textName);

  bugID=Integer.parseInt(sBugID);

  String sql=new String();
  ResultSet rs;

  sql="select * from tctc_bug where bug_id="+bugID;
  rs=myStatement.executeQuery(sql);
   if(rs.next()){
    summary=rs.getString("BUG_SUMMARY");
	frequency=rs.getString("BUG_FREQUENCY");
	ponderance=rs.getString("BUG_PONDERANCE");
	detail=rs.getString("BUG_DETAIL");
	confirmBy=rs.getString("BUG_CONFIRM");
	bugStatus=rs.getString("BUG_STATUS");
	updateDate=rs.getString("BUG_CONFIRM_DATE");
    bugID=rs.getLong("BUG_ID");
	remark=rs.getString("BUG_REMARK");

if (confirmBy==null){
	confirmBy="";}
	else{
		confirmBy=rs.getString("BUG_CONFIRM");}
		if (remark==null){
	remark="";}
	else{
		remark=rs.getString("BUG_REMARK");}
	session.setAttribute("BUG_ID",String.valueOf(bugID));
rs.close();

      out.write("\r\n");
      out.write("<form method=\"post\">\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-Create-Bug.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">Please update bug status:");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Frequency");
      out.write("</TD>\r\n\t  ");
      out.write("<TD width=\"594\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\">");
      out.print(frequency);
      out.write("</TD>");
      out.write("</TR>\r\n\t  ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Ponderance");
      out.write("</TD>\r\n\t   ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >\r\n\t   ");
      out.print(ponderance);
      out.write("</TD>\r\n\t   ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Summary");
      out.write("</TD>\r\n\t  ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\">");
      out.write("<input name=\"summary\" type=\"text\" readonly=true  value=");
      out.print(summary);
      out.write(" size=\"98\">\r\n\t  ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Detail");
      out.write("</TD>\r\n\t  ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >\r\n\t  ");
      out.write("<textarea name=\"detail\" readonly=true cols=\"85\" rows=\"10\">");
      out.print(detail);
      out.write("</textarea>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Confirm By ");
      out.write("</TD>\r\n\t   ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.write("<input name=\"confirm\" type=\"text\"  ize=\"12\" maxlength=\"20\" value=");
      out.print(confirmBy);
      out.write(">");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n\t");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Bug Status ");
      out.write("</TD>\r\n\t   ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >\r\n\t   ");
 if (bugStatus.equals("Open")) {
      out.write("\r\n\t   ");
      out.write("<select name=\"selectstatus\">\r\n        ");
      out.write("<option selected>Open");
      out.write("</option>\r\n        ");
      out.write("<option>Fixed");
      out.write("</option>\r\n        ");
      out.write("<option>Close");
      out.write("</option>\r\n      ");
      out.write("</select>\r\n\t  ");
}
      out.write("\r\n\t  ");
 if (bugStatus.equals("Fixed")) {
      out.write("\r\n\t   ");
      out.write("<select name=\"selectstatus\">\r\n        ");
      out.write("<option >Open");
      out.write("</option>\r\n        ");
      out.write("<option selected>Fixed");
      out.write("</option>\r\n        ");
      out.write("<option>Close");
      out.write("</option>\r\n      ");
      out.write("</select>\r\n\t  ");
}
      out.write("\r\n\t  ");
 if (bugStatus.equals("Close")) {
      out.write("\r\n\t   ");
      out.write("<select name=\"selectstatus\">\r\n        ");
      out.write("<option >Open");
      out.write("</option>\r\n        ");
      out.write("<option >Fixed");
      out.write("</option>\r\n        ");
      out.write("<option selected>Close");
      out.write("</option>\r\n      ");
      out.write("</select>\r\n\t  ");
}
      out.write("\r\n\t  ");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\">&nbsp;Remark");
      out.write("</TD>\r\n\t  ");
      out.write("<TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >\r\n\t  ");
      out.write("<textarea name=\"textremark\"  \r\n\t  cols=\"85\" rows=\"5\" onKeyDown=\"textCounter(this.form.textremark,this.form.remLen,300);\" onKeyUp=\"textCounter(this.form.textremark,this.form.remLen,300);\">");
      out.print(remark);
      out.write("</textarea>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n\t");
      out.write("</TABLE>\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select4.gif\" width=\"52\" height=\"22\"  onClick=\"testSubmit()\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n\r\n");

  }
  else
  {
    rs.close();
    session.setAttribute("Error","1");
//    response.sendRedirect("SelectProject.jsp");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='EnquireBugTracker.jsp'\r\n");
      out.write("</script>\r\n");


  }

      out.write("\r\n");

    myConn.close();
    myStatement.close();
  }

      out.write("\r\n\r\n\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n\r\n\r\n");
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
