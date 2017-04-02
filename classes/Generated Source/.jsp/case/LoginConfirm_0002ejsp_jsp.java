import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;

public class LoginConfirm_0002ejsp_jsp extends HttpJspBase {


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
      response.setContentType("text/html; charset=gb2312");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>LoginConfirm");
      out.write("</title>\r\n");
      out.write("<link rel=stylesheet href=\"style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<body>\r\n");
      out.write("\r\n\r\n");
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

    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();


  String name1=request.getParameter("user_id");
  String pwd1=request.getParameter("password");
  String sql="select * from tctc_employee where em_n='" + name1 + "' and em_pwd='" + pwd1 + "'";

//  ResultSet rs=tt.executeQuery(sq1);
  ResultSet rs=myStatement.executeQuery(sql);

  if(rs.next()){
    session.setMaxInactiveInterval(1800);
    session.setAttribute("UserName",name1);
    session.setAttribute("ProjectName","null");
    session.setAttribute("ProjectID","null");
    session.setAttribute("UseCaseName","null");
    session.setAttribute("UseCaseID","null");
    session.setAttribute("FunctionPointName","null");
    session.setAttribute("FunctionPointID","null");
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");
    session.setAttribute("C_Number","null");
    session.setAttribute("R_Number","null");
    session.setAttribute("Temp","null");
    session.setAttribute("Error","null");
    session.setAttribute("Temp","null");
    session.setAttribute("Page","null");
    session.setAttribute("UseCasePage","null");
    session.setAttribute("CR_Number2","null");
    session.setAttribute("LoadName","null");
    session.setAttribute("elementNumber","null");
    session.setAttribute("functionpointNumber","null");
    rs.close();
    myConn.close();
    myStatement.close();

      out.write("\r\n    ");
      if (true) {
        pageContext.forward("SelectProject.jsp");
        return;
      }
      out.write("\r\n");

  }
  else{
    rs.close();
    myConn.close();
    myStatement.close();


      out.write("\r\n    ");
      if (true) {
        pageContext.forward("login.htm");
        return;
      }
      out.write("\r\n\r\n");

  }



      out.write("\r\n\r\n");
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
