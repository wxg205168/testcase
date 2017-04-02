import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class CreateTestConditionConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nCreateTestConditionConfirm\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n");
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

  String sql=new String();
  ResultSet rs1, rs2;
  int first=1;
  rs1=null;
  rs2=null;
  String checkName=new String();
  String hideName=new String();
  String checkValue=new String();
  String sNumber=(String)session.getAttribute("CR_Number2");
  long number=Integer.parseInt(sNumber);

  String condition=new String();
  String content=new String();
  String sInformationID=new String();
  long informationID=0;


  long functionPointID=Integer.parseInt((String)session.getAttribute("FunctionPointID"));
  long projectID=Integer.parseInt((String)session.getAttribute("ProjectID"));
  long useCaseID=Integer.parseInt((String)session.getAttribute("UseCaseID"));

  for(int i=1;i<(number+1);i++)
  {

    checkName="C"+i;
    checkValue=request.getParameter(checkName);

    hideName="T"+checkValue+checkName;
    sInformationID=request.getParameter(hideName);

    informationID=Integer.parseInt(sInformationID);

    if(first==1){
      content=String.valueOf(informationID);
      first=0;
    }
    else{
      content=content+" "+String.valueOf(informationID);
    }

  }

//  rs1.close();


  if(!content.equals(null))
  {
    sql="select * from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID+" and inf_dis='"+content+"'";
    rs2=myStatement1.executeQuery(sql);
    if(!rs2.next()){
      sql="insert into tctc_information (inf_id,inf_type,inf_dis,fun_p_id,project_id,uc_id) values(seq_tctc_information.nextval,'condition','" + content + "','" + functionPointID + "','"+projectID+"','"+useCaseID+"')";
      myStatement2.executeUpdate(sql);
    }
    rs2.close();
  }


      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='DeleteTestCondition.jsp'\r\n");
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
