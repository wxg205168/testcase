import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;

public class DeleteFunctionPoint_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<!--\r\n.style7 {font-size: large}\r\n.style8 {font-size: small}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style13 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n\r\n\r\n");
      out.write("<body>\r\n\r\n\r\n");
      out.write("<div id=\"pagecell2\">\r\n  ");
      out.write("<img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> ");
      out.write("<img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n  ");
      out.write("<div id=\"breadCrumb\">\r\n\r\n");
      out.write("<form method=\"post\" action=\"DeleteFunctionPointConfirm.jsp\">\r\n");
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
      out.write("\r\n\r\n  ");
      out.write("<p>");
      out.write("</p>\r\n      ");
      out.write("<center>\r\n\t  ");
      out.write("<table width=\"750\" border=\"0\">\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>\r\n\t\t    ");
      out.write("<label>");
      out.write("<span class=\"style7\">FunctionPoint List");
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

      out.write("\r\n\t    ");
      out.write("<tr>\r\n\t\t  ");
      out.write("<td align=\"left\">");
      out.write("<h3>\r\n\t\t    ");
      out.write("<label>");
      out.write("<span class=\"style8\">You can select a functionpoint to delete from list:");
      out.write("</span>");
      out.write("</label>\r\n\t\t  ");
      out.write("</h3>");
      out.write("</td>\r\n\t    ");
      out.write("</tr>\r\n\t  ");
      out.write("</table>\r\n      ");
      out.write("<table width=\"750\" border=\"1\">\r\n        ");
      out.write("<tr>\r\n          ");
      out.write("<td width=\"20\">&nbsp;");
      out.write("</td>\r\n          ");
      out.write("<td width=\"710\" align=\"left\">");
      out.write("<span class=\"style13\">FunctionPoint Name ");
      out.write("</span>");
      out.write("</td>\r\n        ");
      out.write("</tr>\r\n");

  String radioName=new String();
  String textName=new String();
  String functionPointName=new String();
  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");

  if(sProjectID.equals("null")){

    session.setAttribute("Error","2.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectProject.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else if(sUseCaseID.equals("null")){
    session.setAttribute("Error","3.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectUseCase.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{

  long projectID=Integer.parseInt(sProjectID);
  long useCaseID=Integer.parseInt(sUseCaseID);
  long functionPointID=0;

  int number=0;

  sql="select fun_p_id,fun_n from tctc_function_point where pro_id=" +projectID+" and uc_id="+useCaseID;
  rs=tt.executeQuery(sql);

  if(rs.next()){
    noData=1;

    do{
      functionPointID=rs.getLong("fun_p_id");
      functionPointName=rs.getString("fun_n");
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

      out.write("\r\n          ");
      out.write("<td align=\"left\">");
      out.print(functionPointName );
      out.write("<input type=\"hidden\" name=");
      out.print(textName );
      out.write(" value=");
      out.print(functionPointID );
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
      out.write("<input type=\"Submit\" name=\"Submit3\" value=\"Delete FunctionPoint\" >\r\n\t  ");
      out.write("</center>\r\n  ");
      out.write("<p>");
      out.write("</p>\r\n");

  }

      out.write("\r\n      ");
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
      out.write("</p>\r\n");
      out.write("</form>\r\n\r\n  ");
      out.write("</div>\r\n\r\n");
      out.write("</div>\r\n");
      out.write("<!--end pagecell1-->\r\n\r\n");
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
