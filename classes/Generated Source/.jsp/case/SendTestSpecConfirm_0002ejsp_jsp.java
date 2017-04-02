import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.Date;
import java.util.Enumeration;

public class SendTestSpecConfirm_0002ejsp_jsp extends HttpJspBase {


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

      out.write("<body>\r\n");
      out.write("<form method=\"post\" action=\"load.jsp\">\r\n");
      out.write("\r\n");
      excel.GenerateExcel excel = null;
      synchronized (pageContext) {
        excel = (excel.GenerateExcel) pageContext.getAttribute("excel", PageContext.PAGE_SCOPE);
        if (excel == null){
          try {
            excel = (excel.GenerateExcel) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "excel.GenerateExcel");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "excel.GenerateExcel", exc);
          }
          pageContext.setAttribute("excel", excel, PageContext.PAGE_SCOPE);
        }
      }
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

      out.write("\r\n\r\n");

  String projectName=(String)session.getAttribute("ProjectName");
  String sProjectID=(String)session.getAttribute("ProjectID");
  Date today=new Date();

  String temp=String.valueOf(today);

//  Tue Aug 02 15:57:00 CST 2005
  String temp1=temp.substring(4,7);
  temp1=temp1+"_"+temp.substring(8,10);
  temp1=temp1+"_"+temp.substring(24,28);

  if(!sProjectID.equals("null")){


    long projectID=Integer.parseInt(sProjectID);
//    String fileName="\\..\\opt\\btms\\tsgs\\TestSpecs_"+projectName+"_"+temp1+".xls";
    String fileName="TestSpecs_"+projectName+"_"+temp1+".xls";
    excel.getExcel(sProjectID,fileName);
    session.setAttribute("LoadName",fileName);

  }

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='load.jsp'\r\n");
      out.write("</script>\r\n");

  }

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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
