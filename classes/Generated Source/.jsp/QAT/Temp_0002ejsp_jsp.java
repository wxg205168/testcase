import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;

public class Temp_0002ejsp_jsp extends HttpJspBase {


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
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n");
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
      out.write("\r\n");
      out.write("<form method=\"POST\" action=\"UseCase.jsp\">\r\n");

  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement=null;
  myConn=ds.getConnection();
  myStatement=myConn.createStatement();

  String sPage=(String)session.getAttribute("Page");
  String temp=(String)session.getAttribute("Temp");
  String sql=new String();
  String sProjectID=new String();
  String sUseCaseID=new String();
  String sFunctionPointID=new String();
  ResultSet rs;

  if(sPage.equals("1")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sql="select uc_id from tctc_uc where project_id="+Integer.parseInt(sProjectID)+" and uc_name='"+temp+"'";
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("uc_id");

      session.setAttribute("UseCaseName",temp);
      session.setAttribute("UseCaseID",String.valueOf(id));
      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","2.4");
    }
//    response.sendRedirect("UseCase.jsp");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectUseCase.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else if(sPage.equals("2")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sUseCaseID=(String)session.getAttribute("UseCaseID");
    sql="select fun_p_id from tctc_function_point where pro_id="+Integer.parseInt(sProjectID)+" and uc_id=" + Integer.parseInt(sUseCaseID) +" and fun_n='"+temp+"'";
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("fun_p_id");
      session.setAttribute("FunctionPointName",temp);
      session.setAttribute("FunctionPointID",String.valueOf(id));
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","3.4");
    }

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectFunctionPoint.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else if(sPage.equals("3")){
    sProjectID=(String)session.getAttribute("ProjectID");
    sUseCaseID=(String)session.getAttribute("UseCaseID");
    sFunctionPointID=(String)session.getAttribute("FunctionPointID");
    sql="select element_id,element_name from tctc_element where project_id=" +Integer.parseInt(sProjectID)+" and uc_id="+Integer.parseInt(sUseCaseID) + " and functionpoint_id="+Integer.parseInt(sFunctionPointID)+" and element_name='"+temp+"'";;
    rs=myStatement.executeQuery(sql);
    long id=0;

    if(rs.next())
    {
      id=rs.getLong("element_id");
      session.setAttribute("TestElementName",temp);
      session.setAttribute("TestElementID",String.valueOf(id));
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");
    }
    else{
      session.setAttribute("Error","4.4");
    }

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectTestElement.jsp'\r\n");
      out.write("</script>\r\n");

  }
  myConn.close();
  myStatement.close();


      out.write("\r\n\r\n");
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
