import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class SelectProjectConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nSelectProjectConfirm\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n");
      out.write("<form>\r\n\r\n");
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

      out.write("\r\n\r\n");

  String textName=new String();
  String projectName=new String();
  long projectID=0;
  textName="t"+request.getParameter("radiobutton");
  String sProjectID=request.getParameter(textName);

  projectID=Integer.parseInt(sProjectID);

  String sql=new String();
  ResultSet rs;

  sql="select pro_id,pro_m,pro_leader,pro_manager from project_info where pro_id="+projectID;
//  sql="select pro_id,pro_m,pro_l,pro_n from tctc_project where pro_id="+projectID;
  rs=myStatement.executeQuery(sql);
  if(rs.next()){
//    projectName=rs.getString("pro_n");
    projectName=rs.getString("pro_m");


    session.setAttribute("ProjectName",projectName);
    session.setAttribute("ProjectID",String.valueOf(projectID));
    session.setAttribute("UseCaseName","null");
    session.setAttribute("UseCaseID","null");
    session.setAttribute("FunctionPointName","null");
    session.setAttribute("FunctionPointID","null");
    session.setAttribute("TestElementName","null");
    session.setAttribute("TestElementID","null");
    session.setAttribute("Type","c");
    session.setAttribute("CR_Number","null");

    rs.close();
//    response.sendRedirect("SelectProject.jsp");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='SelectUseCase.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else
  {
    rs.close();
    session.setAttribute("Error","1");
//    response.sendRedirect("SelectProject.jsp");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='SelectProject.jsp'\r\n");
      out.write("</script>\r\n");


  }

      out.write("\r\n");

    myConn.close();
    myStatement.close();
  }

      out.write("\r\n");
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
