import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class EnquireTestCase_0002ejsp_jsp extends HttpJspBase {


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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>Test Case");
      out.write("</title>\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<frameset rows=\"146,*\" cols=\"*\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n  ");
      out.write("<frame src=\"Top.jsp\" name=\"topFrame\" scrolling=\"NO\" noresize >\r\n  ");
      out.write("<frameset rows=\"*\" cols=\"180,*\" framespacing=\"0\" frameborder=\"yes\" border=\"0\" bordercolor=\"#CCCCCC\">\r\n    ");
      out.write("<frame src=\"Left_FunctionPoint.jsp\" name=\"leftFrame\" scrolling=\"NO\">\r\n    ");
      out.write("<frame src=\"EnquireTestCase_Right.jsp\" name=\"mainFrame\">\r\n  ");
      out.write("</frameset>\r\n");
      out.write("</frameset>\r\n");
      out.write("<noframes>");
      out.write("<body>\r\n");
      out.write("</body>");
      out.write("</noframes>\r\n");
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
