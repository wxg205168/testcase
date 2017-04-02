import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;

public class DeleteTestCondition_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("<title>");
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteTestConditionConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestConditionConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n");
      out.write("</script>\r\n\r\n");
      out.write("<body>\r\n\r\n");
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
    Statement myStatement3=null;
    Statement myStatement4=null;
    myConn=ds.getConnection();
    myStatement1=myConn.createStatement();
    myStatement2=myConn.createStatement();
    myStatement3=myConn.createStatement();
    myStatement4=myConn.createStatement();

      out.write("\r\n\r\n");
      out.write("<form method=\"POST\">\r\n\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-TestCondition-List.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">Select any Test Condition to delete from list:");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  ");
      out.write("<TBODY>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Condition");
      out.write("</span>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");

  int noData=0;

  String sProjectID=(String)session.getAttribute("ProjectID");
  String sUseCaseID=(String)session.getAttribute("UseCaseID");
  String sFunctionPointID=(String)session.getAttribute("FunctionPointID");

  String sql,sql1;
  ResultSet rs,rs1,rs2,rs3;
  rs3=null;

  String checkName=new String();
  String textName=new String();

  long informationID=0;
  String information=new String();
  int number=0;


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
    long functionPointID = Integer.parseInt(sFunctionPointID);
    long projectID = Integer.parseInt(sProjectID);
    long useCaseID = Integer.parseInt(sUseCaseID);
    String[] temp;
    String condition1=new String();
    int first=1;

    sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID;
    rs=myStatement1.executeQuery(sql);

    if(rs.next()){
      noData=1;
      do{
        number++;
        informationID=rs.getLong("inf_id");
        information=rs.getString("inf_dis");

        first=1;
        temp=rr.getID(information);

        sql="select inf_dis from tctc_information where inf_id in ( ";
        for(int i=0;i<temp.length;i++){
          if(first==1){
            sql=sql+Integer.parseInt(temp[i]);
            first=0;
          }
          else{
            sql=sql+","+Integer.parseInt(temp[i]);
          }

        }
        sql=sql+")";

        rs3=myStatement2.executeQuery(sql);
        first=1;

        while(rs3.next()){
          condition1=rs3.getString("inf_dis");
          condition1=rr.replace(condition1);
          if(first==1){
            information=condition1;
            first=0;
          }
          else{
            information=information+"<br>"+condition1;
          }
        }

        rs3.close();

        checkName="C"+number;
        textName="T"+number;

      out.write("\r\n    ");
      out.write("<TR align=\"center\" bgColor=#f8f8f8>\r\n      ");
      out.write("<TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC >");
      out.write("<input type=\"checkbox\" name=");
      out.print(checkName );
      out.write(" />");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"725\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(information );
      out.write("<input type = \"hidden\" name = ");
      out.print(textName );
      out.write(" value =");
      out.print(informationID );
      out.write(" />");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");

      }while(rs.next());
    }
    rs.close();
    session.setAttribute("CR_Number", String.valueOf(number));

  }

      out.write("\r\n  ");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");

  if(noData==1){

      out.write("\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

    noData=0;
  }

      out.write("\r\n\r\n");
      out.write("</form>\r\n\r\n");
      out.write("<form method=\"POST\">\r\n\r\n");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-CreateTestCondition.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n    ");
      out.write("<td background=\"image/T2.jpg\">Create Test Condition by Test Element Condition:");
      out.write("</td>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n\r\n");
      out.write("<TABLE width=\"750\" border=1>\r\n    ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n      ");
      out.write("<TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Element");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"23\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">&nbsp;");
      out.write("</span>");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"577\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Condition");
      out.write("</span>");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n\r\n");

  int first=1;
  int number1=0;
  int elementNumber=0;
  String ElementName=new String();
  long ElementID=0;
  long InformationID=0;
  String condition=new String();


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
    long ProjectID=Integer.parseInt(sProjectID);
    long UseCaseID=Integer.parseInt(sUseCaseID);
    long FunctionPointID=Integer.parseInt(sFunctionPointID);

    sql="select element_id,element_name from tctc_element where project_id="+ProjectID+" and uc_id="+UseCaseID+" and functionpoint_id="+FunctionPointID;
    rs1=myStatement3.executeQuery(sql);

    if(rs1.next())
    {
      do
      {

      out.write("\r\n\r\n");
      out.write("<TABLE width=\"750\" border=1>\r\n\r\n");


        ElementID=rs1.getLong("element_id");
        ElementName=rs1.getString("element_name");
        first=1;
        number=0;


        sql1="select inf_id,inf_dis from tctc_information where inf_type='c' and project_id="+ProjectID+" and uc_id="+UseCaseID+" and fun_p_id="+FunctionPointID+" and element_id="+ElementID;
        rs2=myStatement4.executeQuery(sql1);

        if(rs2.next())
        {
          elementNumber++;
          checkName="C"+elementNumber;

          noData=1;
          do
          {
            number++;
            condition=rs2.getString("inf_dis");
            condition=rr.replace(condition);
            InformationID=rs2.getLong("inf_id");
            textName="T"+number+checkName;


      out.write("\r\n    ");
      out.write("<TR align=\"center\" bgColor=#f8f8f8>\r\n");

          if(first==1)
          {
            first=0;

      out.write("\r\n      ");
      out.write("<TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>");
      out.print(ElementName );
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" >");
      out.write("<input type=\"radio\" name=");
      out.print(checkName );
      out.write(" value=");
      out.print(number );
      out.write(" checked=\"checked\" />");
      out.write("</TD>\r\n");


          }
          else
          {

      out.write("\r\n      ");
      out.write("<TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>&nbsp;");
      out.write("</TD>\r\n      ");
      out.write("<TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" >");
      out.write("<input type=\"radio\" name=");
      out.print(checkName );
      out.write(" value=");
      out.print(number );
      out.write(" />");
      out.write("</TD>\r\n");

          }

      out.write("\r\n      ");
      out.write("<TD width=\"577\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" widt=\"627\" >");
      out.print(condition );
      out.write("<input type = \"hidden\" name = ");
      out.print(textName );
      out.write(" value =");
      out.print(InformationID );
      out.write(" />");
      out.write("</TD>\r\n    ");
      out.write("</TR>\r\n");

          }while(rs2.next());
        }
        rs2.close();

      out.write("\r\n\r\n");
      out.write("</TABLE>\r\n");

      }while(rs1.next());
      session.setAttribute("CR_Number2",String.valueOf(elementNumber));
    }
    rs1.close();

  }

      out.write("\r\n\r\n\r\n");

  if(noData==1){

      out.write("\r\n\r\n");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ");
      out.write("<tr>\r\n    ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\">");
      out.write("</td>\r\n    ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n    ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

  }

      out.write("\r\n\r\n");
      out.write("</form>\r\n");

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
