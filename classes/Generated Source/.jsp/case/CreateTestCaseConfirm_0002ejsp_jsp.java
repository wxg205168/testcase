import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class CreateTestCaseConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nCreateTestCaseConfirm\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n\r\n");
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
    Statement myStatement1=null;
    Statement myStatement2=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();

      out.write("\r\n\r\n");

  String xx=(String)session.getAttribute("R_Number");
  int x=Integer.parseInt(xx);

  xx=(String)session.getAttribute("C_Number");
  int y=Integer.parseInt(xx);

  ResultSet rs;
  String funID = (String)session.getAttribute("FunctionPointID");
  String sUCID=(String)session.getAttribute("UseCaseID");
  String rContent = new String();
  String cContent = new String();
  String cName = new String();
  String sCheckBox=new String();
  String crName1 = new String();
  String crName2 = new String();
  String sql = new String();
  String projectID = (String)session.getAttribute("ProjectID");
  String type=new String();
  boolean write=false;
  boolean first=true;

  for(int i=1;i<(y+1);i++){
    crName1 = "C" + String.valueOf(i);
    cContent = request.getParameter(crName1);
    type=request.getParameter(String.valueOf(i));

    write=false;
    first=true;

    for(int j=1;j<(x+1);j++){

      cName=String.valueOf(j) + "-" + String.valueOf(i);
      sCheckBox=request.getParameter(cName);
      if(sCheckBox!=null){
        crName2 = "R" + String.valueOf(j);
	if(first){
          rContent = request.getParameter(crName2);
	  first=false;
	}
	else{
	  rContent =rContent + " " + request.getParameter(crName2);
	}
        write=true;

      }
    }
    if(write)
    {
      sql="select * from tctc_test_case where pro_id="+Integer.parseInt(projectID)+" and uc_id="+Integer.parseInt(sUCID)+" and fun_p_id="+Integer.parseInt(funID)+" and condition='"+cContent+"' and result='"+rContent+"'";
      rs=myStatement1.executeQuery(sql);
      if(!rs.next()){
        sql="insert into tctc_test_case (test_case_id,condition,result,fun_p_id,pro_id,uc_id,test_case_type) values(seq_tctc_test_case.nextval,'" + cContent + "','" + rContent + "','" + Integer.parseInt(funID) + "','" + Integer.parseInt(projectID) + "','"+Integer.parseInt(sUCID)+"','"+type+"')";
        myStatement2.executeUpdate(sql);
      }
    }
  }


      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='EnquireTestCase1.jsp'\r\n");
      out.write("</script>\r\n");

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
