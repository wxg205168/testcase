/* compiled from JSP: /EnquireTestCase_Right.jsp
*
* This code was automatically generated at 9:40:16 on 2005-8-8
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
import java.sql.*; //[ /EnquireTestCase_Right.jsp; Line: 56]
import javax.sql.*; //[ /EnquireTestCase_Right.jsp; Line: 56]
import java.util.Enumeration; //[ /EnquireTestCase_Right.jsp; Line: 56]


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
* This code was automatically generated at 9:40:17 on 2005-8-8
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
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1123465206000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1123465206000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"post\">\r\n\r\n  <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n    </tr>\r\n  </table>\r\n\r\n  <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n      <td background=\"image/T2.jpg\">Select Test Case to delete from list:</td>\r\n      <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n    </tr>\r\n  </table>\r\n  <table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\n  style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    <tbody>\r\n      <tr align=\"center\" bgcolor=#74A5E8>\r\n        <td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;</td>\r\n        <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></td>\r\n        <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></td>\r\n      </tr>\r\n\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectProject.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectUseCase.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectFunctionPoint.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n            <tr align=\"center\" bgcolor=#f8f8f8>\r\n              <td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " /></td>\r\n              <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "</td>\r\n              <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "<input type = \"hidden\" name = ";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = " value =";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " /></td>\r\n            </tr>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n    </tbody>\r\n  </table>\r\n\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n\r\n    <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n        <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n        <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n        <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n      </tr>\r\n    </table>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n</form>\r\n\r\n<form method=\"post\" >\r\n\r\n  <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td align=\"left\" valign=\"top\"><img src=\"image/TT-Testmatrix.jpg\" width=\"285\" height=\"46\"></td>\r\n    </tr>\r\n  </table>\r\n\r\n\r\n  <TABLE width=\"0\" border=1 cellPadding=0 cellSpacing=0\r\n    style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    <TBODY>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectProject.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectUseCase.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectFunctionPoint.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "\r\n              <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "\r\n                  <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "\r\n                  <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n                  <TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n                  <TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = " value=";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = "></span></TD>\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n                  <td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = " value=";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "></span></td>\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  private final static String _wl_block34 = "\r\n                    <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block34Bytes = _getBytes(_wl_block34);
  private final static String _wl_block35 = " value=\"checkbox\"  checked=\"checked\"></td>\r\n";
  private final static byte[] _wl_block35Bytes = _getBytes(_wl_block35);
  private final static String _wl_block36 = "\r\n                    <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block36Bytes = _getBytes(_wl_block36);
  private final static String _wl_block37 = " value=\"checkbox\"></td>\r\n";
  private final static byte[] _wl_block37Bytes = _getBytes(_wl_block37);
  private final static String _wl_block38 = "\r\n              </TR>\r\n";
  private final static byte[] _wl_block38Bytes = _getBytes(_wl_block38);
  private final static String _wl_block39 = "\r\n              <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block39Bytes = _getBytes(_wl_block39);
  private final static String _wl_block40 = "\r\n                  <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block40Bytes = _getBytes(_wl_block40);
  private final static String _wl_block41 = "\r\n                  <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block41Bytes = _getBytes(_wl_block41);
  private final static String _wl_block42 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block42Bytes = _getBytes(_wl_block42);
  private final static String _wl_block43 = "\r\n                  <TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block43Bytes = _getBytes(_wl_block43);
  private final static String _wl_block44 = "\r\n                  <TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block44Bytes = _getBytes(_wl_block44);
  private final static String _wl_block45 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block45Bytes = _getBytes(_wl_block45);
  private final static String _wl_block46 = " value=";
  private final static byte[] _wl_block46Bytes = _getBytes(_wl_block46);
  private final static String _wl_block47 = "></span></TD>\r\n";
  private final static byte[] _wl_block47Bytes = _getBytes(_wl_block47);
  private final static String _wl_block48 = "\r\n                  <td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block48Bytes = _getBytes(_wl_block48);
  private final static String _wl_block49 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block49Bytes = _getBytes(_wl_block49);
  private final static String _wl_block50 = " value=";
  private final static byte[] _wl_block50Bytes = _getBytes(_wl_block50);
  private final static String _wl_block51 = "></span></td>\r\n";
  private final static byte[] _wl_block51Bytes = _getBytes(_wl_block51);
  private final static String _wl_block52 = "\r\n                  <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block52Bytes = _getBytes(_wl_block52);
  private final static String _wl_block53 = " value=\"checkbox\"></td>\r\n";
  private final static byte[] _wl_block53Bytes = _getBytes(_wl_block53);
  private final static String _wl_block54 = "\r\n              </TR>\r\n";
  private final static byte[] _wl_block54Bytes = _getBytes(_wl_block54);
  private final static String _wl_block55 = "\r\n    </TBODY>\r\n  </TABLE>\r\n\r\n";
  private final static byte[] _wl_block55Bytes = _getBytes(_wl_block55);
  private final static String _wl_block56 = "\r\n\r\n    <table width=";
  private final static byte[] _wl_block56Bytes = _getBytes(_wl_block56);
  private final static String _wl_block57 = " border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n        <td align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n        <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n        <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n      </tr>\r\n    </table>\r\n";
  private final static byte[] _wl_block57Bytes = _getBytes(_wl_block57);
  private final static String _wl_block58 = "\r\n</form>\r\n\r\n";
  private final static byte[] _wl_block58Bytes = _getBytes(_wl_block58);
  private final static String _wl_block59 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block59Bytes = _getBytes(_wl_block59);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireTestCase_Right.jsp; Line: 57]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 57]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 57]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 57]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 57]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 57]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestCase_Right.jsp; Line: 57]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestCase_Right.jsp; Line: 57]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 57]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 57]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 57]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireTestCase_Right.jsp; Line: 58]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right.jsp; Line: 58]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 58]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 58]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right.jsp; Line: 58]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 58]
            rr = new managestring.mystring(); //[ /EnquireTestCase_Right.jsp; Line: 58]
            pageContext.setAttribute("rr", rr); //[ /EnquireTestCase_Right.jsp; Line: 58]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 58]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 58]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 58]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 60]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireTestCase_Right.jsp; Line: 61]
      //[ /EnquireTestCase_Right.jsp; Line: 62]
      if(!ss.hasMoreElements()){ //[ /EnquireTestCase_Right.jsp; Line: 63]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 68]
      } //[ /EnquireTestCase_Right.jsp; Line: 69]
      else{ //[ /EnquireTestCase_Right.jsp; Line: 70]
        String sql=new String(); //[ /EnquireTestCase_Right.jsp; Line: 71]
        //[ /EnquireTestCase_Right.jsp; Line: 72]
        try{ //[ /EnquireTestCase_Right.jsp; Line: 73]
          DataSource ds=null; //[ /EnquireTestCase_Right.jsp; Line: 74]
          ds=tt.getDataSource(); //[ /EnquireTestCase_Right.jsp; Line: 75]
          Connection myConn=null; //[ /EnquireTestCase_Right.jsp; Line: 76]
          Statement myStatement1=null; //[ /EnquireTestCase_Right.jsp; Line: 77]
          Statement myStatement2=null; //[ /EnquireTestCase_Right.jsp; Line: 78]
          Statement myStatement3=null; //[ /EnquireTestCase_Right.jsp; Line: 79]
          Statement myStatement4=null; //[ /EnquireTestCase_Right.jsp; Line: 80]
          Statement myStatement5=null; //[ /EnquireTestCase_Right.jsp; Line: 81]
          Statement myStatement6=null; //[ /EnquireTestCase_Right.jsp; Line: 82]
          Statement myStatement7=null; //[ /EnquireTestCase_Right.jsp; Line: 83]
          Statement myStatement8=null; //[ /EnquireTestCase_Right.jsp; Line: 84]
          Statement myStatement9=null; //[ /EnquireTestCase_Right.jsp; Line: 85]
          Statement myStatement10=null; //[ /EnquireTestCase_Right.jsp; Line: 86]
          Statement myStatement11=null; //[ /EnquireTestCase_Right.jsp; Line: 87]
          Statement myStatement12=null; //[ /EnquireTestCase_Right.jsp; Line: 88]
          Statement myStatement13=null; //[ /EnquireTestCase_Right.jsp; Line: 89]
          myConn=ds.getConnection(); //[ /EnquireTestCase_Right.jsp; Line: 90]
          myStatement1=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 91]
          myStatement2=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 92]
          myStatement3=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 93]
          myStatement4=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 94]
          myStatement5=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 95]
          myStatement6=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 96]
          myStatement7=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 97]
          myStatement8=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 98]
          myStatement9=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 99]
          myStatement10=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 100]
          myStatement11=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 101]
          myStatement12=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 102]
          myStatement13=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 103]
          _writeText(response, out, _wl_block5, _wl_block5Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 130]
          int noData=0; //[ /EnquireTestCase_Right.jsp; Line: 131]
          int x=0; //[ /EnquireTestCase_Right.jsp; Line: 132]
          //[ /EnquireTestCase_Right.jsp; Line: 133]
          String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestCase_Right.jsp; Line: 134]
          String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestCase_Right.jsp; Line: 135]
          String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireTestCase_Right.jsp; Line: 136]
          //[ /EnquireTestCase_Right.jsp; Line: 137]
          ResultSet rs1,rs2,rs3,rs4,rs5; //[ /EnquireTestCase_Right.jsp; Line: 138]
          rs1=null; //[ /EnquireTestCase_Right.jsp; Line: 139]
          rs2=null; //[ /EnquireTestCase_Right.jsp; Line: 140]
          rs3=null; //[ /EnquireTestCase_Right.jsp; Line: 141]
          rs4=null; //[ /EnquireTestCase_Right.jsp; Line: 142]
          rs5=null; //[ /EnquireTestCase_Right.jsp; Line: 143]
          //[ /EnquireTestCase_Right.jsp; Line: 144]
          String checkBoxName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 145]
          String hideName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 146]
          //[ /EnquireTestCase_Right.jsp; Line: 147]
          long testCaseID=0; //[ /EnquireTestCase_Right.jsp; Line: 148]
          int number=0; //[ /EnquireTestCase_Right.jsp; Line: 149]
          //[ /EnquireTestCase_Right.jsp; Line: 150]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 151]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right.jsp; Line: 152]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 157]
          } //[ /EnquireTestCase_Right.jsp; Line: 158]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 159]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right.jsp; Line: 160]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 165]
          } //[ /EnquireTestCase_Right.jsp; Line: 166]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 167]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right.jsp; Line: 168]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 173]
          } //[ /EnquireTestCase_Right.jsp; Line: 174]
          else{ //[ /EnquireTestCase_Right.jsp; Line: 175]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right.jsp; Line: 176]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right.jsp; Line: 177]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 178]
            //[ /EnquireTestCase_Right.jsp; Line: 179]
            String functionPointName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 180]
            String useCaseName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 181]
            String cDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 182]
            String rDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 183]
            String[] temp; //[ /EnquireTestCase_Right.jsp; Line: 184]
            String condition1=new String(); //[ /EnquireTestCase_Right.jsp; Line: 185]
            int first=1; //[ /EnquireTestCase_Right.jsp; Line: 186]
            int first1=1; //[ /EnquireTestCase_Right.jsp; Line: 187]
            int nn=0; //[ /EnquireTestCase_Right.jsp; Line: 188]
            //[ /EnquireTestCase_Right.jsp; Line: 189]
            sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 190]
            rs1=myStatement1.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 191]
            //[ /EnquireTestCase_Right.jsp; Line: 192]
            if(rs1.next()) //[ /EnquireTestCase_Right.jsp; Line: 193]
            { //[ /EnquireTestCase_Right.jsp; Line: 194]
              noData=1; //[ /EnquireTestCase_Right.jsp; Line: 195]
              do //[ /EnquireTestCase_Right.jsp; Line: 196]
              { //[ /EnquireTestCase_Right.jsp; Line: 197]
                number++; //[ /EnquireTestCase_Right.jsp; Line: 198]
                cDis=rs1.getString("condition"); //[ /EnquireTestCase_Right.jsp; Line: 199]
                rDis=rs1.getString("result"); //[ /EnquireTestCase_Right.jsp; Line: 200]
                first=1; //[ /EnquireTestCase_Right.jsp; Line: 201]
                first1=1; //[ /EnquireTestCase_Right.jsp; Line: 202]
                //[ /EnquireTestCase_Right.jsp; Line: 203]
                temp=rr.getID(cDis); //[ /EnquireTestCase_Right.jsp; Line: 204]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 205]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right.jsp; Line: 206]
                  if(first==1){ //[ /EnquireTestCase_Right.jsp; Line: 207]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 208]
                    first=0; //[ /EnquireTestCase_Right.jsp; Line: 209]
                  } //[ /EnquireTestCase_Right.jsp; Line: 210]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 211]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 212]
                  } //[ /EnquireTestCase_Right.jsp; Line: 213]
                } //[ /EnquireTestCase_Right.jsp; Line: 214]
                sql=sql+")"; //[ /EnquireTestCase_Right.jsp; Line: 215]
                //[ /EnquireTestCase_Right.jsp; Line: 216]
                rs3=myStatement2.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 217]
                first=1; //[ /EnquireTestCase_Right.jsp; Line: 218]
                //[ /EnquireTestCase_Right.jsp; Line: 219]
                while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 220]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 221]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right.jsp; Line: 222]
                  if(first==1){ //[ /EnquireTestCase_Right.jsp; Line: 223]
                    cDis=condition1; //[ /EnquireTestCase_Right.jsp; Line: 224]
                    first=0; //[ /EnquireTestCase_Right.jsp; Line: 225]
                  } //[ /EnquireTestCase_Right.jsp; Line: 226]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 227]
                    cDis=cDis+"<br>"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 228]
                  } //[ /EnquireTestCase_Right.jsp; Line: 229]
                } //[ /EnquireTestCase_Right.jsp; Line: 230]
                //[ /EnquireTestCase_Right.jsp; Line: 231]
                temp=rr.getID(rDis); //[ /EnquireTestCase_Right.jsp; Line: 232]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 233]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right.jsp; Line: 234]
                  if(first1==1){ //[ /EnquireTestCase_Right.jsp; Line: 235]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 236]
                    first1=0; //[ /EnquireTestCase_Right.jsp; Line: 237]
                  } //[ /EnquireTestCase_Right.jsp; Line: 238]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 239]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 240]
                  } //[ /EnquireTestCase_Right.jsp; Line: 241]
                } //[ /EnquireTestCase_Right.jsp; Line: 242]
                sql=sql+")"; //[ /EnquireTestCase_Right.jsp; Line: 243]
                //[ /EnquireTestCase_Right.jsp; Line: 244]
                rs3=myStatement3.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 245]
                first1=1; //[ /EnquireTestCase_Right.jsp; Line: 246]
                //[ /EnquireTestCase_Right.jsp; Line: 247]
                while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 248]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 249]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right.jsp; Line: 250]
                  if(first1==1){ //[ /EnquireTestCase_Right.jsp; Line: 251]
                    rDis=condition1; //[ /EnquireTestCase_Right.jsp; Line: 252]
                    first1=0; //[ /EnquireTestCase_Right.jsp; Line: 253]
                  } //[ /EnquireTestCase_Right.jsp; Line: 254]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 255]
                    rDis=rDis+"<br>"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 256]
                  } //[ /EnquireTestCase_Right.jsp; Line: 257]
                } //[ /EnquireTestCase_Right.jsp; Line: 258]
                //[ /EnquireTestCase_Right.jsp; Line: 259]
                rs3.close(); //[ /EnquireTestCase_Right.jsp; Line: 260]
                //[ /EnquireTestCase_Right.jsp; Line: 261]
                testCaseID=rs1.getLong("test_case_id"); //[ /EnquireTestCase_Right.jsp; Line: 262]
                checkBoxName="C"+number; //[ /EnquireTestCase_Right.jsp; Line: 263]
                hideName="H"+number; //[ /EnquireTestCase_Right.jsp; Line: 264]
                //[ /EnquireTestCase_Right.jsp; Line: 265]
                _writeText(response, out, _wl_block9, _wl_block9Bytes);
                out.print(String.valueOf(checkBoxName ));  //[ /EnquireTestCase_Right.jsp; Line: 268]
                _writeText(response, out, _wl_block10, _wl_block10Bytes);
                out.print(String.valueOf(cDis ));  //[ /EnquireTestCase_Right.jsp; Line: 269]
                _writeText(response, out, _wl_block11, _wl_block11Bytes);
                out.print(String.valueOf(rDis ));  //[ /EnquireTestCase_Right.jsp; Line: 270]
                _writeText(response, out, _wl_block12, _wl_block12Bytes);
                out.print(String.valueOf(hideName ));  //[ /EnquireTestCase_Right.jsp; Line: 270]
                _writeText(response, out, _wl_block13, _wl_block13Bytes);
                out.print(String.valueOf(testCaseID ));  //[ /EnquireTestCase_Right.jsp; Line: 270]
                _writeText(response, out, _wl_block14, _wl_block14Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 272]
              }while(rs1.next()); //[ /EnquireTestCase_Right.jsp; Line: 273]
              session.setAttribute("CR_Number", String.valueOf(number)); //[ /EnquireTestCase_Right.jsp; Line: 274]
            } //[ /EnquireTestCase_Right.jsp; Line: 275]
          } //[ /EnquireTestCase_Right.jsp; Line: 276]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 281]
          if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 282]
            _writeText(response, out, _wl_block16, _wl_block16Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 293]
            noData=0; //[ /EnquireTestCase_Right.jsp; Line: 294]
          } //[ /EnquireTestCase_Right.jsp; Line: 295]
          _writeText(response, out, _wl_block17, _wl_block17Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 311]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 312]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right.jsp; Line: 313]
            _writeText(response, out, _wl_block18, _wl_block18Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 318]
          } //[ /EnquireTestCase_Right.jsp; Line: 319]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 320]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right.jsp; Line: 321]
            _writeText(response, out, _wl_block19, _wl_block19Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 326]
          } //[ /EnquireTestCase_Right.jsp; Line: 327]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 328]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right.jsp; Line: 329]
            _writeText(response, out, _wl_block20, _wl_block20Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 334]
          } //[ /EnquireTestCase_Right.jsp; Line: 335]
          else{ //[ /EnquireTestCase_Right.jsp; Line: 336]
            //[ /EnquireTestCase_Right.jsp; Line: 337]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 338]
            //[ /EnquireTestCase_Right.jsp; Line: 339]
            sql="select count(*) from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 340]
            rs1=myStatement4.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 341]
            int y=0; //[ /EnquireTestCase_Right.jsp; Line: 342]
            if(rs1.next()){ //[ /EnquireTestCase_Right.jsp; Line: 343]
              //        y=rs1.getInt("Expr1000"); //[ /EnquireTestCase_Right.jsp; Line: 344]
              y=rs1.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 345]
            } //[ /EnquireTestCase_Right.jsp; Line: 346]
            else{ //[ /EnquireTestCase_Right.jsp; Line: 347]
              y=0; //[ /EnquireTestCase_Right.jsp; Line: 348]
            } //[ /EnquireTestCase_Right.jsp; Line: 349]
            //[ /EnquireTestCase_Right.jsp; Line: 350]
            sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 351]
            rs2=myStatement5.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 352]
            //      int x=0; //[ /EnquireTestCase_Right.jsp; Line: 353]
            if(rs2.next()){ //[ /EnquireTestCase_Right.jsp; Line: 354]
              x=rs2.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 355]
            } //[ /EnquireTestCase_Right.jsp; Line: 356]
            else{ //[ /EnquireTestCase_Right.jsp; Line: 357]
              x=0; //[ /EnquireTestCase_Right.jsp; Line: 358]
            } //[ /EnquireTestCase_Right.jsp; Line: 359]
            //[ /EnquireTestCase_Right.jsp; Line: 360]
            String CheckName = new String(); //[ /EnquireTestCase_Right.jsp; Line: 361]
            String content = new String(); //[ /EnquireTestCase_Right.jsp; Line: 362]
            long id=0; //[ /EnquireTestCase_Right.jsp; Line: 363]
            rs1=null; //[ /EnquireTestCase_Right.jsp; Line: 364]
            rs2=null; //[ /EnquireTestCase_Right.jsp; Line: 365]
            int first2=1; //[ /EnquireTestCase_Right.jsp; Line: 366]
            String[] temp; //[ /EnquireTestCase_Right.jsp; Line: 367]
            String condition1=new String(); //[ /EnquireTestCase_Right.jsp; Line: 368]
            String information=new String(); //[ /EnquireTestCase_Right.jsp; Line: 369]
            String condition2=new String(); //[ /EnquireTestCase_Right.jsp; Line: 370]
            String result2=new String(); //[ /EnquireTestCase_Right.jsp; Line: 371]
            String[] con; //[ /EnquireTestCase_Right.jsp; Line: 372]
            String[] rel; //[ /EnquireTestCase_Right.jsp; Line: 373]
            //[ /EnquireTestCase_Right.jsp; Line: 374]
            int l=0; //[ /EnquireTestCase_Right.jsp; Line: 375]
            int lll=0; //[ /EnquireTestCase_Right.jsp; Line: 376]
            int cPosition=0; //[ /EnquireTestCase_Right.jsp; Line: 377]
            int rPosition=0; //[ /EnquireTestCase_Right.jsp; Line: 378]
            int have1=1; //[ /EnquireTestCase_Right.jsp; Line: 379]
            int have2=1; //[ /EnquireTestCase_Right.jsp; Line: 380]
            int nn=0; //[ /EnquireTestCase_Right.jsp; Line: 381]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right.jsp; Line: 382]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right.jsp; Line: 383]
            String cDis=new String(); //[ /EnquireTestCase_Right.jsp; Line: 384]
            String rDis=new String(); //[ /EnquireTestCase_Right.jsp; Line: 385]
            //[ /EnquireTestCase_Right.jsp; Line: 386]
            if(x>0 && y>0){ //[ /EnquireTestCase_Right.jsp; Line: 387]
              String[] resultArray=new String[x]; //[ /EnquireTestCase_Right.jsp; Line: 388]
              String[] conditionArray=new String[y]; //[ /EnquireTestCase_Right.jsp; Line: 389]
              //[ /EnquireTestCase_Right.jsp; Line: 390]
              session.setAttribute("R_Number",String.valueOf(x)); //[ /EnquireTestCase_Right.jsp; Line: 391]
              session.setAttribute("C_Number",String.valueOf(y)); //[ /EnquireTestCase_Right.jsp; Line: 392]
              //[ /EnquireTestCase_Right.jsp; Line: 393]
              sql="select inf_dis from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 394]
              rs1=myStatement6.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 395]
              rs1.next(); //[ /EnquireTestCase_Right.jsp; Line: 396]
              //[ /EnquireTestCase_Right.jsp; Line: 397]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 398]
              rs2=myStatement7.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 399]
              rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 400]
              //[ /EnquireTestCase_Right.jsp; Line: 401]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 402]
              rs4=myStatement8.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 403]
              if(rs4.next()){ //[ /EnquireTestCase_Right.jsp; Line: 404]
                do{ //[ /EnquireTestCase_Right.jsp; Line: 405]
                  resultArray[l]=rs4.getString("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 406]
                  l++; //[ /EnquireTestCase_Right.jsp; Line: 407]
                }while(rs4.next()); //[ /EnquireTestCase_Right.jsp; Line: 408]
              } //[ /EnquireTestCase_Right.jsp; Line: 409]
              //[ /EnquireTestCase_Right.jsp; Line: 410]
              sql="select inf_dis,inf_id from tctc_information where inf_type='condition' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 411]
              rs4=myStatement9.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 412]
              if(rs4.next()){ //[ /EnquireTestCase_Right.jsp; Line: 413]
                do{ //[ /EnquireTestCase_Right.jsp; Line: 414]
                  conditionArray[lll]=rs4.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 415]
                  lll++; //[ /EnquireTestCase_Right.jsp; Line: 416]
                }while(rs4.next()); //[ /EnquireTestCase_Right.jsp; Line: 417]
              } //[ /EnquireTestCase_Right.jsp; Line: 418]
              //[ /EnquireTestCase_Right.jsp; Line: 419]
              sql="select count(*) from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 420]
              rs4=myStatement10.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 421]
              if(rs4.next()){ //[ /EnquireTestCase_Right.jsp; Line: 422]
                nn=rs4.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 423]
              } //[ /EnquireTestCase_Right.jsp; Line: 424]
              //[ /EnquireTestCase_Right.jsp; Line: 425]
              if(nn>0){ //[ /EnquireTestCase_Right.jsp; Line: 426]
                con=new String[nn]; //[ /EnquireTestCase_Right.jsp; Line: 427]
                rel=new String[nn]; //[ /EnquireTestCase_Right.jsp; Line: 428]
                //[ /EnquireTestCase_Right.jsp; Line: 429]
                sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 430]
                rs5=myStatement11.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 431]
                //[ /EnquireTestCase_Right.jsp; Line: 432]
                if(rs5.next()) //[ /EnquireTestCase_Right.jsp; Line: 433]
                { //[ /EnquireTestCase_Right.jsp; Line: 434]
                  nn=0; //[ /EnquireTestCase_Right.jsp; Line: 435]
                  do //[ /EnquireTestCase_Right.jsp; Line: 436]
                  { //[ /EnquireTestCase_Right.jsp; Line: 437]
                    cDis=rs5.getString("condition"); //[ /EnquireTestCase_Right.jsp; Line: 438]
                    rDis=rs5.getString("result"); //[ /EnquireTestCase_Right.jsp; Line: 439]
                    con[nn]=cDis; //[ /EnquireTestCase_Right.jsp; Line: 440]
                    rel[nn]=rDis; //[ /EnquireTestCase_Right.jsp; Line: 441]
                    nn++; //[ /EnquireTestCase_Right.jsp; Line: 442]
                  }while(rs5.next()); //[ /EnquireTestCase_Right.jsp; Line: 443]
                } //[ /EnquireTestCase_Right.jsp; Line: 444]
                //[ /EnquireTestCase_Right.jsp; Line: 445]
                if(x>0 && y>0) //[ /EnquireTestCase_Right.jsp; Line: 446]
                { //[ /EnquireTestCase_Right.jsp; Line: 447]
                  noData=1; //[ /EnquireTestCase_Right.jsp; Line: 448]
                  //[ /EnquireTestCase_Right.jsp; Line: 449]
                  for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right.jsp; Line: 450]
                  { //[ /EnquireTestCase_Right.jsp; Line: 451]
                    _writeText(response, out, _wl_block21, _wl_block21Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 454]
                    for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right.jsp; Line: 455]
                    { //[ /EnquireTestCase_Right.jsp; Line: 456]
                      CheckName = null; //[ /EnquireTestCase_Right.jsp; Line: 457]
                      //[ /EnquireTestCase_Right.jsp; Line: 458]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 459]
                        _writeText(response, out, _wl_block22, _wl_block22Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 462]
                      } //[ /EnquireTestCase_Right.jsp; Line: 463]
                      //[ /EnquireTestCase_Right.jsp; Line: 464]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right.jsp; Line: 465]
                        _writeText(response, out, _wl_block23, _wl_block23Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right.jsp; Line: 467]
                        _writeText(response, out, _wl_block24, _wl_block24Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 468]
                      } //[ /EnquireTestCase_Right.jsp; Line: 469]
                      //[ /EnquireTestCase_Right.jsp; Line: 470]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 471]
                        _writeText(response, out, _wl_block25, _wl_block25Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 474]
                      } //[ /EnquireTestCase_Right.jsp; Line: 475]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 476]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right.jsp; Line: 477]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 478]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 479]
                        content=rr.replace(content); //[ /EnquireTestCase_Right.jsp; Line: 480]
                        _writeText(response, out, _wl_block26, _wl_block26Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 482]
                        _writeText(response, out, _wl_block27, _wl_block27Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 482]
                        _writeText(response, out, _wl_block28, _wl_block28Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right.jsp; Line: 482]
                        _writeText(response, out, _wl_block29, _wl_block29Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 483]
                        rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 484]
                      } //[ /EnquireTestCase_Right.jsp; Line: 485]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 486]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 487]
                        content = rs1.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 488]
                        //[ /EnquireTestCase_Right.jsp; Line: 489]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 490]
                        temp=rr.getID(content); //[ /EnquireTestCase_Right.jsp; Line: 491]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right.jsp; Line: 492]
                        //[ /EnquireTestCase_Right.jsp; Line: 493]
                        sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 494]
                        for(int ii=0;ii<temp.length;ii++){ //[ /EnquireTestCase_Right.jsp; Line: 495]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 496]
                            sql=sql+Integer.parseInt(temp[ii]); //[ /EnquireTestCase_Right.jsp; Line: 497]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 498]
                          } //[ /EnquireTestCase_Right.jsp; Line: 499]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 500]
                            sql=sql+","+Integer.parseInt(temp[ii]); //[ /EnquireTestCase_Right.jsp; Line: 501]
                          } //[ /EnquireTestCase_Right.jsp; Line: 502]
                        } //[ /EnquireTestCase_Right.jsp; Line: 503]
                        sql=sql+")"; //[ /EnquireTestCase_Right.jsp; Line: 504]
                        //[ /EnquireTestCase_Right.jsp; Line: 505]
                        rs3=myStatement12.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 506]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 507]
                        //[ /EnquireTestCase_Right.jsp; Line: 508]
                        while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 509]
                          condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 510]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 511]
                            information=condition1; //[ /EnquireTestCase_Right.jsp; Line: 512]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 513]
                          } //[ /EnquireTestCase_Right.jsp; Line: 514]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 515]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 516]
                          } //[ /EnquireTestCase_Right.jsp; Line: 517]
                        } //[ /EnquireTestCase_Right.jsp; Line: 518]
                        //[ /EnquireTestCase_Right.jsp; Line: 519]
                        information=rr.replace(information); //[ /EnquireTestCase_Right.jsp; Line: 520]
                        _writeText(response, out, _wl_block30, _wl_block30Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right.jsp; Line: 522]
                        _writeText(response, out, _wl_block31, _wl_block31Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 522]
                        _writeText(response, out, _wl_block32, _wl_block32Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 522]
                        _writeText(response, out, _wl_block33, _wl_block33Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 523]
                        rs1.next(); //[ /EnquireTestCase_Right.jsp; Line: 524]
                      } //[ /EnquireTestCase_Right.jsp; Line: 525]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right.jsp; Line: 526]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 527]
                        //[ /EnquireTestCase_Right.jsp; Line: 528]
                        result2=resultArray[j-1]; //[ /EnquireTestCase_Right.jsp; Line: 529]
                        condition2=conditionArray[i-1]; //[ /EnquireTestCase_Right.jsp; Line: 530]
                        //[ /EnquireTestCase_Right.jsp; Line: 531]
                        cPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 532]
                        rPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 533]
                        have1=0; //[ /EnquireTestCase_Right.jsp; Line: 534]
                        have2=0; //[ /EnquireTestCase_Right.jsp; Line: 535]
                        //[ /EnquireTestCase_Right.jsp; Line: 536]
                        for(int ll=0;ll<con.length;ll++){ //[ /EnquireTestCase_Right.jsp; Line: 537]
                          cPosition=con[ll].indexOf(condition2); //[ /EnquireTestCase_Right.jsp; Line: 538]
                          if(cPosition!=-1){ //[ /EnquireTestCase_Right.jsp; Line: 539]
                            rPosition=rel[ll].indexOf(result2); //[ /EnquireTestCase_Right.jsp; Line: 540]
                            if(rPosition!=-1){ //[ /EnquireTestCase_Right.jsp; Line: 541]
                              have1=1; //[ /EnquireTestCase_Right.jsp; Line: 542]
                              cPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 543]
                              rPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 544]
                            } //[ /EnquireTestCase_Right.jsp; Line: 545]
                          } //[ /EnquireTestCase_Right.jsp; Line: 546]
                        } //[ /EnquireTestCase_Right.jsp; Line: 547]
                        //[ /EnquireTestCase_Right.jsp; Line: 548]
                        if(have1==1){ //[ /EnquireTestCase_Right.jsp; Line: 549]
                          _writeText(response, out, _wl_block34, _wl_block34Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 551]
                          _writeText(response, out, _wl_block35, _wl_block35Bytes);
                          //[ /EnquireTestCase_Right.jsp; Line: 552]
                        } //[ /EnquireTestCase_Right.jsp; Line: 553]
                        else{ //[ /EnquireTestCase_Right.jsp; Line: 554]
                          _writeText(response, out, _wl_block36, _wl_block36Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 556]
                          _writeText(response, out, _wl_block37, _wl_block37Bytes);
                          //[ /EnquireTestCase_Right.jsp; Line: 557]
                        } //[ /EnquireTestCase_Right.jsp; Line: 558]
                      } //[ /EnquireTestCase_Right.jsp; Line: 559]
                    } //[ /EnquireTestCase_Right.jsp; Line: 560]
                    _writeText(response, out, _wl_block38, _wl_block38Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 563]
                  } //[ /EnquireTestCase_Right.jsp; Line: 564]
                } //[ /EnquireTestCase_Right.jsp; Line: 565]
                rs1.close(); //[ /EnquireTestCase_Right.jsp; Line: 566]
                rs2.close(); //[ /EnquireTestCase_Right.jsp; Line: 567]
                rs3.close(); //[ /EnquireTestCase_Right.jsp; Line: 568]
                rs4.close(); //[ /EnquireTestCase_Right.jsp; Line: 569]
                rs5.close(); //[ /EnquireTestCase_Right.jsp; Line: 570]
              } //[ /EnquireTestCase_Right.jsp; Line: 571]
              else{ //[ /EnquireTestCase_Right.jsp; Line: 572]
                //[ /EnquireTestCase_Right.jsp; Line: 573]
                if(x>0 && y>0) //[ /EnquireTestCase_Right.jsp; Line: 574]
                { //[ /EnquireTestCase_Right.jsp; Line: 575]
                  noData=1; //[ /EnquireTestCase_Right.jsp; Line: 576]
                  for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right.jsp; Line: 577]
                  { //[ /EnquireTestCase_Right.jsp; Line: 578]
                    _writeText(response, out, _wl_block39, _wl_block39Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 581]
                    for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right.jsp; Line: 582]
                    { //[ /EnquireTestCase_Right.jsp; Line: 583]
                      CheckName = null; //[ /EnquireTestCase_Right.jsp; Line: 584]
                      //[ /EnquireTestCase_Right.jsp; Line: 585]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 586]
                        _writeText(response, out, _wl_block40, _wl_block40Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 589]
                      } //[ /EnquireTestCase_Right.jsp; Line: 590]
                      //[ /EnquireTestCase_Right.jsp; Line: 591]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right.jsp; Line: 592]
                        _writeText(response, out, _wl_block41, _wl_block41Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right.jsp; Line: 594]
                        _writeText(response, out, _wl_block42, _wl_block42Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 595]
                      } //[ /EnquireTestCase_Right.jsp; Line: 596]
                      //[ /EnquireTestCase_Right.jsp; Line: 597]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 598]
                        _writeText(response, out, _wl_block43, _wl_block43Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 601]
                      } //[ /EnquireTestCase_Right.jsp; Line: 602]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 603]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right.jsp; Line: 604]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 605]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 606]
                        content=rr.replace(content); //[ /EnquireTestCase_Right.jsp; Line: 607]
                        _writeText(response, out, _wl_block44, _wl_block44Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 609]
                        _writeText(response, out, _wl_block45, _wl_block45Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 609]
                        _writeText(response, out, _wl_block46, _wl_block46Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right.jsp; Line: 609]
                        _writeText(response, out, _wl_block47, _wl_block47Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 610]
                        rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 611]
                      } //[ /EnquireTestCase_Right.jsp; Line: 612]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 613]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 614]
                        content = rs1.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 615]
                        //[ /EnquireTestCase_Right.jsp; Line: 616]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 617]
                        temp=rr.getID(content); //[ /EnquireTestCase_Right.jsp; Line: 618]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right.jsp; Line: 619]
                        //[ /EnquireTestCase_Right.jsp; Line: 620]
                        sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 621]
                        for(int ii=0;ii<temp.length;ii++){ //[ /EnquireTestCase_Right.jsp; Line: 622]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 623]
                            sql=sql+Integer.parseInt(temp[ii]); //[ /EnquireTestCase_Right.jsp; Line: 624]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 625]
                          } //[ /EnquireTestCase_Right.jsp; Line: 626]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 627]
                            sql=sql+","+Integer.parseInt(temp[ii]); //[ /EnquireTestCase_Right.jsp; Line: 628]
                          } //[ /EnquireTestCase_Right.jsp; Line: 629]
                        } //[ /EnquireTestCase_Right.jsp; Line: 630]
                        sql=sql+")"; //[ /EnquireTestCase_Right.jsp; Line: 631]
                        //[ /EnquireTestCase_Right.jsp; Line: 632]
                        rs3=myStatement13.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 633]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 634]
                        //[ /EnquireTestCase_Right.jsp; Line: 635]
                        while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 636]
                          condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 637]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 638]
                            information=condition1; //[ /EnquireTestCase_Right.jsp; Line: 639]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 640]
                          } //[ /EnquireTestCase_Right.jsp; Line: 641]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 642]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 643]
                          } //[ /EnquireTestCase_Right.jsp; Line: 644]
                        } //[ /EnquireTestCase_Right.jsp; Line: 645]
                        //[ /EnquireTestCase_Right.jsp; Line: 646]
                        information=rr.replace(information); //[ /EnquireTestCase_Right.jsp; Line: 647]
                        //[ /EnquireTestCase_Right.jsp; Line: 648]
                        _writeText(response, out, _wl_block48, _wl_block48Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right.jsp; Line: 650]
                        _writeText(response, out, _wl_block49, _wl_block49Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 650]
                        _writeText(response, out, _wl_block50, _wl_block50Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 650]
                        _writeText(response, out, _wl_block51, _wl_block51Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 651]
                        rs1.next(); //[ /EnquireTestCase_Right.jsp; Line: 652]
                      } //[ /EnquireTestCase_Right.jsp; Line: 653]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right.jsp; Line: 654]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 655]
                        _writeText(response, out, _wl_block52, _wl_block52Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 657]
                        _writeText(response, out, _wl_block53, _wl_block53Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 658]
                      } //[ /EnquireTestCase_Right.jsp; Line: 659]
                    } //[ /EnquireTestCase_Right.jsp; Line: 660]
                    _writeText(response, out, _wl_block54, _wl_block54Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 663]
                  } //[ /EnquireTestCase_Right.jsp; Line: 664]
                } //[ /EnquireTestCase_Right.jsp; Line: 665]
                rs1.close(); //[ /EnquireTestCase_Right.jsp; Line: 666]
                rs2.close(); //[ /EnquireTestCase_Right.jsp; Line: 667]
                rs3.close(); //[ /EnquireTestCase_Right.jsp; Line: 668]
              } //[ /EnquireTestCase_Right.jsp; Line: 669]
            } //[ /EnquireTestCase_Right.jsp; Line: 670]
          } //[ /EnquireTestCase_Right.jsp; Line: 671]
          //[ /EnquireTestCase_Right.jsp; Line: 672]
          _writeText(response, out, _wl_block55, _wl_block55Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 677]
          if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 678]
            x=x+1; //[ /EnquireTestCase_Right.jsp; Line: 679]
            _writeText(response, out, _wl_block56, _wl_block56Bytes);
            out.print(String.valueOf(x*163+147 ));  //[ /EnquireTestCase_Right.jsp; Line: 682]
            _writeText(response, out, _wl_block57, _wl_block57Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 690]
          } //[ /EnquireTestCase_Right.jsp; Line: 691]
          _writeText(response, out, _wl_block58, _wl_block58Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 695]
          myConn.close(); //[ /EnquireTestCase_Right.jsp; Line: 696]
          myStatement1.close(); //[ /EnquireTestCase_Right.jsp; Line: 697]
          myStatement2.close(); //[ /EnquireTestCase_Right.jsp; Line: 698]
          myStatement3.close(); //[ /EnquireTestCase_Right.jsp; Line: 699]
          myStatement4.close(); //[ /EnquireTestCase_Right.jsp; Line: 700]
          myStatement5.close(); //[ /EnquireTestCase_Right.jsp; Line: 701]
          myStatement6.close(); //[ /EnquireTestCase_Right.jsp; Line: 702]
          myStatement7.close(); //[ /EnquireTestCase_Right.jsp; Line: 703]
          myStatement8.close(); //[ /EnquireTestCase_Right.jsp; Line: 704]
          myStatement9.close(); //[ /EnquireTestCase_Right.jsp; Line: 705]
          myStatement10.close(); //[ /EnquireTestCase_Right.jsp; Line: 706]
          myStatement11.close(); //[ /EnquireTestCase_Right.jsp; Line: 707]
          myStatement12.close(); //[ /EnquireTestCase_Right.jsp; Line: 708]
          myStatement13.close(); //[ /EnquireTestCase_Right.jsp; Line: 709]
        } //[ /EnquireTestCase_Right.jsp; Line: 710]
        catch(SQLException ex){ //[ /EnquireTestCase_Right.jsp; Line: 711]
          System.err.println("aq.executeQuery: " + ex.getMessage()); //[ /EnquireTestCase_Right.jsp; Line: 712]
          System.err.println("aq.executeQuery: " + sql); //[ /EnquireTestCase_Right.jsp; Line: 713]
        } //[ /EnquireTestCase_Right.jsp; Line: 714]
      } //[ /EnquireTestCase_Right.jsp; Line: 715]
      _writeText(response, out, _wl_block59, _wl_block59Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
