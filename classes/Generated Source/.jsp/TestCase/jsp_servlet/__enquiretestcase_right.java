/* compiled from JSP: /EnquireTestCase_Right.jsp
*
* This code was automatically generated at 8:31:25 on 2005-6-30
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*/

package jsp_servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

// User imports
import java.sql.*; //[ /EnquireTestCase_Right.jsp; Line: 54]


// built-in init parameters:
// boolean             _verbose -- wants debugging

// Well-known variables:
// JspWriter out                  -- to write to the browser
// HttpServletRequest  request    -- the request object.
// HttpServletResponse response   -- the response object.
// PageContext pageContext        -- the page context for this JSP
// HttpSession session            -- the session object for the client (if any)
// ServletContext application     -- The servlet (application) context
// ServletConfig config           -- The ServletConfig for this JSP
// Object page                    -- the instance of this page's implementation class (i.e., 'this')

/**
* This code was automatically generated at 8:31:25 on 2005-6-30
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquiretestcase_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1120091422000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1120091422000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  
  private static void _writeText(ServletResponse rsp, JspWriter out, String block, byte[] blockBytes) throws IOException {
    if (!_WL_ENCODED_BYTES_OK || _hasEncodingChanged(rsp)) {
      out.print(block);
    } else {
      ((weblogic.servlet.jsp.ByteWriter)out).write(blockBytes, block);
    } 
  }
  
  
  private static boolean _hasEncodingChanged(ServletResponse rsp) {
    if (_WL_ORIGINAL_ENCODING.equals(rsp.getCharacterEncoding())) {
      return false;
    }
    return true;
  }
  
  private static boolean _WL_ENCODED_BYTES_OK = true;
  
  private static final String _WL_ORIGINAL_ENCODING = "GBK";
  
  private static byte[] _getBytes(String block) {
    try {
      return block.getBytes(_WL_ORIGINAL_ENCODING);
    } catch (java.io.UnsupportedEncodingException u) {
      _WL_ENCODED_BYTES_OK = false;
    }
    return null;
  }
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>无标题文档</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.usecase.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"UseCase Name can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"DeleteTestCaseConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestCaseConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Select Test Case to delete from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n<table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <tbody>\r\n    <tr align=\"center\" bgcolor=#74A5E8>\r\n      <td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;</td>\r\n      <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></td>\r\n      <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></td>\r\n    </tr>\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n    <tr align=\"center\" bgcolor=#f8f8f8>\r\n      <td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = " /></td>\r\n      <td width=\"363\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea\" cols=\"48\" rows=\"3\">";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "</textarea></td>\r\n      <td width=\"363\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea\" cols=\"48\" rows=\"3\">";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "</textarea><input type = \"hidden\" name = ";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " value =";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = " /></td>\r\n    </tr>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n\r\n  </tbody>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n\r\n</form>\r\n\r\n<form method=\"post\" >\r\n\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n      <TD height=\"25\" width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "\r\n\r\n      <TD width=\"100\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = " cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "</textarea></span></TD>\r\n";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "\r\n      <td width=\"100\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = " cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "</textarea></span></td>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n      <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = " value=\"checkbox\"></td>\r\n";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = "\r\n    </TR>\r\n";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = "\r\n\r\n  </TBODY>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "\r\n\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  
  
  public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException 
  {  
    
    // declare and set well-known variables:
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.ServletContext application = config.getServletContext();
    javax.servlet.jsp.tagext.Tag _activeTag = null;
    // variables for Tag extension protocol
    
    Object page = this;
    javax.servlet.jsp.JspWriter out;
    javax.servlet.jsp.PageContext pageContext =
    javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
    
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /EnquireTestCase_Right.jsp; Line: 55]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 55]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 55]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 55]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 55]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 55]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestCase_Right.jsp; Line: 55]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestCase_Right.jsp; Line: 55]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 55]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 55]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 55]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 81]
      int noData=0; //[ /EnquireTestCase_Right.jsp; Line: 82]
      //[ /EnquireTestCase_Right.jsp; Line: 83]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestCase_Right.jsp; Line: 84]
      String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestCase_Right.jsp; Line: 85]
      String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireTestCase_Right.jsp; Line: 86]
      //[ /EnquireTestCase_Right.jsp; Line: 87]
      String sql=new String(); //[ /EnquireTestCase_Right.jsp; Line: 88]
      ResultSet rs1,rs2,rs3; //[ /EnquireTestCase_Right.jsp; Line: 89]
      //[ /EnquireTestCase_Right.jsp; Line: 90]
      String checkBoxName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 91]
      String hideName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 92]
      //[ /EnquireTestCase_Right.jsp; Line: 93]
      long testCaseID=0; //[ /EnquireTestCase_Right.jsp; Line: 94]
      int number=0; //[ /EnquireTestCase_Right.jsp; Line: 95]
      //[ /EnquireTestCase_Right.jsp; Line: 96]
      if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 97]
        //[ /EnquireTestCase_Right.jsp; Line: 98]
        session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right.jsp; Line: 99]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 104]
      } //[ /EnquireTestCase_Right.jsp; Line: 105]
      else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 106]
        session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right.jsp; Line: 107]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 112]
      } //[ /EnquireTestCase_Right.jsp; Line: 113]
      else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 114]
        session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right.jsp; Line: 115]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 120]
      } //[ /EnquireTestCase_Right.jsp; Line: 121]
      else{ //[ /EnquireTestCase_Right.jsp; Line: 122]
        long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right.jsp; Line: 123]
        long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right.jsp; Line: 124]
        long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 125]
        //[ /EnquireTestCase_Right.jsp; Line: 126]
        String functionPointName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 127]
        String useCaseName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 128]
        String cDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 129]
        String rDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 130]
        //[ /EnquireTestCase_Right.jsp; Line: 131]
        sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 132]
        rs1=tt.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 133]
        //[ /EnquireTestCase_Right.jsp; Line: 134]
        if(rs1.next()) //[ /EnquireTestCase_Right.jsp; Line: 135]
        { //[ /EnquireTestCase_Right.jsp; Line: 136]
          noData=1; //[ /EnquireTestCase_Right.jsp; Line: 137]
          do //[ /EnquireTestCase_Right.jsp; Line: 138]
          { //[ /EnquireTestCase_Right.jsp; Line: 139]
            number++; //[ /EnquireTestCase_Right.jsp; Line: 140]
            cDis=rs1.getString("condition"); //[ /EnquireTestCase_Right.jsp; Line: 141]
            rDis=rs1.getString("result"); //[ /EnquireTestCase_Right.jsp; Line: 142]
            testCaseID=rs1.getLong("test_case_id"); //[ /EnquireTestCase_Right.jsp; Line: 143]
            checkBoxName="C"+number; //[ /EnquireTestCase_Right.jsp; Line: 144]
            hideName="H"+number; //[ /EnquireTestCase_Right.jsp; Line: 145]
            //[ /EnquireTestCase_Right.jsp; Line: 146]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            out.print(String.valueOf(checkBoxName ));  //[ /EnquireTestCase_Right.jsp; Line: 150]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            out.print(String.valueOf(cDis ));  //[ /EnquireTestCase_Right.jsp; Line: 151]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            out.print(String.valueOf(rDis ));  //[ /EnquireTestCase_Right.jsp; Line: 152]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            out.print(String.valueOf(hideName ));  //[ /EnquireTestCase_Right.jsp; Line: 152]
            _writeText(response, out, _wl_block10, _wl_block10Bytes);
            out.print(String.valueOf(testCaseID ));  //[ /EnquireTestCase_Right.jsp; Line: 152]
            _writeText(response, out, _wl_block11, _wl_block11Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 154]
          }while(rs1.next()); //[ /EnquireTestCase_Right.jsp; Line: 155]
          //[ /EnquireTestCase_Right.jsp; Line: 156]
        } //[ /EnquireTestCase_Right.jsp; Line: 157]
        session.setAttribute("CR_Number", String.valueOf(number)); //[ /EnquireTestCase_Right.jsp; Line: 158]
        //[ /EnquireTestCase_Right.jsp; Line: 159]
      } //[ /EnquireTestCase_Right.jsp; Line: 160]
      _writeText(response, out, _wl_block12, _wl_block12Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 166]
      if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 167]
        _writeText(response, out, _wl_block13, _wl_block13Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 179]
        noData=0; //[ /EnquireTestCase_Right.jsp; Line: 180]
      } //[ /EnquireTestCase_Right.jsp; Line: 181]
      _writeText(response, out, _wl_block14, _wl_block14Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 192]
      if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 193]
        //[ /EnquireTestCase_Right.jsp; Line: 194]
        session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right.jsp; Line: 195]
        _writeText(response, out, _wl_block15, _wl_block15Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 200]
      } //[ /EnquireTestCase_Right.jsp; Line: 201]
      else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 202]
        session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right.jsp; Line: 203]
        _writeText(response, out, _wl_block16, _wl_block16Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 208]
      } //[ /EnquireTestCase_Right.jsp; Line: 209]
      else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 210]
        session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right.jsp; Line: 211]
        _writeText(response, out, _wl_block17, _wl_block17Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 216]
      } //[ /EnquireTestCase_Right.jsp; Line: 217]
      else{ //[ /EnquireTestCase_Right.jsp; Line: 218]
        //[ /EnquireTestCase_Right.jsp; Line: 219]
        long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 220]
        //[ /EnquireTestCase_Right.jsp; Line: 221]
        sql="select count(*) from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 222]
        //[ /EnquireTestCase_Right.jsp; Line: 223]
        rs1=tt.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 224]
        int y=0; //[ /EnquireTestCase_Right.jsp; Line: 225]
        if(rs1.next()){ //[ /EnquireTestCase_Right.jsp; Line: 226]
          y=rs1.getInt("Expr1000"); //[ /EnquireTestCase_Right.jsp; Line: 227]
        } //[ /EnquireTestCase_Right.jsp; Line: 228]
        else{ //[ /EnquireTestCase_Right.jsp; Line: 229]
          y=0; //[ /EnquireTestCase_Right.jsp; Line: 230]
        } //[ /EnquireTestCase_Right.jsp; Line: 231]
        //[ /EnquireTestCase_Right.jsp; Line: 232]
        sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 233]
        rs2=tt.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 234]
        int x=0; //[ /EnquireTestCase_Right.jsp; Line: 235]
        if(rs2.next()){ //[ /EnquireTestCase_Right.jsp; Line: 236]
          x=rs2.getInt("Expr1000"); //[ /EnquireTestCase_Right.jsp; Line: 237]
        } //[ /EnquireTestCase_Right.jsp; Line: 238]
        else{ //[ /EnquireTestCase_Right.jsp; Line: 239]
          x=0; //[ /EnquireTestCase_Right.jsp; Line: 240]
        } //[ /EnquireTestCase_Right.jsp; Line: 241]
        //[ /EnquireTestCase_Right.jsp; Line: 242]
        session.setAttribute("R_Number",String.valueOf(x)); //[ /EnquireTestCase_Right.jsp; Line: 243]
        session.setAttribute("C_Number",String.valueOf(y)); //[ /EnquireTestCase_Right.jsp; Line: 244]
        //[ /EnquireTestCase_Right.jsp; Line: 245]
        String CheckName = new String(); //[ /EnquireTestCase_Right.jsp; Line: 246]
        String content = new String(); //[ /EnquireTestCase_Right.jsp; Line: 247]
        rs1=null; //[ /EnquireTestCase_Right.jsp; Line: 248]
        rs2=null; //[ /EnquireTestCase_Right.jsp; Line: 249]
        //[ /EnquireTestCase_Right.jsp; Line: 250]
        sql="select inf_dis from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 251]
        rs1=tt.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 252]
        rs1.next(); //[ /EnquireTestCase_Right.jsp; Line: 253]
        //[ /EnquireTestCase_Right.jsp; Line: 254]
        sql="select inf_dis from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 255]
        rs2=tt.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 256]
        rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 257]
        //[ /EnquireTestCase_Right.jsp; Line: 258]
        if(x>0 && y>0) //[ /EnquireTestCase_Right.jsp; Line: 259]
        { //[ /EnquireTestCase_Right.jsp; Line: 260]
          noData=1; //[ /EnquireTestCase_Right.jsp; Line: 261]
          for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right.jsp; Line: 262]
          { //[ /EnquireTestCase_Right.jsp; Line: 263]
            //[ /EnquireTestCase_Right.jsp; Line: 264]
            _writeText(response, out, _wl_block18, _wl_block18Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 267]
            for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right.jsp; Line: 268]
            { //[ /EnquireTestCase_Right.jsp; Line: 269]
              CheckName = null; //[ /EnquireTestCase_Right.jsp; Line: 270]
              //[ /EnquireTestCase_Right.jsp; Line: 271]
              if(i==0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 272]
                _writeText(response, out, _wl_block19, _wl_block19Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 275]
              } //[ /EnquireTestCase_Right.jsp; Line: 276]
              if(j>0 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 277]
                CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right.jsp; Line: 278]
                content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 279]
                _writeText(response, out, _wl_block20, _wl_block20Bytes);
                out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 282]
                _writeText(response, out, _wl_block21, _wl_block21Bytes);
                out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 282]
                _writeText(response, out, _wl_block22, _wl_block22Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 283]
                rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 284]
              } //[ /EnquireTestCase_Right.jsp; Line: 285]
              else if(i>0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 286]
                CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 287]
                content = rs1.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 288]
                _writeText(response, out, _wl_block23, _wl_block23Bytes);
                out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 290]
                _writeText(response, out, _wl_block24, _wl_block24Bytes);
                out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 290]
                _writeText(response, out, _wl_block25, _wl_block25Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 291]
                rs1.next(); //[ /EnquireTestCase_Right.jsp; Line: 292]
              } //[ /EnquireTestCase_Right.jsp; Line: 293]
              else if(j>0 && i>0){ //[ /EnquireTestCase_Right.jsp; Line: 294]
                CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 295]
                _writeText(response, out, _wl_block26, _wl_block26Bytes);
                out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 297]
                _writeText(response, out, _wl_block27, _wl_block27Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 298]
              } //[ /EnquireTestCase_Right.jsp; Line: 299]
            } //[ /EnquireTestCase_Right.jsp; Line: 300]
            _writeText(response, out, _wl_block28, _wl_block28Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 303]
          } //[ /EnquireTestCase_Right.jsp; Line: 304]
        } //[ /EnquireTestCase_Right.jsp; Line: 305]
        rs1.close(); //[ /EnquireTestCase_Right.jsp; Line: 306]
        rs2.close(); //[ /EnquireTestCase_Right.jsp; Line: 307]
      } //[ /EnquireTestCase_Right.jsp; Line: 308]
      _writeText(response, out, _wl_block29, _wl_block29Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 314]
      if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 315]
        _writeText(response, out, _wl_block30, _wl_block30Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 326]
      } //[ /EnquireTestCase_Right.jsp; Line: 327]
      _writeText(response, out, _wl_block31, _wl_block31Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
