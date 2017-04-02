import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class CreateTestElementConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nCreateTestElementConfirm\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n\r\n");
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
    DataSource ds=null;
    ds=tt.getDataSource();
    Connection myConn=null;
    Statement myStatement1=null;
    Statement myStatement2=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();

      out.write("\r\n\r\n");

  String sProjectID = new String();
  String sUseCaseID=new String();
  String sFunctionPointID=new String();
  String testElementName = new String();
  long projectID=0;
  long useCaseID=0;
  long functionPointID=0;
  String sql=new String();
  ResultSet rs;
  sProjectID=(String)session.getAttribute("ProjectID");
  sUseCaseID=(String)session.getAttribute("UseCaseID");
  sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  testElementName=request.getParameter("testelement");
  projectID=Integer.parseInt(sProjectID);
  useCaseID=Integer.parseInt(sUseCaseID);
  functionPointID=Integer.parseInt(sFunctionPointID);
  testElementName=rr.replaceString(testElementName);
  testElementName=testElementName.trim();


  if(rr.checkString(testElementName)){

  sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID+" and element_name='"+testElementName+"'";;
  rs=myStatement1.executeQuery(sql);

  if(rs.next()){
    session.setAttribute("Error","4.3");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectTestElement.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{

    sql="insert into tctc_element (element_id,element_name,project_id,uc_id,functionpoint_id) values(seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
    myStatement2.executeUpdate(sql);
    session.setAttribute("Temp",testElementName);
    session.setAttribute("Page","3");
    response.sendRedirect("Temp.jsp");
  }
  rs.close();
  }
  else{
    session.setAttribute("Error","4.5");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectTestElement.jsp'\r\n");
      out.write("</script>\r\n");

  }

    myConn.close();
    myStatement1.close();
    myStatement2.close();
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
