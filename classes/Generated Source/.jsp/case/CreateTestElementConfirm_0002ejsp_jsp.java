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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
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
    Statement myStatement3=null;
    Statement myStatement4=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();

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

  int iHave=0;
  int sortID=0;
  int sortNextID=0;
  int radioID=0;
  int elementID=0;
  String text_sort_name=new String();
  String sort_id=new String();
  String text_id_name=new String();
  String sNumber=new String();
  String sElementID=new String();
  String sRadioName=new String();

  sql="select * from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID;
  rs=myStatement4.executeQuery(sql);

  if(rs.next()){

    //sort
    text_sort_name="s"+request.getParameter("radiobutton");

    sort_id=(String)request.getParameter(text_sort_name);
    sortID=Integer.parseInt(sort_id);
    sortNextID=sortID+2;
    sNumber=(String)session.getAttribute("elementNumber");
    iHave=1;

  }
  //enquire same record in DB
  if(rr.checkStringNull(testElementName)){

    sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID+" and element_name='"+testElementName+"'";;
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","4.3");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectTestElement.jsp'\r\n");
      out.write("</script>\r\n");

    }
    else{
      if(iHave==1){
        sRadioName=(String)request.getParameter("radiobutton");

        radioID=Integer.parseInt(sRadioName);
        radioID=radioID+1;

        while(radioID <= Integer.parseInt(sNumber)){

          text_id_name="t"+String.valueOf(radioID);
          sElementID=(String)request.getParameter(text_id_name);
          elementID=Integer.parseInt(sElementID);

          sql="update tctc_element set element_sort_id='"+sortNextID+"' where element_id="+elementID;
          myStatement2.executeUpdate(sql);
          sortNextID++;
          radioID++;
        }

        sortID=sortID+1;
        sql="insert into tctc_element (element_sort_id,element_id,element_name,project_id,uc_id,functionpoint_id) values('"+ sortID+"', seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
        myStatement3.executeUpdate(sql);
      }
      else{
        sql="insert into tctc_element (element_sort_id,element_id,element_name,project_id,uc_id,functionpoint_id) values('1', seq_tctc_element.nextval,'" + testElementName + "','" + projectID + "','"+useCaseID+"','"+functionPointID+"')";
        myStatement2.executeUpdate(sql);

      }
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
    myStatement3.close();
    myStatement4.close();
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
