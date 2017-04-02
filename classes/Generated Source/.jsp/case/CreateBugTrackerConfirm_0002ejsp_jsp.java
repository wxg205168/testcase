import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import java.util.Enumeration;
import javax.sql.*;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class CreateBugTrackerConfirm_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>\r\n");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n");
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

  //prepare DB connection
  DataSource ds=null;
  ds=tt.getDataSource();
  Connection myConn=null;
  Statement myStatement1=null;
  Statement myStatement2=null;
  Statement myStatement3=null;

  try{
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
	myStatement2=myConn.createStatement();
	 myStatement3=myConn.createStatement();
  }
  catch(SQLException ex){
    session.setAttribute("Error","6.1");
    System.err.println("aq.executeQuery: " + ex.getMessage());

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='CreateBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

  }


  //define bug information
  String sql=new String();
  String frequency=new String();
  String ponderance=new String();
  String summary=new String();
  String detail=new String();
  String provide=new String();
  Date test=new Date();

  String sql1=new String();
  String sql2=new String();
  String sql3=new String();
  ResultSet rs;
   ResultSet rs2;
   ResultSet rs3;

  DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
  String today=fmt.format(test);

  frequency=(String)request.getParameter("select");
  ponderance=(String)request.getParameter("select2");
  summary=(String)request.getParameter("textfield");
  detail=(String)request.getParameter("textarea");
  provide=(String)request.getParameter("textfield2");

  frequency=rr.restore(frequency);
  frequency=rr.replaceString(frequency);
  ponderance=rr.restore(ponderance);
  ponderance=rr.replaceString(ponderance);
  summary=rr.restore(summary);
  summary=rr.replaceString(summary);
  detail=rr.restore(detail);
  detail=rr.replaceString(detail);
  provide=rr.restore(provide);
  provide=rr.removeBlank(rr.replaceString(provide));
  frequency=frequency.trim();
  ponderance=ponderance.trim();
  summary=summary.trim();
  detail=detail.trim();
  provide=provide.trim();

  //check string is null
  if(rr.checkStringNull(frequency)||rr.checkStringNull(ponderance)||rr.checkStringNull(summary)||rr.checkStringNull(detail)||rr.checkStringNull(provide)){

    session.setAttribute("Error","6.3");

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='CreateBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

  }
  else{
  //insert record into DB
  try{


    sql="insert into tctc_bug(bug_id,bug_frequency,bug_ponderance,bug_summary,bug_detail,bug_create,bug_create_date,bug_status) values(seq_tctc_bug.nextval,'" + frequency + "','" + ponderance+ "','"+summary+"','"+detail+"','"+provide+"','"+today+"','Open')";
    myStatement1.executeUpdate(sql);

sql1="select * from TCTC_EMPLOYEE where em_p='from'";
	sql2="select * from TCTC_EMPLOYEE where em_p='to'";
	sql3="select * from TCTC_EMPLOYEE where em_p='cc'";
	String from = new String();
	String to = new String();
	String cc = new String();
  rs=myStatement1.executeQuery(sql2);
  rs2=myStatement2.executeQuery(sql1);
  rs3=myStatement3.executeQuery(sql3);
  if(rs2.next()){
    from=rs2.getString("EM_N")+"@bhr.com.cn";
  }
  if(rs.next()){
    to=rs.getString("EM_N")+"@bhr.com.cn";
  }

	if(rs3.next()){
    cc=rs3.getString("EM_N")+"@bhr.com.cn";

  }
  String content="Hi,All\nThis is a TSGS system mail to remind you that a bug has been added.The detail information is following:"+"\nFrequency:"+frequency+"\nPonderance:"+ponderance+"\nSummary:"+summary+"\nDetail:"+detail+
	  "\nProvide By:"+provide;
mail.send(from,to,"","","Add Bug Tracker",cc,content);


      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='CreateBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

  }
  catch(SQLException ex){
    session.setAttribute("Error","6.2");
    System.err.println("aq.executeQuery: " + ex.getMessage());
    System.err.println("sql: " + sql);

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n  parent.location.href='CreateBugTracker.jsp'\r\n");
      out.write("</script>\r\n");

    }
  }


      out.write("\r\n");
      out.write("<form method=\"post\">\r\n\r\n\r\n");
      out.write("</form>\r\n");

  myConn.close();
  myStatement1.close();
  myStatement2.close();
   myStatement3.close();

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
