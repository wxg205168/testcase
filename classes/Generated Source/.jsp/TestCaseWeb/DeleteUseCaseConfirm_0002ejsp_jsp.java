import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;

public class DeleteUseCaseConfirm_0002ejsp_jsp extends HttpJspBase {


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!-- DW6 -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>Untitled Document");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style1 {font-size: small}\r\n.style6 {font-size: small}\r\n.style7 {font-size: x-large}\r\n.style8 {font-size: small}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<script language=JavaScript>\r\n\r\nscores = new Array(20);\r\nvar numTotal=0;\r\nIE4 = (document.all) ? 1 : 0;\r\nver4 = (IE4) ? 1 : 0;\r\nif (ver4) {\r\n    with (document) {\r\n        write(\"");
      out.write("<STYLE TYPE='text/css'>\");\r\n        write(\".child {display:none}\")\r\n        write(\"");
      out.write("</STYLE>\");\r\n    }\r\n}\r\n\r\nfunction expandIt(el) {\r\n    if (!ver4) return;\r\n    if (IE4) {\r\n        whichEl1 = eval(el + \"Child\");\r\n        for(i=1;i");
      out.write("<=numTotal;i++){\r\n            whichEl = eval(scores[i] + \"Child\");\r\n            if(whichEl!=whichEl1) {\r\n                whichEl.style.display = \"none\";\r\n            }\r\n        }\r\n        whichEl1 = eval(el + \"Child\");\r\n        if (whichEl1.style.display == \"none\") {\r\n            whichEl1.style.display = \"block\";\r\n        }\r\n        else {\r\n            whichEl1.style.display = \"none\";\r\n        }\r\n    }\r\n}\r\n\r\nfunction getIndex(el) {\r\n    ind = null;\r\n    for (i=0; i");
      out.write("<document.layers.length; i++) {\r\n        whichEl = document.layers[i];\r\n        if (whichEl.id == el) {\r\n            ind = i;\r\n            break;\r\n        }\r\n    }\r\n    return ind;\r\n}\r\n\r\nfunction arrange() {\r\n    nextY = document.layers[firstInd].pageY +document.layers[firstInd].document.height;\r\n    for (i=firstInd+1; i");
      out.write("<document.layers.length; i++) {\r\n        whichEl = document.layers[i];\r\n        if (whichEl.visibility != \"hide\") {\r\n            whichEl.pageY = nextY;\r\n            nextY += whichEl.document.height;\r\n        }\r\n    }\r\n}\r\n\r\nfunction initIt(){\r\n    if (!ver4) return;\r\n    divColl = document.all.tags(\"DIV\");\r\n    for (i=0; i");
      out.write("<divColl.length; i++) {\r\n        whichEl = divColl(i);\r\n        if (whichEl.className == \"child\") whichEl.style.display = \"none\";\r\n    }\r\n}\r\nonload = initIt;\r\n\r\n");
      out.write("</script>\r\n\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"post\" action=\"DeleteUseCase.jsp\">\r\n");
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

  String sql=new String();
  ResultSet rs;
  String textName=new String();
  String textName1=new String();
  String textName2=new String();
  String textValue1=new String();
  String textValue2=new String();
  String textValue3=new String();
  textName="t"+request.getParameter("radiobutton");
  textName1="tt"+request.getParameter("radiobutton");
  textName2="ttt"+request.getParameter("radiobutton");
  textValue1=(String)request.getParameter(textName);
  textValue2=(String)request.getParameter(textName1);
  textValue3=(String)request.getParameter(textName2);

  sql="select * from tctc_uc where uc_id="+textValue2;
  rs=tt.executeQuery(sql);

  if(textValue2.equals((String)session.getAttribute("UseCaseID"))){
      session.setAttribute("UseCaseName","null");
      session.setAttribute("UseCaseID","null");
      session.setAttribute("FunctionPointName","null");
      session.setAttribute("FunctionPointID","null");
      session.setAttribute("TestElementName","null");
      session.setAttribute("TestElementID","null");
      session.setAttribute("Type","c");
      session.setAttribute("CR_Number","null");

  }


      out.write("\r\n\r\n");
      out.write("<div id=\"masthead1\">\r\n  ");
      out.write("<h1 class=\"style7\" id=\"siteName\">Welcome");
      out.write("</h1>\r\n  ");
      out.write("<div id=\"globalNav\" class=\"style1\">\r\n    ");
      out.write("<label>");
      out.write("<span class=\"style6\">");
      out.write("<span class=\"style1\">Project&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("</span>:");
      out.write("</span>");
      out.write("<span class=\"style8\">");
      out.print(session.getAttribute("ProjectName") );
      out.write("</label>\r\n\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"masthead2\">\r\n  ");
      out.write("<div id=\"globalNav\" class=\"style1\">\r\n    ");
      out.write("<label>");
      out.write("<span class=\"style6\">");
      out.write("<span class=\"style1\">Use case &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("</span>:");
      out.write("</span>");
      out.write("<span class=\"style8\">");
      out.print(session.getAttribute("UseCaseName") );
      out.write("</span>");
      out.write("</label>\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"masthead3\">\r\n  ");
      out.write("<div id=\"globalNav\" class=\"style1\">\r\n    ");
      out.write("<label>");
      out.write("<span class=\"style6\">");
      out.write("<span class=\"style1\">Function point ");
      out.write("</span>:");
      out.write("</span>");
      out.write("<span class=\"style8\">");
      out.print(session.getAttribute("FunctionPointName") );
      out.write("</span>");
      out.write("</label>\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"masthead4\">\r\n  ");
      out.write("<div id=\"globalNav\" class=\"style1\">\r\n    ");
      out.write("<label>");
      out.write("<span class=\"style6\">");
      out.write("<span class=\"style1\">Test element&nbsp; &nbsp;");
      out.write("</span>:");
      out.write("</span> ");
      out.write("<span class=\"style8\">");
      out.print(session.getAttribute("TestElementName") );
      out.write("</span>");
      out.write("</label>\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n\r\n\r\n\r\n");
      out.write("<div id=\"pagecell1\">\r\n  ");
      out.write("<!--pagecell1-->\r\n  ");
      out.write("<img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> ");
      out.write("<img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n  ");
      out.write("<div id=\"breadCrumb\">\r\n    ");
      out.write("<a href=\"Login.htm\" class=\"style1\">Login");
      out.write("</a> / ");
      out.write("<a href=\"SystemMain.jsp\" class=\"style1\">Main");
      out.write("</a>\r\n  ");
      out.write("</div>\r\n  ");
      out.write("<div id=\"pageName\">\r\n    ");
      out.write("<h2>&nbsp;");
      out.write("</h2>\r\n\r\n  ");
      out.write("</div>\r\n  ");
      out.write("<div id=\"col2\">\r\n    ");
      out.write("<div class=\"feature\">\r\n      ");
      out.write("<p>\r\n        ");
      out.write("<label>");
      out.write("<span class=\"style1\">UseCase Information:");
      out.write("</span>");
      out.write("</label>\r\n      ");
      out.write("</p>\r\n");

  if(rs.next()){
    sql="delete from tctc_uc where uc_id="+textValue2;
    tt.executeQuery(sql);

      out.write("\r\n\r\n      ");
      out.write("<table width=\"600\" border=\"1\">\r\n        ");
      out.write("<tr>\r\n          ");
      out.write("<td width=\"200\" class=\"style1\">");
      out.write("<span class=\"style1\">UseCase Name: ");
      out.write("</span>");
      out.write("</td>\r\n          ");
      out.write("<td width=\"400\" class=\"style8\">");
      out.print(textValue1 );
      out.write("</td>\r\n        ");
      out.write("</tr>\r\n      ");
      out.write("</table>\r\n      ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n      ");
      out.write("<p>\r\n      ");
      out.write("<input type=\"submit\" name=\"Submit\" value=\"Delete Other UseCase\" />\r\n      ");
      out.write("</p>\r\n");

  }
  else{

      out.write("\r\n    ");
      out.write("<font size=\"5\">\r\n      Record has been deleted.\r\n    ");
      out.write("</font>\r\n    ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n    ");
      out.write("<input name=\"submit\" type=\"submit\" value=\"Back\">\r\n");

  }
  rs.close();

      out.write("\r\n\t  ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n\t  ");
      out.write("<p>&nbsp;");
      out.write("</p>\r\n    ");
      out.write("</div>\r\n  ");
      out.write("</div>\r\n  ");
      out.write("<!--end col2 -->\r\n  ");
      out.write("<div id=\"pageNav\">\r\n    ");
      out.write("<div id=\"sectionLinks\">\r\n       ");
      out.write("<div id='TreeMenu1Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu1'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Project\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu1Child' class='child'>\r\n         ");
      out.write("<a href=\"SelectProject.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Select Project\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"CreateProject.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create Project\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"DeleteProject.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete Project\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu6Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu6'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Use Case ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu6Child' class='child'>\r\n         ");
      out.write("<a href=\"SelectUseCase.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Select Use Case ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"CreateUseCase.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create Use Case ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"DeleteUseCase.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete Use Case ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu2Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu2'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Function Point\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu2Child' class='child'>\r\n         ");
      out.write("<a href=\"SelectFunctionPoint.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Select FunctionPoint\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"CreateFunctionPoint.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create FunctionPoint\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"DeleteFunctionPoint.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete FunctionPoint\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu8Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu8'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Test Element\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu8Child' class='child'>\r\n         ");
      out.write("<a href=\"SelectTestElement.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Select TestElement\r\n        ");
      out.write("</a>\r\n        ");
      out.write("<a href=\"CreateTestElement.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create TestElement\r\n        ");
      out.write("</a>\r\n        ");
      out.write("<a href=\"DeleteTestElement.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete TestElement\r\n        ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n\r\n       ");
      out.write("<div id='TreeMenu5Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu5'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Test Case Material\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu5Child' class='child'>\r\n         ");
      out.write("<a href=\"CreateTCInfromation.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create Material\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"EnquireCRInfromation.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Enquire Material\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"UpdateCRInfromation.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Update Material\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"DeleteCRInfromation.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete Material\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n\r\n       ");
      out.write("<div id='TreeMenu3Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu3'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Test Case\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu3Child' class='child'>\r\n         ");
      out.write("<a href=\"CreateCondition.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create Test Condition\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"DeleteCondition.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete Test Condition\r\n         ");
      out.write("</a>\r\n\r\n         ");
      out.write("<a href=\"TestMatrix.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create TestCase\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"EnquireTestCase.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Enquire TestCase\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"Delete TestCase.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Delete TestCase\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu4Parent' class='parent'>\r\n         ");
      out.write("<a href=\"#\" onClick=\"expandIt('TreeMenu4'); return false\">\r\n           ");
      out.write("<img src=\"Picture001.jpg\" width=10 height=10  border=0>&nbsp;Test Spec\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n       ");
      out.write("<div id='TreeMenu4Child' class='child'>\r\n         ");
      out.write("<a href=\"ExcelEmail.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Create TestSpec\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"EnquireTestSpec.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Enquire TestSpec\r\n         ");
      out.write("</a>\r\n         ");
      out.write("<a href=\"SendEmail.jsp\"  target='_self'>\r\n           &nbsp;&nbsp;&nbsp;&nbsp;");
      out.write("<img src=\"Picture002.jpg\" width=10 height=10  border=0>&nbsp;Send TestSpec\r\n         ");
      out.write("</a>\r\n       ");
      out.write("</div>\r\n\r\n    ");
      out.write("</div>\r\n  ");
      out.write("</div>\r\n  ");
      out.write("<!--end col1 div -->\r\n  ");
      out.write("<div id=\"siteInfo\">    &copy;2005\r\n    QAT\r\n  ");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--end pagecell1-->\r\n");
      out.write("<br />\r\n");
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
