/* compiled from JSP: /EnquireTestCase_Right_Top.jsp
*
* This code was automatically generated at 16:02:24 on 2005-8-11
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
import java.sql.*; //[ /EnquireTestCase_Right_Top.jsp; Line: 56]
import javax.sql.*; //[ /EnquireTestCase_Right_Top.jsp; Line: 56]
import java.util.Enumeration; //[ /EnquireTestCase_Right_Top.jsp; Line: 56]
import java.util.ArrayList; //[ /EnquireTestCase_Right_Top.jsp; Line: 56]


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
* This code was automatically generated at 16:02:24 on 2005-8-11
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquiretestcase_right_top
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right_Top.jsp", 1123747336000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right_Top.jsp", 1123747336000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.usecase.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"UseCase Name can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteTestCaseConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\n\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestCaseConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n<form method=\"post\">\r\n\r\n  <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n    </tr>\r\n  </table>\r\n\r\n  <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n      <td background=\"image/T2.jpg\">Select Test Case to delete from list:</td>\r\n      <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n    </tr>\r\n  </table>\r\n  <table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\n  style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    <tbody>\r\n      <tr align=\"center\" bgcolor=#74A5E8>\r\n        <td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;</td>\r\n        <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></td>\r\n        <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></td>\r\n      </tr>\r\n\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectProject.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectUseCase.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectFunctionPoint.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n            <tr align=\"center\" bgcolor=#f8f8f8>\r\n              <td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = " /></td>\r\n              <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "</td>\r\n              <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "<input type = \"hidden\" name = ";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " value =";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = " /></td>\r\n            </tr>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n    </tbody>\r\n  </table>\r\n\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n\r\n    <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n        <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n        <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n        <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n      </tr>\r\n    </table>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n</form>\r\n\r\n<form method=\"post\" >\r\n\r\n  <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td align=\"left\" valign=\"top\"><img src=\"image/TT-Testmatrix.jpg\" width=\"285\" height=\"46\"></td>\r\n    </tr>\r\n  </table>\r\n\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectProject.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectUseCase.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectFunctionPoint.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "\r\n  <TABLE width=";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = " border=1 cellPadding=0 cellSpacing=0\r\n    style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    <TBODY>\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "\r\n              <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n                  <td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n                  <TD width=\"163\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>\r\n";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "\r\n                  <TD width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = " value=";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "></span></TD>\r\n";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "\r\n              </TR>\r\n";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = "\r\n    </TBODY>\r\n  </TABLE>\r\n";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "\r\n\r\n</form>\r\n\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  private final static String _wl_block34 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block34Bytes = _getBytes(_wl_block34);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
      } // end bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 57]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
            rr = new managestring.mystring(); //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
            pageContext.setAttribute("rr", rr); //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
      } // end bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 58]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      compages.compagesData cc = null; //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
      cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
      if (cc == null) { // begin 'cc' instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
          cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
          if (cc == null) { // begin 'cc' synchronized instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
            cc = new compages.compagesData(); //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
            pageContext.setAttribute("cc", cc); //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
      } // end bean instantiation block... //[ /EnquireTestCase_Right_Top.jsp; Line: 59]
      _writeText(response, out, _wl_block4, _wl_block4Bytes);
      //[ /EnquireTestCase_Right_Top.jsp; Line: 61]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireTestCase_Right_Top.jsp; Line: 62]
      //[ /EnquireTestCase_Right_Top.jsp; Line: 63]
      if(!ss.hasMoreElements()){ //[ /EnquireTestCase_Right_Top.jsp; Line: 64]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireTestCase_Right_Top.jsp; Line: 69]
      } //[ /EnquireTestCase_Right_Top.jsp; Line: 70]
      else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 71]
        String sql=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 72]
        //[ /EnquireTestCase_Right_Top.jsp; Line: 73]
        try{ //[ /EnquireTestCase_Right_Top.jsp; Line: 74]
          DataSource ds=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 75]
          ds=tt.getDataSource(); //[ /EnquireTestCase_Right_Top.jsp; Line: 76]
          Connection myConn=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 77]
          Statement myStatement1=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 78]
          Statement myStatement2=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 79]
          Statement myStatement3=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 80]
          Statement myStatement4=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 81]
          Statement myStatement5=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 82]
          Statement myStatement7=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 83]
          myConn=ds.getConnection(); //[ /EnquireTestCase_Right_Top.jsp; Line: 84]
          myStatement1=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 85]
          myStatement2=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 86]
          myStatement3=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 87]
          myStatement4=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 88]
          myStatement5=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 89]
          myStatement7=myConn.createStatement(); //[ /EnquireTestCase_Right_Top.jsp; Line: 90]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /EnquireTestCase_Right_Top.jsp; Line: 117]
          int noData=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 118]
          int x=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 119]
          //[ /EnquireTestCase_Right_Top.jsp; Line: 120]
          String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestCase_Right_Top.jsp; Line: 121]
          String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestCase_Right_Top.jsp; Line: 122]
          String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireTestCase_Right_Top.jsp; Line: 123]
          //[ /EnquireTestCase_Right_Top.jsp; Line: 124]
          ResultSet rs1,rs2,rs3; //[ /EnquireTestCase_Right_Top.jsp; Line: 125]
          rs1=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 126]
          rs2=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 127]
          rs3=null; //[ /EnquireTestCase_Right_Top.jsp; Line: 128]
          //[ /EnquireTestCase_Right_Top.jsp; Line: 129]
          String checkBoxName=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 130]
          String hideName=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 131]
          //[ /EnquireTestCase_Right_Top.jsp; Line: 132]
          long testCaseID=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 133]
          int number=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 134]
          //[ /EnquireTestCase_Right_Top.jsp; Line: 135]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 136]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 137]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 142]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 143]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 144]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 145]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 150]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 151]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 152]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 153]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 158]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 159]
          else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 160]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right_Top.jsp; Line: 161]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right_Top.jsp; Line: 162]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right_Top.jsp; Line: 163]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 164]
            String functionPointName=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 165]
            String useCaseName=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 166]
            String cDis = new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 167]
            String rDis = new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 168]
            String[] temp; //[ /EnquireTestCase_Right_Top.jsp; Line: 169]
            String condition1=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 170]
            int first=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 171]
            int first1=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 172]
            int nn=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 173]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 174]
            sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right_Top.jsp; Line: 175]
            rs1=myStatement1.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 176]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 177]
            if(rs1.next()) //[ /EnquireTestCase_Right_Top.jsp; Line: 178]
            { //[ /EnquireTestCase_Right_Top.jsp; Line: 179]
              noData=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 180]
              do //[ /EnquireTestCase_Right_Top.jsp; Line: 181]
              { //[ /EnquireTestCase_Right_Top.jsp; Line: 182]
                number++; //[ /EnquireTestCase_Right_Top.jsp; Line: 183]
                cDis=rs1.getString("condition"); //[ /EnquireTestCase_Right_Top.jsp; Line: 184]
                rDis=rs1.getString("result"); //[ /EnquireTestCase_Right_Top.jsp; Line: 185]
                first=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 186]
                first1=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 187]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 188]
                temp=rr.getID(cDis); //[ /EnquireTestCase_Right_Top.jsp; Line: 189]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right_Top.jsp; Line: 190]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right_Top.jsp; Line: 191]
                  if(first==1){ //[ /EnquireTestCase_Right_Top.jsp; Line: 192]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right_Top.jsp; Line: 193]
                    first=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 194]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 195]
                  else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 196]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right_Top.jsp; Line: 197]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 198]
                  //[ /EnquireTestCase_Right_Top.jsp; Line: 199]
                } //[ /EnquireTestCase_Right_Top.jsp; Line: 200]
                sql=sql+") order by inf_id"; //[ /EnquireTestCase_Right_Top.jsp; Line: 201]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 202]
                rs3=myStatement2.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 203]
                first=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 204]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 205]
                while(rs3.next()){ //[ /EnquireTestCase_Right_Top.jsp; Line: 206]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right_Top.jsp; Line: 207]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right_Top.jsp; Line: 208]
                  if(first==1){ //[ /EnquireTestCase_Right_Top.jsp; Line: 209]
                    cDis=condition1; //[ /EnquireTestCase_Right_Top.jsp; Line: 210]
                    first=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 211]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 212]
                  else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 213]
                    cDis=cDis+"<br>"+condition1; //[ /EnquireTestCase_Right_Top.jsp; Line: 214]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 215]
                } //[ /EnquireTestCase_Right_Top.jsp; Line: 216]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 217]
                temp=rr.getID(rDis); //[ /EnquireTestCase_Right_Top.jsp; Line: 218]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right_Top.jsp; Line: 219]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right_Top.jsp; Line: 220]
                  if(first1==1){ //[ /EnquireTestCase_Right_Top.jsp; Line: 221]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right_Top.jsp; Line: 222]
                    first1=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 223]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 224]
                  else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 225]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right_Top.jsp; Line: 226]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 227]
                } //[ /EnquireTestCase_Right_Top.jsp; Line: 228]
                sql=sql+") order by inf_id"; //[ /EnquireTestCase_Right_Top.jsp; Line: 229]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 230]
                rs3=myStatement3.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 231]
                first1=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 232]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 233]
                while(rs3.next()){ //[ /EnquireTestCase_Right_Top.jsp; Line: 234]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right_Top.jsp; Line: 235]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right_Top.jsp; Line: 236]
                  if(first1==1){ //[ /EnquireTestCase_Right_Top.jsp; Line: 237]
                    rDis=condition1; //[ /EnquireTestCase_Right_Top.jsp; Line: 238]
                    first1=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 239]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 240]
                  else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 241]
                    rDis=rDis+"<br>"+condition1; //[ /EnquireTestCase_Right_Top.jsp; Line: 242]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 243]
                } //[ /EnquireTestCase_Right_Top.jsp; Line: 244]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 245]
                testCaseID=rs1.getLong("test_case_id"); //[ /EnquireTestCase_Right_Top.jsp; Line: 246]
                checkBoxName="C"+number; //[ /EnquireTestCase_Right_Top.jsp; Line: 247]
                hideName="H"+number; //[ /EnquireTestCase_Right_Top.jsp; Line: 248]
                //[ /EnquireTestCase_Right_Top.jsp; Line: 249]
                _writeText(response, out, _wl_block10, _wl_block10Bytes);
                out.print(String.valueOf(checkBoxName ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 252]
                _writeText(response, out, _wl_block11, _wl_block11Bytes);
                out.print(String.valueOf(cDis ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 253]
                _writeText(response, out, _wl_block12, _wl_block12Bytes);
                out.print(String.valueOf(rDis ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 254]
                _writeText(response, out, _wl_block13, _wl_block13Bytes);
                out.print(String.valueOf(hideName ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 254]
                _writeText(response, out, _wl_block14, _wl_block14Bytes);
                out.print(String.valueOf(testCaseID ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 254]
                _writeText(response, out, _wl_block15, _wl_block15Bytes);
                //[ /EnquireTestCase_Right_Top.jsp; Line: 256]
              }while(rs1.next()); //[ /EnquireTestCase_Right_Top.jsp; Line: 257]
              session.setAttribute("CR_Number", String.valueOf(number)); //[ /EnquireTestCase_Right_Top.jsp; Line: 258]
              rs3.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 259]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 260]
            rs1.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 261]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 262]
          _writeText(response, out, _wl_block16, _wl_block16Bytes);
          //[ /EnquireTestCase_Right_Top.jsp; Line: 267]
          if(noData==1){ //[ /EnquireTestCase_Right_Top.jsp; Line: 268]
            _writeText(response, out, _wl_block17, _wl_block17Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 279]
            noData=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 280]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 281]
          _writeText(response, out, _wl_block18, _wl_block18Bytes);
          //[ /EnquireTestCase_Right_Top.jsp; Line: 293]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 294]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 295]
            _writeText(response, out, _wl_block19, _wl_block19Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 300]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 301]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 302]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 303]
            _writeText(response, out, _wl_block20, _wl_block20Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 308]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 309]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right_Top.jsp; Line: 310]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right_Top.jsp; Line: 311]
            _writeText(response, out, _wl_block21, _wl_block21Bytes);
            //[ /EnquireTestCase_Right_Top.jsp; Line: 316]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 317]
          else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 318]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 319]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right_Top.jsp; Line: 320]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 321]
            sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right_Top.jsp; Line: 322]
            rs1=myStatement4.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 323]
            int y=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 324]
            if(rs1.next()){ //[ /EnquireTestCase_Right_Top.jsp; Line: 325]
              y=rs1.getInt("count(*)"); //[ /EnquireTestCase_Right_Top.jsp; Line: 326]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 327]
            else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 328]
              y=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 329]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 330]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 331]
            sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right_Top.jsp; Line: 332]
            rs2=myStatement5.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 333]
            if(rs2.next()){ //[ /EnquireTestCase_Right_Top.jsp; Line: 334]
              x=rs2.getInt("count(*)"); //[ /EnquireTestCase_Right_Top.jsp; Line: 335]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 336]
            else{ //[ /EnquireTestCase_Right_Top.jsp; Line: 337]
              x=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 338]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 339]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 340]
            String CheckName = new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 341]
            String content = new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 342]
            long id=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 343]
            int first2=1; //[ /EnquireTestCase_Right_Top.jsp; Line: 344]
            String[] temp; //[ /EnquireTestCase_Right_Top.jsp; Line: 345]
            String condition1=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 346]
            String information=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 347]
            String condition2=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 348]
            String result2=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 349]
            String[] con; //[ /EnquireTestCase_Right_Top.jsp; Line: 350]
            String[] rel; //[ /EnquireTestCase_Right_Top.jsp; Line: 351]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 352]
            int l=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 353]
            int lll=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 354]
            int cPosition=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 355]
            int rPosition=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 356]
            int i=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 357]
            int nn=0; //[ /EnquireTestCase_Right_Top.jsp; Line: 358]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right_Top.jsp; Line: 359]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right_Top.jsp; Line: 360]
            String cDis=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 361]
            String rDis=new String(); //[ /EnquireTestCase_Right_Top.jsp; Line: 362]
            //[ /EnquireTestCase_Right_Top.jsp; Line: 363]
            if(x>0 && y>0){ //[ /EnquireTestCase_Right_Top.jsp; Line: 364]
              _writeText(response, out, _wl_block22, _wl_block22Bytes);
              out.print(String.valueOf(x*163+147 ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 366]
              _writeText(response, out, _wl_block23, _wl_block23Bytes);
              //[ /EnquireTestCase_Right_Top.jsp; Line: 369]
              //[ /EnquireTestCase_Right_Top.jsp; Line: 370]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right_Top.jsp; Line: 371]
              rs2=myStatement7.executeQuery(sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 372]
              rs2.next(); //[ /EnquireTestCase_Right_Top.jsp; Line: 373]
              //[ /EnquireTestCase_Right_Top.jsp; Line: 374]
              if(x>0 && y>0) //[ /EnquireTestCase_Right_Top.jsp; Line: 375]
              { //[ /EnquireTestCase_Right_Top.jsp; Line: 376]
                _writeText(response, out, _wl_block24, _wl_block24Bytes);
                //[ /EnquireTestCase_Right_Top.jsp; Line: 379]
                for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right_Top.jsp; Line: 380]
                { //[ /EnquireTestCase_Right_Top.jsp; Line: 381]
                  CheckName = null; //[ /EnquireTestCase_Right_Top.jsp; Line: 382]
                  //[ /EnquireTestCase_Right_Top.jsp; Line: 383]
                  if(j==1 && i==0){ //[ /EnquireTestCase_Right_Top.jsp; Line: 384]
                    _writeText(response, out, _wl_block25, _wl_block25Bytes);
                    //[ /EnquireTestCase_Right_Top.jsp; Line: 387]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 388]
                  //[ /EnquireTestCase_Right_Top.jsp; Line: 389]
                  if(i==0 && j==0){ //[ /EnquireTestCase_Right_Top.jsp; Line: 390]
                    _writeText(response, out, _wl_block26, _wl_block26Bytes);
                    //[ /EnquireTestCase_Right_Top.jsp; Line: 393]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 394]
                  if(j>0 && i==0){ //[ /EnquireTestCase_Right_Top.jsp; Line: 395]
                    CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right_Top.jsp; Line: 396]
                    content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right_Top.jsp; Line: 397]
                    id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right_Top.jsp; Line: 398]
                    content=rr.replace(content); //[ /EnquireTestCase_Right_Top.jsp; Line: 399]
                    //                  content=rr.replaceBlank(content); //[ /EnquireTestCase_Right_Top.jsp; Line: 400]
                    _writeText(response, out, _wl_block27, _wl_block27Bytes);
                    out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 402]
                    _writeText(response, out, _wl_block28, _wl_block28Bytes);
                    out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 402]
                    _writeText(response, out, _wl_block29, _wl_block29Bytes);
                    out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right_Top.jsp; Line: 402]
                    _writeText(response, out, _wl_block30, _wl_block30Bytes);
                    //[ /EnquireTestCase_Right_Top.jsp; Line: 403]
                    rs2.next(); //[ /EnquireTestCase_Right_Top.jsp; Line: 404]
                  } //[ /EnquireTestCase_Right_Top.jsp; Line: 405]
                } //[ /EnquireTestCase_Right_Top.jsp; Line: 406]
                _writeText(response, out, _wl_block31, _wl_block31Bytes);
                //[ /EnquireTestCase_Right_Top.jsp; Line: 409]
              } //[ /EnquireTestCase_Right_Top.jsp; Line: 410]
              _writeText(response, out, _wl_block32, _wl_block32Bytes);
              //[ /EnquireTestCase_Right_Top.jsp; Line: 414]
            } //[ /EnquireTestCase_Right_Top.jsp; Line: 415]
            rs2.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 416]
            rs1.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 417]
          } //[ /EnquireTestCase_Right_Top.jsp; Line: 418]
          _writeText(response, out, _wl_block33, _wl_block33Bytes);
          //[ /EnquireTestCase_Right_Top.jsp; Line: 423]
          myConn.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 424]
          myStatement1.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 425]
          myStatement2.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 426]
          myStatement3.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 427]
          myStatement4.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 428]
          myStatement5.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 429]
          myStatement7.close(); //[ /EnquireTestCase_Right_Top.jsp; Line: 430]
        } //[ /EnquireTestCase_Right_Top.jsp; Line: 431]
        catch(SQLException ex){ //[ /EnquireTestCase_Right_Top.jsp; Line: 432]
          System.err.println("aq.executeQuery: " + ex.getMessage()); //[ /EnquireTestCase_Right_Top.jsp; Line: 433]
          System.err.println("aq.executeQuery: " + sql); //[ /EnquireTestCase_Right_Top.jsp; Line: 434]
        } //[ /EnquireTestCase_Right_Top.jsp; Line: 435]
      } //[ /EnquireTestCase_Right_Top.jsp; Line: 436]
      _writeText(response, out, _wl_block34, _wl_block34Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
