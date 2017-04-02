import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class CreateCRInformationConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nCreateCRInformationConfirm\r\n");
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


  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  String sFunctionPointID=(String)session.getAttribute("FunctionPointID");
  String sTestElementID=(String)session.getAttribute("TestElementID");

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
  else if(sFunctionPointID.equals("null")){
    session.setAttribute("Error","4.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectFunctionPoint.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{

  long projectID=Integer.parseInt(sProjectID);
  long useCaseID=Integer.parseInt(sUseCaseID);
  long functionPointID=Integer.parseInt(sFunctionPointID);
  long testElementID=0;

  String MaterialType=(String)request.getParameter("radiobutton");
  String type=new String();
  String sType=new String();
  String sql;
  ResultSet rs;


  if((MaterialType.equals("1") && (!sTestElementID.equals("null"))) || MaterialType.equals("2"))
  {

  if(MaterialType.equals("1")){
    type="c";
    sType="condition";
    testElementID=Integer.parseInt(sTestElementID);

  }
  else if(MaterialType.equals("2")){
    type="r";
    sType="result";
  }
  String dis= request.getParameter("textarea");
  dis=rr.replaceString(dis);
  dis=rr.restore(dis);
  dis=dis.trim();

  if(dis==null){
    session.setAttribute("Error","5.3");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='EnquireCRInfromation.jsp'\r\n");
      out.write("</script>\r\n");


  }
  else{

  sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='"+type +"' and inf_dis='"+dis+"' and project_id="+projectID+" and uc_id="+useCaseID;
  rs=myStatement1.executeQuery(sql);
  if (rs.next()){
    rs.close();
    session.setAttribute("Error","5.2");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='EnquireCRInfromation.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{

    if(rr.checkString(dis)){

      if(MaterialType.equals("1")){
        sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id,element_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"','"+testElementID+"')";
      }
      else if(MaterialType.equals("2")){
        sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'" + type + "','" + dis + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')";
      }

      myStatement2.executeUpdate(sql);
      rs.close();
      session.setAttribute("Type",type);
    }
    else{
      session.setAttribute("Error","5.3");
    }


      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n    parent.location.href='EnquireCRInfromation.jsp'\r\n");
      out.write("</script>\r\n");

  }
  }
  }
  else
  {
    session.setAttribute("Error","5.1");


      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectTestElement.jsp'\r\n");
      out.write("</script>\r\n");

  }
  }

      out.write("\r\n");

    myConn.close();
    myStatement1.close();
    myStatement2.close();
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
