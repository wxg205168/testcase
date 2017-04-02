import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class CreateFunctionPointPreviousConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\nCreateFunctionPointConfirm\r\n");
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


  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  long projectID=0;
  long useCaseID=0;

  if(sProjectID.equals("null") || sProjectID.equals(null)){
    session.setAttribute("Error","2.1");

      out.write("\r\n\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectProject.jsp'\r\n");
      out.write("</script>\r\n\r\n");

  }
  else if(sUseCaseID.equals("null") || sUseCaseID.equals(null)){
    session.setAttribute("Error","3.1");

      out.write("\r\n");
      out.write("<script LANGUAGE=\"javascript\">\r\n  parent.location.href='SelectUseCase.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{
    projectID=Integer.parseInt(sProjectID);
    useCaseID=Integer.parseInt(sUseCaseID);

    String functionPointName = new String();
    String sql=new String();
    ResultSet rs;
    functionPointName=request.getParameter("functionpoint");
    functionPointName=rr.replaceString(functionPointName);
    functionPointName=functionPointName.trim();

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

    sql="select * from tctc_function_point where pro_id=" +projectID+" and uc_id="+useCaseID;
    rs=myStatement4.executeQuery(sql);

    if(rs.next()){

      //sort
      text_sort_name="s"+request.getParameter("radiobutton");

      sort_id=(String)request.getParameter(text_sort_name);
      sortID=Integer.parseInt(sort_id);
      sortNextID=sortID+1;
      sNumber=(String)session.getAttribute("functionpointNumber");
      iHave=1;

    }

    //enquire same record
    if(rr.checkStringNull(functionPointName)){

    sql="select fun_n from tctc_function_point where pro_id="+projectID+" and uc_id=" + useCaseID +" and fun_n='"+functionPointName+"'";
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      session.setAttribute("Error","3.3");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n    parent.location.href='SelectFunctionPoint.jsp'\r\n");
      out.write("</script>\r\n");

    }
    else{
      if(iHave==1){
        sRadioName=(String)request.getParameter("radiobutton");

        radioID=Integer.parseInt(sRadioName);

        while(radioID <= Integer.parseInt(sNumber)){

          text_id_name="t"+String.valueOf(radioID);
          sElementID=(String)request.getParameter(text_id_name);
          elementID=Integer.parseInt(sElementID);

          sql="update tctc_function_point set fun_sort_id='"+sortNextID+"' where fun_p_id="+elementID;
          myStatement3.executeUpdate(sql);
          sortNextID++;
          radioID++;
        }

        sql="insert into tctc_function_point (fun_sort_id,fun_p_id,fun_n,pro_id,uc_id) values('"+ sortID+"',seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')";
        myStatement2.executeUpdate(sql);
      }
      else{
        sql="insert into tctc_function_point (fun_sort_id,fun_p_id,fun_n,pro_id,uc_id) values('1',seq_tctc_function_point.nextval,'" + functionPointName + "','" + projectID + "','"+useCaseID+"')";
        myStatement2.executeUpdate(sql);
      }

      session.setAttribute("Temp",functionPointName);
      session.setAttribute("Page","2");
      response.sendRedirect("Temp.jsp");
    }
    rs.close();
    }
    else{
    session.setAttribute("Error","3.5");

      out.write("\r\n    ");
      out.write("<script language=\"JavaScript\">\r\n      parent.location.href='SelectFunctionPoint.jsp'\r\n    ");
      out.write("</script>\r\n");

    }
  }

      out.write("\r\n");

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
