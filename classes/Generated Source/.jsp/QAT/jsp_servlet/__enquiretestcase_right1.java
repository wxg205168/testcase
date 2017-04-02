/* compiled from JSP: /EnquireTestCase_Right1.jsp
*
* This code was automatically generated at 15:54:11 on 2005-8-11
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
import java.sql.*; //[ /EnquireTestCase_Right1.jsp; Line: 56]
import javax.sql.*; //[ /EnquireTestCase_Right1.jsp; Line: 56]
import java.util.Enumeration; //[ /EnquireTestCase_Right1.jsp; Line: 56]
import java.util.ArrayList; //[ /EnquireTestCase_Right1.jsp; Line: 56]


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
* This code was automatically generated at 15:54:11 on 2005-8-11
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquiretestcase_right1
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right1.jsp", 1123746770000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right1.jsp", 1123746770000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block6 = "\r\n\r\n<form method=\"post\">\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectProject.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectUseCase.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n        <script LANGUAGE=\"javascript\">\r\n          parent.location.href=\'SelectFunctionPoint.jsp\'\r\n        </script>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n\r\n\r\n</form>\r\n\r\n<form method=\"post\" >\r\n\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectProject.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectUseCase.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectFunctionPoint.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n  <TABLE width=0 border=1 cellPadding=0 cellSpacing=0\r\n    style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n    <TBODY>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n              <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n                  <td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n                  <td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n                  <TD width=\"163\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "\r\n                  <TD width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = " value=";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "></span></TD>\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "\r\n                  <td width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = " value=";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "></span></td>\r\n";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = "\r\n                    <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = " value=\"checkbox\"  checked=\"checked\"></td>\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n                    <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = " value=\"checkbox\"></td>\r\n";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = "\r\n              </TR>\r\n";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "\r\n              <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  private final static String _wl_block34 = "\r\n                  <td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block34Bytes = _getBytes(_wl_block34);
  private final static String _wl_block35 = "\r\n                  <td width=\"147\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block35Bytes = _getBytes(_wl_block35);
  private final static String _wl_block36 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block36Bytes = _getBytes(_wl_block36);
  private final static String _wl_block37 = "\r\n                  <TD width=\"163\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block37Bytes = _getBytes(_wl_block37);
  private final static String _wl_block38 = "\r\n                  <TD width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >";
  private final static byte[] _wl_block38Bytes = _getBytes(_wl_block38);
  private final static String _wl_block39 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block39Bytes = _getBytes(_wl_block39);
  private final static String _wl_block40 = " value=";
  private final static byte[] _wl_block40Bytes = _getBytes(_wl_block40);
  private final static String _wl_block41 = "></span></TD>\r\n";
  private final static byte[] _wl_block41Bytes = _getBytes(_wl_block41);
  private final static String _wl_block42 = "\r\n                  <td width=\"163\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\" >";
  private final static byte[] _wl_block42Bytes = _getBytes(_wl_block42);
  private final static String _wl_block43 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block43Bytes = _getBytes(_wl_block43);
  private final static String _wl_block44 = " value=";
  private final static byte[] _wl_block44Bytes = _getBytes(_wl_block44);
  private final static String _wl_block45 = "></span></td>\r\n";
  private final static byte[] _wl_block45Bytes = _getBytes(_wl_block45);
  private final static String _wl_block46 = "\r\n                  <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block46Bytes = _getBytes(_wl_block46);
  private final static String _wl_block47 = " value=\"checkbox\"></td>\r\n";
  private final static byte[] _wl_block47Bytes = _getBytes(_wl_block47);
  private final static String _wl_block48 = "\r\n              </TR>\r\n";
  private final static byte[] _wl_block48Bytes = _getBytes(_wl_block48);
  private final static String _wl_block49 = "\r\n    </TBODY>\r\n  </TABLE>\r\n";
  private final static byte[] _wl_block49Bytes = _getBytes(_wl_block49);
  private final static String _wl_block50 = "\r\n\r\n";
  private final static byte[] _wl_block50Bytes = _getBytes(_wl_block50);
  private final static String _wl_block51 = "\r\n\r\n    <table width=";
  private final static byte[] _wl_block51Bytes = _getBytes(_wl_block51);
  private final static String _wl_block52 = " border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tbody>\r\n      <tr>\r\n        <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n        <td align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n        <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n        <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n      </tr>\r\n      </tbody>\r\n    </table>\r\n";
  private final static byte[] _wl_block52Bytes = _getBytes(_wl_block52);
  private final static String _wl_block53 = "\r\n\r\n</form>\r\n\r\n";
  private final static byte[] _wl_block53Bytes = _getBytes(_wl_block53);
  private final static String _wl_block54 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block54Bytes = _getBytes(_wl_block54);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireTestCase_Right1.jsp; Line: 57]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right1.jsp; Line: 57]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 57]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right1.jsp; Line: 57]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right1.jsp; Line: 57]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 57]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestCase_Right1.jsp; Line: 57]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestCase_Right1.jsp; Line: 57]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 57]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right1.jsp; Line: 57]
      } // end bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 57]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireTestCase_Right1.jsp; Line: 58]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right1.jsp; Line: 58]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 58]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right1.jsp; Line: 58]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right1.jsp; Line: 58]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 58]
            rr = new managestring.mystring(); //[ /EnquireTestCase_Right1.jsp; Line: 58]
            pageContext.setAttribute("rr", rr); //[ /EnquireTestCase_Right1.jsp; Line: 58]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 58]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right1.jsp; Line: 58]
      } // end bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 58]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      compages.compagesData cc = null; //[ /EnquireTestCase_Right1.jsp; Line: 59]
      cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right1.jsp; Line: 59]
      if (cc == null) { // begin 'cc' instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 59]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right1.jsp; Line: 59]
          cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right1.jsp; Line: 59]
          if (cc == null) { // begin 'cc' synchronized instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 59]
            cc = new compages.compagesData(); //[ /EnquireTestCase_Right1.jsp; Line: 59]
            pageContext.setAttribute("cc", cc); //[ /EnquireTestCase_Right1.jsp; Line: 59]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 59]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right1.jsp; Line: 59]
      } // end bean instantiation block... //[ /EnquireTestCase_Right1.jsp; Line: 59]
      _writeText(response, out, _wl_block4, _wl_block4Bytes);
      //[ /EnquireTestCase_Right1.jsp; Line: 61]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireTestCase_Right1.jsp; Line: 62]
      //[ /EnquireTestCase_Right1.jsp; Line: 63]
      if(!ss.hasMoreElements()){ //[ /EnquireTestCase_Right1.jsp; Line: 64]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireTestCase_Right1.jsp; Line: 69]
      } //[ /EnquireTestCase_Right1.jsp; Line: 70]
      else{ //[ /EnquireTestCase_Right1.jsp; Line: 71]
        String sql=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 72]
        //[ /EnquireTestCase_Right1.jsp; Line: 73]
        try{ //[ /EnquireTestCase_Right1.jsp; Line: 74]
          DataSource ds=null; //[ /EnquireTestCase_Right1.jsp; Line: 75]
          ds=tt.getDataSource(); //[ /EnquireTestCase_Right1.jsp; Line: 76]
          Connection myConn=null; //[ /EnquireTestCase_Right1.jsp; Line: 77]
          //    Statement myStatement1=null; //[ /EnquireTestCase_Right1.jsp; Line: 78]
          //    Statement myStatement2=null; //[ /EnquireTestCase_Right1.jsp; Line: 79]
          //    Statement myStatement3=null; //[ /EnquireTestCase_Right1.jsp; Line: 80]
          Statement myStatement4=null; //[ /EnquireTestCase_Right1.jsp; Line: 81]
          Statement myStatement5=null; //[ /EnquireTestCase_Right1.jsp; Line: 82]
          Statement myStatement6=null; //[ /EnquireTestCase_Right1.jsp; Line: 83]
          Statement myStatement7=null; //[ /EnquireTestCase_Right1.jsp; Line: 84]
          Statement myStatement8=null; //[ /EnquireTestCase_Right1.jsp; Line: 85]
          //    Statement myStatement9=null; //[ /EnquireTestCase_Right1.jsp; Line: 86]
          Statement myStatement10=null; //[ /EnquireTestCase_Right1.jsp; Line: 87]
          Statement myStatement11=null; //[ /EnquireTestCase_Right1.jsp; Line: 88]
          //    Statement myStatement12=null; //[ /EnquireTestCase_Right1.jsp; Line: 89]
          //    Statement myStatement13=null; //[ /EnquireTestCase_Right1.jsp; Line: 90]
          Statement myStatement14=null; //[ /EnquireTestCase_Right1.jsp; Line: 91]
          //    Statement myStatement15=null; //[ /EnquireTestCase_Right1.jsp; Line: 92]
          myConn=ds.getConnection(); //[ /EnquireTestCase_Right1.jsp; Line: 93]
          //    myStatement1=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 94]
          //    myStatement2=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 95]
          //    myStatement3=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 96]
          myStatement4=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 97]
          myStatement5=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 98]
          myStatement6=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 99]
          myStatement7=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 100]
          myStatement8=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 101]
          //    myStatement9=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 102]
          myStatement10=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 103]
          myStatement11=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 104]
          //    myStatement12=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 105]
          //    myStatement13=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 106]
          myStatement14=myConn.createStatement(); //[ /EnquireTestCase_Right1.jsp; Line: 107]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /EnquireTestCase_Right1.jsp; Line: 111]
          int noData=0; //[ /EnquireTestCase_Right1.jsp; Line: 112]
          int x=0; //[ /EnquireTestCase_Right1.jsp; Line: 113]
          //[ /EnquireTestCase_Right1.jsp; Line: 114]
          String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestCase_Right1.jsp; Line: 115]
          String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestCase_Right1.jsp; Line: 116]
          String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireTestCase_Right1.jsp; Line: 117]
          //[ /EnquireTestCase_Right1.jsp; Line: 118]
          ResultSet rs1,rs2,rs3,rs4,rs5,rs6; //[ /EnquireTestCase_Right1.jsp; Line: 119]
          rs1=null; //[ /EnquireTestCase_Right1.jsp; Line: 120]
          rs2=null; //[ /EnquireTestCase_Right1.jsp; Line: 121]
          rs3=null; //[ /EnquireTestCase_Right1.jsp; Line: 122]
          rs4=null; //[ /EnquireTestCase_Right1.jsp; Line: 123]
          rs5=null; //[ /EnquireTestCase_Right1.jsp; Line: 124]
          rs6=null; //[ /EnquireTestCase_Right1.jsp; Line: 125]
          //[ /EnquireTestCase_Right1.jsp; Line: 126]
          String checkBoxName=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 127]
          String hideName=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 128]
          //[ /EnquireTestCase_Right1.jsp; Line: 129]
          long testCaseID=0; //[ /EnquireTestCase_Right1.jsp; Line: 130]
          int number=0; //[ /EnquireTestCase_Right1.jsp; Line: 131]
          //[ /EnquireTestCase_Right1.jsp; Line: 132]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 133]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right1.jsp; Line: 134]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 139]
          } //[ /EnquireTestCase_Right1.jsp; Line: 140]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 141]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right1.jsp; Line: 142]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 147]
          } //[ /EnquireTestCase_Right1.jsp; Line: 148]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 149]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right1.jsp; Line: 150]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 155]
          } //[ /EnquireTestCase_Right1.jsp; Line: 156]
          else{ //[ /EnquireTestCase_Right1.jsp; Line: 157]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right1.jsp; Line: 158]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right1.jsp; Line: 159]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right1.jsp; Line: 160]
            //[ /EnquireTestCase_Right1.jsp; Line: 161]
            String functionPointName=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 162]
            String useCaseName=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 163]
            String cDis = new String(); //[ /EnquireTestCase_Right1.jsp; Line: 164]
            String rDis = new String(); //[ /EnquireTestCase_Right1.jsp; Line: 165]
            String[] temp; //[ /EnquireTestCase_Right1.jsp; Line: 166]
            String condition1=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 167]
            int first=1; //[ /EnquireTestCase_Right1.jsp; Line: 168]
            int first1=1; //[ /EnquireTestCase_Right1.jsp; Line: 169]
            int nn=0; //[ /EnquireTestCase_Right1.jsp; Line: 170]
            //[ /EnquireTestCase_Right1.jsp; Line: 171]
          } //[ /EnquireTestCase_Right1.jsp; Line: 172]
          _writeText(response, out, _wl_block10, _wl_block10Bytes);
          //[ /EnquireTestCase_Right1.jsp; Line: 180]
          if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 181]
            session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right1.jsp; Line: 182]
            _writeText(response, out, _wl_block11, _wl_block11Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 187]
          } //[ /EnquireTestCase_Right1.jsp; Line: 188]
          else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 189]
            session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right1.jsp; Line: 190]
            _writeText(response, out, _wl_block12, _wl_block12Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 195]
          } //[ /EnquireTestCase_Right1.jsp; Line: 196]
          else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right1.jsp; Line: 197]
            session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right1.jsp; Line: 198]
            _writeText(response, out, _wl_block13, _wl_block13Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 203]
          } //[ /EnquireTestCase_Right1.jsp; Line: 204]
          else{ //[ /EnquireTestCase_Right1.jsp; Line: 205]
            //[ /EnquireTestCase_Right1.jsp; Line: 206]
            long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right1.jsp; Line: 207]
            //[ /EnquireTestCase_Right1.jsp; Line: 208]
            sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right1.jsp; Line: 209]
            rs1=myStatement4.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 210]
            int y=0; //[ /EnquireTestCase_Right1.jsp; Line: 211]
            if(rs1.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 212]
              //        y=rs1.getInt("Expr1000"); //[ /EnquireTestCase_Right1.jsp; Line: 213]
              y=rs1.getInt("count(*)"); //[ /EnquireTestCase_Right1.jsp; Line: 214]
            } //[ /EnquireTestCase_Right1.jsp; Line: 215]
            else{ //[ /EnquireTestCase_Right1.jsp; Line: 216]
              y=0; //[ /EnquireTestCase_Right1.jsp; Line: 217]
            } //[ /EnquireTestCase_Right1.jsp; Line: 218]
            //[ /EnquireTestCase_Right1.jsp; Line: 219]
            sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right1.jsp; Line: 220]
            rs2=myStatement5.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 221]
            //      int x=0; //[ /EnquireTestCase_Right1.jsp; Line: 222]
            if(rs2.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 223]
              x=rs2.getInt("count(*)"); //[ /EnquireTestCase_Right1.jsp; Line: 224]
            } //[ /EnquireTestCase_Right1.jsp; Line: 225]
            else{ //[ /EnquireTestCase_Right1.jsp; Line: 226]
              x=0; //[ /EnquireTestCase_Right1.jsp; Line: 227]
            } //[ /EnquireTestCase_Right1.jsp; Line: 228]
            //[ /EnquireTestCase_Right1.jsp; Line: 229]
            String CheckName = new String(); //[ /EnquireTestCase_Right1.jsp; Line: 230]
            String content = new String(); //[ /EnquireTestCase_Right1.jsp; Line: 231]
            long id=0; //[ /EnquireTestCase_Right1.jsp; Line: 232]
            rs1=null; //[ /EnquireTestCase_Right1.jsp; Line: 233]
            rs2=null; //[ /EnquireTestCase_Right1.jsp; Line: 234]
            int first2=1; //[ /EnquireTestCase_Right1.jsp; Line: 235]
            String[] temp; //[ /EnquireTestCase_Right1.jsp; Line: 236]
            String condition1=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 237]
            String information=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 238]
            String condition2=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 239]
            String result2=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 240]
            String[] con; //[ /EnquireTestCase_Right1.jsp; Line: 241]
            String[] rel; //[ /EnquireTestCase_Right1.jsp; Line: 242]
            //[ /EnquireTestCase_Right1.jsp; Line: 243]
            int l=0; //[ /EnquireTestCase_Right1.jsp; Line: 244]
            int lll=0; //[ /EnquireTestCase_Right1.jsp; Line: 245]
            int cPosition=0; //[ /EnquireTestCase_Right1.jsp; Line: 246]
            int rPosition=0; //[ /EnquireTestCase_Right1.jsp; Line: 247]
            int have1=1; //[ /EnquireTestCase_Right1.jsp; Line: 248]
            int have2=1; //[ /EnquireTestCase_Right1.jsp; Line: 249]
            int nn=0; //[ /EnquireTestCase_Right1.jsp; Line: 250]
            long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right1.jsp; Line: 251]
            long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right1.jsp; Line: 252]
            String cDis=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 253]
            String rDis=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 254]
            long element_ID=0; //[ /EnquireTestCase_Right1.jsp; Line: 255]
            String[] elementCondition=new String[y]; //[ /EnquireTestCase_Right1.jsp; Line: 256]
            int[] infID=new int[y]; //[ /EnquireTestCase_Right1.jsp; Line: 257]
            int[] conditionPos=new int[y]; //[ /EnquireTestCase_Right1.jsp; Line: 258]
            int[] conditionEle=new int[y]; //[ /EnquireTestCase_Right1.jsp; Line: 259]
            int len=0; //[ /EnquireTestCase_Right1.jsp; Line: 260]
            int eleLen=0; //[ /EnquireTestCase_Right1.jsp; Line: 261]
            ArrayList resultList=new ArrayList(); //[ /EnquireTestCase_Right1.jsp; Line: 262]
            int aa=0; //[ /EnquireTestCase_Right1.jsp; Line: 263]
            //[ /EnquireTestCase_Right1.jsp; Line: 264]
            if(x>0 && y>0){ //[ /EnquireTestCase_Right1.jsp; Line: 265]
              _writeText(response, out, _wl_block14, _wl_block14Bytes);
              //[ /EnquireTestCase_Right1.jsp; Line: 270]
              //[ /EnquireTestCase_Right1.jsp; Line: 271]
              //[ /EnquireTestCase_Right1.jsp; Line: 272]
              //        sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" group by element_id"; //[ /EnquireTestCase_Right1.jsp; Line: 273]
              //        rs1=myStatement9.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 274]
              //        rs1.next(); //[ /EnquireTestCase_Right1.jsp; Line: 275]
              //        aa=rs1.getInt("count(*)"); //[ /EnquireTestCase_Right1.jsp; Line: 276]
              //[ /EnquireTestCase_Right1.jsp; Line: 277]
              sql="select element_id from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" group by element_id"; //[ /EnquireTestCase_Right1.jsp; Line: 278]
              rs1=myStatement6.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 279]
              while(rs1.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 280]
                element_ID=rs1.getLong("element_id") ; //[ /EnquireTestCase_Right1.jsp; Line: 281]
                sql="select inf_id,inf_dis from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" and element_id="+element_ID+" order by inf_id"; //[ /EnquireTestCase_Right1.jsp; Line: 282]
                rs6=myStatement14.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 283]
                //[ /EnquireTestCase_Right1.jsp; Line: 284]
                if(rs6.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 285]
                  eleLen++; //[ /EnquireTestCase_Right1.jsp; Line: 286]
                  //[ /EnquireTestCase_Right1.jsp; Line: 287]
                  do{ //[ /EnquireTestCase_Right1.jsp; Line: 288]
                    elementCondition[len]=rs6.getString("inf_dis"); //[ /EnquireTestCase_Right1.jsp; Line: 289]
                    infID[len]=rs6.getInt("inf_id"); //[ /EnquireTestCase_Right1.jsp; Line: 290]
                    conditionPos[len]=len; //[ /EnquireTestCase_Right1.jsp; Line: 291]
                    conditionEle[len]=eleLen; //[ /EnquireTestCase_Right1.jsp; Line: 292]
                    len++; //[ /EnquireTestCase_Right1.jsp; Line: 293]
                  }while(rs6.next()); //[ /EnquireTestCase_Right1.jsp; Line: 294]
                } //[ /EnquireTestCase_Right1.jsp; Line: 295]
                //[ /EnquireTestCase_Right1.jsp; Line: 296]
              } //[ /EnquireTestCase_Right1.jsp; Line: 297]
              aa=eleLen; //[ /EnquireTestCase_Right1.jsp; Line: 298]
              //[ /EnquireTestCase_Right1.jsp; Line: 299]
              resultList=cc.combine(conditionPos,conditionEle,aa); //[ /EnquireTestCase_Right1.jsp; Line: 300]
              y=resultList.size(); //[ /EnquireTestCase_Right1.jsp; Line: 301]
              //[ /EnquireTestCase_Right1.jsp; Line: 302]
              //[ /EnquireTestCase_Right1.jsp; Line: 303]
              session.setAttribute("R_Number",String.valueOf(x)); //[ /EnquireTestCase_Right1.jsp; Line: 304]
              session.setAttribute("C_Number",String.valueOf(y)); //[ /EnquireTestCase_Right1.jsp; Line: 305]
              //[ /EnquireTestCase_Right1.jsp; Line: 306]
              String[] resultArray=new String[x]; //[ /EnquireTestCase_Right1.jsp; Line: 307]
              String[] conditionArray=new String[y]; //[ /EnquireTestCase_Right1.jsp; Line: 308]
              //[ /EnquireTestCase_Right1.jsp; Line: 309]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID+" order by inf_id"; //[ /EnquireTestCase_Right1.jsp; Line: 310]
              rs2=myStatement7.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 311]
              rs2.next(); //[ /EnquireTestCase_Right1.jsp; Line: 312]
              //[ /EnquireTestCase_Right1.jsp; Line: 313]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID+" order by inf_id"; //[ /EnquireTestCase_Right1.jsp; Line: 314]
              rs4=myStatement8.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 315]
              if(rs4.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 316]
                do{ //[ /EnquireTestCase_Right1.jsp; Line: 317]
                  resultArray[l]=rs4.getString("inf_id"); //[ /EnquireTestCase_Right1.jsp; Line: 318]
                  l++; //[ /EnquireTestCase_Right1.jsp; Line: 319]
                }while(rs4.next()); //[ /EnquireTestCase_Right1.jsp; Line: 320]
              } //[ /EnquireTestCase_Right1.jsp; Line: 321]
              //[ /EnquireTestCase_Right1.jsp; Line: 322]
              int llll=0; //[ /EnquireTestCase_Right1.jsp; Line: 323]
              int test[]=new int[aa]; //[ /EnquireTestCase_Right1.jsp; Line: 324]
              String cString=new String(); //[ /EnquireTestCase_Right1.jsp; Line: 325]
              int first11=1; //[ /EnquireTestCase_Right1.jsp; Line: 326]
              //[ /EnquireTestCase_Right1.jsp; Line: 327]
              for(int aaaa=0;aaaa<y;aaaa++){ //[ /EnquireTestCase_Right1.jsp; Line: 328]
                //[ /EnquireTestCase_Right1.jsp; Line: 329]
                test=(int[])resultList.get(aaaa); //[ /EnquireTestCase_Right1.jsp; Line: 330]
                llll=test.length; //[ /EnquireTestCase_Right1.jsp; Line: 331]
                //[ /EnquireTestCase_Right1.jsp; Line: 332]
                for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right1.jsp; Line: 333]
                  if(first11==1){ //[ /EnquireTestCase_Right1.jsp; Line: 334]
                    cString=String.valueOf(infID[test[aaa]]); //[ /EnquireTestCase_Right1.jsp; Line: 335]
                    first11=0; //[ /EnquireTestCase_Right1.jsp; Line: 336]
                  } //[ /EnquireTestCase_Right1.jsp; Line: 337]
                  else{ //[ /EnquireTestCase_Right1.jsp; Line: 338]
                    cString=cString+" "+ String.valueOf(infID[test[aaa]]); //[ /EnquireTestCase_Right1.jsp; Line: 339]
                  } //[ /EnquireTestCase_Right1.jsp; Line: 340]
                } //[ /EnquireTestCase_Right1.jsp; Line: 341]
                cString.trim(); //[ /EnquireTestCase_Right1.jsp; Line: 342]
                conditionArray[aaaa]=cString; //[ /EnquireTestCase_Right1.jsp; Line: 343]
                first11=1; //[ /EnquireTestCase_Right1.jsp; Line: 344]
              } //[ /EnquireTestCase_Right1.jsp; Line: 345]
              lll=0; //[ /EnquireTestCase_Right1.jsp; Line: 346]
              //[ /EnquireTestCase_Right1.jsp; Line: 347]
              sql="select count(*) from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right1.jsp; Line: 348]
              rs4=myStatement10.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 349]
              if(rs4.next()){ //[ /EnquireTestCase_Right1.jsp; Line: 350]
                nn=rs4.getInt("count(*)"); //[ /EnquireTestCase_Right1.jsp; Line: 351]
              } //[ /EnquireTestCase_Right1.jsp; Line: 352]
              //[ /EnquireTestCase_Right1.jsp; Line: 353]
              //[ /EnquireTestCase_Right1.jsp; Line: 354]
              if(nn>0){ //[ /EnquireTestCase_Right1.jsp; Line: 355]
                con=new String[nn]; //[ /EnquireTestCase_Right1.jsp; Line: 356]
                rel=new String[nn]; //[ /EnquireTestCase_Right1.jsp; Line: 357]
                //[ /EnquireTestCase_Right1.jsp; Line: 358]
                sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right1.jsp; Line: 359]
                rs5=myStatement11.executeQuery(sql); //[ /EnquireTestCase_Right1.jsp; Line: 360]
                //[ /EnquireTestCase_Right1.jsp; Line: 361]
                if(rs5.next()) //[ /EnquireTestCase_Right1.jsp; Line: 362]
                { //[ /EnquireTestCase_Right1.jsp; Line: 363]
                  nn=0; //[ /EnquireTestCase_Right1.jsp; Line: 364]
                  do //[ /EnquireTestCase_Right1.jsp; Line: 365]
                  { //[ /EnquireTestCase_Right1.jsp; Line: 366]
                    cDis=rs5.getString("condition"); //[ /EnquireTestCase_Right1.jsp; Line: 367]
                    rDis=rs5.getString("result"); //[ /EnquireTestCase_Right1.jsp; Line: 368]
                    con[nn]=cDis; //[ /EnquireTestCase_Right1.jsp; Line: 369]
                    rel[nn]=rDis; //[ /EnquireTestCase_Right1.jsp; Line: 370]
                    nn++; //[ /EnquireTestCase_Right1.jsp; Line: 371]
                  }while(rs5.next()); //[ /EnquireTestCase_Right1.jsp; Line: 372]
                } //[ /EnquireTestCase_Right1.jsp; Line: 373]
                //[ /EnquireTestCase_Right1.jsp; Line: 374]
                if(x>0 && y>0) //[ /EnquireTestCase_Right1.jsp; Line: 375]
                { //[ /EnquireTestCase_Right1.jsp; Line: 376]
                  noData=1; //[ /EnquireTestCase_Right1.jsp; Line: 377]
                  //[ /EnquireTestCase_Right1.jsp; Line: 378]
                  for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right1.jsp; Line: 379]
                  { //[ /EnquireTestCase_Right1.jsp; Line: 380]
                    _writeText(response, out, _wl_block15, _wl_block15Bytes);
                    //[ /EnquireTestCase_Right1.jsp; Line: 383]
                    for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right1.jsp; Line: 384]
                    { //[ /EnquireTestCase_Right1.jsp; Line: 385]
                      CheckName = null; //[ /EnquireTestCase_Right1.jsp; Line: 386]
                      //[ /EnquireTestCase_Right1.jsp; Line: 387]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right1.jsp; Line: 388]
                        _writeText(response, out, _wl_block16, _wl_block16Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 391]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 392]
                      //[ /EnquireTestCase_Right1.jsp; Line: 393]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right1.jsp; Line: 394]
                        _writeText(response, out, _wl_block17, _wl_block17Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right1.jsp; Line: 396]
                        _writeText(response, out, _wl_block18, _wl_block18Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 397]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 398]
                      //[ /EnquireTestCase_Right1.jsp; Line: 399]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right1.jsp; Line: 400]
                        _writeText(response, out, _wl_block19, _wl_block19Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 403]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 404]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right1.jsp; Line: 405]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right1.jsp; Line: 406]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right1.jsp; Line: 407]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right1.jsp; Line: 408]
                        content=rr.replace(content); //[ /EnquireTestCase_Right1.jsp; Line: 409]
                        _writeText(response, out, _wl_block20, _wl_block20Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right1.jsp; Line: 411]
                        _writeText(response, out, _wl_block21, _wl_block21Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 411]
                        _writeText(response, out, _wl_block22, _wl_block22Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right1.jsp; Line: 411]
                        _writeText(response, out, _wl_block23, _wl_block23Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 412]
                        rs2.next(); //[ /EnquireTestCase_Right1.jsp; Line: 413]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 414]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right1.jsp; Line: 415]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right1.jsp; Line: 416]
                        content=conditionArray[i-1]; //[ /EnquireTestCase_Right1.jsp; Line: 417]
                        //[ /EnquireTestCase_Right1.jsp; Line: 418]
                        //[ /EnquireTestCase_Right1.jsp; Line: 419]
                        first2=1; //[ /EnquireTestCase_Right1.jsp; Line: 420]
                        //                  temp=rr.getID(content); //[ /EnquireTestCase_Right1.jsp; Line: 421]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right1.jsp; Line: 422]
                        test=(int[])resultList.get(i-1); //[ /EnquireTestCase_Right1.jsp; Line: 423]
                        llll=test.length; //[ /EnquireTestCase_Right1.jsp; Line: 424]
                        //[ /EnquireTestCase_Right1.jsp; Line: 425]
                        for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right1.jsp; Line: 426]
                          condition1=String.valueOf(elementCondition[test[aaa]]); //[ /EnquireTestCase_Right1.jsp; Line: 427]
                          condition1=rr.replace(condition1); //[ /EnquireTestCase_Right1.jsp; Line: 428]
                          if(first2==1){ //[ /EnquireTestCase_Right1.jsp; Line: 429]
                            information=condition1; //[ /EnquireTestCase_Right1.jsp; Line: 430]
                            first2=0; //[ /EnquireTestCase_Right1.jsp; Line: 431]
                          } //[ /EnquireTestCase_Right1.jsp; Line: 432]
                          else{ //[ /EnquireTestCase_Right1.jsp; Line: 433]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right1.jsp; Line: 434]
                          } //[ /EnquireTestCase_Right1.jsp; Line: 435]
                        } //[ /EnquireTestCase_Right1.jsp; Line: 436]
                        //[ /EnquireTestCase_Right1.jsp; Line: 437]
                        //                  information=rr.replace(information); //[ /EnquireTestCase_Right1.jsp; Line: 438]
                        _writeText(response, out, _wl_block24, _wl_block24Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right1.jsp; Line: 440]
                        _writeText(response, out, _wl_block25, _wl_block25Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 440]
                        _writeText(response, out, _wl_block26, _wl_block26Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right1.jsp; Line: 440]
                        _writeText(response, out, _wl_block27, _wl_block27Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 441]
                        lll++; //[ /EnquireTestCase_Right1.jsp; Line: 442]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 443]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right1.jsp; Line: 444]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right1.jsp; Line: 445]
                        //[ /EnquireTestCase_Right1.jsp; Line: 446]
                        result2=resultArray[j-1]; //[ /EnquireTestCase_Right1.jsp; Line: 447]
                        condition2=conditionArray[i-1]; //[ /EnquireTestCase_Right1.jsp; Line: 448]
                        //[ /EnquireTestCase_Right1.jsp; Line: 449]
                        cPosition=-1; //[ /EnquireTestCase_Right1.jsp; Line: 450]
                        rPosition=-1; //[ /EnquireTestCase_Right1.jsp; Line: 451]
                        have1=0; //[ /EnquireTestCase_Right1.jsp; Line: 452]
                        have2=0; //[ /EnquireTestCase_Right1.jsp; Line: 453]
                        //[ /EnquireTestCase_Right1.jsp; Line: 454]
                        for(int ll=0;ll<con.length;ll++){ //[ /EnquireTestCase_Right1.jsp; Line: 455]
                          cPosition=con[ll].indexOf(condition2); //[ /EnquireTestCase_Right1.jsp; Line: 456]
                          if(cPosition!=-1){ //[ /EnquireTestCase_Right1.jsp; Line: 457]
                            rPosition=rel[ll].indexOf(result2); //[ /EnquireTestCase_Right1.jsp; Line: 458]
                            if(rPosition!=-1){ //[ /EnquireTestCase_Right1.jsp; Line: 459]
                              have1=1; //[ /EnquireTestCase_Right1.jsp; Line: 460]
                              cPosition=-1; //[ /EnquireTestCase_Right1.jsp; Line: 461]
                              rPosition=-1; //[ /EnquireTestCase_Right1.jsp; Line: 462]
                            } //[ /EnquireTestCase_Right1.jsp; Line: 463]
                          } //[ /EnquireTestCase_Right1.jsp; Line: 464]
                        } //[ /EnquireTestCase_Right1.jsp; Line: 465]
                        //[ /EnquireTestCase_Right1.jsp; Line: 466]
                        if(have1==1){ //[ /EnquireTestCase_Right1.jsp; Line: 467]
                          _writeText(response, out, _wl_block28, _wl_block28Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 469]
                          _writeText(response, out, _wl_block29, _wl_block29Bytes);
                          //[ /EnquireTestCase_Right1.jsp; Line: 470]
                        } //[ /EnquireTestCase_Right1.jsp; Line: 471]
                        else{ //[ /EnquireTestCase_Right1.jsp; Line: 472]
                          _writeText(response, out, _wl_block30, _wl_block30Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 474]
                          _writeText(response, out, _wl_block31, _wl_block31Bytes);
                          //[ /EnquireTestCase_Right1.jsp; Line: 475]
                        } //[ /EnquireTestCase_Right1.jsp; Line: 476]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 477]
                    } //[ /EnquireTestCase_Right1.jsp; Line: 478]
                    _writeText(response, out, _wl_block32, _wl_block32Bytes);
                    //[ /EnquireTestCase_Right1.jsp; Line: 481]
                  } //[ /EnquireTestCase_Right1.jsp; Line: 482]
                } //[ /EnquireTestCase_Right1.jsp; Line: 483]
                rs1.close(); //[ /EnquireTestCase_Right1.jsp; Line: 484]
                rs2.close(); //[ /EnquireTestCase_Right1.jsp; Line: 485]
                //          rs3.close(); //[ /EnquireTestCase_Right1.jsp; Line: 486]
                rs4.close(); //[ /EnquireTestCase_Right1.jsp; Line: 487]
                rs5.close(); //[ /EnquireTestCase_Right1.jsp; Line: 488]
              } //[ /EnquireTestCase_Right1.jsp; Line: 489]
              else{ //[ /EnquireTestCase_Right1.jsp; Line: 490]
                //[ /EnquireTestCase_Right1.jsp; Line: 491]
                if(x>0 && y>0) //[ /EnquireTestCase_Right1.jsp; Line: 492]
                { //[ /EnquireTestCase_Right1.jsp; Line: 493]
                  noData=1; //[ /EnquireTestCase_Right1.jsp; Line: 494]
                  for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right1.jsp; Line: 495]
                  { //[ /EnquireTestCase_Right1.jsp; Line: 496]
                    _writeText(response, out, _wl_block33, _wl_block33Bytes);
                    //[ /EnquireTestCase_Right1.jsp; Line: 499]
                    for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right1.jsp; Line: 500]
                    { //[ /EnquireTestCase_Right1.jsp; Line: 501]
                      CheckName = null; //[ /EnquireTestCase_Right1.jsp; Line: 502]
                      //[ /EnquireTestCase_Right1.jsp; Line: 503]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right1.jsp; Line: 504]
                        _writeText(response, out, _wl_block34, _wl_block34Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 507]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 508]
                      //[ /EnquireTestCase_Right1.jsp; Line: 509]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right1.jsp; Line: 510]
                        _writeText(response, out, _wl_block35, _wl_block35Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right1.jsp; Line: 512]
                        _writeText(response, out, _wl_block36, _wl_block36Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 513]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 514]
                      //[ /EnquireTestCase_Right1.jsp; Line: 515]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right1.jsp; Line: 516]
                        _writeText(response, out, _wl_block37, _wl_block37Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 519]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 520]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right1.jsp; Line: 521]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right1.jsp; Line: 522]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right1.jsp; Line: 523]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right1.jsp; Line: 524]
                        content=rr.replace(content); //[ /EnquireTestCase_Right1.jsp; Line: 525]
                        _writeText(response, out, _wl_block38, _wl_block38Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right1.jsp; Line: 527]
                        _writeText(response, out, _wl_block39, _wl_block39Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 527]
                        _writeText(response, out, _wl_block40, _wl_block40Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right1.jsp; Line: 527]
                        _writeText(response, out, _wl_block41, _wl_block41Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 528]
                        rs2.next(); //[ /EnquireTestCase_Right1.jsp; Line: 529]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 530]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right1.jsp; Line: 531]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right1.jsp; Line: 532]
                        content=conditionArray[i-1]; //[ /EnquireTestCase_Right1.jsp; Line: 533]
                        //[ /EnquireTestCase_Right1.jsp; Line: 534]
                        first2=1; //[ /EnquireTestCase_Right1.jsp; Line: 535]
                        //                  temp=rr.getID(content); //[ /EnquireTestCase_Right1.jsp; Line: 536]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right1.jsp; Line: 537]
                        test=(int[])resultList.get(i-1); //[ /EnquireTestCase_Right1.jsp; Line: 538]
                        llll=test.length; //[ /EnquireTestCase_Right1.jsp; Line: 539]
                        //[ /EnquireTestCase_Right1.jsp; Line: 540]
                        for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right1.jsp; Line: 541]
                          condition1=String.valueOf(elementCondition[test[aaa]]); //[ /EnquireTestCase_Right1.jsp; Line: 542]
                          condition1=rr.replace(condition1); //[ /EnquireTestCase_Right1.jsp; Line: 543]
                          if(first2==1){ //[ /EnquireTestCase_Right1.jsp; Line: 544]
                            information=condition1; //[ /EnquireTestCase_Right1.jsp; Line: 545]
                            first2=0; //[ /EnquireTestCase_Right1.jsp; Line: 546]
                          } //[ /EnquireTestCase_Right1.jsp; Line: 547]
                          else{ //[ /EnquireTestCase_Right1.jsp; Line: 548]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right1.jsp; Line: 549]
                          } //[ /EnquireTestCase_Right1.jsp; Line: 550]
                        } //[ /EnquireTestCase_Right1.jsp; Line: 551]
                        //[ /EnquireTestCase_Right1.jsp; Line: 552]
                        //                  information=rr.replace(information); //[ /EnquireTestCase_Right1.jsp; Line: 553]
                        _writeText(response, out, _wl_block42, _wl_block42Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right1.jsp; Line: 555]
                        _writeText(response, out, _wl_block43, _wl_block43Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 555]
                        _writeText(response, out, _wl_block44, _wl_block44Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right1.jsp; Line: 555]
                        _writeText(response, out, _wl_block45, _wl_block45Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 556]
                        lll++; //[ /EnquireTestCase_Right1.jsp; Line: 557]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 558]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right1.jsp; Line: 559]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right1.jsp; Line: 560]
                        _writeText(response, out, _wl_block46, _wl_block46Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right1.jsp; Line: 562]
                        _writeText(response, out, _wl_block47, _wl_block47Bytes);
                        //[ /EnquireTestCase_Right1.jsp; Line: 563]
                      } //[ /EnquireTestCase_Right1.jsp; Line: 564]
                    } //[ /EnquireTestCase_Right1.jsp; Line: 565]
                    _writeText(response, out, _wl_block48, _wl_block48Bytes);
                    //[ /EnquireTestCase_Right1.jsp; Line: 568]
                    //[ /EnquireTestCase_Right1.jsp; Line: 569]
                  } //[ /EnquireTestCase_Right1.jsp; Line: 570]
                } //[ /EnquireTestCase_Right1.jsp; Line: 571]
                rs1.close(); //[ /EnquireTestCase_Right1.jsp; Line: 572]
                rs2.close(); //[ /EnquireTestCase_Right1.jsp; Line: 573]
                rs4.close(); //[ /EnquireTestCase_Right1.jsp; Line: 574]
              } //[ /EnquireTestCase_Right1.jsp; Line: 575]
              _writeText(response, out, _wl_block49, _wl_block49Bytes);
              //[ /EnquireTestCase_Right1.jsp; Line: 579]
            } //[ /EnquireTestCase_Right1.jsp; Line: 580]
          } //[ /EnquireTestCase_Right1.jsp; Line: 581]
          //[ /EnquireTestCase_Right1.jsp; Line: 582]
          _writeText(response, out, _wl_block50, _wl_block50Bytes);
          //[ /EnquireTestCase_Right1.jsp; Line: 585]
          if(noData==1){ //[ /EnquireTestCase_Right1.jsp; Line: 586]
            x=x+1; //[ /EnquireTestCase_Right1.jsp; Line: 587]
            _writeText(response, out, _wl_block51, _wl_block51Bytes);
            out.print(String.valueOf(x*163+147 ));  //[ /EnquireTestCase_Right1.jsp; Line: 590]
            _writeText(response, out, _wl_block52, _wl_block52Bytes);
            //[ /EnquireTestCase_Right1.jsp; Line: 600]
          } //[ /EnquireTestCase_Right1.jsp; Line: 601]
          _writeText(response, out, _wl_block53, _wl_block53Bytes);
          //[ /EnquireTestCase_Right1.jsp; Line: 606]
          myConn.close(); //[ /EnquireTestCase_Right1.jsp; Line: 607]
          //    myStatement1.close(); //[ /EnquireTestCase_Right1.jsp; Line: 608]
          //    myStatement2.close(); //[ /EnquireTestCase_Right1.jsp; Line: 609]
          //    myStatement3.close(); //[ /EnquireTestCase_Right1.jsp; Line: 610]
          myStatement4.close(); //[ /EnquireTestCase_Right1.jsp; Line: 611]
          myStatement5.close(); //[ /EnquireTestCase_Right1.jsp; Line: 612]
          myStatement6.close(); //[ /EnquireTestCase_Right1.jsp; Line: 613]
          myStatement7.close(); //[ /EnquireTestCase_Right1.jsp; Line: 614]
          myStatement8.close(); //[ /EnquireTestCase_Right1.jsp; Line: 615]
          //    myStatement9.close(); //[ /EnquireTestCase_Right1.jsp; Line: 616]
          myStatement10.close(); //[ /EnquireTestCase_Right1.jsp; Line: 617]
          myStatement11.close(); //[ /EnquireTestCase_Right1.jsp; Line: 618]
          //    myStatement12.close(); //[ /EnquireTestCase_Right1.jsp; Line: 619]
          //    myStatement13.close(); //[ /EnquireTestCase_Right1.jsp; Line: 620]
          myStatement14.close(); //[ /EnquireTestCase_Right1.jsp; Line: 621]
        } //[ /EnquireTestCase_Right1.jsp; Line: 622]
        catch(SQLException ex){ //[ /EnquireTestCase_Right1.jsp; Line: 623]
          System.err.println("aq.executeQuery: " + ex.getMessage()); //[ /EnquireTestCase_Right1.jsp; Line: 624]
          System.err.println("aq.executeQuery: " + sql); //[ /EnquireTestCase_Right1.jsp; Line: 625]
        } //[ /EnquireTestCase_Right1.jsp; Line: 626]
      } //[ /EnquireTestCase_Right1.jsp; Line: 627]
      _writeText(response, out, _wl_block54, _wl_block54Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
