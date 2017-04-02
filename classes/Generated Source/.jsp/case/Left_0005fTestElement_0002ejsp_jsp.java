import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.Enumeration;

public class Left_0005fTestElement_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<!--\r\nbody {\r\n\tbackground-image: url(image/left_bg.jpg);\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n}\r\n.style2 {\r\n\tfont-size: 18px;\r\n\tfont-weight: bold;\r\n\tcolor: #FFFFFF;\r\n}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<body>\r\n");
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

      out.write("\r\n\r\n");

  String temp;

      out.write("\r\n");
      out.write("<table width=\"180\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"10\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"170\">");
      out.write("<span class=\"style2\"> Project:");
      out.write("</span>");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n");

  temp=new String();
  temp=(String)session.getAttribute("ProjectName");
  if(temp.equals("null")){
    temp="N.A.";
  }

      out.write("\r\n    ");
      out.write("<td height=\"50\">");
      out.print(rr.replace(temp) );
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td> ");
      out.write("<span class=\"style2\">Usecase:");
      out.write("</span>");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n");

  temp=new String();
  temp=(String)session.getAttribute("UseCaseName");
  if(temp.equals("null")){
    temp="N.A.";
  }

      out.write("\r\n    ");
      out.write("<td height=\"50\">");
      out.print(rr.replace(temp) );
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td>");
      out.write("<span class=\"style2\">FunctionPoint:");
      out.write("</span>");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n");

  temp=new String();
  temp=(String)session.getAttribute("FunctionPointName");
  if(temp.equals("null")){
    temp="N.A.";
  }

      out.write("\r\n    ");
      out.write("<td height=\"50\">");
      out.print(rr.replace(temp) );
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td>");
      out.write("<span class=\"style2\">TestElement:");
      out.write("</span>");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>\r\n");

  temp=new String();
  temp=(String)session.getAttribute("TestElementName");
  if(temp.equals("null")){
    temp="N.A.";
  }

      out.write("\r\n    ");
      out.write("<td height=\"50\">");
      out.print(rr.replace(temp) );
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");

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
