import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class UpdateBugStatus_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<head>\r\n\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n\r\n");
      out.write("<form>\r\n");
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
      out.write("\r\n");
      email.SendEmail mail = null;
      synchronized (pageContext) {
        mail = (email.SendEmail) pageContext.getAttribute("mail", PageContext.PAGE_SCOPE);
        if (mail == null){
          try {
            mail = (email.SendEmail) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "email.SendEmail");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "email.SendEmail", exc);
          }
          pageContext.setAttribute("mail", mail, PageContext.PAGE_SCOPE);
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
	 Statement myStatement1=null;
	 Statement myStatement2=null;
  Statement myStatement3=null;
    myConn=ds.getConnection();
    myStatement=myConn.createStatement();
	myStatement1=myConn.createStatement();
	myStatement2=myConn.createStatement();
	myStatement3=myConn.createStatement();

      out.write("\r\n");

	 String sql=new String();
String sql1=new String();
 String sql2=new String();
  String sql3=new String();
  ResultSet rs;
  ResultSet rs2;
   ResultSet rs3;

String bugStatus=new String();
String updateDate=new String();
String confirmBy=new String();
String remark=new String();
String summary=new String();
String detail=new String();
  int number=Integer.parseInt((String)session.getAttribute("BUG_ID"));
  bugStatus=(String)request.getParameter("selectstatus");
   updateDate=(String)request.getParameter("dateselect");
   confirmBy=(String)request.getParameter("confirm");
   remark=(String) request.getParameter("textremark");
   summary= (String) request.getParameter("summary");
   detail= (String) request.getParameter("detail");

  bugStatus=rr.restore(bugStatus);
  bugStatus=rr.replaceString(bugStatus);
 confirmBy=rr.restore(confirmBy);
  confirmBy=rr.replaceString(confirmBy);
 remark=rr.restore(remark);
  remark=rr.replaceString(remark);
  confirmBy=rr.removeBlank(confirmBy.trim());
  remark=remark.trim();
Date test=new Date();

  DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
  String today=fmt.format(test);
   sql="update tctc_bug set BUG_STATUS='"+bugStatus+"',BUG_REMARK='"+remark+"',BUG_CONFIRM='"+confirmBy+"',BUG_CONFIRM_DATE='"+today+"'where BUG_ID="+number;
        myStatement.executeUpdate(sql);
sql1="select BUG_CONFIRM from TCTC_BUG where BUG_ID="+number;
		sql2="select BUG_CREATE from TCTC_BUG where BUG_ID="+number;
	sql3="select * from TCTC_EMPLOYEE where em_p='cc'";
	String from = new String();
	String to = new String();
	String cc = new String();
  rs=myStatement1.executeQuery(sql2);
  rs2=myStatement2.executeQuery(sql1);
  rs3=myStatement3.executeQuery(sql3);
  if(rs2.next()){
    from=rs2.getString("BUG_CONFIRM")+"@bhr.com.cn";

  }
  if(rs.next()){
    to=rs.getString("BUG_CREATE")+"@bhr.com.cn";
  }
  System.out.println("to:--------"+to);
 String tos="";
 tos=tos+";"+to;
	if(rs3.next()){
    cc=rs3.getString("EM_N")+"@bhr.com.cn";

  }
  String content="Hi,All\nThis is a TSGS system mail to remind you that the bug has been confirmed.The detail information is following:"+"\nSummary:"+summary+"\nDetail:"+detail+"\nConfirmBy:"+confirmBy+"\nBugStatus:"+bugStatus+
	  "\nRemark:"+remark;
mail.send(from,to,"","","Update Bug Tracker",cc,content);

  
      out.write("\r\n  ");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='EnquireBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

    myConn.close();
    myStatement.close();
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
