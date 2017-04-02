import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class UpdateUseCaseConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nUpdatetUseCaseConfirm\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n");
      out.write("<form action=\"SelectUseCase.jsp\">\r\n\r\n\r\n");
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

    String sql=new String();
    ResultSet rs;
    String textName=new String();
    String textName1=new String();
    String textName2=new String();
    String useCaseName=new String();
    String useCaseAB=new String();
    long useCaseID=0;
    String sProjectID=(String)session.getAttribute("ProjectID");
    long projectID=Integer.parseInt(sProjectID);

    textName="t"+request.getParameter("radiobutton");
    textName1="u"+request.getParameter("radiobutton");
    textName2="uu"+request.getParameter("radiobutton");
    useCaseID=Integer.parseInt(request.getParameter(textName));
    useCaseName=(String)request.getParameter(textName1);
    useCaseAB=(String)request.getParameter(textName2);
    useCaseName=rr.replaceString(useCaseName);
    useCaseName=rr.restore(useCaseName);
    useCaseAB=rr.replaceString(useCaseAB);
    useCaseAB=rr.restore(useCaseAB);
    useCaseName=useCaseName.trim();
    useCaseAB=useCaseAB.trim();

    if(rr.checkString(useCaseAB) && rr.checkStringNull(useCaseName)){

      sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID;
      rs=myStatement1.executeQuery(sql);

      if(rs.next()){

        sql="update tctc_uc set uc_name='"+useCaseName+"', uc_ab='"+useCaseAB+"' where uc_id="+useCaseID;
        myStatement2.executeUpdate(sql);

      }
      else{
        session.setAttribute("Error","2.2");
      }
      rs.close();
    }
    else{
      session.setAttribute("Error","2.5");
    }

      out.write("\r\n\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='SelectUseCase.jsp'\r\n");
      out.write("</script>\r\n\r\n");

    myConn.close();
    myStatement1.close();
    myStatement2.close();
  }

      out.write("\r\n");
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
