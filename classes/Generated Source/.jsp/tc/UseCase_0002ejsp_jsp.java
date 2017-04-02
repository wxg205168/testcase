import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;

public class UseCase_0002ejsp_jsp extends HttpJspBase {


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!-- DW6 -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>Test Case System");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style1 {font-size: small}\r\n.style88 {\r\n\tfont-weight: bold;\r\n\tfont-size: 36px;\r\n\tfont-family: Arial, Helvetica, sans-serif;\r\n}\r\n.style6 {font-size: small}\r\n.style8 {font-size: small}\r\n\r\n.style11 {\r\n\tcolor: #3399FF;\r\n\tfont-size: small;\r\n}\r\n\r\n.style7 {font-size:large}\r\n\r\n.style10 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style100 {font-size: large}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n\r\n\r\n");
      out.write("<body>\r\n\r\n\r\n");
      out.write("<div id=\"masthead2\">\r\n  ");
      out.write("<center>\r\n  ");
      out.write("<h1 class=\"style88\" id=\"siteName\">Test Case Generator");
      out.write("</h1>\r\n  ");
      out.write("<div id=\"globalNav\" class=\"style1\">\r\n    ");
      out.write("<img alt=\"\" src=\"gblnav_left.gif\" height=\"32\" width=\"4\" id=\"gnl\" /> ");
      out.write("<img alt=\"\" src=\"glbnav_right.gif\" height=\"32\" width=\"4\" id=\"gnr\" />\r\n    ");
      out.write("<div id=\"globalLink1\">\r\n      ");
      out.write("<a href=\"Project.jsp\" target=\"_parent\" id=\"gl1\" class=\"glink\" >Project\r\n      ");
      out.write("</a>");
      out.write("<a href=\"UseCase.jsp\" target='_parent' id=\"gl2\" class=\"glink\" >Use Case\r\n      ");
      out.write("</a>");
      out.write("<a href=\"FunctionPoint.jsp\" target='_parent' id=\"gl3\" class=\"glink\" >Function Point\r\n      ");
      out.write("</a>");
      out.write("<a href=\"TestElement.jsp\" target='_parent' id=\"gl4\" class=\"glink\" >Test Element\r\n      ");
      out.write("</a>");
      out.write("<a href=\"EnquireCRInfromation.jsp\" target='_parent' id=\"gl5\" class=\"glink\" >Test Case Material\r\n      ");
      out.write("</a>");
      out.write("<a href=\"DeleteTestCondition.jsp\" target='_parent' id=\"gl6\" class=\"glink\" >Test Condition\r\n      ");
      out.write("</a>");
      out.write("<a href=\"EnquireTestCase.jsp\" target='_parent' id=\"gl7\" class=\"glink\" >Test Case\r\n      ");
      out.write("</a>");
      out.write("<a href=\"EnquireTestSpec.jsp\" target='_parent' id=\"gl7\" class=\"glink\" >Test Spec\r\n      ");
      out.write("</a>\r\n    ");
      out.write("</div>\r\n\r\n  ");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n\r\n");
      out.write("<div id=\"pagecell3\">\r\n  ");
      out.write("<!--pagecell1-->\r\n  ");
      out.write("<img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> ");
      out.write("<img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n\r\n\r\n  ");
      out.write("<div id=\"col2\">\r\n    ");
      out.write("<div class=\"feature\">\r\n\r\n");
      out.write("<form method=\"post\" action=\"SelectUseCaseConfirm.jsp\">\r\n");
      out.write("\r\n");
      mydb.DatabaseBean tt = null;
      synchronized (request) {
        tt = (mydb.DatabaseBean) pageContext.getAttribute("tt", PageContext.REQUEST_SCOPE);
        if (tt == null){
          try {
            tt = (mydb.DatabaseBean) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "mydb.DatabaseBean");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "mydb.DatabaseBean", exc);
          }
          pageContext.setAttribute("tt", tt, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n\r\n  ");
      out.write("<p>");
      out.write("</p>\r\n      ");
      out.write("<center>\r\n\t  ");
      out.write("<table width=\"750\" border=\"0\">\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>\r\n\t\t    ");
      out.write("<label>");
      out.write("<span class=\"style7\">UseCase List");
      out.write("</span>");
      out.write("</label>\r\n\t\t  ");
      out.write("</h3>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td height=\"30\">");
      out.write("</td>");
      out.write("</tr>\r\n");


  String sql=new String();
  ResultSet rs;
  String sError=(String)session.getAttribute("Error");
  String dis=new String();


  if(sError.equals("2.1") || sError.equals("2.2") || sError.equals("2.3"))
  {
    session.setAttribute("Error","null");
    sql="select error_dis from tctc_error where error_code='"+sError+"'";
    rs=tt.executeQuery(sql);
    if(rs.next())
    {
      dis=rs.getString("error_dis");


      out.write("\r\n\t\t");
      out.write("<tr>");
      out.write("<td align=\"left\">");
      out.write("<h3>");
      out.write("<label>");
      out.write("<span class=\"style12\">Error:");
      out.print(dis );
      out.write("</span>");
      out.write("</label>");
      out.write("</h3>");
      out.write("</td>");
      out.write("</tr>\r\n");

    }
  }

      out.write("\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>\r\n\t\t    ");
      out.write("<label>");
      out.write("<span class=\"style8\">You can select a usecase from list:");
      out.write("</span>");
      out.write("</label>\r\n\t\t  ");
      out.write("</h3>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t  ");
      out.write("</table>\r\n      ");
      out.write("<table width=\"750\" border=\"1\">\r\n        ");
      out.write("<tr>\r\n          ");
      out.write("<td width=\"20\">&nbsp;");
      out.write("</td>\r\n          ");
      out.write("<td width=\"710\" align=\"left\">");
      out.write("<span class=\"style13\">Use Name ");
      out.write("</span>");
      out.write("</td>\r\n        ");
      out.write("</tr>\r\n");

  String radioName=new String();
  String textName=new String();
  String UseCaseName=new String();
  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n\r\n  parent.location.href='SelectProject.jsp'\r\n\r\n");
      out.write("</script>\r\n\r\n");


  }
  else{

  long projectID=Integer.parseInt(sProjectID);
  long UseCaseID=0;

  int number=0;

  sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID;
  rs=tt.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      UseCaseID=rs.getLong("uc_id");
      UseCaseName=rs.getString("uc_name");
      number=number+1;
      radioName=String.valueOf(number);
      textName="t"+String.valueOf(number);

      out.write("\r\n        ");
      out.write("<tr>\r\n");

      if(number==1){

      out.write("\r\n          ");
      out.write("<td align=\"center\">");
      out.write("<input type=\"radio\" name=\"radiobutton\" value=");
      out.print(radioName );
      out.write(" checked=\"checked\" />");
      out.write("</td>\r\n");

      }
      else{

      out.write("\r\n          ");
      out.write("<td align=\"center\">");
      out.write("<input type=\"radio\" name=\"radiobutton\" value=");
      out.print(radioName );
      out.write(" />");
      out.write("</td>\r\n");

      }

      out.write("\r\n\r\n          ");
      out.write("<td align=\"left\">");
      out.print(UseCaseName );
      out.write("<input type=\"hidden\" name=");
      out.print(textName );
      out.write(" value=");
      out.print(UseCaseID );
      out.write(">");
      out.write("</td>\r\n        ");
      out.write("</tr>\r\n");

    }while(rs.next());
    rs.close();

      out.write("\r\n      ");
      out.write("</table>\r\n");

  }

      out.write("\r\n");

  }

  if(noData==1){


      out.write("\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<input type=\"Submit\" name=\"Submit\" value=\"Select UseCase\">\r\n\t  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n      ");
      out.write("<input type=\"button\" name=\"Submit3\" value=\"Delete UseCase\" onclick = \"parent.location.href='DeleteUseCase.jsp'\">\r\n\t  ");
      out.write("</center>\r\n  ");
      out.write("<p>");
      out.write("</p>\r\n");

  }

      out.write("\r\n\r\n");
      out.write("</form>\r\n\r\n");
      out.write("<form method=\"post\" action=\"CreateUseCaseConfirm.jsp\">\r\n\r\n  ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n\r\n\t  ");
      out.write("<center>\r\n\t  ");
      out.write("<table width=\"750\" border=\"0\">\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>\r\n\t\t    ");
      out.write("<label>");
      out.write("<span class=\"style7\">Create UseCase");
      out.write("</span>");
      out.write("</label>\r\n\t\t  ");
      out.write("</h3>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td height=\"30\">");
      out.write("</td>");
      out.write("</tr>\r\n\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>");
      out.write("<span class=\"style8\">Please input Use Case information:");
      out.write("</span>");
      out.write("</h3>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t  ");
      out.write("</table>\r\n      ");
      out.write("<table width=\"750\" border=\"1\">\r\n        ");
      out.write("<tr>\r\n          ");
      out.write("<td width=\"150\" align=\"left\">");
      out.write("<span class=\"style13\">UseCase Name ");
      out.write("</span>");
      out.write("</td>\r\n          ");
      out.write("<td width=\"584\" align=\"left\">");
      out.write("<input name=\"usecase\" type=\"text\" size=\"92\" maxlength=\"100\" />");
      out.write("</td>\r\n        ");
      out.write("</tr>\r\n      ");
      out.write("</table>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<input type=\"Submit\" name=\"Submit2\" value=\"Create UseCase\">\r\n\t  ");
      out.write("</center>\r\n\r\n");
      out.write("</form>\r\n\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n    ");
      out.write("</div>\r\n  ");
      out.write("</div>\r\n  ");
      out.write("<!--end col2 -->\r\n  ");
      out.write("<div id=\"pageNav\">\r\n    ");
      out.write("<div id=\"sectionLinks\">\r\n      ");
      out.write("<p>");
      out.write("<label>");
      out.write("<span class=\"style100\">Project:");
      out.write("</span>");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"style11\">");
      out.print(session.getAttribute("ProjectName") );
      out.write("</span>");
      out.write("</label>");
      out.write("</p>\r\n      ");
      out.write("<p>");
      out.write("<label>");
      out.write("<span class=\"style100\">Usecase:");
      out.write("</span>");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"style11\">");
      out.print(session.getAttribute("UseCaseName") );
      out.write("</span>");
      out.write("</label>");
      out.write("</p>\r\n      ");
      out.write("<p>");
      out.write("<label>");
      out.write("<span class=\"style100\">FunctionPoint:");
      out.write("</span>");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"style11\">");
      out.print(session.getAttribute("FunctionPointName") );
      out.write("</span>");
      out.write("</label>");
      out.write("</p>\r\n      ");
      out.write("<p>");
      out.write("<label>");
      out.write("<span class=\"style100\">TestElement:");
      out.write("</span>");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"style11\">");
      out.print(session.getAttribute("TestElementName") );
      out.write("</span>");
      out.write("</label>");
      out.write("</p>\r\n\r\n    ");
      out.write("</div>\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<br />\r\n");
      out.write("</form>\r\n");
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
