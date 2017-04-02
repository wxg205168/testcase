import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.sql.*;
import javax.sql.*;
import java.util.Enumeration;
import java.util.ArrayList;

public class EnquireTestCase_0005fRight_0002ejsp_jsp extends HttpJspBase {


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
      out.write("</style>\r\n\r\n");
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
      compages.compagesData cc = null;
      synchronized (pageContext) {
        cc = (compages.compagesData) pageContext.getAttribute("cc", PageContext.PAGE_SCOPE);
        if (cc == null){
          try {
            cc = (compages.compagesData) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "compages.compagesData");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "compages.compagesData", exc);
          }
          pageContext.setAttribute("cc", cc, PageContext.PAGE_SCOPE);
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
    String sProjectID=(String)session.getAttribute("ProjectID");
    String sUseCaseID=(String)session.getAttribute("UseCaseID");
    String sFunctionPointID=(String)session.getAttribute("FunctionPointID");

    if(sProjectID.equals("null")){
      session.setAttribute("Error","2.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectProject.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else if(sUseCaseID.equals("null")){
      session.setAttribute("Error","3.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectUseCase.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else if(sFunctionPointID.equals("null")){
      session.setAttribute("Error","4.1");

      out.write("\r\n      ");
      out.write("<script LANGUAGE=\"javascript\">\r\n        parent.location.href='SelectFunctionPoint.jsp'\r\n      ");
      out.write("</script>\r\n");

    }
    else{

      long projectID=Integer.parseInt(sProjectID);
      long useCaseID=Integer.parseInt(sUseCaseID);
      long functionPointID=Integer.parseInt(sFunctionPointID);

      DataSource ds=null;
      ds=tt.getDataSource();
      Connection myConn=null;
      Statement myStatement1=null;
      Statement myStatement2=null;
      Statement myStatement3=null;
      Statement myStatement4=null;
      Statement myStatement5=null;
      Statement myStatement6=null;
      Statement myStatement7=null;
      Statement myStatement8=null;
      Statement myStatement9=null;
      Statement myStatement10=null;
      Statement myStatement11=null;
      Statement myStatement12=null;
      Statement myStatement14=null;

      myConn=ds.getConnection();
      myStatement1=myConn.createStatement();
      myStatement2=myConn.createStatement();
      myStatement3=myConn.createStatement();
      myStatement4=myConn.createStatement();
      myStatement5=myConn.createStatement();
      myStatement6=myConn.createStatement();
      myStatement7=myConn.createStatement();
      myStatement8=myConn.createStatement();
      myStatement9=myConn.createStatement();
      myStatement10=myConn.createStatement();
      myStatement11=myConn.createStatement();
      myStatement12=myConn.createStatement();
      myStatement14=myConn.createStatement();

      String sql=new String();
      String condition1=new String();

      ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7;
      rs1=null;
      rs2=null;
      rs3=null;
      rs4=null;
      rs5=null;
      rs6=null;
      rs7=null;
      int l=0;
      int resultNumber=0;
      int abc1=0;
      int abc2=0;
      String[] rArray;
      String[] temp;
      String rTemp=new String();

      try{
        sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
        rs7=myStatement12.executeQuery(sql);
        rs7.next();
        resultNumber=rs7.getInt("count(*)");
//        resultNumber=rs7.getInt("Expr1000");
        rArray=new String[resultNumber];

        sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
        rs7=myStatement9.executeQuery(sql);
        if(rs7.next()){
          do{
            rTemp=rs7.getString("inf_dis");
            rTemp=rr.replace(rTemp);
            rTemp=rr.replaceBlank(rTemp);
            rArray[l]=rTemp;
            l++;
          }while(rs7.next());
        }
        rs7.close();

      out.write("\r\n        ");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("<!--\r\n          bname=navigator.appName;\r\n          bversion=parseInt(navigator.appVersion)\r\n\r\n          if(bname==\"Netscape\")\r\n            brows=true\r\n          else\r\n            brows=false\r\n\r\n          var x=0;\r\n          var link=new Array();\r\n\r\n          function dspl(msg,bgcolor,dtop,delft){\r\n            this.msg=msg;\r\n            this.bgcolor=bgcolor;\r\n            this.dtop=dtop;\r\n            this.dleft=delft;\r\n          }\r\n");

          for(int t=0;t<resultNumber;t++){


      out.write("\r\n            link[");
      out.print(t );
      out.write("]=new dspl('");
      out.print(rArray[t] );
      out.write("','bisque',");
      out.print(300+t*150 );
      out.write(",");
      out.print(400+t*140 );
      out.write(")\r\n");

          }

      out.write("\r\n          function don(x){\r\n            if ((bname==\"Netscape\" && bversion>=4) || (bname==\"Microsoft Internet Explorer\" && bversion>=4)){\r\n              if (brows){\r\n                with(link[x]){\r\n                  document.layers['linkex'].bgColor=bgcolor;\r\n                  document.layers['linkex'].document.writeln(msg);\r\n                  document.layers['linkex'].document.close();\r\n                  document.layers['linkex'].top=dtop;\r\n                  document.layers['linkex'].left=dleft;\r\n                }\r\n                document.layers['linkex'].visibility=\"show\";\r\n              }\r\n              else{\r\n                with(link[x]){\r\n                  linkex.innerHTML=msg;\r\n                  linkex.style.top=dtop;\r\n                  linkex.style.left=dleft;\r\n                  linkex.style.background=bgcolor;\r\n                }\r\n                linkex.style.visibility=\"visible\";\r\n              }\r\n            }\r\n          }\r\n\r\n          function doff(){\r\n            if ((bname==\"Netscape\" && bversion>=4) || (bname==\"Microsoft Internet Explorer\" && bversion>=4)){\r\n");
      out.write("              if (brows)\r\n                document.layers['linkex'].visibility=\"hide\";\r\n              else\r\n                linkex.style.visibility=\"hidden\";\r\n              }\r\n            }\r\n//-->\r\n        ");
      out.write("</SCRIPT>\r\n\r\n        ");
      out.write("<SCRIPT language=\"JavaScript\">\r\n\r\n          function testSubmit(){\r\n            if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n              document.forms[0].action=\"DeleteTestCaseConfirm.jsp\";\r\n              document.forms[0].submit();\r\n            }\r\n          }\r\n\r\n          function testSubmit1(){\r\n            document.forms[1].action=\"CreateTestCaseConfirm.jsp\";\r\n            document.forms[1].submit();\r\n          }\r\n        ");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n\r\n");
      out.write("<Div id=\"linkex\" style=\"position: absolute; visibility: hidden; width=80%;font-weight: bold;\">\r\n");
      out.write("</Div>\r\n");
      out.write("<Layer name=\"linkex\" visibility=\"hide\" width=80%>\r\n");
      out.write("</Layer>\r\n\r\n");
      out.write("<form method=\"post\">\r\n\r\n          ");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n            ");
      out.write("<tr>\r\n              ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n            ");
      out.write("</tr>\r\n          ");
      out.write("</table>\r\n          ");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            ");
      out.write("<tr>\r\n              ");
      out.write("<td width=\"31\">");
      out.write("<img src=\"image/T1.jpg\" width=\"31\" height=\"26\">");
      out.write("</td>\r\n              ");
      out.write("<td background=\"image/T2.jpg\">Select Test Case to delete from list:");
      out.write("</td>\r\n              ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/T3.jpg\" width=\"17\" height=\"26\">");
      out.write("</td>\r\n            ");
      out.write("</tr>\r\n          ");
      out.write("</table>\r\n          ");
      out.write("<table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\n            style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n            ");
      out.write("<tbody>\r\n              ");
      out.write("<tr align=\"center\" bgcolor=#74A5E8>\r\n                ");
      out.write("<td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;");
      out.write("</td>\r\n                ");
      out.write("<td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Condition");
      out.write("</span>");
      out.write("</td>\r\n    \t        ");
      out.write("<td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">Test Result");
      out.write("</span>");
      out.write("</td>\r\n              ");
      out.write("</tr>\r\n\r\n");

              int noData=0;
              int x=0;

              String checkBoxName=new String();
              String hideName=new String();

              long testCaseID=0;
              int number=0;

              String functionPointName=new String();
              String useCaseName=new String();
              String cDis = new String();
              String rDis = new String();
              int first=1;
              int first1=1;
              int nn=0;

              sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
              rs1=myStatement1.executeQuery(sql);

              if(rs1.next())
              {
                noData=1;
                do
                {
                  number++;
                  cDis=rs1.getString("condition");
                  rDis=rs1.getString("result");
                  first=1;
                  first1=1;

                  temp=rr.getID(cDis);
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
                  sql=sql+") order by inf_id";
                  rs3=myStatement2.executeQuery(sql);
                  first=1;

                  while(rs3.next()){
                    condition1=rs3.getString("inf_dis");
                    condition1=rr.replace(condition1);
                    if(first==1){
                      cDis=condition1;
                      first=0;
                    }
                    else{
                      cDis=cDis+"<br>"+condition1;
                    }
                  }

                  temp=rr.getID(rDis);
                  sql="select inf_dis from tctc_information where inf_id in ( ";
                  for(int i=0;i<temp.length;i++){
                    if(first1==1){
                      sql=sql+Integer.parseInt(temp[i]);
                      first1=0;
                    }
                    else{
                      sql=sql+","+Integer.parseInt(temp[i]);
                    }
                  }
                  sql=sql+")";

                  rs3=myStatement3.executeQuery(sql);
                  first1=1;

                  while(rs3.next()){
                    condition1=rs3.getString("inf_dis");
                    condition1=rr.replace(condition1);
                    if(first1==1){
                      rDis=condition1;
                      first1=0;
                    }
                    else{
                      rDis=rDis+"<br>"+condition1;
                    }
                  }

                  rs3.close();

                  testCaseID=rs1.getLong("test_case_id");
                  checkBoxName="C"+number;
                  hideName="H"+number;


      out.write("\r\n                  ");
      out.write("<tr align=\"center\" bgcolor=#f8f8f8>\r\n                    ");
      out.write("<td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC >");
      out.write("<input type=\"checkbox\" name=");
      out.print(checkBoxName );
      out.write(" />");
      out.write("</td>\r\n                    ");
      out.write("<td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(cDis );
      out.write("</td>\r\n                    ");
      out.write("<td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >");
      out.print(rDis );
      out.write("<input type = \"hidden\" name = ");
      out.print(hideName );
      out.write(" value =");
      out.print(testCaseID );
      out.write(" />");
      out.write("</td>\r\n                  ");
      out.write("</tr>\r\n");

                }while(rs1.next());
                session.setAttribute("CR_Number", String.valueOf(number));
              }

      out.write("\r\n            ");
      out.write("</tbody>\r\n          ");
      out.write("</table>\r\n");

          if(noData==1){

      out.write("\r\n            ");
      out.write("<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              ");
      out.write("<tr>\r\n                ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n                ");
      out.write("<td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">");
      out.write("</td>\r\n                ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n                ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n              ");
      out.write("</tr>\r\n            ");
      out.write("</table>\r\n");

            noData=0;
          }

      out.write("\r\n");
      out.write("</form>\r\n\r\n");
      out.write("<form method=\"post\" >\r\n\r\n          ");
      out.write("<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n            ");
      out.write("<tr>\r\n              ");
      out.write("<td align=\"left\" valign=\"top\">");
      out.write("<img src=\"image/TT-Testmatrix.jpg\" width=\"285\" height=\"46\">");
      out.write("</td>\r\n            ");
      out.write("</tr>\r\n          ");
      out.write("</table>\r\n\r\n          ");
      out.write("<TABLE width=\"0\" border=1 cellPadding=0 cellSpacing=0\r\n            style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n            ");
      out.write("<TBODY>\r\n");

//      long functionPointID=Integer.parseInt(sFunctionPointID);
              sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID;
              rs1=myStatement4.executeQuery(sql);
              int y=0;
              if(rs1.next()){

                y=rs1.getInt("count(*)");
//                y=rs1.getInt("Expr1000");
              }
              else{
                y=0;
              }

              sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
              rs2=myStatement5.executeQuery(sql);
//      int x=0;
              if(rs2.next()){
                x=rs2.getInt("count(*)");
//                x=rs2.getInt("Expr1000");
              }
              else{
                x=0;
              }

              String CheckName = new String();
              String content = new String();
              long id=0;
              rs1=null;
              rs2=null;
              int first2=1;
//      String[] temp;
//      String condition1=new String();
              String information=new String();
              String condition2=new String();
              String result2=new String();
              String[] con;
              String[] rel;

              l=0;
              int lll=0;
              int cPosition=0;
              int rPosition=0;
              int have1=1;
              int have2=1;
              nn=0;
              long element_ID=0;
              String[] elementCondition=new String[y];
              int[] infID=new int[y];
              int[] conditionPos=new int[y];
              int[] conditionEle=new int[y];
              int len=0;
              int eleLen=0;
              ArrayList resultList=new ArrayList();
              int aa=0;

              if(x>0 && y>0){

                sql="select element_id from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" group by element_id";
                rs1=myStatement6.executeQuery(sql);
                while(rs1.next()){
                  element_ID=rs1.getLong("element_id") ;
                  sql="select inf_id,inf_dis from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" and element_id="+element_ID+" order by inf_id";
                  rs6=myStatement14.executeQuery(sql);

                  if(rs6.next()){
                    eleLen++;

                    do{
                      elementCondition[len]=rs6.getString("inf_dis");
                      infID[len]=rs6.getInt("inf_id");
                      conditionPos[len]=len;
                      conditionEle[len]=eleLen;
                      len++;
                    }while(rs6.next());
                  }
                }
                aa=eleLen;

                rs6.close();
                resultList=cc.combine(conditionPos,conditionEle,aa);
                y=resultList.size();

                session.setAttribute("R_Number",String.valueOf(x));
                session.setAttribute("C_Number",String.valueOf(y));

                String[] resultArray=new String[x];
                String[] conditionArray=new String[y];

                sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
                rs2=myStatement7.executeQuery(sql);
                rs2.next();

                sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID;
                rs4=myStatement8.executeQuery(sql);
                if(rs4.next()){
                  do{
                    resultArray[l]=rs4.getString("inf_id");
                    l++;
                  }while(rs4.next());
                }

                int llll=0;
                int test[]=new int[aa];
                String cString=new String();
                int first11=1;

                for(int aaaa=0;aaaa<y;aaaa++){

                  test=(int[])resultList.get(aaaa);
                  llll=test.length;

                  for(int aaa=0;aaa<llll;aaa++){
                    if(first11==1){
                      cString=String.valueOf(infID[test[aaa]]);
                      first11=0;
                    }
                    else{
                      cString=cString+" "+ String.valueOf(infID[test[aaa]]);
                    }
                  }
                  cString.trim();
                  conditionArray[aaaa]=cString;
                  first11=1;
                }
                lll=0;

                sql="select count(*) from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
                rs4=myStatement10.executeQuery(sql);
                if(rs4.next()){
                  nn=rs4.getInt("count(*)");
//                  nn=rs4.getInt("Expr1000");
                }

                if(nn>0){
                  con=new String[nn];
                  rel=new String[nn];

                  sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;;
                  rs5=myStatement11.executeQuery(sql);

                  if(rs5.next()){
                    nn=0;
                    do{
                      cDis=rs5.getString("condition");
                      rDis=rs5.getString("result");
                      con[nn]=cDis;
                      rel[nn]=rDis;
                      nn++;
                    }while(rs5.next());
                  }

                  if(x>0 && y>0){
                    noData=1;

                    for(int i=0;i<(y+1);i++){

      out.write("\r\n                       ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n");

                         abc1=0;
                         for(int j=0;j<(x+1);j++){
                           CheckName = null;

                           if(j==1 && i==0){

      out.write("\r\n                             ");
      out.write("<td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("</td>\r\n");

                           }
                           if(j==1 && i!=0){

      out.write("\r\n                             ");
      out.write("<td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("<select name=");
      out.print(String.valueOf(i) );
      out.write(">");
      out.write("<option selected>Main Flow");
      out.write("</option>");
      out.write("<option>Alternative");
      out.write("</option>");
      out.write("<option>Exceptional");
      out.write("</option>");
      out.write("<option>Abnormal");
      out.write("</option>");
      out.write("<option>Concurrency");
      out.write("</option>");
      out.write("<option>Logging");
      out.write("</option>");
      out.write("<option>Security");
      out.write("</option>");
      out.write("<option>System Dependency");
      out.write("</option>");
      out.write("</select>");
      out.write("</td>\r\n");

                           }
                           if(i==0 && j==0){

      out.write("\r\n                             ");
      out.write("<TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;");
      out.write("</TD>\r\n");

                           }
                           if(j>0 && i==0){
                             CheckName = "R" + String.valueOf(j);
                             content = rs2.getString("inf_dis");
                             id=rs2.getLong("inf_id");
                             content=rr.replace(content);

      out.write("\r\n                             ");
      out.write("<TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">");
      out.write("<textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">");
      out.print(content );
      out.write("</textarea>");
      out.write("<input type=\"hidden\" name=");
      out.print(CheckName );
      out.write(" value=");
      out.print(id );
      out.write(">");
      out.write("</span>");
      out.write("</TD>\r\n");

                             rs2.next();
                           }
                           else if(i>0 && j==0){
                             CheckName = "C" + String.valueOf(i);
                             content=conditionArray[i-1];
                             first2=1;
//                  temp=rr.getID(content);
                             content="\""+content+"\"";
                             test=(int[])resultList.get(i-1);
                             llll=test.length;

                             for(int aaa=0;aaa<llll;aaa++){
                               condition1=String.valueOf(elementCondition[test[aaa]]);
                               if(first2==1){
                                 information=condition1;
                                 first2=0;
                               }
                               else{
                                 information=information+"\n"+condition1;
                               }
                             }

                             information=rr.replace(information);

      out.write("\r\n                             ");
      out.write("<td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">");
      out.write("<textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">");
      out.print(information );
      out.write("</textarea>");
      out.write("<input type=\"hidden\" name=");
      out.print(CheckName );
      out.write(" value=");
      out.print(content );
      out.write(">");
      out.write("</span>");
      out.write("</td>\r\n");

                             lll++;
                           }
                           else if(j>0 && i>0){
                             CheckName = String.valueOf(j) + "-" + String.valueOf(i);

                             result2=resultArray[j-1];
                             condition2=conditionArray[i-1];

                             cPosition=-1;
                             rPosition=-1;
                             have1=0;
                             have2=0;

                             for(int ll=0;ll<con.length;ll++){
                               cPosition=con[ll].indexOf(condition2);
                               if(cPosition!=-1){
                                 rPosition=rel[ll].indexOf(result2);
                                 if(rPosition!=-1){
                                   have1=1;
                                   cPosition=-1;
                                   rPosition=-1;
                                 }
                               }
                             }

                             if(have1==1){

      out.write("\r\n                               ");
      out.write("<td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("<input type=\"checkbox\" name=");
      out.print(CheckName );
      out.write(" value=\"checkbox\"  checked=\"checked\" onmouseover=\"don(");
      out.print(abc1 );
      out.write(")\" onmouseout=\"doff()\">");
      out.write("</td>\r\n");

                             }
                             else{

      out.write("\r\n                               ");
      out.write("<td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("<input type=\"checkbox\" name=");
      out.print(CheckName );
      out.write(" value=\"checkbox\" onmouseover=\"don(");
      out.print(abc1 );
      out.write(")\" onmouseout=\"doff()\">");
      out.write("</td>\r\n");

                             }
                             abc1++;
                           }
                         }

      out.write("\r\n                      ");
      out.write("</TR>\r\n");

                    }
                  }
                  rs1.close();
                  rs2.close();
                  rs3.close();
                  rs4.close();
                  rs5.close();
                }
                else{

                  if(x>0 && y>0)
                  {
                    noData=1;
                    for(int i=0;i<(y+1);i++)
                    {

      out.write("\r\n                      ");
      out.write("<TR align=\"center\" bgColor=#74A5E8>\r\n");

                      abc2=0;
                      for(int j=0;j<(x+1);j++)
                      {
                        CheckName = null;

                        if(j==1 && i==0){

      out.write("\r\n                          ");
      out.write("<td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("</td>\r\n");

                        }

                        if(j==1 && i!=0){

      out.write("\r\n                          ");
      out.write("<td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("<select name=");
      out.print(String.valueOf(i) );
      out.write(">");
      out.write("<option selected>Main Flow");
      out.write("</option>");
      out.write("<option>Alternative");
      out.write("</option>");
      out.write("<option>Exceptional");
      out.write("</option>");
      out.write("<option>Abnormal");
      out.write("</option>");
      out.write("<option>Concurrency");
      out.write("</option>");
      out.write("<option>Logging");
      out.write("</option>");
      out.write("<option>Security");
      out.write("</option>");
      out.write("<option>System Dependency");
      out.write("</option>");
      out.write("</select>");
      out.write("</td>\r\n");

                        }

                        if(i==0 && j==0){

      out.write("\r\n                          ");
      out.write("<TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;");
      out.write("</TD>\r\n");

                        }
                        if(j>0 && i==0){
                          CheckName = "R" + String.valueOf(j);
                          content = rs2.getString("inf_dis");
                          id=rs2.getLong("inf_id");
                          content=rr.replace(content);

      out.write("\r\n                          ");
      out.write("<TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">");
      out.write("<textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">");
      out.print(content );
      out.write("</textarea>");
      out.write("<input type=\"hidden\" name=");
      out.print(CheckName );
      out.write(" value=");
      out.print(id );
      out.write(">");
      out.write("</span>");
      out.write("</TD>\r\n");

                          rs2.next();
                        }
                        else if(i>0 && j==0){
                          CheckName = "C" + String.valueOf(i);
                          content=conditionArray[i-1];

                          first2=1;
//                  temp=rr.getID(content);
                          content="\""+content+"\"";
                          test=(int[])resultList.get(i-1);
                          llll=test.length;

                          for(int aaa=0;aaa<llll;aaa++){
                            condition1=String.valueOf(elementCondition[test[aaa]]);
                            if(first2==1){
                              information=condition1;
                              first2=0;
                            }
                            else{
                              information=information+"\n"+condition1;
                            }
                          }

                          information=rr.replace(information);

      out.write("\r\n                          ");
      out.write("<td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >");
      out.write("<span class=\"style5\">");
      out.write("<textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">");
      out.print(information );
      out.write("</textarea>");
      out.write("<input type=\"hidden\" name=");
      out.print(CheckName );
      out.write(" value=");
      out.print(content );
      out.write(">");
      out.write("</span>");
      out.write("</td>\r\n");

                          lll++;
                        }
                        else if(j>0 && i>0){
                          CheckName = String.valueOf(j) + "-" + String.valueOf(i);

      out.write("\r\n                          ");
      out.write("<td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">");
      out.write("<input type=\"checkbox\" name=");
      out.print(CheckName );
      out.write(" value=\"checkbox\" onmouseover=\"don(");
      out.print(abc2 );
      out.write(")\" onmouseout=\"doff()\">");
      out.write("</td>\r\n");

                          abc2++;
                        }
                      }

      out.write("\r\n                      ");
      out.write("</TR>\r\n");

                    }
                  }
                  rs1.close();
                  rs2.close();
                  rs4.close();
                }
              }

      out.write("\r\n            ");
      out.write("</TBODY>\r\n          ");
      out.write("</TABLE>\r\n\r\n");

          if(noData==1){
            x=x+1;

      out.write("\r\n\r\n            ");
      out.write("<table width=");
      out.print(x*163+147 );
      out.write(" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              ");
      out.write("<tr>\r\n                ");
      out.write("<td width=\"17\">");
      out.write("<img src=\"image/table_left.jpg\" width=\"17\" height=\"27\">");
      out.write("</td>\r\n                ");
      out.write("<td align=\"right\" background=\"image/table_left1.jpg\">");
      out.write("<img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\">");
      out.write("</td>\r\n                ");
      out.write("<td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;");
      out.write("</td>\r\n                ");
      out.write("<td width=\"9\" background=\"image/T2.jpg\">");
      out.write("<img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\">");
      out.write("</td>\r\n              ");
      out.write("</tr>\r\n            ");
      out.write("</table>\r\n");

          }

      out.write("\r\n");
      out.write("</form>\r\n\r\n");
      out.write("</body>\r\n");

        myConn.close();
        myStatement1.close();
        myStatement2.close();
        myStatement3.close();
        myStatement4.close();
        myStatement5.close();
        myStatement6.close();
        myStatement7.close();
        myStatement8.close();
        myStatement9.close();
        myStatement10.close();
        myStatement11.close();
        myStatement12.close();
//      myStatement13.close();
        myStatement14.close();
      }
      catch(SQLException ex){
        System.err.println("aq.executeQuery: " + ex.getMessage());
        System.err.println("aq.executeQuery: " + sql);
      }
    }
  }

      out.write("\r\n");
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
